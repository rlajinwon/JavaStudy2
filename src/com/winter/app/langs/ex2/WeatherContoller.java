//package com.winter.app.langs.ex2;
//
//import java.util.ArrayList;
//import java.util.Scanner;
//
//public class WeatherContoller {
//
//	
//	private WeatherInfo weatherInfo;
//	private WeatherView weatherView;
//	private Scanner sc;
//	
//	
//	
//	
//	public WeatherContoller() {
//		this.weatherInfo = new WeatherInfo();
//		this.weatherView = new WeatherView();
//		this.sc = new Scanner(System.in);
//	}
//	
//	public void start() {
//		ArrayList<WeatherDTO> ar = null;
//		boolean check = true;
////		WeatherDTO[] dtos = null;
//		while(check) {
//			System.out.println("1. 날씨 정보 초기화");
//			System.out.println("2. 날씨 정보 출력");
//			System.out.println("3. 날씨 정보 검색");
//			System.out.println("4. 날씨 정보 추가");
//			System.out.println("5. 날씨 정보 삭제");
//			int select = this.sc.nextInt();
//			if(select==1) {
//				ar = WeatherDTO.init();
//				
//			}else if(select==2) {
//				weatherView.view(ar);
//				
//			}else if(select==3) {
//				WeatherDTO weatherDTO =weatherInfo.findByName(ar);
//				if(weatherDTO != null) {
//					weatherView.view(weatherDTO);
//				}else {
//					System.out.println("검색 결과 X");
//				}
//				
//			}else if(select==4) {
//				weatherInfo.add(ar);
//				
//			}else if(select==5) {
//				
//			}else {
//				System.out.println("프로그램 종료");
//				break;
//			}
//			
//		}
//		
//		
//		
//	}
//}
