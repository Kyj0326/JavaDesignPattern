package com.compp.agrv;

import java.util.List;

import com.compp.dao.InfoItem;
import com.vis.Accept;
import com.vis.AddFunction;

public class OcbAgreeVersion implements AgreeVersion, Accept {
	
	private InfoItem infoItem;
	
	

	public OcbAgreeVersion(InfoItem infoItem) {
		super();
		this.infoItem = infoItem;
	}

	@Override
	public List<String> getInfoItem() {
		// TODO Auto-generated method stub
		return infoItem.getList();
	}

	@Override
	public String getAgrVer() {
		// TODO Auto-generated method stub
		return infoItem.getAgrVerCd();
	}

	@Override
	public void accept(AddFunction add) {
		// TODO Auto-generated method stub
		add.addBiz(this);
	}
	

}
