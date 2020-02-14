package com.skcc;

public class Mainapp {
	
	public static void main(String[] args) {
		
		MemberFactory memFac = new MemberFactory();
		User indiUser = new User();
		indiUser.setCi("asdjioasdjiasodjioasdjio33212321312");
		
		
		MemberFlg test  = memFac.createMember(1);
		
		test.Validate(indiUser);
		
		
		
		
		
	}

}
