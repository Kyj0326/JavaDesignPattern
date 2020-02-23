package com.compp.agrv;

import java.util.ArrayList;
import java.util.List;

import com.compp.dao.InfoItem;

public class AgreeVersionImpl implements AgreeVersion {
	
	private List<AgreeVersion> agrvers = new ArrayList<AgreeVersion>(); 
	
	public void addAgreeVersion(AgreeVersion agreeVersion) {
		agrvers.add(agreeVersion);
	}
	
	public void removeAgreeVersion(AgreeVersion agreeVersion) {
		agrvers.remove(agreeVersion);
	}

	@Override
	public List<String> getInfoItem() {
		// TODO Auto-generated method stub
		List<String> items = new ArrayList<String>();
		for(AgreeVersion agreeVersion : agrvers) {
			items.addAll(agreeVersion.getInfoItem());
		}
		
		//중복제거
		List<String> dup = new ArrayList<String>();
		for(int i=0; i<items.size(); i++) {
			if(!dup.contains(items.get(i)))
				dup.add(items.get(i));
		}
		return dup;
	}

	@Override
	public String getAgrVer() {
		// TODO Auto-generated method stub
		List<String> agrver = new ArrayList<String>();
		for(AgreeVersion agreeVersion : agrvers) {
			agrver.add(agreeVersion.getAgrVer());
		}
		return agrver.toString();
	}
	

}
