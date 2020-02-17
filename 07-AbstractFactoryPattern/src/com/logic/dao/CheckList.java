package com.logic.dao;

public class CheckList {
	
	private String coopCrdCd;
	
	private String jonUseYn;

	public String getCoopCrdCd() {
		return coopCrdCd;
	}

	public void setCoopCrdCd(String coopCrdCd) {
		this.coopCrdCd = coopCrdCd;
	}

	public String getJonUseYn() {
		return jonUseYn;
	}

	public void setJonUseYn(String jonUseYn) {
		this.jonUseYn = jonUseYn;
	}

	public CheckList(String coopCrdCd, String jonUseYn) {
		super();
		this.coopCrdCd = coopCrdCd;
		this.jonUseYn = jonUseYn;
	}

}
