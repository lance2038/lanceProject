/*

package com.common.util;

import java.awt.image.BufferedImage;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.Writer;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

import javax.imageio.ImageIO;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

*/
/**
 *
 *
 * @author Aries.Y
 * @since 2008-12-15
 *//*

public class FileUtils {
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

    public final static String PATH_TEMPFILE = "giis" + File.separator + "tempFile";
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
/** IC卡操作返回xml字符窜DataArea的id属性的值 *//*

    public final static String XML_DATAAREA_ID_ICCARD = "D00E00";
    */
/** XML数据元素名：Field *//*

    public final static String XML_ELEMENT_FIELD = "Field";
    */
/** XML数据元素名：DataArea *//*

    public final static String XML_ELEMENT_DATAAREA = "DataArea";
    */
/** XML数据属性名：id *//*

    public final static String XML_ATTR_ID = "id";
    */
/** XML数据值：EMPNO（保险编号） 对应aac001 *//*

    public final static String XML_DATA_EMPNO = "EMPNO";
    */
/** XML数据值：ICNO（'IC卡号） 对应aaz500 *//*

    public final static String XML_DATA_ICNO = "ICNO";


    */
/** response句柄responseKey *//*

    public final static String RESPONSE_KEY = "responseKey";
    */
/** responseSuccess *//*

    public final static String RESPONSE_SUCCESS = "responseSuccess";
    */
/** responseFailse *//*

    public final static String RESPONSE_FAILSE = "responseFailse";



    */
/** PAGE:SELECTION PAGE指向选择句柄*//*

    public final static String PAGE_SELECTION = "selection";
    */
/** PAGE:toInsert 新增*//*

    public final static String PAGE_ADD = "add";
    */
/** PAGE:toInsert 编辑*//*

    public final static String PAGE_EDIT = "edit";
    */
/** PAGE:toDelete 删除*//*

    public final static String PAGE_DELETE = "delete";
    */
/** PAGE:toView 查看*//*

    public final static String PAGE_VIEW = "view";
    */
/** PAGE:toSelect 查询*//*

    public final static String PAGE_SELECT = "select";
    */
/** PAGE:reset 重置*//*

    public final static String PAGE_RESET = "reset";

    */
/** 空值，即"" *//*

    public final static String STR_EMPTY = "";
    */
/** 半角空格 *//*

    public final static String STR_SPACE_HALF = " ";
    */
/** true *//*

    public final static String STR_TRUE = "true";
    */
/** failse *//*

    public final static String STR_FAILSE = "failse";
    */
/** 初始化密码 *//*

    public final static String STR_PASSOWRD_DEFAULT = "";
    */
/** 假的空密码 *//*

    public final static String STR_PASSOWRD_FAKE_NULL = "xxxxxx";
    */
/** cardOperPrintForm业务打印单Form *//*

    public final static String STR_FORM_CARDOPERPRINT = "cardOperPrintForm";
    */
/** 0 *//*

    public final static String STR_ZERO = "0";
    */
/** 是 *//*

    public final static String STR_CHN_YES = "是";
    */
/** 否 *//*

    public final static String STR_CHN_NO = "否";

    */
/** 执行100条flush一次 *//*

    public final static int SIZE_FLUSH_BATCH_100 = 100;
    */
/** sql语句中，in条件参数最多能容纳的长度 *//*

    public final static int SIZE_MAX_ARGS_IN_LIST = 999;
    */
/** 照片写入时一次性可以写入的最多照片数 *//*

    public final static int SIZE_MAX_WRITE_IMAGE = 200;
    */
/**
     * 创建所需的文件路径
     *
     * @param filepath
     *            文件路径
     *//*

    public static void createPath(String filepath) {

        File file = new File(filepath);
        if (!file.isDirectory()) {// 如果指定路径不是目录
            // 创建目录
            file.mkdir();
        }
    }

    */
