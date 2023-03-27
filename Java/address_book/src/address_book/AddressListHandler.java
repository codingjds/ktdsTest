package address_book;

import java.util.ArrayList;
import java.util.List;

public class AddressListHandler {
	//ctrl+shift+O 					= new ArrayList<Address>(); 생략가능
	private List<Address> addressList = new ArrayList<>();
	
	/*
	 * byte =Byte
	 * short = Short
	 * int = Integer
	 * long = Long
	 * float = Float
	 * double = Double
	 * boolean = Boolean
	 * char = Character
	 */
	//private List<Integer> intList = new ArrayList<>();
	//private List<Double> doubleList = new ArrayList<>();
	//private double[] doubleArray = new double[50];
	
	public void create(String name, String phoneNumber, String address) {
		Address addr = new Address();
		addr.setName(name);
		addr.setPhoneNumber(phoneNumber);
		addr.setAddress(address);
		addressList.add(addr);
	}
	
	public void update(int index, String name, String phoneNumber, String address) {
		Address addr = addressList.get(index);
		addr.setName(name);
		addr.setPhoneNumber(phoneNumber);
		addr.setAddress(address);
	}
	
	public void delete(int index) {
		addressList.remove(index);
	}
	
	public void read(int index) {
		Address addr = addressList.get(index);
		System.out.println("이름: "+ addr.getName());
		System.out.println("전화번호: "+ addr.getPhoneNumber());
		System.out.println("주소: "+ addr.getAddress()+"\n");
	}
	/**
	 * 전통적 for를 이용해 반복
	 */
	public void readAllFor() {
		for(int i = 0 ; i<addressList.size() ; i +=1) {
			read(i);
		}
	}
	/**
	 * for-each를 이용해 반복
	 */
	public void readAllForeach() {
		for(Address addr : addressList) {
			System.out.println("이름: "+ addr.getName());
			System.out.println("전화번호: "+ addr.getPhoneNumber());
			System.out.println("주소: "+ addr.getAddress()+"\n");
		}
	}
	/**
	 * List의 forEach를 이용해 반복
	 */
	public void readAllListForeach() {
		addressList.forEach( (addr) -> {	//스트림이 지원하는 반복자
			System.out.println("이름: "+ addr.getName());
			System.out.println("전화번호: "+ addr.getPhoneNumber());
			System.out.println("주소: "+ addr.getAddress()+"\n");
		} );
	}
	
	
	public static void main(String[] args) {
		
		AddressListHandler handler = new AddressListHandler();
		handler.create("조태용", "010-1234-1234", "서울");
		handler.create("장", "010-1234-1235", "서울");
		handler.create("김", "010-1234-1236", "서울");
		
		handler.read(0);
		handler.read(1);
		handler.read(2);
		
		handler.update(2, "이건희", "010-1111-2222", "서울");
		handler.read(2);
		
		handler.delete(2);
		
		System.out.println("test");
		
		System.out.println("FOR");
		handler.readAllFor();
		
		System.out.println("FOR-EACH");
		handler.readAllForeach();
		
		System.out.println("lIST FOR EACH");
		handler.readAllListForeach();
		
		/*
		 * //List 추가 Address addr = new Address(); addr.setName("정덕수");
		 * handler.addressList.add(addr);
		 * 
		 * Address addr2 = new Address(); addr2.setName("이동학");
		 * handler.addressList.add(addr2);
		 * 
		 * //list 조회 Address each = handler.addressList.get(0);
		 * System.out.println(each.getName());
		 * 
		 * each = handler.addressList.get(1); System.out.println(each.getName());
		 * 
		 * System.out.println(handler.addressList.size());
		 * 
		 * //list 삭제 // handler.adressList.remove(0); // handler.adressList.remove(0);
		 * // handler.adressList.clear(); //수많은 리스트 한번에 지움 //
		 * System.out.println(handler.adressList.size());
		 * 
		 * //List 수정 Address addr3 = handler.addressList.get(0); addr3.setName("장민창");
		 * 
		 * System.out.println(handler.addressList.get(0).getName()); //할당을 한적이 없지만 메모리
		 * 주소를 가져와서 수정한 것이기 떄문에 addr3을 새로 만들어 냈지만 원래 리스트 내의 값이 수정된다.
		 * 
		 * List<Integer> intList = new ArrayList<>();
		 * 
		 * intList.add(10); intList.set(0,100);
		 * 
		 * System.out.println(intList.get(0));
		 * 
		 * //WrapperClass는 메모리가 아니라 값을 가진다! 이유는 제데릭을 쓰기위함이지 레퍼런스용이 아니다 //제네릭
		 * Generic(일반적)은 클래스 내부에서 지정하는 것이 아닌 외부에서 사용자에 의해 지정되는 것 //intList.add(10);
		 * //int a = intList.get(0); //a= 100; //System.out.println(intList.get(0)); 100
		 * 이 아니라 10이 나온다 //System.out.println(a); 100
		 */	}
	
}
