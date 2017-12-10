/*
package com.common.util;

import static java.math.BigDecimal.ROUND_HALF_UP;

import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.beanutils.PropertyUtils;
import org.apache.commons.lang.StringUtils;

import com.hx.base.dao.JBaseDao;



@SuppressWarnings("unchecked")
public class Util {
	// 报表一行能够容纳的字节数
	public static final int LINE_BYTE_SIZE = 52;
	public static final String SYS_USERS_KEY = "SYS_USERS";

	public static final List<String> USERS_LIST = new ArrayList<String>();
	static {
		USERS_LIST.add("AAE011");
		USERS_LIST.add("AAE012");
		USERS_LIST.add("AAE014");
	}

	*/
/**
	 * 通过身份证号取得年龄
	 *
	 * @param String
	 *            身份证号 18或15位
	 * @return int 年龄
	 *//*

	public static int getAgeByIdcard(String idno) {
		String idCard = StringUtils.trimToEmpty(idno);
		if (IDCardUtil.isValidIdentity(idCard)) {// 身份证号合法
			return IDCardUtil.getAge(idCard);
		}
		return 0;
	}

	*/
/**
	 * 通过出生日期取得年龄
	 *
	 * @param String
	 *            出生日期 2001-01-01
	 * @return int 年龄
	 *//*

	public static int getAgeByBirthday(String as_birthday) {
		int age = 0;
		String birthday = StringUtils.trimToEmpty(as_birthday);
		if (!StringUtils.isBlank(birthday)) {
			age = Integer.valueOf(com.hx.base.util.DateUtil
					.getCurrentYear())
					- Integer.valueOf(birthday.substring(0, 4));
			int birthMonth = Integer.parseInt(birthday.substring(5, 7));
			int currentMonth = Integer
					.valueOf(com.hx.base.util.DateUtil
							.getCurrentMonth());
			if (currentMonth - 1 < birthMonth) {
				age--;
			}
		}
		return age;
	}

	*/
/**
	 * 采用四舍五入的方式将value转换为两位小数的字符串
	 *
	 * @param value
	 *            将要转换的数字
	 * @return 采用四舍五入的方式将value转换为两位小数的字符串
	 *//*

	public static String round(Number value) {
		return round(value, 2);
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

	public static String round(Number value, int scale) {
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
	 * 调用对象o的名为methodName方法
	 *
	 * @param o
	 *            任意对象
	 * @param methodName
	 *            要调用的方法名
	 * @param args
	 *            方法的参数
	 * @return 调用失败为null，否则返回该方法调用后的结果
	 *//*

	public static Object invokeMethod(Object o, String methodName,
			Object... args) {
		Class clz = o.getClass();
		Method[] methods = clz.getDeclaredMethods();
		for (Method method : methods) {
			if (method.getName().equals(methodName))
				try {
					return method.invoke(o, args);
				} catch (Exception e) {
					return null;
				}
		}
		return null;
	}

	*/
/**
	 * 调用对象o的名为methodName方法（含继承）
	 *
	 * @param o
	 *            任意对象
	 * @param methodName
	 *            要调用的方法名
	 * @param superClass
	 * 			  true继承获取父类Class，method
	 * @param args
	 *            方法的参数
	 * @return 调用失败为null，否则返回该方法调用后的结果
	 *//*

	public static Object invokeMethod(Object o, String methodName, boolean superClass,
			Object... args) {
		Class clz = o.getClass();
		Method[] methods = clz.getDeclaredMethods();
		for (Method method : methods) {
			if (method.getName().equals(methodName))
				try {
					return method.invoke(o, args);
				} catch (Exception e) {
					return null;
				}
		}
		if(superClass){
			clz = o.getClass().getSuperclass();
			methods = clz.getDeclaredMethods();
			for (Method method : methods) {
				if (method.getName().equals(methodName))
					try {
						return method.invoke(o, args);
					} catch (Exception e) {
						return null;
					}
			}
		}
		return null;
	}

	*/
