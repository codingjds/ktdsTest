package com.ktdsuniversity.edu.market;

public class Main {
	public static void main(String[] args) {
		
		//buyer에게 seller를 참조 = buyer를 통해 seller접근
		
								//이름, 돈, 사과개수
		Buyer buyer = new Buyer("장민창", 5_000_000, 0);
		
									//이름, 돈, 사과개수
		Seller seller = new Seller("이동학", 10_000_000, 10);
		
					//판매자에게 5개를 산다
		buyer.buy(seller, 5);
	}
}
