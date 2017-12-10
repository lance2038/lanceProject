/*
package com.common.util;

import static org.apache.commons.lang.StringUtils.isBlank;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.commons.lang.StringUtils;



public class ConvertUtil
{
	*/
/**
	 * 将java.util.Date转换为字符串，包括毫秒
	 *
	 * @param date 需要转换的时间戳
	 * @return 日期字符串，包括毫秒：如果传入参数为空，则返回空串
	 *//*

	  public static String toDateTimeStringAll(Date date)
	 {

		if (date == null)
	    {
	      return "";
	    }
	    return date.toString();
	}
	*/
/**
	 * 将java.util.Date转换位format格式的字符串，如不指定格式则用默认格式：yyyy-MM-dd HH:mm:ss
	 *
	 * @param date 需要转换的日期
	 * @param format 日期格式
	 * @return 转换为format格式的字符串
	 *//*

	public static String toDateTimeString(Date date, String format)
	{

		if (isBlank(format)) format = "yyyy-MM-dd";
		return new SimpleDateFormat(format).format(date);
	}

	public static String toDateTimeString(String date,String format){
		Date d=parseDate(date);
		return toDateTimeString(d, format);
	}
	*/
/**
	 * 将日期转换为yyyy-MM-dd格式
	 *
	 * @param date 指定的日期
	 * @return 转换为yyyy-MM-dd格式的字符串
	 *//*

	public static String toDateString(Date date)
	{

		return toDateTimeString(date, "yyyy-MM-dd");
	}

	*/
/**
	 * 将日期转换为yyyy-MM-dd格式
	 *
	 * @param date 指定的日期
	 * @return 转换为yyyy-MM-dd格式的字符串
	 *//*

	public static String toTimeString(Date date)
	{

		return toDateTimeString(date, "yyyy-MM-dd");
	}

	*/
/**
	 * 将字符串转换为java.sql.Timestamp
	 *
	 * @param str 指定的字符串
	 * @return 转换后的java.sql.Timestamp
	 *//*

	public static Timestamp String2Date(String str)
	{

		if (isBlank(str)) return null;
		return parseDate(str);
	}

	*/
/**
	 * 把数据库取出的列值统一转换为字符串类型：只处理 日期、数字、字符串类型
	 *
	 * @param obj 列值,数字精度（可选）
	 * @return String 结果为字符串类型：日期：YYYY-MM-DD 数字：默认两位小数 字符串：去空格
	 *//*

	public static String changeColumnType(Object obj, int... scale)
	{

		if (obj == null)
		{// 参数为空
			return "";
		}
		else
		{// 参数不为空
			if (obj instanceof Date)
			{// 日期
				return toDateString((Date) obj);
			}
			else if (obj instanceof Number)
			{// 数字
				if (scale.length == 1)
				{
					return Util.round((Number) obj, scale[0]);
				}
				else
				{
					return Util.round((Number) obj);
				}
			}
			else
			{// 字符串
				return StringUtils.trimToEmpty((String) obj);
			}
		}
	}

	*/
/**
	 * 把数据库取出的列值统一转换为String或Double类型：只处理 日期、数字、字符串类型（报表专用）
	 *     数字类型的转换为Double类型
	 *     其余类型则统一转换为String类型
	 * @param trim true或空表示去空格 false 不去空格
	 * @return String 结果为String或Double类型：日期：YYYY-MM-DD 数字：两位小数 字符串：去空格
	 *//*

	public static Object getNumColumnType(Object obj, boolean... trim)
	{

		if (obj == null)
		{// 参数为空
			return "";
		}
		else
		{// 参数不为空
			if (obj instanceof Date)
			{// 日期
				return toDateString((Date) obj);
			}
			else if (obj instanceof Number)
			{// 数字
				return Double.valueOf(Util.round((Number) obj));
			}
			else
			{// 字符串
				if(trim.length == 0 || trim[0] == true){
					return StringUtils.trimToEmpty((String) obj);
				}
				else{
					return obj;
				}
			}
		}
	}

	*/
