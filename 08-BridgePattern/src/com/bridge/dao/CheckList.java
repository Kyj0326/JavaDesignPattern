package com.bridge.dao;

public class CheckList {
	
	private String mbrId;
	
	private String coopCrdCd;
	
	private String jonYn;
	
	private String grpSvcFg;
	
	private String target;
	
	private String args4;
	
	private String args5;
	
	public CheckList mbrId(String val) {
		mbrId=val;
		return this;
	}
	
	public CheckList coopCrdCd(String val) {
		coopCrdCd=val;
		return this;
	}
	
	public CheckList jonYn(String val) {
		jonYn=val;
		return this;
	}
	
	public CheckList grpSvcFg(String val) {
		grpSvcFg=val;
		return this;
	}
	
	public CheckList target(String val) {
		target=val;
		return this;
	}


	public String getTarget() {
		return target;
	}

	public void setTarget(String target) {
		this.target = target;
	}

	public String getMbrId() {
		return mbrId;
	}

	public void setMbrId(String mbrId) {
		this.mbrId = mbrId;
	}

	public String getCoopCrdCd() {
		return coopCrdCd;
	}

	public void setCoopCrdCd(String coopCrdCd) {
		this.coopCrdCd = coopCrdCd;
	}

	public String getJonYn() {
		return jonYn;
	}

	public void setJonYn(String jonYn) {
		this.jonYn = jonYn;
	}

	public String getGrpSvcFg() {
		return grpSvcFg;
	}

	public void setGrpSvcFg(String grpSvcFg) {
		this.grpSvcFg = grpSvcFg;
	}

	public String getArgs4() {
		return args4;
	}

	public void setArgs4(String args4) {
		this.args4 = args4;
	}

	public String getArgs5() {
		return args5;
	}

	public void setArgs5(String args5) {
		this.args5 = args5;
	}


}
