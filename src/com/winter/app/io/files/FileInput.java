package com.winter.app.io.files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class FileInput {
	
	public void add() {
		
		// 도시명, 기온, 습도, 현재날씨 상태
		// sample.txt에 추가 
		
		
		
		
		
	}
	
	
	
	
	
	
	

	public ArrayList<Weather> input() throws Exception {
		
		File file = new File("C:\\test\\sample.txt");
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		boolean check = true;
		ArrayList<Weather> ar = new ArrayList<>();
		
		while(check) {
			String data = br.readLine();
				if(data==null) {
			break;
		}
				
		Weather weather = new Weather();
		
		
		
		StringTokenizer st = new StringTokenizer(data);
		
		
		
		while(st.hasMoreTokens()) {
			String t = st.nextToken("-");	
			
			weather.setCity(t);
			t=st.nextToken();
			weather.setGion(Integer.parseInt(t));
			
			weather.setHuminity(Double.parseDouble(st.nextToken()));
			weather.setStatus(st.nextToken());
			
			ar.add(weather);
			
			
		//	System.out.println(t);
			//Weather에 Data입력하고
			//Weather을 모아서 리턴 
			//Main 메서드에 모든 내용 출력 
			
		
		}
		
		}
		
		br.close();
		fr.close();
		return ar;
	}
	
}