/**
	 * 从字符串中解析日期
	 *
	 * @return Timestamp 解析之后的日期
	 * @exception
	 *//*

	@SuppressWarnings("deprecation")
	private static Timestamp parseDate(String s)
	{

		int firstDash, secondDash, dividingSpace, firstColon, secondColon;
		int year = 0, month = 1, day = 1, hour = 0, minute = 0, second = 0, nanos = 0, period = 0;
		String date_s = null, time_s = null;
		if (isBlank(s)) throw new IllegalArgumentException("null string");
		s = s.trim();
		dividingSpace = s.indexOf(' ');
		if (dividingSpace > 0)
		{
			date_s = s.substring(0, dividingSpace).trim();
			time_s = s.substring(dividingSpace + 1).trim();
		}
		else
			date_s = s;// 无时间，只有日期
		firstDash = date_s.indexOf('-');
		if (firstDash <= 0) firstDash = date_s.indexOf('/');
		secondDash = date_s.indexOf('-', firstDash + 1);
		if (secondDash <= 0) secondDash = date_s.indexOf('/', firstDash + 1);
		if ((firstDash > 0) & (secondDash > 0) & (secondDash < date_s.length() - 1))// have
		// dash
		{
			year = Integer.parseInt(date_s.substring(0, firstDash));
			month = Integer.parseInt(date_s.substring(firstDash + 1, secondDash));
			day = Integer.parseInt(date_s.substring(secondDash + 1));
		}
		if (firstDash <= 0)// no dash
		{
			int len = date_s.length();
			if (len == 8 && (date_s.startsWith("20") || date_s.startsWith("19")))// 20080910
			{
				year = Integer.parseInt(date_s.substring(0, 4));
				month = Integer.parseInt(date_s.substring(4, 6));
				day = Integer.parseInt(date_s.substring(6, 8));
			}
			else if (len == 6 && (date_s.startsWith("20") || date_s.startsWith("19")))// 200808
			// |
			// 199902
			{
				year = Integer.parseInt(date_s.substring(0, 4));
				month = Integer.parseInt(date_s.substring(4, 6));
				day = 1;
			}
			else if (len == 6 && !(date_s.startsWith("20") || date_s.startsWith("19")))// 080808
			{
				year = Integer.parseInt(date_s.substring(0, 2));
				month = Integer.parseInt(date_s.substring(2, 4));
				day = Integer.parseInt(date_s.substring(4, 6));
			}
		}
		if (!isBlank(time_s))
		{
			firstColon = time_s.indexOf(':');
			secondColon = time_s.indexOf(':', firstColon + 1);
			period = time_s.indexOf('.', secondColon + 1);
			if ((firstColon > 0) & (secondColon > 0))
			{
				hour = Integer.parseInt(time_s.substring(0, firstColon));
				minute = Integer.parseInt(time_s.substring(firstColon + 1, secondColon));
			}
			if (period > 0)
			{
				second = Integer.parseInt(time_s.substring(secondColon + 1, period));
				nanos = Integer.parseInt(time_s.substring(period + 1));
			}
			else
				second = Integer.parseInt(time_s.substring(secondColon + 1));
		}
		if (year <= 100) year += 2000;
		year -= 1900;
		month--;
		return new Timestamp(year, month, day, hour, minute, second, nanos);
	}

	*/
/**
	 * 取得指定日期的字符串的开始时刻，如果2008-11-03 -> 2008-11-03 00:00:00
	 *
	 * @param str 指定的字符串
	 * @return java.sql.Date
	 *//*

	public static Timestamp toStartDate(String dateStr)
	{

		Date date = String2Date(dateStr);
		if (null == date) return null;
		return parseDate(toDateString(date) + " 00:00:00");
	}

	*/
/**
	 * 取得指定日期的字符串的最后时刻，如果2008-11-03 -> 2008-11-03 23:59:59
	 *
	 * @param str 指定的字符串
	 * @return java.sql.Date
	 *//*

	public static Timestamp toEndDate(String dateStr)
	{

		Date date = String2Date(dateStr);
		if (null == date) return null;
		return parseDate(toDateString(date) + " 23:59:59");
	}

	*/
/**
	 * convert String type to Int type
	 *
	 * @param intstr 指定的字符串
	 * @return Int type
	 * Add by chenliang
	 *//*

	  public static int stringToInt(String intstr)
	  {

	    Integer integer;
	    if (intstr == null || intstr.equals(""))
	    {
	      intstr = "0";

	    }
	    integer = Integer.valueOf(intstr);

	    return integer.intValue();

	  }
	*/
