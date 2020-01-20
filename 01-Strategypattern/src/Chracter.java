
public class Chracter {
	
	//접근점
	private Weapon weapon;

	//교환가능
	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}
	

	public void attack() {
		if(weapon==null) {
			System.out.println("맨손공격");
		}else {
		//위임하다. 델리게이트
		weapon.attack();
		}
	}
	
	
	

}
