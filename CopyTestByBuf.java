package com.io.buffer;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class CopyTestByBuf {

	public static void main(String[] args) throws IOException {

		Reader reader = new FileReader("D:"+File.separator+"1.txt");
		BufferedReader br = new BufferedReader(reader);
		
		Writer writer = new FileWriter("D:"+File.separator+"2.txt");
		BufferedWriter bw = new BufferedWriter(writer);
		
		int ch = 0;
		while((ch = br.read())!=-1) {
			bw.write(ch);
		}
		
		br.close();
		bw.close();
	} 

}
