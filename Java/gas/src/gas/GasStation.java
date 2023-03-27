package gas;

import java.util.ArrayList;
import java.util.List;

public class GasStation {
	private List<Fuel> fuelList ;
	private int money ;
	
	//생성자
	public GasStation() {
		fuelList = new ArrayList<>();
		fuelList.add(new Fuel(FuelType.GASOLINE,5_000));
		fuelList.add(new Fuel(FuelType.DIESEL,3_000));
		fuelList.add(new Fuel(FuelType.LPG,1_000));
		
		setMoney(1_000_000);
	}
	
	//Alt > S > R > Alt+A > Alt+R

	public List<Fuel> getFuelList() {
		return fuelList;
	}
	public void setFuelList(List<Fuel> fuelList) {
		this.fuelList = fuelList;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}

	/**
	 * 판매
	 * 
	 * @param type  연료종류(gasoline, diesel, lpg)
	 * @param stock 판매량
	 */
	public boolean sell(FuelType type, int stock) {
		boolean result = false;
		// 1. type 연료가 stock만큼 존재하는지 확인한다.
		if (checkStock(type, stock)) {
			result=true;
			// 1-2. 연료가 충분하다면 type 연료의 잔량을 stock만큼 줄인다
			// 1-2-1. type의 값이 gasoline이라면 gasoline 변수에서 stock을 줄인다
			for(Fuel fuel : fuelList) {
				if(fuel.getType() == type) {
					int fuelStock = fuel.getStock();
					fuelStock = fuelStock - stock;
					fuel.setStock(fuelStock);
				}
			}
		}
		else{
			result = false;
			System.out.println("연료가 부족합니다");
		}
		return result;
	}
			
//			if(gasoline.getType().equals(type)) {
//				int fuelStock = gasoline.getStock();
//				fuelStock = fuelStock - stock;
//				gasoline.setStock(fuelStock);
//			}else if(diesel.getType().equals(type)) {
//				int fuelStock = diesel.getStock();
//				fuelStock = fuelStock - stock;
//				diesel.setStock(fuelStock);
//			}else if(lpg.getType().equals(type)) {
//				int fuelStock = lpg.getStock();
//				fuelStock = fuelStock - stock;
//				lpg.setStock(fuelStock);
//			}
		// 1-1. 연료가 부족하다면 "연료가 부족합니다"를 출력하고 매소드를 종료한다.
			/* ctrl+shift+ / 전체 주석
			 * if(type.equals("gasoline")) { if(gasoline.getType().equals("gasoline")) { int
			 * fuelStock= gasoline.getStock(); fuelStock =fuelStock - stock;
			 * gasoline.setStock(fuelStock); } else if(diesel.getType().equals("diesel")) {
			 * int fuelStock= gasoline.getStock(); fuelStock =fuelStock - stock;
			 * diesel.setStock(fuelStock); }else if(lpg.getType().equals("lpg")) { int
			 * fuelStock= gasoline.getStock(); fuelStock =fuelStock - stock;
			 * lpg.setStock(fuelStock); }
			 * 
			 * //1-2-2. type의 값이 diesel이라면 diesel 변수에서 stock을 줄인다 }else
			 * if(type.equals("diesel")) {
			 * 
			 * diesel.decreaseStock(stock);
			 * 
			 * //1-2-3. type의 값이 lpg이라면 lpg 변수에서 stock을 줄인다 }else if(type.equals("lpg")) {
			 * 
			 * lpg.decreaseStock(stock); }
			 * 
			 * }else if(type.equals(lpg.getType())) {
			 * 
			 * lpg.decreaseStock(stock); }
			 */

	/**
	 * 수입
	 * 
	 * @param money 구매가격
	 */
	public void addMoney(int money) {
		//1.money 파라미터값을 인스턴스변수 money에 더한다
		this.money += money;
	}

	/**
	 * type 연료가 stock만큼 주유가능한지 확인
	 * 
	 * @param type  연료종류(gasoline, diesel, lpg)
	 * @param stock 주유량
	 * @return 연료의 양이 stock 이상이면 true, 아니면 false
	 */
	private boolean checkStock(FuelType type, int stock) {
		//boolean result = false;
		
		for(Fuel fuel : fuelList) {
			//if(fuel.getType().equals(type)) { => enum으로 만들면 문자열이더라도 ==쓸수있다
			if(fuel.getType() == type) {
//				result = fuel.getStock()>= stock;
//				break;
				return fuel.getStock()>= stock;
			}
		}
		//return result;
		return false;
	}
	
//		if(gasoline.getType().equals(type)) {
//			result = gasoline.getStock()>= stock;
//		}
//		else if(diesel.getType().equals(type)) {
//			result = diesel.getStock()>= stock;			
//		}
//		else if(lpg.getType().equals(type)) {
//			result = lpg.getStock()>= stock;	
//		}
//		return result;
//	}

//	@Override
//	public String toString() {
//		return "주유소 휘발유 량: " + fuelList.get +" 자본금: " + money + "\n" 
//				+ "주유소 경유 량: " + diesel.getStock() + "\n"
//				+ "주유소 LPG 량: " + lpg.getStock();
//	}
}
