package com.winter.app.langs.ex2;

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
		
		public void view(WeatherDTO[] dtos) {
			this.view();
			
			for(int i=0; i<dtos.length;i++) {
				System.out.print(dtos[i].getCity()+"\t");
				System.out.print(dtos[i].getGion()+"\t");
				System.out.print(dtos[i].getHumidity()+"\t");
				System.out.println(dtos[i].getStatus()+"\t");
			}
			
		}
	}


