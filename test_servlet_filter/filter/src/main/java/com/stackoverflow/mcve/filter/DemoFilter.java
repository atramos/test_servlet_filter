package com.stackoverflow.mcve.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class DemoFilter implements Filter {

	public void doFilter(ServletRequest request, final ServletResponse response,
			FilterChain chain) throws IOException, ServletException {

		response.getOutputStream().print("filter works!!!");
	}
}
