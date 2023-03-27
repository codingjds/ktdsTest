package market;
/**
 * 시장프로그램
 * @author User
 *
 */
public class Market {
	/*
	 * 시장프로그램
	 * 사과를 개당 2,000원에 판매하는 판매자가 있다.
	 * 구매자는 판매자에게 사과를 주문하고, 비용을 지불한다.
	 * 구매가 완료되었을 떄
	 * 판매자의 사과재고, 자본금
	 * 구매자의 사과재고, 자본금
	 * 을 출력하는 프로그램을 작성한다.
	 */
	
	/**
	 * 사과 시장가격
	 */
	public static final int PRICE_OF_APPLE = 2000;
	//상수 설정
	
	public static void main(String[] args) {
		
		Buyer buyer = new Buyer();
		Seller seller = new Seller();
		
		buyer.setStock(0);
		buyer.setMoney(1_000_000);
		
		seller.setStock(50);
		seller.setMoney(10_000);
		
		System.out.println(buyer);
		System.out.println(seller);

		buyer.buy(seller, 5);
		
		System.out.println(buyer);
		System.out.println(seller);
		
	}
	
}
