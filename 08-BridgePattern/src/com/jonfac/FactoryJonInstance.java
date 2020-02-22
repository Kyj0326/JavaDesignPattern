package com.jonfac;

import com.bridge.dao.CheckList;
import com.jonfac.abst.CancelPoint;
import com.jonfac.abst.CheckPoint;
import com.jonfac.abst.JonUseFactory;
import com.jonfac.abst.UsePoint;

public class FactoryJonInstance {
	
		
		public static JonUseFactory getUseFactory(CheckList list) {
				
				if( list.getJonYn()=="Y") {
						
				if( list.getTarget() =="CD01") {
					return new KbFactory();
				}else if ( list.getTarget() == "CD02") {
					return new WrFactory();
				}else if ( list.getTarget() == "CD03") {
					return new BeneFactory();
				}else if ( list.getTarget() == "CD04") {
					return new EmFactory(); 
				}else if ( list.getTarget() == "CD05") { 
					return new SamFactory();
				}else if ( list.getTarget() == "CD06") {
					return new PaycoFactory();
				}
			
			}
			
			return null;
			
		}

}
	


class KbCancel implements CancelPoint{

	@Override
	public void cancel() {
		// TODO Auto-generated method stub
		System.out.println("kb����Ʈ ��� ���");
	}

}

class KbCheck implements CheckPoint{

	@Override
	public void check() {
		// TODO Auto-generated method stub
		System.out.println("KB����Ʈ ��ȸ�սô�~");
	}

}

class KbFactory implements JonUseFactory{

	@Override
	public CheckPoint createChkPoint() {
		// TODO Auto-generated method stub
		return new KbCheck();
	}

	@Override
	public UsePoint createUsePoint() {
		// TODO Auto-generated method stub
		return new KbUse();
	}

	@Override
	public CancelPoint createCancelPoint() {
		// TODO Auto-generated method stub
		return new KbCancel();
	}

}

class KbUse implements UsePoint{

	@Override
	public void use() {
		// TODO Auto-generated method stub
		System.out.println("KB����Ʈ ����սô�~");
	}
	

}


class WrCancel implements CancelPoint {

	@Override
	public void cancel() {
		// TODO Auto-generated method stub
		System.out.println("�츮 ����Ʈ ��� ���");
	}

}

class WrCheck implements CheckPoint{

	@Override
	public void check() {
		// TODO Auto-generated method stub
		System.out.println("WR����Ʈ ��ȸ�սô�~");
	}
	
}

class WrFactory implements JonUseFactory{

	@Override
	public CheckPoint createChkPoint() {
		// TODO Auto-generated method stub
		return new WrCheck();
	}

	@Override
	public UsePoint createUsePoint() {
		// TODO Auto-generated method stub
		return new WrUse();
	}

	@Override
	public CancelPoint createCancelPoint() {
		// TODO Auto-generated method stub
		return new WrCancel();
	}
	
}

class WrUse implements UsePoint{

	@Override
	public void use() {
		// TODO Auto-generated method stub
		System.out.println("WR����Ʈ ����սô�~");
	}
	

}

class BeneCancel implements CancelPoint {

	@Override
	public void cancel() {
		// TODO Auto-generated method stub
		System.out.println("�����Ǿ� ����Ʈ ��� ���");
	}
	

}

class BeneCheck implements CheckPoint{

	@Override
	public void check() {
		// TODO Auto-generated method stub
		System.out.println("BENEPIA ����Ʈ ��ȸ�սô�~");
	}

}

class BeneFactory implements JonUseFactory{

	@Override
	public CheckPoint createChkPoint() {
		// TODO Auto-generated method stub
		return new BeneCheck();
	}

	@Override
	public UsePoint createUsePoint() {
		// TODO Auto-generated method stub
		return new BeneUse();
	}

	@Override
	public CancelPoint createCancelPoint() {
		// TODO Auto-generated method stub
		return new BeneCancel();
	}
	
	


}

class BeneUse implements UsePoint{

	@Override
	public void use() {
		// TODO Auto-generated method stub
		System.out.println("BENEPIA ����Ʈ ����սô�~");
	}
	

}


class EmCancel implements CancelPoint {

	@Override
	public void cancel() {
		// TODO Auto-generated method stub
		System.out.println("��������Ʈ ��� ���");
	}
	
	

}

class EmCheck implements CheckPoint{

	@Override
	public void check() {
		// TODO Auto-generated method stub
		System.out.println("���� ����Ʈ ��ȸ�սô�~");
	}
}

class EmFactory implements JonUseFactory{

	@Override
	public CheckPoint createChkPoint() {
		// TODO Auto-generated method stub
		return new EmCheck();
	}

	@Override
	public UsePoint createUsePoint() {
		// TODO Auto-generated method stub
		return new EmUse();
	}

	@Override
	public CancelPoint createCancelPoint() {
		// TODO Auto-generated method stub
		return new EmCancel();
	}
	
	
}

class EmUse implements UsePoint{

	@Override
	public void use() {
		// TODO Auto-generated method stub
		System.out.println("���� ����Ʈ ����սô�~");
	}
	
}

class SamCancel implements CancelPoint {

	@Override
	public void cancel() {
		// TODO Auto-generated method stub
		System.out.println("�Ｚ ����Ʈ ��� ���");
	}
	

}

class SamCheck implements CheckPoint{

	@Override
	public void check() {
		// TODO Auto-generated method stub
		System.out.println("�Ｚ ����Ʈ ��ȸ�սô�~");
	}
}

class SamFactory implements JonUseFactory{

	@Override
	public CheckPoint createChkPoint() {
		// TODO Auto-generated method stub
		return new SamCheck();
	}

	@Override
	public UsePoint createUsePoint() {
		// TODO Auto-generated method stub
		return new SamUse();
	}

	@Override
	public CancelPoint createCancelPoint() {
		// TODO Auto-generated method stub
		return new SamCancel();
	}

	
}

class SamUse implements UsePoint{

	@Override
	public void use() {
		// TODO Auto-generated method stub
		System.out.println("�Ｚ ����Ʈ ����սô�~");
	}
	


}

class PaycoCancel implements CancelPoint {

	@Override
	public void cancel() {
		// TODO Auto-generated method stub
		System.out.println("������ ����Ʈ ��� ���");
	}
	

}

class PaycoCheck implements CheckPoint{

	@Override
	public void check() {
		// TODO Auto-generated method stub
		System.out.println("������ ����Ʈ ��ȸ�սô�~");
	}

}

class PaycoFactory implements JonUseFactory{

	@Override
	public CheckPoint createChkPoint() {
		// TODO Auto-generated method stub
		return new PaycoCheck();
	}

	@Override
	public UsePoint createUsePoint() {
		// TODO Auto-generated method stub
		return new PaycoUse();
	}

	@Override
	public CancelPoint createCancelPoint() {
		// TODO Auto-generated method stub
		return new PaycoCancel();
	}
	
	

}

class PaycoUse implements UsePoint{

	@Override
	public void use() {
		// TODO Auto-generated method stub
		System.out.println("������ ����Ʈ ����սô�~");
		}
		

}
