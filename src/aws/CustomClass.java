package aws;

public class CustomClass {
	// 회원 작성
	int id;								// 회원 번호
	String name;						// 회원 이름
	int age;							// 회원 나이
	int purchaseIdx = 0;				// 장바구니 공간
	ProductClass[] shoppingBasket;		// 물품 객체가 저장될 장바구니
	int[] purchaseQty = new int[10];
	
	// 생성자 선언
	public CustomClass(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
		
	}
	
	public CustomClass(int id, String name, int age, ProductClass[] shoppingBasket) {		// 배열 선언과 초기화가 한번에 이뤄지지 않음
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
	void addToCart(ProductClass product, int purchaseQty) {
		boolean isOk = product.checkQty(purchaseQty);
		
		if(!isOk) {			// isOk가 false면
			System.out.printf("수량이 부족합니다. 구입가능한 수량은 %d입니다.\n", product.quantity);
			
		} else {
			System.out.println(shoppingBasket.length);
			shoppingBasket[this.purchaseIdx] = product;
			this.purchaseQty[this.purchaseIdx] = purchaseQty;
			product.quantity -= purchaseQty;			// 재고수량 = 기존 재고수량 - 구입수량
			
//			System.out.println(shoppingBasket[--this.purchaseIdx].name);
			System.out.printf("[%d]나이가 %d살인 %s가 %d원짜리 상품 %s를 %d개 장바구니에 담았습니다. \n", this.purchaseIdx, this.age, this.name, shoppingBasket[this.purchaseIdx].price, shoppingBasket[this.purchaseIdx].name,purchaseQty);
			
			this.purchaseIdx++;
			
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
		for(int i =0; i < shoppingBasket.length; i++) {
			if(shoppingBasket[i] != null) {
				System.out.println("==============================================================");
				System.out.printf("%s님이 %s 상품을 %d개 구매했습니다. \n", this.name, shoppingBasket[i].name, purchaseQty[i]);
				sum += shoppingBasket[i].price * purchaseQty[i];
			}
		}
		System.out.printf("결제하실 금액은 총 %d입니다.\n", sum);
		
	}
	/*
	 * purchase() END
	 */
	
	}
	

