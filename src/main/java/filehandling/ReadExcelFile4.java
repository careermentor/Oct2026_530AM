package filehandling;

import java.io.FileInputStream;
import java.text.SimpleDateFormat;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelFile4 
{

	public static void main(String[] args) throws Exception 
	{
		//print number starting from 1 to 10 incrementally by 1
		
		/*
		for(int i=1; i<=10; i++)
		{
			System.out.println(i);
		}
		*/
		
		FileInputStream fis = new FileInputStream("./data/testdata.xlsx");
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		XSSFSheet sh1 = wb.getSheet("register"); 
		
		int nr = sh1.getPhysicalNumberOfRows();  //nr=4
		
		for(int i=0; i<nr; i++)
		{
			XSSFRow row = sh1.getRow(i);  //i=0, i=1, i=2, i=3
			
			//when i=0, i=1
			
			int nc = row.getPhysicalNumberOfCells();  //nc=2, nc=3
			
			for(int j=0; j<nc; j++)
			{
				XSSFCell col = row.getCell(j);  //j=0, j=1, j=2
				
				if(col.getCellType()==CellType.STRING)
				{
					System.out.print(col.getStringCellValue() + "    ");
				}
				else if(col.getCellType()==CellType.BOOLEAN)
				{
					System.out.print(col.getBooleanCellValue() + "    ");
				}
				
				else if(col.getCellType()==CellType.NUMERIC)
				{
					
					if(DateUtil.isCellDateFormatted(col))
					{
						SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
						
						System.out.println(sdf.format(col.getDateCellValue()) + "     ");
						
					}
					
					else
					{
						System.out.print(col.getNumericCellValue() + "    ");
					}
					
					
				}
				
				
				
				
				//col.getNumericCellValue();
				//col.getBooleanCellValue();
				//col.getDateCellValue();
				
			}
			
			System.out.println();
		}
		
		/*
		//first row
		XSSFRow row1 = sh1.getRow(0);
		
		XSSFCell col1 = row1.getCell(0);  //col1
		System.out.print(col1.getStringCellValue() + "    ");
		
		XSSFCell col2 = row1.getCell(1);  //col2
		System.out.print(col2.getStringCellValue() + "    ");
		
		
		System.out.println();
		
		//second row
				XSSFRow row2 = sh1.getRow(1);
				
				XSSFCell col21 = row2.getCell(0);  //col1
				System.out.print(col21.getStringCellValue() + "    ");
				
				XSSFCell col22 = row2.getCell(1);  //col2
				System.out.print(col22.getStringCellValue() + "    ");
				
				System.out.println();
				
				//third row
				XSSFRow row3 = sh1.getRow(2);
				
				XSSFCell col31 = row3.getCell(0);  //col1
				System.out.print(col31.getStringCellValue() + "    ");
				
				XSSFCell col32 = row3.getCell(1);  //col2
				System.out.print(col32.getStringCellValue() + "    ");
				
			*/
	}
	
}
