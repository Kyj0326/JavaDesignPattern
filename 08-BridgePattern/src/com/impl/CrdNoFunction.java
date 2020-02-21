package com.impl;

import com.intf.Function;

public class CrdNoFunction implements Function {

	@Override
	public void accumulate() {
		// TODO Auto-generated method stub
		System.out.println("카드번호로 적립해요~");
	}

	@Override
	public void use() {
		// TODO Auto-generated method stub
		System.out.println("카드번호로 사용해요~");
	}

	@Override
	public void cancel() {
		// TODO Auto-generated method stub
		System.out.println("카드번호로 취소해요~");
	}

	@Override
	public void check() {
		// TODO Auto-generated method stub
		System.out.println("카드번호로 조회해요~");
	}
	


}
