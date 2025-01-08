package com.winter.app.langs.ex2;
import java.io.ObjectInputStream.GetField;
import java.util.Scanner;
import java.util.StringTokenizer;

import com.winter.app.langs.ex2.*;


public class WeatherInfo {

	private StringBuffer info;
	
	public WeatherInfo() {
		this.info = new StringBuffer();
		this.info.append("seoul,10,0.3,맑음,");
		this.info.append("일산,-12,0.56,흐림,");
		this.info.append("인천*32*0.95*무더위,");
		this.info.append("제주*56*0.02*무더위");
		
		
	}
	
	public WeatherDTO[] init() {
		
		String data = this.info.toString().replace("*", ",");
		StringTokenizer st = new StringTokenizer(data,",");
		
		WeatherDTO [] weatherDTOs = new WeatherDTO[st.countTokens()/4];
		
		//배열의 index번호
		int idx = 0;
		
		while (st.hasMoreElements()) {
			WeatherDTO weatherDTO = new WeatherDTO();
			weatherDTO.setCity(st.nextToken().trim());
			weatherDTO.setGion(Integer.parseInt(st.nextToken().trim()));
			weatherDTO.setHumidity(Double.parseDouble(st.nextToken().trim()));
			weatherDTO.setStatus(st.nextToken().trim());
			weatherDTOs[idx] = weatherDTO;
			idx++;
			
		}return weatherDTOs;
	}
		
	
	
	
	
	
	
	public WeatherDTO[] init_old() {
		
		System.out.println(this.info);
		
		//1.split
		//2 구분자 통일
		String data = this.info.toString();
		
		data = data.replace("*", ",");
		
		
		String[] datas = data.split(",");
		
		WeatherDTO [] dtos = new WeatherDTO[datas.length/4];
		
		for(int i =0; i<datas.length; i++) {
			WeatherDTO weatherDTO = new WeatherDTO();
			dtos[i/4] = weatherDTO;
			weatherDTO.setCity(datas[i].trim());
			weatherDTO.setGion(Integer.parseInt(datas[++i].trim()));
			weatherDTO.setHumidity(Double.parseDouble(datas[++i].trim()));
			weatherDTO.setStatus(datas[++i].trim());
			}return dtos;
				
	
			
		//info의 정보 파싱
		//weatherDTO에 담아서
		//weatherDTO들을 리턴 
	}
	public WeatherDTO findByName(WeatherDTO[] dtos) {
		System.out.println("검색할 도시명을 입력하세요:");
		
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		
		for(int i = 0; i<dtos.length;i++){
			if(name.equals(dtos[i].getCity())) {
				return dtos[i];
			}
			
		}
		
		
				
				
			return null;
		}
	
	public void add() {
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		System.out.println("지역,기온,습도,날씨 입력:");
		
		
		
		
	}
	
	
	
		
	}