/**
     * 执行文件下载
     *
     * @param response
     *            HttpServletResponse对象
     * @param fileFullName
     *            文件绝对路径名称
     * @param displayName
     *            下载时显示的默认文件名称
     * @throws Exception
     *
     * @author Aries.Y
     * @since 2008-12-15
     *//*

    public static void exportFile(HttpServletResponse response, String fileFullName, String displayName)
            throws Exception {

        // 设置response为文件下载
        response.reset();
        response.setContentType("application/x-download");

        // 如果传入文件名为空
        if (ValidateUtils.isNull(displayName)) {
            // 当前时间
            String date = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
            // 当前日期.zip形式
            displayName = date + SUFFIX_ZIP;
        }
        response.addHeader("Content-Disposition", "attachment;filename=" + displayName);

        // 定义ServletOutputStream对象
        ServletOutputStream outp = null;
        // 定义FileInputStream对象
        FileInputStream in = null;
        try {
            // 取得ServletOutputStream
            outp = response.getOutputStream();
            // 生成FileInputStream
            in = new FileInputStream(fileFullName);
            byte[] b = new byte[1024];
            int i = 0;
            while ((i = in.read(b)) > 0) {
                // 将文件流写入ServletOutputStream
                outp.write(b, 0, i);
            }
            outp.flush();
        } finally {
            if (in != null) {
                // 关闭FileInputStream
                in.close();
                in = null;
            }
            if (outp != null) {
                // 关闭ServletOutputStream
                outp.close();
                outp = null;
            }
        }
    }   

    */
/**
     * 写txt文件 若文件不存在则创建
     *
     * @param dataList 数据List，列表存储的对象为String
     * @param filePath 文件路径
     * @param fileName 文件名
     * @return
     * @throws Exception
     *
     * @author Aries.Y
     * @since 2009-2-2
     *//*

    public static int writeTxtFile(List<String> dataList, String filePath, String fileName) throws Exception {
        // 返回值初始化
        int rtnCd = 0;
        // 创建所需的文件路径
        createPath(filePath);

        // 文件名是否空
        if (ValidateUtils.isNull(fileName)) {
            rtnCd = 1;
            return rtnCd;
        }
        // 文件名补全
        if (!fileName.endsWith(SUFFIX_TXT)) {
            fileName += SUFFIX_TXT;
        }

        String fileFullName;
        if (!filePath.endsWith("/") && !filePath.endsWith("\\")) {
            fileFullName = filePath + File.separator + fileName;
        } else {
            fileFullName = filePath + fileName;
        }
        // 创建txt文件
        File txtFile = new File(fileFullName);
        if (!txtFile.exists()) {
            txtFile.createNewFile();
        }

        Writer writer = null;
        try {
            int size2Flush = 1000;
            int count2Flush = 0;
            writer = new PrintWriter(txtFile, "GBK");

            for(String str:dataList) {
                writer.write(str);
                //换行
                writer.write("\r\n");
                count2Flush++;
                // 此处是为尽量节省内存，作用未知（未跟踪过）
                if (count2Flush > size2Flush) {
                    writer.flush();
                    count2Flush = 0;
                }
            }

        } catch (Exception e) {
            throw e;
        } finally {
            if (writer != null){
                writer.flush();
                writer.close();
            }
        }
        // 正常
        rtnCd = -1;
        return rtnCd;
    }

    */
/**
     * 写图片文件
     *
     * @param imgBytes
     *            图片对象的byte[]形式
     * @param path
     *            路径
     * @param fileName
     *            文件名
     * @throws Exception
     *
     * @author Aries.Y
     * @since 2008-12-16
     *//*

    public static void wirteImage(byte[] imgBytes, String path, String fileName) throws Exception {
        // 输入流
        InputStream inputStream = new BufferedInputStream(new ByteArrayInputStream(imgBytes));
        // 可访问图像数据缓冲区的 Image
        BufferedImage image = null;
        // 输出文件
        File file = null;
        try {
            // 读取inputStream
            image = ImageIO.read(inputStream);
            // 创建所需的文件路径
            createPath(path);
            file = new File(path, fileName);
            // 写入
            ImageIO.write(image, IMAGE_TYPE_JPG, file);

        } catch (Exception e) {
            throw e;
        } finally {
            if(image!=null){
                image.flush();
                image = null;
            }
            if (inputStream != null) {
                inputStream.close();
            }
        }
    }

    */
