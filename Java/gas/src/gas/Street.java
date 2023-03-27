package gas;

import java.util.HashMap;
import java.util.Map;

/**
 * 주유소 프로그램
 * @author User
 *
 */
public class Street {
	/*
	 * 주유소 프로그램
	 * 주유소에 휘발유, 경유, LPG를 판매하고 있습니다.
	 * 시장가
	 *  휘발유:1569.67원
	 *  경유:1651.15원
	 *  LPG:1039.35원
	 * 휘발유, 경유, LPG를 주유하고 난 뒤의
	 * 주유소와 세명 고객의 기름량과 자본금을 출력하세요
	 * 
	 */
	//map으로 static필드 초기화 데이터값
	//Double: 제너릭에는 primitive은 불가-> wrapper형식으로만 가능
	public static final Map<FuelType, Double> PRICES;
	//static필드 초기화 데이터값을 할당하기위해
	static {
		PRICES =new HashMap<>();
		PRICES.put(FuelType.GASOLINE, 1569.67);
		PRICES.put(FuelType.DIESEL, 1651.15);
		PRICES.put(FuelType.LPG, 1039.35);
	}
	
//	/**
//	 * 휘발유 리터당 가격
//	 */
//	public static final double GASOLINE_PRICE = 1569.67;
//	/**
//	 * 경유 리터당 가격
//	 */
//	public static final double DIESEL_PRICE = 1651.15;
//	/**
//	 * LPG 리터당 가격
//	 */
//	public static final double LPG_PRICE = 1039.35;
	
	
	public static void main(String[] args) {
		
		GasStation gasStation = new GasStation();
		/*Fuel fuel = new Fuel();
		gasStation.setGasoline(fuel);
		gasStation.setDiesel(fuel);
		gasStation.setLpg(fuel);*/
		
		Customer customer = new Customer();
		customer.setFuel(new Fuel(FuelType.DIESEL,50));
		customer.setMoney(1_000_000);
		
		
		customer.buy(gasStation, FuelType.DIESEL, 5000);
	//	customer.buy(gasStation, FuelType.0diesel, 50);
	//	customer.buy(gasStation, "Diesel", 50);
		
//		System.out.println(customer);
//		System.out.println(gasStation);
//		
		
	}
}
