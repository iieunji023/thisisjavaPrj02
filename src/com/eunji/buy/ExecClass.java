package com.eunji.buy;

public class ExecClass {
	public static void main(String[] args) {
		/*
		 * 회원 등록
		 */
		CustomClass c1 = new CustomClass(1, "이자바", 25);
		CustomClass c2 = new CustomClass(2, "박자바", 22);
		CustomClass c3 = new CustomClass(3, "이은지", 27);
		
		c1.customInfo();
		c2.customInfo();
		c3.customInfo();
		
		/*
		 * 상품 등록: 새우깡(100개/1600원), 콜라(500개/2000원), 천하장사(1000개/800원), 빼빼로(300개/1500원), 사이다(500/2000원) 
		 */
		
		ProductClass p1 = new ProductClass(1, "새우깡", 1600, 100);
		ProductClass p2 = new ProductClass(2, "콜라", 2000, 500);
		ProductClass p3 = new ProductClass(3, "천하장사", 800, 1000);
		ProductClass p4 = new ProductClass(4, "사이다", 2000, 500);
		
		p1.productInfo();
		p2.productInfo();
		p3.productInfo();
		p4.productInfo();
		
	}

}
