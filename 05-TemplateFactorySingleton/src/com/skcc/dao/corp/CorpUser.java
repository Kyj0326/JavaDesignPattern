package com.skcc.dao.corp;

public class CorpUser {

	private String coNo;
	
	private String coBizNo;

	public String getCoNo() {
		return coNo;
	}

	public void setCoNo(String coNo) {
		this.coNo = coNo;
	}

	public String getCoBizNo() {
		return coBizNo;
	}

	public void setCoBizNo(String coBizNo) {
		this.coBizNo = coBizNo;
	}

	public CorpUser(String coNo, String coBizNo) {
		super();
		this.coNo = coNo;
		this.coBizNo = coBizNo;
	}
	
	
}
