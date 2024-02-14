package aws;

public class ProductClass {
	// 물품
	int id;				// 물품 번호
	String name;		// 물품 이름
	int price;			// 물품 가격
	int quantity; 		// 물품 수량(재고)
	
	// 생성자 선언
	public ProductClass(int id, String name, int price, int quantity) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		
	}

	// 초기화가 잘 이루어졌는지 확인하기 위한 메소드
	void productInfo() {
		System.out.printf("id: %d, name: %s, price: %d, quantity: %d \n", id, name, price, quantity);
		
	}
	
	// 구입 수량과 재고 비교하여 구입 가능한지 알려주는 메소드
	boolean checkQty(int purchaseQty) {
		return this.quantity >=  purchaseQty ? true : false;
		
	}
	
}
