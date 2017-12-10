/*
package com.common.util;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Enumeration;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.ResourceBundle;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

*/
/**
 * 共通方法

 *//*

public class CommonUtils {
    */
/** Messages.properties *//*

    public final static String PROPERTY_MSG = "Messages";
    */
/** 图片格式:jpg *//*

    public final static String IMAGE_TYPE_JPG = "jpg";
    */
/** 图片格式:jpeg *//*

    public final static String IMAGE_TYPE_JPEG = "jpeg";
    */
/** 图片后缀:.jpg *//*

    public final static String SUFFIX_JPG = ".jpg";
    */
/** 图片后缀:.jpeg *//*

    public final static String SUFFIX_JPEG = ".jpeg";
    */
/** csv后缀:.csv *//*

    public final static String SUFFIX_CSV = ".csv";
    */
/** txt后缀:.txt *//*

    public final static String SUFFIX_TXT = ".txt";
    */
/** zip后缀:.zip *//*

    public final static String SUFFIX_ZIP = ".zip";
    */
/** 照片大小限制：2000000 bytes *//*

    public final static int IMAGE_SIZE_LIMIT = 2000000;
    */
/** 日期格式:yyyy-MM-dd HH:mm:ss *//*

    public final static String DATE_FORMAT_DEFAULT = "yyyy-MM-dd HH:mm:ss";
    */
/** 日期格式:yyyy年MM月dd日 HH:mm *//*

    public final static String DATE_FORMAT_2 = "yyyy年MM月dd日 HH:mm";
    */
/** 日期格式:yyyyMMddHHmmss *//*

    public final static String DATE_FORMAT_1 = "yyyyMMddHHmmss";
    */
/** 日期格式:yyyy-MM-dd *//*

    public final static String DATE_FORMAT_3 = "yyyy-MM-dd";
    */
/** 临时文件路径 - 相对于工程路径目录 *//*

    public final static String PATH_TEMPFILE = "giis" + java.io.File.separator + "tempFile";
    */
/** 创建临时照片文件路径使用 *//*

    public final static String STR_PATHPHOTO = "/photos";
    */
/** 符号:_ (下划线) *//*

    public final static String SIGN_UNDERLINE = "_";
    */
/** 符号:' *//*

    public final static String SIGN_SINGLEQUOTE = "'";
    */
/** 符号:, *//*

    public final static String SIGN_COMMA = ",";
    */
/** 符号:. *//*

    public final static String SIGN_DOT = ".";
    */
/** 符号:√ *//*

    public final static String SIGN_RIGHT = "√";
    */
/**
     * 生成完整的社会保障卡卡号
     *
     * @param firstLetter 社会保障卡头字母
     * @param originalStartNum 社会保障卡初始序列号
     * @param count 需要生成的社会保障卡卡号数量
     * @return 生成的社会保障卡卡号数组，如果没有则为null
     *
     * @author Aries.Y
     * @since 2009-2-6
     *//*

    public static String[] generatefullAaz500(String firstLetter, String originalStartNum, int count) {
        if (ValidateUtils.isNull(firstLetter) || ValidateUtils.isNull(originalStartNum)
                || originalStartNum.length() != 7 || count < 1) {
            return null;
        }
        // 生成的卡号数组
        String[] cardNos = new String[count];
        int workCardNum = Integer.parseInt(originalStartNum);
        for (int i = 0; i < count; i++) {
            // 生成校验码
            String validateLetter = generateValidateLetter4Card(firstLetter,"" + workCardNum);
            // 完整的卡号生成
            String cardNum = firstLetter + workCardNum + validateLetter;
            cardNos[i] = cardNum;
            workCardNum++;
        }
        return cardNos;
    }

    */
/**
     * 计算社保卡卡号的校验码数值
     *
     * @param firstLetter 卡号头字母
     * @param num 初始卡号，7位
     * @return 校验码数值
     *
     * @author Aries.Y
     * @since 2009-2-6
     *//*

    public static String generateValidateLetter4Card(String firstLetter, String num){
        // 加权因子
        int[] wi = { 3, 7, 9, 10, 5, 8, 4, 2 };
        int firstNum = Integer.parseInt(firstLetter, 16);
        int[] ci = new int[wi.length];
        ci[0] = firstNum;
        for (int i = 0; i < num.length(); i++) {
            if ((i + 1) < ci.length) {
                ci[i + 1] = Integer.parseInt(num.substring(i, i + 1));
            } else {
                break;
            }
        }
        int sum = 0;
        for (int i = 0; i < wi.length; i++) {
            sum += wi[i] * ci[i];
        }
        String validateLetter = String.valueOf(11-sum%11);
        if ("10".equals(validateLetter)){
            validateLetter = "X";
        } else if ("11".equals(validateLetter)){
            validateLetter = "0";
        }

        return validateLetter;
    }

    */
