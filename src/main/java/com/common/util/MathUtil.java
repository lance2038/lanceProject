/*
package com.common.util;

import static java.math.BigDecimal.ROUND_HALF_UP;

import java.math.BigDecimal;
import java.math.BigInteger;

import com.sun.org.apache.bcel.internal.generic.NEW;

public class MathUtil {
	// 默认除法运算精度,及即保留小数点多少位
	private static final int DEF_DIV_SCALE = 2;

	// 这个类不能实例化
	private MathUtil() {
	}

	*/
/**
	 * 提供精确的加法运算。
	 *
	 * @param v1
	 *            被加数
	 * @param v2
	 *            加数
	 * @return 两个参数的和
	 *//*

	public static double add(double v1, double v2) {
		BigDecimal b1 = new BigDecimal(Double.toString(v1));
		BigDecimal b2 = new BigDecimal(Double.toString(v2));
		return (b1.add(b2)).doubleValue();
	}

	*/
/**
	 * 提供精确的加法运算。
	 *
	 * @param v1
	 *            被加数
	 * @param v2
	 *            加数
	 * @return 两个参数的和
	 *//*

	public static float add(float v1, float v2) {
		BigDecimal b1 = new BigDecimal(Float.toString(v1));
		BigDecimal b2 = new BigDecimal(Float.toString(v2));
		return (b1.add(b2)).floatValue();
	}

	*/
/**
	 * 提供精确的减法运算。
	 *
	 * @param v1
	 *            被减数
	 * @param v2
	 *            减数
	 * @return 两个参数的差
	 *//*

	public static double sub(double v1, double v2) {
		BigDecimal b1 = new BigDecimal(Double.toString(v1));
		BigDecimal b2 = new BigDecimal(Double.toString(v2));
		return (b1.subtract(b2)).doubleValue();
	}

	*/
/**
	 * 提供精确的减法运算。
	 *
	 * @param v1
	 *            被减数
	 * @param v2
	 *            减数
	 * @return 两个参数的差
	 *//*

	public static float sub(float v1, float v2) {
		BigDecimal b1 = new BigDecimal(Float.toString(v1));
		BigDecimal b2 = new BigDecimal(Float.toString(v2));
		return (b1.subtract(b2)).floatValue();
	}

	*/
/**
	 * 提供精确的乘法运算。
	 *
	 * @param v1
	 *            被乘数
	 * @param v2
	 *            乘数
	 * @return 两个参数的积
	 *//*

	public static double mul(double v1, double v2) {
		BigDecimal b1 = new BigDecimal(Double.toString(v1));
		BigDecimal b2 = new BigDecimal(Double.toString(v2));
		return (b1.multiply(b2)).doubleValue();
	}

	*/
/**
	 * 提供精确的乘法运算。
	 *
	 * @param v1
	 *            被乘数
	 * @param v2
	 *            乘数
	 * @return 两个参数的积
	 *//*

	public static float mul(float v1, float v2) {
		BigDecimal b1 = new BigDecimal(Float.toString(v1));
		BigDecimal b2 = new BigDecimal(Float.toString(v2));
		return (b1.multiply(b2)).floatValue();
	}

	*/
/**
	 * 提供（相对）精确的除法运算，当发生除不尽的情况时，精确到 小数点以后多少位，以后的数字四舍五入。
	 *
	 * @param v1
	 *            被除数
	 * @param v2
	 *            除数
	 * @return 两个参数的商
	 *//*

	public static double div(double v1, double v2) {
		return div(v1, v2, DEF_DIV_SCALE);
	}

	*/
/**
	 * 提供（相对）精确的除法运算，当发生除不尽的情况时，精确到 小数点以后多少位，以后的数字四舍五入。
	 *
	 * @param v1
	 *            被除数
	 * @param v2
	 *            除数
	 * @return 两个参数的商
	 *//*

	public static float div(float v1, float v2) {

		return div(v1, v2, DEF_DIV_SCALE);

	}

	*/
/**
	 * 提供（相对）精确的除法运算。当发生除不尽的情况时，由scale参数指 定精度，以后的数字四舍五入。
	 *
	 * @param v1
	 *            被除数
	 * @param v2
	 *            除数
	 * @param scale
	 *            表示表示需要精确到小数点以后几位。
	 * @return 两个参数的商
	 *//*

	public static double div(double v1, double v2, int scale) {
		if (scale < 0) {
			throw new IllegalArgumentException(
					"The scale must be a positive integer or zero");
		}
		BigDecimal b1 = new BigDecimal(Double.toString(v1));
		BigDecimal b2 = new BigDecimal(Double.toString(v2));
		return (b1.divide(b2, scale, BigDecimal.ROUND_HALF_UP)).doubleValue();
	}

	*/
