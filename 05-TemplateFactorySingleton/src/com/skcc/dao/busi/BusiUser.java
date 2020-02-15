package com.skcc.dao.busi;

public class BusiUser {
	
	private String prnBizNo;
	
	private String dealrFg;

	public String getPrnBizNo() {
		return prnBizNo;
	}

	public void setPrnBizNo(String prnBizNo) {
		this.prnBizNo = prnBizNo;
	}

	public String getDealrFg() {
		return dealrFg;
	}

	public void setDealrFg(String dealrFg) {
		this.dealrFg = dealrFg;
	}

	public BusiUser(String prnBizNo, String dealrFg) {
		super();
		this.prnBizNo = prnBizNo;
		this.dealrFg = dealrFg;
	}
	
	

}