/**
     * 填充空格到字符串右侧
     *
     * @param str 将要处理的字符串
     * @param len 设定长度
     * @return
     *
     * @author Aries.Y
     * @since 2009-2-2
     *//*

    public static String fillRightSpace(String str, int len) {
        int strLen = 0;
        StringBuffer sb;
        if (str != null) {
            strLen = str.length();
            if (strLen >= len) {
                return str;
            }
            sb = new StringBuffer(str);
        } else {
            sb = new StringBuffer();
        }

        for (int i = 0; i < (len - strLen); i++) {
            sb.append(" ");
        }
        return sb.toString();
    }

    */
/**
     * 如果String对象的值为null，则将其转换成""
     *
     * @param inStr
     * @return
     *
     * @author Aries.Y
     * @since 2008-12-1
     *//*

    public static String getNullToString(String inStr) {
        String out = null;
        if (inStr == null) {
            out = "";
        } else {
            out = inStr;
        }
        return out;
    }

    */
/**
     * trim掉字符串2边的半角/全角空格/制表符
     *
     * @param inStr
     * @return
     *
     * @author Aries.Y
     * @since 2008-12-1
     *//*

    public static String trimSpace(String inStr) {

        if (inStr == null || "".equals(inStr)) {
            return inStr;
        }
        char val[] = inStr.toCharArray();
        int count = val.length;
        int st = 0;
        int len = count;

        while ((st < len) && ((val[st] == '　') || val[st] == ' ' || val[st] == '	')) {
            st++;
        }
        while ((st < len) && ((val[len - 1] == '　') || val[len - 1] == ' ' || val[len - 1] == '	')) {
            len--;
        }

        return ((st > 0) || (len < count)) ? inStr.substring(st, len) : inStr;
    }


    */
/**
     * 字符串格式转换： GBK ->UTF-8
     *
     * @param inStr
     * @return
     * @throws UnsupportedEncodingException
     *
     * @author Aries.Y
     * @since 2008-12-1
     *//*

    public static String gbk2Utf8(String inStr) throws UnsupportedEncodingException{
        return new String(inStr.getBytes("GBK"), "UTF-8");
    }

    */
/**
     * 字符串格式转换： UTF-8 ->GBK
     *
     * @param inStr
     * @return
     *
     * @author Aries.Y
     * @since 2008-12-6
     *//*

    public static String toGBK(String inStr ){
        String str = "";
        try{
            str = new String(inStr.getBytes("GBK"),"ISO-8859-1");
        }catch(Exception e){
            e.printStackTrace();
            return inStr;
        }
        return str ;
    }



    */
/**
     * 利用键值取得Message属性文件中对应的message<br>
     * 适用于对应的message有参数的情况<br>
     * parmList：对应文件中Message的参数，parmList中参数的顺序与其在文件中出现的顺序应当一致<br>
     *
     * @param msgKey 所需message的键值
     * @param parmList 参数列表
     * @return 给定键值对应的的message
     *
     * @author Aries.Y
     * @since 2008-12-1
     *//*

    public static String getMsg(String msgKey, List<String> parmList) {

        // 绑定属性文件
        ResourceBundle rb = ResourceBundle.getBundle(PROPERTY_MSG);
        // 得到Message属性文件的相关message
        String tempMsg = CommonUtils.trimSpace(rb.getString(msgKey));

        // 如果参数列表为空，直接返回，不对参数进行替换
        if (parmList == null || parmList.size() == 0) {
            return msgKey + ":" + tempMsg;
        }

        // 参数规则
        String regEx = "\\{\\d+\\}";
        Pattern p = Pattern.compile(regEx);
        Matcher m = p.matcher(tempMsg);

        StringBuffer sb = new StringBuffer();
        for (int i = 0; m.find(); i++) {
            if (i < parmList.size()) {
                // 实现非终端追加和替换步骤
                m.appendReplacement(sb, parmList.get(i));
            } else {
                break;
            }
        }
        // 实现终端追加和替换步骤
        m.appendTail(sb);

        return msgKey + ":" + sb.toString();

    }


    */
/**
     * 利用键值取得Message属性文件中对应的message<br>
     * 适用于对应的message没有参数的情况<br>
     *
     * @param msgKey 所需message的键值
     * @return 给定键值对应的的message
     *
     * @author Aries.Y
     * @since 2008-12-1
     *//*

    public static String getMsg(String msgKey) {

        // 绑定属性文件
        ResourceBundle rb = ResourceBundle.getBundle(PROPERTY_MSG);
        // 得到Message属性文件的相关message
        String msg = CommonUtils.trimSpace(rb.getString(msgKey));

        return msgKey + ":" + msg;
    }

    */
