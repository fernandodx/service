package br.com.util;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class RelatorioUtil {

	public File exportarExcel(String nomeArquivo) throws Exception {
		
		File file = new File(nomeArquivo+".xls"); //Criamos um nome para o arquivo  
		HSSFWorkbook workbook = new HSSFWorkbook();
		HSSFSheet primeiraAba = workbook.createSheet("Aba 1");
		
		FileOutputStream fos = null;
		
		try{
			
			fos = new FileOutputStream(new File(nomeArquivo));
			
			//LOOP
			
			HSSFRow linha = primeiraAba.createRow(0);
			linha.createCell(0).setCellValue("DATA");
			linha.createCell(1).setCellValue("NOME");
			HSSFRow linha1 = primeiraAba.createRow(1);
			linha1.createCell(0).setCellValue("12/12/2012");
			linha1.createCell(1).setCellValue("Fernando");
			
			BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(file)); //Criamos o arquivo  
			bos.write(workbook.getBytes()); //Gravamos os bytes lá  
			bos.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			fos.flush();
			fos.close();
			
		}
		
		return file;
	}
	
	
	public void gerarExcel(String nomeArquivo) throws Exception {
		
		HSSFWorkbook workbook = new HSSFWorkbook();
		HSSFSheet primeiraAba = workbook.createSheet("Aba 1");
		
		FileOutputStream fos = null;
		
		try{
			
			fos = new FileOutputStream(new File(nomeArquivo));
			
			//LOOP
			
			HSSFRow linha = primeiraAba.createRow(0);
			linha.createCell(0).setCellValue("DATA");
			linha.createCell(1).setCellValue("NOME");
			HSSFRow linha1 = primeiraAba.createRow(1);
			linha1.createCell(0).setCellValue("12/12/2012");
			linha1.createCell(1).setCellValue("Fernando");
			
			workbook.write(fos);
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			fos.flush();
			fos.close();
		}
		
	}
	
	
}
