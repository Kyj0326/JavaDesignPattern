//���� �˰����� �ϳ��� �߻����� �������� ����� ���������� ���� ��ȯ �����ϵ��� �ϴ� ����
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
