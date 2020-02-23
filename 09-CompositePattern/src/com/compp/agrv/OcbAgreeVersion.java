package com.compp.agrv;

import java.util.List;

import com.compp.dao.InfoItem;

public class OcbAgreeVersion implements AgreeVersion{
	
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
	

}
