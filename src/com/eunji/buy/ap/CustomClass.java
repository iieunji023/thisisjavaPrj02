package com.eunji.buy.ap;

import java.util.Arrays;

public class CustomClass {
	// 회원 작성
	int id;				// 회원 번호
	String name;		// 회원 이름
	int age;			// 회원 나이
	int i;
	int j;
	
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
	
	// 초기화가 잘 이루어졌는지 확인하기 위한 메소드
	void customInfo() {
		System.out.printf("id: %d, name: %s, age: %d \n", id, name, age);
		
	}
	
	/*
	 * addToCart() START
	 */
	void addToCart(ProductClass product, int quantity) {
		try {
		    // 고객이 입력한 수량과 상품에 저장된 수량 비교
		    if (quantity < product.quantity) {
		        boolean productExists = false;

		        // 이전에 추가된 상품의 정보를 출력하기 위해 i-1을 사용
		        for (int k = i - 1; k >= 0; k--) {
		            if (shoppingBasket[k].name.equals(product.name)) {
		                System.out.println("==============================================================");
		                System.out.printf("[%d] %s님이 %s 상품을 %d개 추가했습니다. \n", k, this.name, shoppingBasket[k].name, shoppingBasket[k].quantity);
		                System.out.printf("%s상품의 남은 수량: %d \n", shoppingBasket[k].name, product.quantity);

		                j = shoppingBasket[k].quantity += quantity;

		                System.out.println("확인: " + shoppingBasket[k].name + j);
		                
		                productExists = true;
		                break;
		            }
		        }

		        if (!productExists) {
		            // ProductClass타입의 배열에 담기 위해 ProductClass 객체를 생성한 후 담아야 함
		            shoppingBasket[i] = new ProductClass(product.id, product.name, product.price, quantity);
		            product.quantity -= quantity;

		            System.out.println("==============================================================");
		            System.out.printf("[%d] %s님이 %s 상품을 %d개 장바구니에 담았습니다. \n", i, this.name, shoppingBasket[i].name, shoppingBasket[i].quantity);
		            System.out.printf("%s상품의 남은 수량: %d \n", shoppingBasket[i].name, product.quantity);

		            i++;
		        }
		    } else {
		        System.out.println("수량을 초과하였습니다.");
		    }
		} catch (Exception e) {
		    System.out.println("장바구니에 담을 수 없습니다.  ");
		}
	}
	/*
	 * addToCart() END
	 */
	
	/*
	 * purchase() START
	 */
	void purchase() {
		int sum = 0;
		int pq = 0;
		for(int i =0; i < shoppingBasket.length; i++) {
			if(shoppingBasket[i] != null) {
				System.out.println("==============================================================");
				System.out.printf("%s님이 %s 상품을 %d개 구매했습니다. \n", this.name, shoppingBasket[i].name, shoppingBasket[i].quantity);
				sum += shoppingBasket[i].price * shoppingBasket[i].quantity;
//				shoppingBasket[i].nate 
				
			}
		}
		
		System.out.printf("결제하실 금액은 총 %d원 입니다. \n", sum);
		
	}
	/*
	 * purchase() END
	 */
	
	}
	

