package com.impl;

import com.intf.Function;

public class MbrFgNoFunction implements Function {

	@Override
	public void accumulate() {
		// TODO Auto-generated method stub
		System.out.println("ȸ�����й�ȣ�� �����ؿ�~");
	}

	@Override
	public void use() {
		// TODO Auto-generated method stub
		System.out.println("ȸ�����й�ȣ�� ����ؿ�~");
	}

	@Override
	public void cancel() {
		// TODO Auto-generated method stub
		System.out.println("ȸ�����й�ȣ�� ����ؿ�~");
	}

	@Override
	public void check() {
		// TODO Auto-generated method stub
		System.out.println("ȸ�����й�ȣ�� ��ȸ�ؿ�~");
	}
	
	

}
