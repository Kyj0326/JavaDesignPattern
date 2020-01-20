//여러 알고리즘을 하나의 추상적인 접근점을 만들어 접금점에서 서로 교환 가능하도록 하는 패턴
public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Chracter character = new Chracter();
		
		character.attack();
		
		character.setWeapon(new Sword());
		character.attack();
		
		character.setWeapon(new Knife());
		character.attack();
		
		
		
	}

}
