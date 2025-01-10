package com.winter.app.io.files;

import java.util.ArrayList;

public class FileMain {

	public static void main(String[] args) {
		
//		FileOutput fo = new FileOutput();
//		
//		fo.write();

		
		FileInput fi = new FileInput();
		
		try {
			ArrayList<Weather> ar = fi.input();
			for(Weather weather :ar) {
				weather.info();
			}
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
