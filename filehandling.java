package Jan_Batch_2026;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class fileHandling {
	public static void filedetails() {
		
				System.out.println("File Operations");
				String filePath ="C:\\Users\\Live wire\\Desktop\\alpha.txt";
				File file = new File(filePath);
				System.out.println(file.exists());
				System.out.println(file.canRead());
				System.out.println(file.canWrite());
				System.out.println(file.getName());
				System.out.println(file.getParent());
				System.out.println(file.getAbsolutePath());
				System.out.println(file.isFile());
				System.out.println(file.isDirectory());

	}
	public static void createFile(String filePath) {
		System.out.println("Create a file");
		File file = new File(filePath);
		try {
			if (file.createNewFile()) {
				// file.createNewFile();
				System.out.println("File created");
			} else {
				System.out.println("File already created");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static void writeFile() {
		String file ="C:\\Users\\Live wire\\Desktop\\alpha\\1.txt";
		FileWriter fw;
		try {
			fw = new FileWriter(file,true);
			Scanner s = new Scanner(System.in);
			System.out.println("Enter a data :");
			String a = s.nextLine();
			fw.write(a);
			fw.flush();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void readFile(String filePath) {
		System.out.println("Read a file");
		File file = new File(filePath);
		try {
			Scanner read = new Scanner(file);
			while(read.hasNextLine()) {
				String data = read.nextLine();
			System.out.println(data);
			}
			read.close();
		}
		catch(Exception e) {
			e.printStackTrace();}
		}
public static void deleteFile(String filePath) {
		
		System.out.println("Delete a file");
		
		File file = new File(filePath);
		if(file.delete()) {
			System.out.println("File is deleted");
		}
		else {
			System.out.println("File is not deleted");
		}
	}

	public static void array() {
		
//		int aSize = 5;
//		int a[] = new int[aSize];
//		a[0]=10;
//		a[1]=20;
//		a[2]=30;
//		a[3]=40;
//		a[4]=50;
//		
//		int bSize = 3;
//		int b[] = new int[bSize];
//		b[0]=10;
//		b[1]=20;
//		b[2]=30;
//		
//		int n =a.length+b.length;
//		int x[] = new int[n];
//		int i = 0;
//		int j = 0;
//		while(i<x.length && j<a.length) {
//			x[i]=a[j];
//			i++;
//			j++;
//		}
//		int j1=0;
//		while(i<x.length && j1<b.length) {
//			x[i]=b[j1];
//			i++;
//			j1++;
//		}
//		for(int i1=0;i1<x.length;i1++) {
//			System.out.println(x[i1]);
//		}
//		int aSize = 5;
//		int a[] = new int[aSize];
//		a[0]=10;
//		a[1]=20;
//		a[2]=30;
//		a[3]=40;
//		a[4]=50;
//		
//		int b[]=new int[aSize];
//		for(int i=0;i<a.length;i++) {
//			b[i]=a[i];
//		}
//		
//		for(int i=0;i<a.length;i++) {
//			System.out.println(b[i]);
//		}
//		int aSize = 5;
//		int a[] = new int[aSize];
//		a[0]=10;
//		a[1]=20;
//		a[2]=30;
//		a[3]=40;
//		a[4]=50;
//		
//		//we one temp -> inside a loop
//		//int temp = a[i];
//		//a[i]=b[i];
//		//b[i]=temp;
//		int i=0;
//		int j=a.length-1;
//		while(i<=j) {
//			int temp = a[i];
//			a[i++]=a[j];
//			a[j--]=temp;
//		}
//		for(int k=0;k<a.length;k++) {
//			System.out.println(a[k]);
//		}
	}


	public static void main(String[] args) {
		String filePath ="C:\\Users\\Live wire\\Desktop\\alpha\\1.txt";
//		createFile(filePath);
//		writeFile();
//		readFile(filePath);
//		deleteFile(filePath);
//		filedetails();
		
	}

}