/**
	 * 按字符的宽度将过长的字符串分割成报表的多行
	 *
	 * @param source
	 *            需要分割的字符串
	 * @return 分割后的字符串list
	 * @throws UnsupportedEncodingException
	 *//*

	public static List<String> getReportSplit(String source, int splitByteSize)
			throws UnsupportedEncodingException {
		int lineByteSize = splitByteSize == 0?LINE_BYTE_SIZE:splitByteSize;
		ArrayList<String> lines = new ArrayList<String>();
		if (StringUtils.isBlank(source)) {// null或空字符串
			lines.add("");
			return lines;
		}
		int cnt = 0;
		StringBuilder line = new StringBuilder();
		for (int i = 0; i < source.length(); i++) {
			while (cnt >= lineByteSize) {
				lines.add(line.toString());
				line = new StringBuilder();
				cnt = 0;
			}
			char ch = source.charAt(i);
			if (ch < 128)
				cnt++;
			else
				cnt += 2;
			line.append(ch);
		}
		if (line.length() > 0)
			lines.add(line.toString());
		return lines;
	}

	*/
/**
	 * 按字符的宽度将过长的字符串分割成报表的多行(第一行可缩进)
	 *
	 * @param source
	 *            需要分割的字符串
	 * @return 分割后的字符串list
	 * @throws UnsupportedEncodingException
	 *//*

	public static List<String> getReportSplit2(String source, int firstRowByteSize, int splitByteSize)
			throws UnsupportedEncodingException {
		int firstRowSize = firstRowByteSize == 0?LINE_BYTE_SIZE:firstRowByteSize;
		int lineByteSize = splitByteSize == 0?LINE_BYTE_SIZE:splitByteSize;
		ArrayList<String> lines = new ArrayList<String>();
		if (StringUtils.isBlank(source)) {// null或空字符串
			lines.add("");
			return lines;
		}
		int cnt = 0;
		StringBuilder line = new StringBuilder();
		for (int i = 0; i < source.length(); i++) {
			while (cnt >= firstRowSize) {
				lines.add(line.toString());
				line = new StringBuilder();
				cnt = 0;
				firstRowSize = lineByteSize;
			}
			char ch = source.charAt(i);
			if (ch < 128)
				cnt++;
			else
				cnt += 2;
			line.append(ch);
		}
		if (line.length() > 0)
			lines.add(line.toString());
		return lines;
	}

	*/
/**
	 * 开发数据库中汉字转码
	 *
	 * @param str
	 * @return
	 * @throws UnsupportedEncodingException
	 *//*

	public static String devDecode(String str) {
		if (StringUtils.isBlank(str))
			return "";
		try {
			return new String(str.getBytes("ISO-8859-1"), "GBK");
		} catch (UnsupportedEncodingException e) {
			return "";
		}
	}


	*/
/**
	 * 清空指定的对象，将bean的所有属性都设置成NULL
	 *
	 * @param bean
	 * @throws Exception
	 *//*

	public static void cleanBean(Object bean) throws Exception {
		Map<String, Object> props = BeanUtils.describe(bean);
		for (String prop : props.keySet()) {
			if (null == props.get(prop))
				continue;
			BeanUtils.copyProperty(bean, prop, null);
		}
	}

	*/
/**
	 * 清空指定的对象，将bean的所有属性都设置成NULL
	 *
	 * @param bean
	 * @param flag true包含字段清空，false不包含字段清空
	 * @param String... 字段
	 * @throws Exception
	 *//*

	public static void cleanBean(Object bean, boolean flag, String... colArray) throws Exception {
		Map<String, Object> props = BeanUtils.describe(bean);

		String cols = "";
		if(colArray.length > 0)
			for(String col: colArray){
				cols+=col.toLowerCase()+",";
			}
		for (String prop : props.keySet()) {
			try{
				if((flag && cols.contains(prop)) || (!flag && !cols.contains(prop))){
					BeanUtils.copyProperty(bean, prop, null);
				}else{
					continue;
				}
			}catch(Exception e){
				continue;
			}
		}
	}

	*/
