package access;

/**
 *  모든멤버가 public인 클래스
 * @author User
 *
 */
public class Public {
	
	/**
	 * 첫번째 멤버변수
	 */
	private int numberOne;
	
	/**
	 * 두 번쨰 멤버변수
	 * 멤버변수는 항상 private으로 보호되어야한다.
	 */
	private int numberTwo;
	
	/**
	 * numberOne 멤버변수의  Getter
	 * @return
	 */
	public int getNumberOne() {
		return numberOne;
	}
	/*접근제한자 반환타입 메소드명(파라미터타입 파라미터명){
		return 반환값 혹은 변수  혹은 수식
	}
	 */
	
	/**
	 * numberOne 멤버변수의 Setter
	 * @param numberOne(Main클래스가 할당한 값)
	 */
	//void는 리턴값이 없다!
	public void setNumberOne(int numberOne) {
		if(numberOne<100){
			this.numberOne = numberOne;			
		}
		//인스턴스.멤버변수
		//this.numberOne = numberOne;			
	}
	
	public int getNumberTwo() {
		return numberTwo;
	}
	public void setNumberTwo(int numberTwo) {
		if(numberTwo <100) {
			this.numberTwo = numberTwo;
		}
	}
	
	
	//클래스앞에 클래스 범위내에서만 public 사용가능
	public void add() {
		int result= numberOne+numberTwo;
		System.out.println(result);
	}
}
