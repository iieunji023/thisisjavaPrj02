package com.eunji.buy;

public class CustomClass {
	// 회원 작성
	int id;				// 회원 번호
	String name;		// 회원 이름
	int age;			// 회원 나이
	
	/*
	 * 물품 객체가 저장될 장바구니
	 * 물품이 담기는 타입이 ProductClass객체이므로 ProductClass객체 타입의 배열 형태로 저장함
	 */
	ProductClass[] shoppingBasket;
	
	// 생성자 선언
	public CustomClass(int id, String name, int age, ProductClass[] shoppingBasket) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.shoppingBasket = shoppingBasket;
		
	}
	
//	public CustomClass(int quantity) {
//		p.quantity = quantity;
//		
//	}
	
	// 초기화가 잘 이루어졌는지 확인하기 위한 메소드
	void customInfo() {
		System.out.printf("id: %d, name: %s, age: %d \n", id, name, age);
		
	}
	
	// 장바구니에 담는 메소드
	void addToCart(ProductClass p, int quantity) {
		p.quantity = quantity;
		// 배열에 product 객체 저장
//		shoppingBasket = new ProductClass[0] {p};
		
		int i = 0;
		shoppingBasket[i] = p;
		i++;
		shoppingBasket[i] = p;
		
		
		
		
//		shoppingBasket[product.id]{product, quantity};
		
	}
	
}
