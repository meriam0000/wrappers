package com.wrapper;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet Filter implementation class Filter1
 */
@WebFilter("/servlet1")
public class Filter1 extends HttpFilter implements Filter {
       
    /**
     * @see HttpFilter#HttpFilter()
     */
    public Filter1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		   
		
	            HttpServletRequest httpRequest = (HttpServletRequest) request;
	            HttpServletResponse httpResponse = (HttpServletResponse) response;

	            // Set content type if needed
	            response.setContentType("text/html");
	            PrintWriter out = response.getWriter();
	            out.println("<b> <i>Filtering request and passing it to Wrapper class</i> </b> <br/>");

	            // Wrap the request if it's an HttpServletRequest
	            RequestWrapper1 requestWrapper1 = new RequestWrapper1(httpRequest);
	            out.println("<b> <i>Filter is filtering the response and passing it to Wrapper class</i> </b> <br/>");
	            WrapperResponse responseWrapper = new WrapperResponse(httpResponse);
	            

	            // Pass the wrapped request and original response to the next filter or servlet
	            chain.doFilter(requestWrapper1,responseWrapper);
	        }
		

	          
		
         // pass the request along the filter chain
	

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
