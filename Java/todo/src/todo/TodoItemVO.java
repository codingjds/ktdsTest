package todo;


public class TodoItemVO {
	
	private String name;
	private boolean check;	//기본적으로 False가 들어가기때문에 할당 필요 X
	//생성자
	/**
	 * 생성자
	 * @param name 아이템명
	 */
	public TodoItemVO(String name) {
		setName(name);
	}	//이렇게 만들면 기본생성자는 만들 수 없다
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isCheck() {
		return check;
	}
	public void setCheck(boolean check) {
		this.check = check;
	}
	
	
	
}
