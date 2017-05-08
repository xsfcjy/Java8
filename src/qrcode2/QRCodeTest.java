package qrcode2;

import java.awt.image.BufferedImage;  
import java.io.InputStream;  
import java.net.URL;  
  
import javax.imageio.ImageIO;  
  
  
import jp.sourceforge.qrcode.QRCodeDecoder;  
  
/** 
 * 二维码生成测试类 
 * @author Cloud 
 * @data   2016-11-21 
 * QRCodeTest 
 */  
  
public class QRCodeTest {  
  
    public static void main(String[] args) throws Exception {  
         
          // QRcode 二维码生成测试 
          QRCodeUtil.QRCodeCreate("http://www.baidu.com?houseCode=22222222", "D:\\soft\\java\\qrcode\\images\\qrcode.jpg", 21, "D:\\soft\\java\\qrcode\\images\\timg.jpg"); 
//          QRCodeUtil.zxingCodeCreate("http://blog.csdn.net/u014266877", 300, 300, "E://zxingcode.jpg", "jpg"); 
        /** 
         *     QRcode 二维码解析测试 
         *    String qrcodeAnalyze = QRCodeUtil.QRCodeAnalyze("E://qrcode.jpg"); 
         */  
        /** 
         * ZXingCode 二维码生成测试 
         * 
         */  
        /** 
         * ZxingCode 二维码解析 
         *    String zxingAnalyze =  QRCodeUtil.zxingCodeAnalyze("E://zxingcode.jpg").toString(); 
         */  
          String zxingAnalyze =  QRCodeUtil.zxingCodeAnalyze("D:\\soft\\java\\qrcode\\images\\qrcode.jpg").toString();     
          System.out.println(zxingAnalyze);  
          zxingAnalyze =  QRCodeUtil.zxingCodeAnalyze("D:\\soft\\java\\qrcode\\images\\new.gif").toString();
          System.out.println(zxingAnalyze);  
    }  
} 
