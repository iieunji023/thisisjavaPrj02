package com.eunji.buy;

public class CustomClass {
	// 회원 작성
	int id;				// 회원 번호
	String name;		// 회원 이름
	int age;			// 회원 나이
	
	// 생성자 선언
	public CustomClass(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	// 초기화가 잘 이루어졌는지 확인하기 위한 메소드
	void customInfo() {
//		System.out.println("id: " + id);
//		System.out.println("name: " + name);
//		System.out.println("age: " + age);
		
		System.out.printf("id: %d, name: %s, age: %d \n", id, name, age);
		
	}
	
}