/**
	 * 简单的Bean对象字符串属性去空格
	 *
	 * @param obj
	 *            Bean对象
	 * @param trim
	 *            NULL转换为空串标志： 不输入或值为true,则把NULL转换为空串，其余字符串去空格;
	 *            如果值为false,则把空串转换为NULL,值为NULL的保持不变;
	 * @throws Exception
	 *//*

	public static void trimSimplePropertyBean(Object obj, boolean... trim) throws Exception {
		Map propsMap = null;// 属性集合
		Set keySet = null;// 属性名集合
		Iterator iterator = null;// 属性名迭代器
		Class propType = null;// 属性类型
		String propName = null;// 属性名
		try {
			propsMap = BeanUtils.describe(obj);
			keySet = propsMap.keySet();
			iterator = keySet.iterator();
			while (iterator.hasNext()) {
				propName = iterator.next().toString();
				propType = PropertyUtils.getPropertyType(obj, propName);
				if (propType.getSimpleName().equals("String")) {// 属性类型为字符串
					if (PropertyUtils.getProperty(obj, propName) != null) {// 字符串属性不为
						// NULL
						if (trim.length > 0 && trim[0] == false) {// 空串 置换为 NULL
							PropertyUtils.setProperty(obj, propName,
									StringUtils.trimToNull(propsMap.get(
											propName).toString()));
						} else {
							PropertyUtils.setProperty(obj, propName,
									StringUtils.trimToEmpty(propsMap.get(
											propName).toString()));
						}
					} else {// 字符串属性为 NULL
						if (trim.length == 0
								|| (trim.length > 0 && trim[0] == true)) {// NULL
							// 置换为
							// 空串
							PropertyUtils.setProperty(obj, propName, "");
						}
					}
				}
			}
		} catch (Exception e) {
			throw e;
		}
	}

	*/
/**
	 * Double -> 人民币大写
	 *
	 * @see 带有 “负”、“元”、“角”、“分”、“整” 字样
	 * @param val
	 *            转换数字
	 * @return String 人民币大写
	 * @author chen liang
	 *//*

	public static String NumToRMB(double val) {
		String HanDigiStr[] = new String[] { " 零", " 壹", " 贰", " 叁", " 肆",
				" 伍", " 陆", " 柒", " 捌", " 玖" };
		String HanDiviStr[] = new String[] { "", " 拾", " 佰", " 仟", " 万", " 拾",
				" 佰", " 仟", " 亿", " 拾", " 佰", " 仟", " 万", " 拾", " 佰", " 仟",
				" 亿", " 拾", " 佰", " 仟", " 万", " 拾", " 佰", " 仟" };
		String SignStr = "";
		String TailStr = "";
		long fraction, integer;
		int jiao, fen;
		if (val < 0) {
			val = -val;
			SignStr = "负";
		}
		if (val > 99999999999999.999 || val < -99999999999999.999)
			return "数值位数过大!";
		// 四舍五入到分
		long temp = Math.round(val * 100);
		integer = temp / 100;
		fraction = temp % 100;
		jiao = (int) fraction / 10;
		fen = (int) fraction % 10;
		if (jiao == 0 && fen == 0) {
			TailStr = " 整";
		} else {
			TailStr = HanDigiStr[jiao];
			if (jiao != 0) {
				TailStr += " 角";
			}
			if (integer == 0 && jiao == 0) // 零元后不写零几分
			{
				TailStr = "";
			}
			if (fen != 0) {
				TailStr += HanDigiStr[fen] + " 分";
			} else {
				TailStr += " 整";
			}
		}
		// 下一行可用于非正规金融场合，0.03只显示“叁分”而不是“零元叁分”
		// if( !integer ) return SignStr+TailStr;
		return SignStr + PositiveToHanStr(String.valueOf(integer)) + " 元"
				+ TailStr;
	}

	*/
