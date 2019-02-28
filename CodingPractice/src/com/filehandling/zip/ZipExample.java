package com.filehandling.zip;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipExample {

	public static void main(String[] args) {
		String filePath = "C:\\Users\\sohan.joshi\\Desktop\\ahrs_ohrcc.log";
		String logName ;
		try {
			
            File file = new File(filePath);
            String zipFileName = file.getName().concat(".zip");
            String zipFilePath = Paths.get(filePath)
            					.getParent()
            					.toString()
            					 + File.separator
            					 + zipFileName;
            
            FileOutputStream fos = new FileOutputStream(zipFilePath);
            ZipOutputStream zos = new ZipOutputStream(fos);
 
            zos.putNextEntry(new ZipEntry(file.getName()));
 
            byte[] bytes = Files.readAllBytes(Paths.get(filePath));
            
            filePath = zipFilePath;
            logName = zipFileName;
            
            zos.write(bytes, 0, bytes.length);
            zos.closeEntry();
            zos.close();
 
        } catch (FileNotFoundException ex) {
            System.err.format("The file %s does not exist", filePath);
        } catch (IOException ex) {
            System.err.println("I/O error: " + ex);
        }

	}

}
