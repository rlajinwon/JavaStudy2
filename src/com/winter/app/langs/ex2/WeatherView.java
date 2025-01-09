package com.winter.app.langs.ex2;

import java.util.ArrayList;

public class WeatherView {
	
	
		private void view() {
			System.out.println("지역\t기온\t습도\t날씨");			
		}
	
	
	

		public void view(WeatherDTO weatherDTO) {
			this.view();
			
			System.out.print(weatherDTO.getCity()+"\t");
			System.out.print(weatherDTO.getGion()+"\t");
			System.out.print(weatherDTO.getHumidity()+"\t");
			System.out.println(weatherDTO.getStatus()+"\t");
		}
	
	
	
	
		
		//weatherDTO들의 정보를 출력 
		
		public void view(ArrayList<WeatherDTO> ar) {
			this.view();
			
			for(int i=0; i<ar.size();i++) {
				System.out.print(ar.get(i).getCity()+"\t");
				System.out.print(ar.get(i).getGion()+"\t");
				System.out.print(ar.get(i).getHumidity()+"\t");
				System.out.println(ar.get(i).getStatus()+"\t");
			}
			
		}
	}


