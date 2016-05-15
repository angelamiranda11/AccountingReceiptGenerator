package model;
import com.itextpdf.text.*;
import java.io.*;
import com.itextpdf.text.pdf.PdfWriter;

public class MyPDFCreator {
	public static void generatePDF(ORBean or){
		Document docu = new Document();
		
		try
		{
			PdfWriter.getInstance(docu, new FileOutputStream("C:/ICS113/eclipse_ws/MVC_or/PDFOutput.pdf"));
			
			docu.open();
			
			docu.add(new Paragraph(""
					+ "tjrkljtkl "));
			
			docu.close();
		}
		
		catch(DocumentException de)
		{
			de.printStackTrace();
		}
		catch(FileNotFoundException fnfe)
		{
			fnfe.printStackTrace();
		}
	}
}