/**
	 * String -> 人民币大写
	 *
	 * @param NumStr
	 *            整数字符串
	 * @return String 人民币大写
	 * @author chen liang
	 *//*

	public static String PositiveToHanStr(String NumStr) {
		String HanDigiStr[] = new String[] { " 零", " 壹", " 贰", " 叁", " 肆",
				" 伍", " 陆", " 柒", " 捌", " 玖" };
		String HanDiviStr[] = new String[] { "", " 拾", " 佰", " 仟", " 万", " 拾",
				" 佰", " 仟", " 亿", " 拾", " 佰", " 仟", " 万", " 拾", " 佰", " 仟",
				" 亿", " 拾", " 佰", " 仟", " 万", " 拾", " 佰", " 仟" };
		// 输入字符串必须正整数，只允许前导空格(必须右对齐)，不宜有前导零
		String RMBStr = "";
		boolean lastzero = false;
		boolean hasvalue = false; // 亿、万进位前有数值标记
		int len, n;
		len = NumStr.length();
		if (len > 15)
			return "数值过大!";
		for (int i = len - 1; i >= 0; i--) {
			if (NumStr.charAt(len - i - 1) == ' ')
				continue;
			n = NumStr.charAt(len - i - 1) - '0';
			if (n < 0 || n > 9)
				return "输入含非数字字符!";
			if (n != 0) {
				if (lastzero)
					RMBStr += HanDigiStr[0];
				if (!(n == 1 && (i % 4) == 1 && i == len - 1)) // 十进位处于第一位不发壹音
					RMBStr += HanDigiStr[n];
				RMBStr += HanDiviStr[i]; // 非零值后加进位，个位为空
				hasvalue = true; // 置万进位前有值标记
			} else {
				if ((i % 8) == 0 || ((i % 8) == 4 && hasvalue)) // 亿万之间必须有非零值方显示万
					RMBStr += HanDiviStr[i]; // “亿”或“万”
			}
			if (i % 8 == 0)
				hasvalue = false; // 万进位前有值标记逢亿复位
			lastzero = (n == 0) && (i % 4 != 0);
		}
		if (RMBStr.length() == 0)
			return HanDigiStr[0]; // 输入空字符或"0"，返回"零"
		return RMBStr;
	}



	private static String mapToString(Map map) {
		if (map == null || map.size() < 1) {
			return "'00000'";// 没有设定资源
		}
		StringBuilder str = new StringBuilder();
		for (Iterator it = map.entrySet().iterator(); it.hasNext();) {
			Map.Entry ent = (Map.Entry) it.next();
			str.append(",'").append(ent.getKey()).append("'");
		}
		return str.substring(1);
	}

	public static TreeMap<String, String> CodeList2Map(List list)
	{

		TreeMap<String, String> map = new TreeMap<String, String>();
		for (int i = 0; i < list.size(); ++i)
		{
			Map tpMap = (Map) list.get(i);
			map.put(CommonTools.nullToString(tpMap.get("KEY")).trim(), CommonTools.nullToString(tpMap.get("NAME")));
		}
		return map;
	}


    */
