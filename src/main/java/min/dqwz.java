package min;

import org.apache.pdfbox.pdmodel.PDDocument;

import java.io.ByteArrayOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;


public class dqwz {
    /**
     * 读取pdf中文字信息(全部)
     */
    public StringBuilder getText(String fileName) throws IOException {
        StringBuilder text;
        SavePdfDocument pdfDocument = new SavePdfDocument();
        PDDocument document = pdfDocument.getPdDocument(fileName);
        //将提取出来的字节流转换为字符流进行显示
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        OutputStreamWriter writer = new OutputStreamWriter(out);
        getTextStripper(document, writer);
        document.close();
        out.close();
        writer.close();
        byte[] con = out.toByteArray();
        text = new StringBuilder(String.valueOf(con));
        log.info("提取的文本内容为:"+textString);
        return textString;
    }

    }
