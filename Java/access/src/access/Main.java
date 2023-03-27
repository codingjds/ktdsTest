package access;

public class Main {
	public static void main(String[] args) {
		
		Public pub = new Public();
		pub.add();
		
		//새로 할당
		int publicNumberOne = pub.getNumberOne();
		System.out.println(publicNumberOne);
		
		int publicNumberTwo = pub.getNumberTwo();
		System.out.println(publicNumberTwo);
		
		//반환되는 return값이 없기때문에 할당할수없다.
		pub.setNumberOne(7);
		publicNumberOne = pub.getNumberOne();
		System.out.println(publicNumberOne);
		
		publicNumberTwo = pub.getNumberTwo();
		System.out.println(publicNumberTwo);		
		pub.setNumberTwo(8);
		
		pub.add();
		
		/*전체적으로 데이터를 private으로 해야한다! 그리고 공개할것만 골라서 public!=>멤버가 가지고있는 데이터를 보호하기위해서
		Private pri = new Private();
		pri.add();
		*/
	}
}
