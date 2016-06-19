/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tesseracttest;
import java.io.*;
import net.sourceforge.tess4j.*;
/**
 *
 * @author Ali
 */
 
public class Main {
public static void main(String[] args) {
File imageFile = new File("testimg1.png");
Tesseract instance = Tesseract.getInstance(); //
 
try {
 
String result = instance.doOCR(imageFile);
System.out.println("Printing OCR output from image file:\n"+result);
 
} catch (TesseractException e) {
System.err.println(e.getMessage());
}
}
}
