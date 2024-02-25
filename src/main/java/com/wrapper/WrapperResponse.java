package com.wrapper;

import java.util.Locale;

import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpServletResponseWrapper;

public class WrapperResponse extends HttpServletResponseWrapper{

	 public WrapperResponse(HttpServletResponse response) {
	        super(response);
	    }

	
	

	public Locale getLocale ()
	    {
	        System.out.println ("Wrapper class called by Filter");
	        //Calling the superclass method i.e. ServletResponse's getLocale() method.
	        Locale loc = super.getLocale ();
	        String country = loc.getCountry ();
	        String language = loc.getLanguage ();
	        if (!country.equals ("US"))
	        {
	         Locale loc1 = new Locale ("English, US");
	         loc = loc1;
	        }
	        System.out.println (country);
	        System.out.println (language);
	        return loc;
	    }

}
