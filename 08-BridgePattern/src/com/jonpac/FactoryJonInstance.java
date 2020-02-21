package com.jonpac;

import com.dao.CheckList;
import com.jonpac.abst.CancelPoint;
import com.jonpac.abst.CheckPoint;
import com.jonpac.abst.JonUseFactory;
import com.jonpac.abst.UsePoint;

public class FactoryJonInstance {
	
		public static JonUseFactory getUseFactory(CheckList list) {
				
				if( list.getJonUseYn()=="Y") {
							
					if( list.getCoopCrdCd() =="A001") {
						return new KbFactory();
					}else if ( list.getCoopCrdCd() == "A002") {
						return new WrFactory();
					}else if ( list.getCoopCrdCd() == "A003") {
						return new BeneFactory();
					}else if ( list.getCoopCrdCd() == "A004") {
						return new EmFactory(); 
					}else if ( list.getCoopCrdCd() == "A005") { 
						return new SamFactory();
					}else if ( list.getCoopCrdCd() == "A006") {
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
		System.out.println("kb포인트 사용 취소");
	}

}

class KbCheck implements CheckPoint{

	@Override
	public void check() {
		// TODO Auto-generated method stub
		System.out.println("KB포인트 조회합시다~");
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
		System.out.println("KB포인트 사용합시다~");
	}
	

}


class WrCancel implements CancelPoint {

	@Override
	public void cancel() {
		// TODO Auto-generated method stub
		System.out.println("우리 포인트 사용 취소");
	}

}

class WrCheck implements CheckPoint{

	@Override
	public void check() {
		// TODO Auto-generated method stub
		System.out.println("WR포인트 조회합시다~");
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
		System.out.println("WR포인트 사용합시다~");
	}
	

}

class BeneCancel implements CancelPoint {

	@Override
	public void cancel() {
		// TODO Auto-generated method stub
		System.out.println("베네피아 포인트 사용 취소");
	}
	

}

class BeneCheck implements CheckPoint{

	@Override
	public void check() {
		// TODO Auto-generated method stub
		System.out.println("BENEPIA 포인트 조회합시다~");
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
		System.out.println("BENEPIA 포인트 사용합시다~");
	}
	

}


class EmCancel implements CancelPoint {

	@Override
	public void cancel() {
		// TODO Auto-generated method stub
		System.out.println("두툼포인트 사용 취소");
	}
	
	

}

class EmCheck implements CheckPoint{

	@Override
	public void check() {
		// TODO Auto-generated method stub
		System.out.println("두툼 포인트 조회합시다~");
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
		System.out.println("두툼 포인트 사용합시다~");
	}
	
}

class SamCancel implements CancelPoint {

	@Override
	public void cancel() {
		// TODO Auto-generated method stub
		System.out.println("삼성 포인트 사용 취소");
	}
	

}

class SamCheck implements CheckPoint{

	@Override
	public void check() {
		// TODO Auto-generated method stub
		System.out.println("삼성 포인트 조회합시다~");
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
		System.out.println("삼성 포인트 사용합시다~");
	}
	


}

class PaycoCancel implements CancelPoint {

	@Override
	public void cancel() {
		// TODO Auto-generated method stub
		System.out.println("페이코 포인트 사용 취소");
	}
	

}

class PaycoCheck implements CheckPoint{

	@Override
	public void check() {
		// TODO Auto-generated method stub
		System.out.println("페이코 포인트 조회합시다~");
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
		System.out.println("페이코 포인트 사용합시다~");
	}
	

}