/**-----------------------------------------------------------------------
     *getAppPath需要一个当前程序使用的Java类的class属性参数，它可以返回打包过的
     *Java可执行文件（jar，war）所处的系统目录名或非打包Java程序所处的目录
     *@param cls为Class类型
     *@return 返回值为该类所在的Java程序运行的目录
     *
     *System.getProperty("java.class.path")//这个方法可以获取当前运行程序的完整路径,绝对的路径,并且适应操作系统,无需处理,更加high的是,,哪怕你把jar文件弄成了exe文件,,都可以获取哦,相信非常多的人需要.
	  System.getProperty("usr.dir")//获取当前运行程序的完整目录,配合上面那个使用,相信问题都没了.
     -------------------------------------------------------------------------*//*

    public static String getAppPath(Class cls){
        //检查用户传入的参数是否为空
        if(cls==null)
         throw new IllegalArgumentException("参数不能为空！");
        ClassLoader loader=cls.getClassLoader();
        //获得类的全名，包括包名
        String clsName=cls.getName()+".class";
        //获得传入参数所在的包
        Package pack=cls.getPackage();
        String path="";
        //如果不是匿名包，将包名转化为路径
        if(pack!=null){
            String packName=pack.getName();
           //此处简单判定是否是Java基础类库，防止用户传入JDK内置的类库
           if(packName.startsWith("java.")||packName.startsWith("javax."))
              throw new IllegalArgumentException("不要传送系统类！");
            //在类的名称中，去掉包名的部分，获得类的文件名
            clsName=clsName.substring(packName.length()+1);
            //判定包名是否是简单包名，如果是，则直接将包名转换为路径，
            if(packName.indexOf(".")<0) path=packName+"/";
            else{//否则按照包名的组成部分，将包名转换为路径
                int start=0,end=0;
                end=packName.indexOf(".");
                while(end!=-1){
                    path=path+packName.substring(start,end)+"/";
                    start=end+1;
                    end=packName.indexOf(".",start);
                }
                path=path+packName.substring(start)+"/";
            }
        }
        //调用ClassLoader的getResource方法，传入包含路径信息的类文件名
        java.net.URL url =loader.getResource(path+clsName);
        //从URL对象中获取路径信息
        String realPath=url.getPath();
        //去掉路径信息中的协议名"file:"
        int pos=realPath.indexOf("file:");
        if(pos>-1) realPath=realPath.substring(pos+5);
        //去掉路径信息最后包含类文件信息的部分，得到类所在的路径
        pos=realPath.indexOf(path+clsName);
        realPath=realPath.substring(0,pos-1);
        //如果类文件被打包到JAR等文件中时，去掉对应的JAR等打包文件名
        if(realPath.endsWith("!"))
            realPath=realPath.substring(0,realPath.lastIndexOf("/"));
      */
/*------------------------------------------------------------
       ClassLoader的getResource方法使用了utf-8对路径信息进行了编码，当路径
        中存在中文和空格时，他会对这些字符进行转换，这样，得到的往往不是我们想要
        的真实路径，在此，调用了URLDecoder的decode方法进行解码，以便得到原始的
        中文及空格路径
      -------------------------------------------------------------*//*

      try{
        realPath=java.net.URLDecoder.decode(realPath,"utf-8");
       }catch(Exception e){throw new RuntimeException(e);}
       return realPath;
    }//getAppPath定义结束
   //-----------------------------------------------------------------

    */
/**根据节点id，取得所有子点id
     * @param codeId
     * @param dao
     * @return
     *//*

    public static void  getchildrenId(String codeId, JBaseDao dao, StringBuilder sf)
    {
    	if(sf.length() < 1)
    	{
    		sf.append("''");
    	}
    	String sql = "SELECT SUBCODE FROM SYS_CODELIST WHERE PARENTCODE = '"+codeId+"'";
    	List list = dao.queryForList(sql);
    	if(list == null || list.size() < 1 )
    	{
    		sf.append(",'").append(codeId).append("'");
    	}
    	for(int i=0;i<list.size();i++)
    	{
    		Map m = (Map)list.get(i);
    		String subid = CommonTools.nullToString(m.get("SUBCODE"));//子点ID
    		getchildrenId(subid, dao, sf);
    	}
    }
    
	*/
/**
	 * 测试Main
	 *
	 * @param args
	 * @throws Exception
	 *//*

	public static void main(String[] args) throws Exception {
		// System.out.println(round(4.015 * 100));
		// System.out.println(round(2.74246, 4));
		// System.out.println(toDateString(new Date()));
		// System.out.println(toTimeString(new Date()));
		// System.out.println(toDateTimeString(new Date(), "yyyyMM"));
		// System.out.println(NumToRMBStr(-123.456));
		// System.out.println(PositiveIntegerToHanStr("123"));
		// System.out.println(PositiveIntegerToHanStr("-123"));
		// System.out.println(PositiveIntegerToHanStr("123.456"));

	}

}
*/
