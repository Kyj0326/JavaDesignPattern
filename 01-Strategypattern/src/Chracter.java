
public class Chracter {
	
	//������
	private Weapon weapon;

	//��ȯ����
	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}
	

	public void attack() {
		if(weapon==null) {
			System.out.println("�Ǽհ���");
		}else {
		//�����ϴ�. ��������Ʈ
		weapon.attack();
		}
	}
	
	
	

}
