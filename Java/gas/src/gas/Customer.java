package gas;

public class Customer {
	//구매, 지출, 구매가능여부
	/**
	 * 연료
	 */
	private Fuel fuel;
	/**
	 * 자본금
	 */
	private int money;
	
	public Fuel getFuel() {
		return fuel;
	}
	public void setFuel(Fuel fuel) {
		this.fuel = fuel;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	
	/**
	 * 주유소에서 연료를 구입한다.
	 * @param gasStation 주유소
	 * @param type 연료종류 (gasoline, diesel, lpg)
	 * @param stock 구매량
	 */
	public void buy(GasStation gasStation, FuelType type, int stock) {
		boolean result = false;
		//1. type 연료를 stock 만큼 구매할 돈이 있는지 확인한다.
		if(checkMoney(type, stock)) {
			boolean sellResult = gasStation.sell(type, stock);
			//1-3. 돈은 있는데 주유소에서 판매할 수 없다고 하면 
			//		"연료를 구매할 수 없습니다."를 출력하고 메소드를 끝낸다.
			if(sellResult) {
				//1-1. 돈이 있다면 연료의 잔량을 stock만큼 증가시킨다.
				int fuelStock = fuel.getStock();
				fuelStock += stock;
				fuel.setStock(fuelStock);
				
				int money = (int)(Street.PRICES.get(type)*stock);
				
//				if(type.equals("gasoline")) {
//					money = (int)(Street.GASOLINE_PRICE * stock);
//				}
//				else if(type.equals("diesel")) {
//					money = (int)(Street.DIESEL_PRICE * stock);
//				}
//				else if(type.equals("lpg")) {
//					money = (int)(Street.LPG_PRICE * stock);
//				}
				this.pay(gasStation, money);
			}
			else {
				System.out.println("연료가 부족하여 연료를 구매할 수 없습니다.");
			}
			
		//1-2. 돈이 없다면 "연료를 구매할 수 없습니다"를 출력하고 메소드를 끝낸다.
		}else {
			System.out.println("잔액이 부족하여 연료를 구매할 수 없습니다.");
		}
	}
		/*gasStation.sell(type, stock);
		this.fuel.increaseStock(stock);
		int money=0;
		if(type.equals("gasoline")) {
			money=(int)(Street.GASOLINE_PRICE*stock);
		}else if(type.equals("diesel")) {
			money=(int)(Street.DIESEL_PRICE*stock);
		}else if(type.equals("lpg")) {
			money=(int)(Street.LPG_PRICE*stock);
		}
		this.pay(gasStation, money);
		*/
	/**
	 * 지출
	 * @param money 구매가격
	 */
	private void pay(GasStation gasStation, int money) {
		//주유소에게 돈을 지급한다.
		gasStation.addMoney(money);
		//고객의 돈을 뺀다.
		this.money -= money;
	}
	
	/**
	 * 주유하기에 충분한 돈을 가지고 있는지 확인한다
	 * @param type 주유할 연료종류 (gasoline, diesel, lpg)
	 * @param stock 주유량
	 * @return 주유가 가능한 돈을 가지고 있다면 true, 아니면 false
	 */
	private boolean checkMoney(FuelType type, int stock) {
		
		return Street.PRICES.get(type) * stock <=money; //Map (null*123)==>NullPointerException 문제발생
//		boolean result = false;
//		if(type.equals("gasoline")) {
//			//type에 맞는 연료가격을 stock에 곱해서 money 보다 적은지 확인한다
//			result = Street.GASOLINE_PRICE * stock <= money;
//		}
//		else if(type.equals("diesel")) {
//			result = Street.DIESEL_PRICE * stock <= money;
//		}
//		else if(type.equals("lpg")) {
//			result = Street.LPG_PRICE * stock <= money;
//		}
//		return result;
	}
	
	@Override
	public String toString() {
		
		return "고객님 기름량: "+fuel.getStock()+  " 자본금: " + money;
	}
}
