package com.eunji.buy.ap;

public class ExecClass {
	public static void main(String[] args) {
		/*
		 * 1. 회원 등록
		 */
		CustomClass c1 = new CustomClass(1, "이자바", 25, new ProductClass[10]);
		CustomClass c2 = new CustomClass(2, "박자바", 22, new ProductClass[10]);
		CustomClass c3 = new CustomClass(3, "이은지", 27, new ProductClass[10]);
		
		c1.customInfo();
		c2.customInfo();
		c3.customInfo();
		
		/*
		 * 2. 상품 등록: 새우깡(100개/1000원), 콜라(500개/2000원), 천하장사(1000개/800원), 빼빼로(300개/1500원), 사이다(500/2000원)
		 */
		ProductClass p1 = new ProductClass(1, "새우깡", 1000, 100);
		ProductClass p2 = new ProductClass(2, "콜라", 2000, 500);
		ProductClass p3 = new ProductClass(3, "천하장사", 800, 1000);
		ProductClass p4 = new ProductClass(4, "빼빼로", 1500, 300);
		ProductClass p5 = new ProductClass(5, "사이다", 2000, 500);
		
		p1.productInfo();
		p2.productInfo();
		p3.productInfo();
		p4.productInfo();
		
		/*
		 * 3. 상품 구매 - 장바구니에 담기
		 * 창고에 저장된 수량 이상으로 저장될 경우는 결제 불가 
		 */
		// c3.addToCart(물건, 수량);
		// System.out.println("p1: " + p1);
		c1.addToCart(p1, 8);
		c1.addToCart(p1, 8);
		c1.addToCart(p1, 8);
		c1.addToCart(p1, 8);
		c1.addToCart(p2, 1000);
		c1.addToCart(p2, 15);
		c1.addToCart(p2, 15);
//		c1.addToCart(p2, 15);
//		c1.addToCart(p2, 15);
//		c1.addToCart(p2, 15);
//		c1.addToCart(p2, 15);
//		c1.addToCart(p2, 15);
//		c1.addToCart(p2, 15);
		c2.addToCart(p5, 5);
		c3.addToCart(p4, 10);
		
		/*
		 * 상품 구매 - 결제
		 */
//		c3.purchase(); // ~가 새우깡을 구매했습니다.가 나오도록 하기
		c1.purchase();
		c2.purchase();
		c3.purchase();
		
	}

}
