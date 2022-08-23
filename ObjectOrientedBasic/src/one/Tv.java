package one;

public class Tv {	//Tv 설계도
		
	
//	TV란?
//			
//	속성: 크기, 길이, 높이, 색상, 볼륨, 채널 등
//	기능: 켜기, 끄기, 볼륨 높이기, 볼륨 낮추기, 채널 높이기 등
//	
//	객체는 속상과 기능 두 종류의 구성요소로 이루어져 있으며
//	일반적으로 객체는 다수의 속성과 다수의 기능을 갖는다
//	
//	속성(property) - 멤버변수(member variable), 특성(attribute), 필드, 상태
//	기능(function) - 메서드(method), 함수(function), 행위
	
	String color = "";	//색상
	boolean power = false;	//전원
	int channel = 0;	//채널
	
	void power() {	//메서드, 전원이라는 변수를 조작하는 애
		power = !power;	//TV를 켜거나 끄는 기능
	}
	void channelUp() {					
		channel = channel + 1;	//채널을 높이는 기능
	}
	void channelDown() {
		channel = channel - 1;	//채널을 낮추는 기능을 하는 메서드
	}
	
	
	
	
	
	
	
	
	
	
}