/**
	 * 提供（相对）精确的除法运算。当发生除不尽的情况时，由scale参数指 定精度，以后的数字四舍五入。
	 *
	 * @param v1
	 *            被除数
	 * @param v2
	 *            除数
	 * @param scale
	 *            表示表示需要精确到小数点以后几位。
	 * @return 两个参数的商
	 *//*

	public static float div(float v1, float v2, int scale) {
		if (scale < 0) {
			throw new IllegalArgumentException(
					"The scale must be a positive integer or zero");
		}
		BigDecimal b1 = new BigDecimal(Float.toString(v1));
		BigDecimal b2 = new BigDecimal(Float.toString(v2));
		return (b1.divide(b2, scale, BigDecimal.ROUND_HALF_UP)).floatValue();
	}

	*/
/**
	 * 采用四舍五入的方式将value转换为小数位数为scale的字符串
	 *
	 * @param value
	 *            将要转换的数字
	 * @param scale
	 *            小数位数
	 * @return 采用四舍五入的方式将value转换为小数位数为scale的字符串
	 *//*

	public static String round(Number value, int scale)
	{
		BigDecimal bigDec = null;
		if (value instanceof Byte)
			bigDec = new BigDecimal((Byte) value);
		else if (value instanceof Double)
			bigDec = new BigDecimal((Double) value);
		else if (value instanceof Float)
			bigDec = new BigDecimal((Float) value);
		else if (value instanceof Integer)
			bigDec = new BigDecimal((Integer) value);
		else if (value instanceof Long)
			bigDec = new BigDecimal((Long) value);
		else if (value instanceof Short)
			bigDec = new BigDecimal((Short) value);
		else if (value instanceof BigInteger)
			bigDec = new BigDecimal((BigInteger) value);
		else if (value instanceof BigDecimal)
			bigDec = (BigDecimal) value;
		return bigDec.setScale(scale, ROUND_HALF_UP).toString();
	}

	 */
/**
	   * 提供精确的小数位四舍五入处理。
	   * @param v 需要四舍五入的数字
	   * @param scale 小数点后保留几位
	   * @return 四舍五入后的结果
	   *//*

	  public static double round(double v,int scale){
		if(scale<0){
		  throw new IllegalArgumentException(
		  "The scale must be a positive integer or zero");
		}
		BigDecimal b = new BigDecimal(Double.toString(v));
		BigDecimal one = new BigDecimal("1");
		return (b.divide(one,scale,BigDecimal.ROUND_HALF_UP)).doubleValue();
	  }
	  public static String round(float a_Num)
	   {
		   Float ft = new Float(a_Num);
		   BigDecimal bd = new BigDecimal(ft.doubleValue());
		   BigDecimal one = new BigDecimal("1");
		   return String.valueOf((bd.divide(one,DEF_DIV_SCALE,BigDecimal.ROUND_HALF_UP)).doubleValue());

	   }

	   public static String round(double a_Num)
	   {
		   BigDecimal bd = new BigDecimal(a_Num);

		   return round(bd.setScale(2,6).toString());
	   }

	   public static String round(BigDecimal a_Num)
	   {
		   return round(a_Num.setScale(2,6).toString());
	   }

	   public static String round(int a_Num)
	   {
		   String strTemp;
		   int a_Bit = 2;

		   strTemp = Integer.toString((Math.round(a_Num * 100) / 100));
		   if (strTemp.indexOf(".") == -1)
			   strTemp += ".00";
		   else
			   strTemp += "00";
		   strTemp = strTemp.substring(0,strTemp.indexOf(".")+3);
		   return strTemp;
	   }

	   public static String round(String strTemp)
	   {
	   		System.out.println(strTemp);
		   if (strTemp.indexOf(".") == -1)
			   strTemp += ".00";
		   else
			   strTemp += "00";
		   strTemp = strTemp.substring(0,strTemp.indexOf(".")+3);
		   return strTemp;
	   }
	public static void main(String[] args) {

		// double f = add()
		//System.out.println(Round(0.1245));
		System.out.println(round((Double)(2262.598269079464988198269079464988198269),4));
		System.out.println(Util.round(new BigDecimal("2262.598269079464988198269079464988198269")));
	}
}
*/
