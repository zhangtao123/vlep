package com.anji.allways.filter;

import com.netflix.zuul.ZuulFilter;

/**
 * Created with IntelliJ IDEA.
 * User: User
 * Date: 2018/5/30
 * Time: 16:41
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public class AccessFilter extends ZuulFilter {

    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return false;
    }

    @Override
    public Object run() {
        return null;
    }
}