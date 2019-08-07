package com.carroti.boot.config;

import com.netflix.zuul.ZuulFilter;

public class PreFilter extends ZuulFilter {
	 
    
    @Override
    public String filterType() {
        return "pre";
    }
 
    @Override
    public int filterOrder() {
        return 1;
    }
 
    @Override
    public boolean shouldFilter() {
        return true;
    }
 
    @Override
    public Object run() {
 
        System.out.println("Zuul 진입점 체크.");
        return null;
    }
    
}

