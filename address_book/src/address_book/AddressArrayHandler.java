package address_book;
/**
 * 주소록 최대 5개만 저장할 수 있는 주소록
 * @author User
 *
 */
public class AddressArrayHandler {
	
	//배열의 정의방법
	//타입[] 변수명 = new 타입 [몇개];
	//int[] arrays = new int[5];
	private Address[] addressArray = new Address[5];
	
	public void create(int index, String name, String phoneNumber, String address) {
		addressArray[index] = new Address();
		addressArray[index].setName(name);
		addressArray[index].setPhoneNumber(phoneNumber);
		addressArray[index].setAddress(address);
		
	}
	
	public void update(int index, String name, String phoneNumber, String address) {
		addressArray[index].setName(name);
		addressArray[index].setPhoneNumber(phoneNumber);
		addressArray[index].setAddress(address);
	}
	
	public void delete(int index) {
		addressArray[index] = null;
	}
	
	public void read(int index) {
		if(addressArray.length > index) {
			System.out.println("이름: "+ addressArray[index].getName());
			System.out.println("전화번호: "+ addressArray[index].getPhoneNumber());
			System.out.println("주소: "+ addressArray[index].getAddress());
		}
	}
	
	public static void main(String[] args) {
		//[   0   ][   1   ][   2   ][   3   ][   4   ]
		//[Address][Address][Address][Address][Address]
		
		AddressArrayHandler handler = new AddressArrayHandler();
		handler.create(0, "정", "010-1234-1234", "서울");
		handler.create(1, "김", "010-1234-5678", "서울");
		handler.create(2, "이", "없음", "인천");
		handler.create(3, "박", "011-5678-1234", "서울");
		handler.create(4, "최", "010-4321-1234", "서울");
		//handler.create(5, "변", "010-4444-6666", "서울");
		
		handler.read(0);
		handler.read(1);
		handler.read(2);
		handler.read(3);
		handler.read(4);
		//handler.read(5);
		
		
		/*
		 * handler.addressArray[0] = new Address();
		 * handler.addressArray[0].setName("정덕수");
		 * 
		 * handler.addressArray[1] = new Address();
		 * handler.addressArray[1].setName("정");
		 * 
		 * handler.addressArray[2] = new Address();
		 * handler.addressArray[2].setName("덕");
		 * 
		 * handler.addressArray[3] = new Address();
		 * handler.addressArray[3].setName("수");
		 * 
		 * handler.addressArray[4] = new Address();
		 * handler.addressArray[4].setName("님");
		 * 
		 * System.out.println(handler.addressArray[0].getName());
		 * System.out.println(handler.addressArray[1].getName());
		 * System.out.println(handler.addressArray[2].getName());
		 * System.out.println(handler.addressArray[3].getName());
		 * System.out.println(handler.addressArray[4].getName());
		 * 
		 * System.out.println(handler.addressArray.length);
		 */
	}
}
