package com.io.buffer;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class MyBufRead {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("++++++++++++++");
		FileReader reader = new FileReader("D:"+File.separator+"1.txt");
		MyBufferReader mbf = new MyBufferReader(reader);
		String line = null;
		while((line=mbf.myReadLine())!=null) {
			System.out.println(line);
		}
		mbf.myClose();
	}

}
