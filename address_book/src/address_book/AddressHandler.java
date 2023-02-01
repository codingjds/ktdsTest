package address_book;

public class AddressHandler {
	/*
	 * 주소록 프로그램
	 * 	이름 : String
	 * 	전화번호 : String
	 * 	주소 : String
	 * 주소
	 * 	등록/삭제/수정/조회
	 */
	private Address address1;
	/**
	 * 주소록 추가
	 */
	// C R U D db에서 자주 쓰는 용어
	public void create() {
		address1 = new Address();
		address1.setName("정덕수");
		address1.setPhoneNumber("010-8873-8068");
		address1.setAddress("서울");
	}
	public void update() {
		address1.setName("덕수");
	}
	public void delete() {
		address1 = null;
	}
	public void read() {
		
		System.out.println("이름: "+ address1.getName());
		System.out.println("전화번호: "+ address1.getPhoneNumber());
		System.out.println("주소: "+ address1.getAddress());
	}
	
	public static void main(String[] args) {
		AddressHandler handler = new AddressHandler();
		handler.create();
		handler.read();

		handler.update();
		handler.read();
		
		handler.delete();
		//handler.read();	
	}
}
