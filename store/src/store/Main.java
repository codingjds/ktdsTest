package store;

/**
 * 실행클래스
 * @author User
 *
 */
public class Main {
	//인스턴스 필드는 인스턴스에서만 접근이 가능하다
	Store store=new Store();
	
	//static이 붙으면 클래스 필드 | 메모리 모든 곳에서 공유된다.
	//static은 store 인스턴스에 접근이 불가능 하므로 Main클래스를 통해 접근할 수 있다.
	public static void main(String[] args) {
		//편의점 변수(인스턴스 | 객체)
		Main main=new Main();
		main.store.addProducts();
		main.store.checkQuantity();
		//instance.? 호출
	}
}
