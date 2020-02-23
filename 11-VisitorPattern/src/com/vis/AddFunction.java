package com.vis;

import com.compp.agrv.AgreeVersionImpl;
import com.compp.agrv.MkeAgreeVersion;
import com.compp.agrv.OcbAgreeVersion;
import com.compp.agrv.TheAgreeVersion;

public interface AddFunction {
	
	public void addBiz(MkeAgreeVersion MkeAgr);
	public void addBiz(OcbAgreeVersion OcbAgr);
	public void addBiz(TheAgreeVersion TheAgr);
	public void addBiz(AgreeVersionImpl agr);

}
