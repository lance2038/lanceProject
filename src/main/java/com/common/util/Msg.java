
package com.common.util;

import java.text.MessageFormat;
import java.util.Date;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

public class Msg
{
	private static ResourceBundle bundle;
	// 加载资源文件
	static
	{
		if (null == bundle)
			bundle = ResourceBundle.getBundle("ApplicationResources");
	}

	/**
	 * 获取资源文件中键为key的消息 获取规则：先完全匹配搜索，再搜索key的小写，再搜索key的大写，如果仍然没找到则返回key
	 *
	 * @return String key指定的消息
	 * @exception
	 */
	public static String getMsg(String key)
	{
		String msg;
		try
		{
			msg = bundle.getString(key);
		} catch (MissingResourceException e)
		{
			try
			{
				msg = bundle.getString(key.toLowerCase());
			} catch (MissingResourceException e2)
			{
				try
				{
					msg = bundle.getString(key.toUpperCase());
				} catch (Exception e3)
				{
					return key;
				}
			}
		}
		return msg;
	}

	/**
	 * 获取资源文件中键为key的消息，并用指定的参数格式化.如果key指定的消息不存在，则返回key
	 *
	 * @param key
	 *            指定的key
	 * @return String 格式化后的消息
	 * @exception
	 */
	public static String getMsg(String key, Object... args)
	{
		String msg = getMsg(key);
		if (null == msg)
			return key;
		return MessageFormat.format(msg, args);
	}

	public static void main(String[] args)
	{
		Date today = new Date();
		System.out.println(getMsg("dlgs.Test", "梁荣杰", today, today,
				4123565.567, 5523, 0.00524, 12465.586465879825));
	}

}