/**
     * 压缩指定文件/文件夹
     *
     * @param path
     *            文件/文件夹路径
     * @param zipName
     *            压缩后的文件名
     * @return -1:正常<br>
     *         0:IO异常<br>
     *         1:压缩文件路径不正确<br>
     *
     * @author Aries.Y
     * @throws FileNotFoundException
     * @since 2008-12-16
     *//*

    public static int zipAll(String path, String zipName) {
        // 返回值初始化
        int rtnCd = 0;
        // 待压缩的文件/文件夹
        File file = new File(path);
        // zip输出流
        ZipOutputStream zipOut = null;
        try {

            zipOut = new ZipOutputStream(new FileOutputStream(zipName));
            // 相对根目录
            String base = "";
            // 压缩目录/文件
            zip(zipOut, file, base);
        } catch (FileNotFoundException e) {
            rtnCd = 1;
        } catch (IOException e) {
            rtnCd = 0;
        } finally {
            try {
                zipOut.close();
            } catch (IOException e) {
                rtnCd = 0;
            }
        }
        return rtnCd;

    }

    */
/**
     * 压缩当前目录/文件
     *
     * @param out
     *            zip输出流
     * @param file
     *            文件夹
     * @param bsseDirectory
     *            base目录
     *
     * @author Aries.Y
     * @throws IOException
     * @since 2008-12-16
     *//*

    private static void zip(ZipOutputStream out, File file, String bsseDirectory) throws IOException {
        // 判断是否是文件夹
        if (file.isDirectory()) {
            File[] files = file.listFiles();
            String base = bsseDirectory;
            // 此处不可使用java.io.File.separator，否则作成的zip文件会有空文件
            out.putNextEntry(new ZipEntry(bsseDirectory + file.getName() + "/"));
            base = bsseDirectory + file.getName() + File.separator;
            // 循环添加
            for (int i = 0; i < files.length; i++) {
                // 迭代方式添加压缩文件/目录
                zip(out, files[i], base);
            }
        } else {
            out.putNextEntry(new ZipEntry(bsseDirectory + file.getName()));
            FileInputStream input = new FileInputStream(file);
            int len;
            byte[] bytes2write = new byte[8192];
            while ((len = input.read(bytes2write)) != -1) {
                out.write(bytes2write, 0, len);
            }
            input.close();
        }
    }

    */
/**
     * @param folderPath
     * @return -1:正常<br>
     *         0:IO异常<br>
     *         1:文件夹路径不正确<br>
     *
     * @author Aries.Y
     * @since 2008-12-16
     *//*

    public static int delFolder(String folderPath) {
        // 返回值初始化
        int rtnCd = 0;
        File baseFile = new File(folderPath);
        // 判断是否为文件夹
        if (!baseFile.isDirectory()) {
            rtnCd = 1;
        } else {
            // 删除执行
            delAllFiles(folderPath);
            // 删除空文件夹根
            baseFile.delete();
            rtnCd = -1;
        }

        return rtnCd;
    }

    */
/**
     * 删除指定文件夹中所有文件
     *
     * @param path
     *            文件夹路径
     *
     * @author Aries.Y
     * @since 2008-12-16
     *//*

    private static void delAllFiles(String path) {
        File file2Del = new File(path);
        // 存在与否判断
        if (!file2Del.exists()) {
            return;
        } else if (!file2Del.isDirectory()) { // 是否目录
            return;
        }
        // 列出当前目录下所有文件名
        String[] files = file2Del.list();
        File tempFile4Del = null;
        String tempFileName = null;
        for (int i = 0; i < files.length; i++) {

            // 文件名设定
            if (files[i].endsWith(File.separator)) {
                tempFileName = path + files[i];
            } else {
                tempFileName = path + File.separator + files[i];
            }
            tempFile4Del = new File(tempFileName);
            // 是否文件
            if (tempFile4Del.isFile()) {
                tempFile4Del.delete();
            } else if (tempFile4Del.isDirectory()) { // 文件夹？
                // 文件夹中所有文件
                delAllFiles(tempFileName);
                // 删除空文件夹根
                tempFile4Del.delete();
            }
        }
    }

    */
