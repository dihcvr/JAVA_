package exercice05;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FileStatistics {
	
	String filename;
	
	public FileStatistics(String filename) {
		this.filename=filename;
	}
	public int getCharCount() throws Exception{
		File file = new File(this.filename);
		FileInputStream fw = new FileInputStream(file);

		BufferedInputStream bw = new BufferedInputStream(fw);
		int c=0;
		String k="";
		while((c = bw.read()) != -1) {
			k += (char) c ;
		}
		String[] str=k.replaceAll("\\s", "").split("");
		
		return str.length;
	}
	public int getWordCount() throws Exception{
		int cmp=0;
		File file = new File(this.filename);
		FileInputStream fw = new FileInputStream(file);
		BufferedInputStream bw = new BufferedInputStream(fw);
		int c;
		String k="";
		String[] str = null;
		while((c = bw.read()) != -1) {
			k += (char) c ;
			//str =k.split("[ ?,.\n]+");
			str=k.split("\\W+");
		}
		return str.length;
	}
	public void saveCounts(String filename) throws Exception {
		FileStatistics f=new FileStatistics("fichier.txt");
		FileOutputStream fos = new FileOutputStream(new File(filename));
		int c;
		String car = "Char : "+ f.getCharCount() + "\n" +"Word : "+ f.getWordCount();
		byte[] counts=car.getBytes();
		fos.write(counts);
		fos.close();
		
	}
	public void getDictionary() throws Exception {
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(this.filename));
		Map <String, Integer> map= new HashMap<String, Integer>();
		int c;
		String k="";
		String[] str;
		String[] str2;
		while((c = bis.read())!= -1) {
			k += (char)c;
		}
		str =k.split("\\W+");
		str2=str;
		Set <String> setCar = map.keySet();
		int cmp=0;
		for(int i=0;i<str.length;i++) {
			for(int j=0;j<str2.length;j++) {
				if(str[i].equals(str2[j])) {
					cmp++;
				}
			}
			map.put(str[i], cmp);
			cmp=0;
		}
		for(String b : setCar) {
			System.out.println(b + " -> "+map.get(b));
		}
		FileOutputStream fos = new FileOutputStream(new File("dictionnaire.txt"));
		for(String f : setCar) {
			String s= f + " -> "+map.get(f) + "\n";
			byte[] b = s.getBytes();
			fos.write(b);
		}
	}
	public static void main(String[] args) throws Exception {
		FileStatistics f=new FileStatistics("fichier.txt");
		/*
		System.out.println("Char : "+f.getCharCount());
		System.out.println("Word : "+f.getWordCount());
		
		f.saveCounts("counts.txt");
		*/
		FileStatistics f2=new FileStatistics("fichier2.txt");
		f2.getDictionary();
	}

}