/**
	 * 将日期格式字符串转换为大写数字日期
	 *
	 * @param dateStr 指定的字符串2010-08-04
	 * @return String 二〇一〇年八月四日
	 * Add by sunbing
	 *//*

	  public static String DateStringToUpcase(String dateStr)
	  {
		  StringBuilder str = new StringBuilder();
		  str.append("");
		  if(isBlank(dateStr))
			  return "";
		  if(dateStr.length() >= 10 &&
				  (stringToInt(dateStr.substring(5,7)) > 12
						  || stringToInt(dateStr.substring(8,10)) > 31))
			  return dateStr;
		  String year = toDateTimeString(dateStr, "yyyy");
		  String month = toDateTimeString(dateStr, "MM");
		  String day = toDateTimeString(dateStr, "dd");

		  year = getCapNum(year);
		  month = getCapNum(month);
		  day = getCapNum(day);
		  str.append(year).append("年").append(month).append("月").append(day).append("日");

		  return str.toString();
	  }
	  public static String getCapNum(String numStr){
		  StringBuilder str = new StringBuilder();
		  str.append("");
		  String upCaseNum 	= "〇一二三四五六七八九十";
		  String lowerCaseNum = "0123456789A";

		  if(numStr.length() == 4 || numStr.length() == 1){
			  for(int i = 0; i < numStr.length(); i++){
				  String substr = numStr.substring(i, i+1);
				  str.append(upCaseNum.charAt(lowerCaseNum.indexOf(substr)));
			  }
		  }else if(numStr.length() == 2){
			  String firStr = numStr.substring(0,1);
			  String secStr = numStr.substring(1,2);
			  if("0".equals(firStr)){
				  str.append(upCaseNum.charAt(lowerCaseNum.indexOf(secStr)));
			  }else if("0".equals(secStr)){
				  str.append("1".equals(firStr)?"":upCaseNum.charAt(lowerCaseNum.indexOf(firStr)));
			  	  str.append("十");
			  }else{
				  str.append("1".equals(firStr)?"":upCaseNum.charAt(lowerCaseNum.indexOf(firStr)));
				  str.append("十");
				  str.append(upCaseNum.charAt(lowerCaseNum.indexOf(secStr)));
			  }
		  }

		  return str.toString();
	  }

	  //半角转全角
	  public static String BQchange(String QJstr){
		  String outStr = "";
		  String Tstr = "";
		  byte[] b = null;
		  for(int i=0; i<QJstr.length(); i++){
			  try{
				  Tstr = QJstr.substring(i,i+1);
				  b = Tstr.getBytes("unicode");
			  }catch(java.io.UnsupportedEncodingException e){
				  e.printStackTrace();
			  }
			  if(b[3] != -1){
				  b[2] = (byte)(b[2] - 32);
				  b[3] = -1;
				  try{
					  outStr = outStr + new String(b, "unicode");
				  }catch(java.io.UnsupportedEncodingException e){
					  e.printStackTrace();
				  }
			  }else{
				  outStr = outStr + Tstr;
			  }
		  }
		  return outStr;
	  }
	  //全角转半角
	  public static String QBchange(String QJstr){
		  String outStr = "";
		  String Tstr = "";
		  byte[] b = null;

		  for(int i =0; i<QJstr.length(); i++){
			  try{
				  Tstr = QJstr.substring(i,i+1);
				  b = Tstr.getBytes("unicode");
			  }catch(java.io.UnsupportedEncodingException e){
				  e.printStackTrace();
			  }
			  if(b[3] == -1){
				  b[2] = (byte)(b[2] + 32);
				  b[3] = 0;
				  try{
					  outStr = outStr + new String(b, "unicode");
				  }catch(java.io.UnsupportedEncodingException e){
					  e.printStackTrace();
				  }
			  }else{
				  outStr = outStr + Tstr;
			  }
		  }
		  return outStr;
	  }

	  */
/**
	   * 半角转全角函数
	   * （全角空格为12288，半角空格为32，其他字符半角（33-126）与全角（65281-65374）的对应关系是均相差65248）
	   * @param input 任意字符串
	   * @return 全角字符串
	   *//*

	  public static String toSBC(String input){
		  //半角转全角
		  char[] c = input.toCharArray();
		  for(int i = 0; i< c.length; i++){
			  if(c[i] == 32){
				  c[i] = (char)12288;
				  continue;
			  }
			  if(c[i] < 127)
				  c[i] = (char)(c[i]+65248);
		  }
		  return new String(c);
	  }

	  */
/**
	   * 全角转半角函数
	   * （全角空格为12288，半角空格为32，其他字符半角（33-126）与全角（65281-65374）的对应关系是均相差65248）
	   * @param input 任意字符串
	   * @return 半角字符串
	   *//*

	  public static String toDBC(String input){
		//全角转半角
		  char[] c = input.toCharArray();
		  for(int i = 0; i< c.length; i++){
			  if(c[i] == 12288){
				  c[i] = (char)32;
				  continue;
			  }
			  if(c[i] > 65280 && c[i]<65375)
				  c[i] = (char)(c[i] - 65248);
		  }
		  return new String(c);
	  }
	*/
/**
	 * @param args
	 * @throws UnsupportedEncodingException
	 *//*

	public static void main(String[] args)
	{

	}
}

*/