/**
     * 计算2个日期之间的天数，忽略日期前后顺序
     *
     * @param day1 日期1
     * @param day2 日期2
     * @return
     *
     * @author Aries.Y
     * @since 2008-12-1
     *//*

    public static int diff2Days(Date day1, Date day2){

        long startDay = day1.getTime();
        long endDay = day2.getTime();
        long diff = startDay - endDay;

        return Math.abs((int) (diff / 1000L / 60L / 60L / 24));

    }

    */
/**
     * 取得指定日期格式的当前时间字符串，默认格式：yyyy-MM-dd HH:mm:ss
     *
     * @param formatString
     * @return
     *
     * @author Aries.Y
     * @since 2008-12-19
     *//*

    public static String getCurrentDate(String formatString) {
        Date date = new Date(System.currentTimeMillis());
        String format = formatString;
        if (format == null) {
            format = "yyyy-MM-dd HH:mm:ss";
        }
        return new SimpleDateFormat(format).format(date);
    }


    */
/**
     * 检索的IN条件生成
     *
     * @param list
     * @return
     *
     * @author Aries.Y
     * @since 2009-1-5
     *//*

    public static String makeInSqlArg(List<String> list){
        String[] args = list.toArray(new String[0]);
        return makeInSqlArg(args);
    }

    */
/**
     * 检索的IN条件生成
     *
     * @param args
     * @return
     *
     * @author Aries.Y
     * @since 2009-1-5
     *//*

    public static String makeInSqlArg(String[] args){
        StringBuffer sb = new StringBuffer();
        // 检索的IN条件生成
        for (int i = 0; i < args.length; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append("'");
            sb.append(args[i]);
            sb.append("'");
        }
        return sb.toString();
    }

    */
/**
     * 卡管理工程单独使用的session清除
     *
     * @param request
     *
     * @author Aries.Y
     * @since 2009-1-13
     *//*

    public static void clearDlcmSession(HttpServletRequest request){
        HttpSession session = request.getSession();
        Enumeration em = session.getAttributeNames();
        Object obj = null;
        try {
            while ((obj = em.nextElement()) != null) {
                String name = String.valueOf(obj);
                if (name.startsWith("session")) {
                    session.removeAttribute(name);
                }
            }
        } catch (NoSuchElementException e) {

        }
    }

    */
/**
     * 利用Dom4J，将xml字符串中的元素的属性id作为key，元素的值为value，存入Map<br>如果元素不存在属性id，则不添加
     *
     * @param xmlStr xml格式字符串
     * @return
     *
     * @author Aries.Y
     * @throws DocumentException
     * @since 2009-1-15
     *//*

    public static Map<String,String> getMapFromXml(String xmlStr) throws DocumentException{
        InputStream xmlIn = new ByteArrayInputStream(xmlStr.getBytes());
        SAXReader reader = new SAXReader();
        Document doc = reader.read(xmlIn);
        return null;
    }

    */
/**
     * 将ic卡读卡产生的数据转换成标准接口的读取结果（即相应的xml格式字符串）
     *
     * @param aac001 个人编号
     * @param aaz500 卡号
     * @return xml格式字符串
     * @throws DocumentException
     * @throws IOException
     *
     * @author Aries.Y
     * @since 2009-1-15
     *//*

    public static String makeXML4readICCard(String aac001, String aaz500) throws DocumentException, IOException {
        // 统一接口IC卡读卡的xml模版
        String xmlTemplate = "<?xml version='1.0' encoding='GB2312'?><Output><Field id ='return' text ='返回代码值'>0</Field><Field id ='errMsg' text ='错误信息'>成功</Field><Field id ='state' text ='状态字'>无</Field><DataArea id ='D00E00' text ='参保人员基本信息'><Field id ='EMPNO' text ='保险编号'></Field><Field id ='ICNO' text ='IC卡号'></Field></DataArea></Output>";
        InputStream xmlIn = null;
        Document doc = null;
        try {
            xmlIn = new ByteArrayInputStream(xmlTemplate.getBytes());
            SAXReader reader = new SAXReader();
            doc = reader.read(xmlIn);
            Element root = doc.getRootElement();
            Element dataAreaElement = root.element("root");
            List list = dataAreaElement.elements("child");
            Element element = null;
            for (int i = 0; i<list.size();i++) {
                element = (Element) list.get(i);
                if ("child2".equals(element.attributeValue("child2"))) {
                    element.setText(aac001);
                } else if ("child3".equals(element.attributeValue("child2"))) {
                    element.setText(aaz500);
                }
            }
        } catch (DocumentException e) {
            throw e;
        } finally {
            if (xmlIn != null){
                xmlIn.close();
            }
        }
        return doc.asXML();

    }
}
*/
