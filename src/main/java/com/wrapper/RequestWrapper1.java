package com.wrapper;

import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletRequestWrapper;

public class RequestWrapper1 extends ServletRequestWrapper {
	public RequestWrapper1(ServletRequest req) {
		super(req);
	}@Override
	public String getParameter (String str) {
		String name= super.getParameter(str);
		if(name==null || name.isEmpty()){
			name="please, enter your name in the form";
		}
		return name ;
	}

}
