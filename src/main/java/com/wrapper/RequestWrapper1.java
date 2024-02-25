package com.wrapper;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletRequestWrapper;

public class RequestWrapper1 extends HttpServletRequestWrapper {
	 public RequestWrapper1(HttpServletRequest req) {
	        super(req);
	    }
	@Override
	public String getParameter (String str) {
		String name= super.getParameter(str);
		if(name==null || name.isEmpty()){
			name="please, enter your name in the form";
		}
		return name ;
	}

}
