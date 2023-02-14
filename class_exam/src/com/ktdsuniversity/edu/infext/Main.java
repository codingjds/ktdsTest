package com.ktdsuniversity.edu.infext;

public class Main {
	
	public static void memberManage(MemberService memberService) {
		memberService.regist();
		memberService.updateMyInfo();
		
//		if(memberService instanceof VipMemberService) {
////			VipMemberService vipMemberService = (VipMemberService) memberService;
////			vipMemberService.addPoint(50);
//				//instanceof 없이 캐스팅하면 에러뜸 / 부모클래스가 자식클래스로 갈수없으므로 캐스팅한거임
//			((VipMemberService) memberService).addPoint(50);
//			//실무버전 위에 두줄을 한줄로 요약가능 -자바에서 http요청할때 많이 쓰임
//		}	
		
		memberService.unregist();
	}
	
//																							public static void vipMemberManage(VipMemberService memberService) {
//																								memberService.regist();
//																								memberService.unregist();
//																								memberService.updateMyInfo();
//																								memberService.addPoint(50);
//																							}	//addPoint를 쓰기위해 두개로 쪼갰다
//																			
	public static void main(String[] args) {
		//Sub class is a Super class
		MemberService memberService = new MemberServiceImpl();
		MemberService vipMemberService = new VipMemberServiceImpl();
		
		memberManage(memberService);
		memberManage(vipMemberService);
//																								vipMemberManage(vipMemberService);
		
//		//의문점 1 .  자식클래스가 왜 인터페이스 받은 것만 되는거지? 상속받은 클래스는..?
//		//이유 찾음 !! new로 생성할때는 인터페이스가 아닌 클래스만 가능하다!
//		MemberService memberService = new MemberServiceImpl();
//		memberService.regist();
//		memberService.unregist();
//		memberService.updateMyInfo();
//		
//		MemberService vipMemberService = new VipMemberServiceImpl();
//		vipMemberService.regist();
//		vipMemberService.unregist();
//		vipMemberService.updateMyInfo();
////		vipMemberService.addPoint(); -> 불가능 MemberService에는 addPoint가 없기 때문에
//		
//		//인터페이스만 있고 바디가 없는 것 ==> 추상화! 추상화가 높다 낮다
//		
		
	}
	
	
}
