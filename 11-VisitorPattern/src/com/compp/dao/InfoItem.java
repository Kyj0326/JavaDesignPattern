package com.compp.dao;

import java.util.List;

public class InfoItem {
	
	private String agrVerCd;
	
	private List<String> list;

	public String getAgrVerCd() {
		return agrVerCd;
	}

	public void setAgrVerCd(String agrVerCd) {
		this.agrVerCd = agrVerCd;
	}

	public List<String> getList() {
		return list;
	}

	public void setList(List<String> list) {
		this.list = list;
	}

	public InfoItem(String agrVerCd, List<String> list) {
		super();
		this.agrVerCd = agrVerCd;
		this.list = list;
	}

	
}
