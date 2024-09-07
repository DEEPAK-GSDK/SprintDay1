package com.cg.CsvRead;

	import java.io.*;
	import java.io.FileReader;
	import java.io.IOException;
	import java.util.Iterator;
	import java.util.*;
	import org.testng.annotations.DataProvider;
	import com.opencsv.CSVReader;
	public class CsvRead {
		@DataProvider(name="csv")

	   public static Iterator<Object[]> csvReader() throws IOException

	   {

          //opening file
		   File file=new File("C:\\Users\\BRASAGNA\\Desktop\\CSV.csv");
	       //Object for CSVREader
		   CSVReader read=new CSVReader(new FileReader(file));

	       //get header

	       String[] keys=read.readNext();

	       List<Object[]> list=new ArrayList<>();



	       if(keys!=null)

	       {

	       String[] data;

	       while((data=read.readNext())!=null)

	       {

	           Map<String,String> testdata=new HashMap<>();



	           for(int i=0;i<keys.length;i++)

	           {

	               testdata.put(keys[i], data[i]);

	           }

	           list.add(new Object[] {testdata});



	       }

	       }

	       read.close();



	       return list.iterator();



	   }


	}