/**
     * 删除指定文件
     *
     * @param fileName
     *
     * @author Aries.Y
     * @since 2008-12-16
     *//*

    public static void delFile(String fileName) {
        File file2Del = new File(fileName);
        if (!file2Del.exists()) {
            return;
        } else if (file2Del.isFile()) {
            file2Del.delete();
        } else if (file2Del.isDirectory()) {
            delAllFiles(fileName);
        }
    }

    */
/**
     * 解压缩zip文件
     *
     * @param fileName
     *            zip文件名（包括路径）
     * @param outPath
     *            解压路径
     * @author Aries.Y
     * @throws IOException
     * @since 2008-12-18
     *//*

    public static void unzip(String fileName, String outPath) throws IOException {
        InputStream in = new FileInputStream(fileName);
        upzip(in, outPath);
    }

    */
/**
     * 解压缩zip文件
     *
     * @param in
     *            输入流
     * @param outPath
     *            解压路径
     *
     * @author Aries.Y
     * @throws IOException
     * @since 2008-12-18
     *//*

    public static void upzip(InputStream in, String outPath) throws IOException {
        // zip流初始化
        ZipInputStream zipIn = new ZipInputStream(in);

        // 创建输出目录
        File outFileDir = new File(outPath);
        if (!outFileDir.exists()) {
            outFileDir.mkdir();
        }
        ZipEntry entry = null;
        // 循环每一个zip中的条目
        while ((entry = zipIn.getNextEntry()) != null) {
            // 是否文件夹
            if (entry.isDirectory()) {
                File dir2Unzip = new File(outPath, entry.getName());
                // 创建文件夹
                if (!dir2Unzip.exists()) {
                    dir2Unzip.mkdir();
                }
                // 关闭当前条目
                zipIn.closeEntry();
            } else {
                File file2Unzip = new File(outPath, entry.getName());
                // 创建文件
                file2Unzip.createNewFile();
                FileOutputStream fileOut = new FileOutputStream(file2Unzip);
                byte[] bytes2Write = new byte[8192];
                int len = 0;
                // 写文件
                while ((len = zipIn.read(bytes2Write)) != -1) {
                    fileOut.write(bytes2Write, 0, len);
                }
                fileOut.close();
                // 关闭当前条目
                zipIn.closeEntry();
            }
        }
        in.close();

    }

    */
/**
     * 读取Excel文件的内容
     *
     * @param filePath
     *            文件路径
     * @param fileName
     *            文件名称
     * @return
     *//*

    public static String readExcel(String filePath, String fileName) {
        String file = filePath + File.separator + fileName;
        StringBuffer sb = new StringBuffer();
        Workbook wb = null;
        try {
            // 构造Workbook（工作薄）对象
            wb = Workbook.getWorkbook(new File(file));
        } catch (BiffException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (wb == null)
            return null;

        // 获得了Workbook对象之后，就可以通过它得到Sheet（工作表）对象了
        Sheet[] sheet = wb.getSheets();

        if (sheet != null && sheet.length > 0) {
            // 对每个工作表进行循环
            for (int i = 0; i < sheet.length; i++) {
                // 得到当前工作表的行数
                int rowNum = sheet[i].getRows();
                for (int j = 0; j < rowNum; j++) {
                    // 得到当前行的所有单元格
                    Cell[] cells = sheet[i].getRow(j);
                    if (cells != null && cells.length > 0) {
                        // 对每个单元格进行循环
                        for (int k = 0; k < cells.length; k++) {
                            // 读取当前单元格的值
                            String cellValue = cells[k].getContents();
                            sb.append(cellValue + "\t");
                        }
                    }
                    sb.append("\r\n");
                }
                sb.append("\r\n");
            }
        }
        // 最后关闭资源，释放内存
        wb.close();
        wb = null;
        return sb.toString();
    }

}
*/
