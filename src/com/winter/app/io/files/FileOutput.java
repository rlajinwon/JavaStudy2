package com.winter.app.io.files;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileOutput {
	
	boolean check = true;
	
	public void write() {
		Scanner sc = new Scanner(System.in);
		
		while(check) {

			System.out.println("입력");
			String data = sc.next();
			
		
			if(data.equalsIgnoreCase("end"))
				check=!check;
			else {
			
			
			this.output(data);
			}
			
		
		}
		sc.close();
		
		
	}
	
	

	private void output(String data) {
		
		//파일에 내용을 출력
		
		System.out.println("호출");
		File file = new File("C:\\test\\sample.txt");
		
		file = new File("C:\\test","sample.txt");
		FileWriter fw = null;
		
		
		try {
			//false 기존의 파일을 삭제하고 덮어 씌운다
			//true 기존 파일에 추가하여 작성
			fw = new FileWriter(file,true);
			
			fw.write(data);
			//버퍼초기화 
			fw.write("\r\n");
			//buffer를 강제로 비움
			fw.flush();
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}finally {
			try {
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
		
		System.out.println("종료");
	}

}
