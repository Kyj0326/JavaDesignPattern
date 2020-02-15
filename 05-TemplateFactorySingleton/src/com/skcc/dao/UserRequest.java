package com.skcc.dao;

import com.skcc.dao.busi.BusiUser;
import com.skcc.dao.corp.CorpUser;

public class UserRequest {
	
	private String reqFg;
	
	private int mbrFg;
	
	private String mbrId;
	
	private String ci;
	
	private CorpUser corpUser;
	
	private BusiUser busiUser;

	public String getReqFg() {
		return reqFg;
	}

	public void setReqFg(String reqFg) {
		this.reqFg = reqFg;
	}

	public int getMbrFg() {
		return mbrFg;
	}

	public void setMbrFg(int mbrFg) {
		this.mbrFg = mbrFg;
	}

	public String getMbrId() {
		return mbrId;
	}

	public void setMbrId(String mbrId) {
		this.mbrId = mbrId;
	}

	public String getCi() {
		return ci;
	}

	public void setCi(String ci) {
		this.ci = ci;
	}

	public CorpUser getCorpUser() {
		return corpUser;
	}

	public void setCorpUser(CorpUser corpUser) {
		this.corpUser = corpUser;
	}

	public BusiUser getBusiUser() {
		return busiUser;
	}

	public void setBusiUser(BusiUser busiUser) {
		this.busiUser = busiUser;
	}

	public UserRequest(String reqFg, int mbrFg, String mbrId, String ci, CorpUser corpUser, BusiUser busiUser) {
		super();
		this.reqFg = reqFg;
		this.mbrFg = mbrFg;
		this.mbrId = mbrId;
		this.ci = ci;
		this.corpUser = corpUser;
		this.busiUser = busiUser;
	}

}
