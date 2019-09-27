package com.liu.source.filters;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import java.io.IOException;

/**
 * Created by liufengfang on 2019/9/27.
 */
@Component
public class MyFilterOne implements Filter {
    Log logger = LogFactory.getLog(this.getClass());

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        logger.info("MyFilterOne-init() ");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        logger.info("MyFilterOne-doFilter()  start");
        filterChain.doFilter(servletRequest,servletResponse);
        logger.info("MyFilterOne-doFilter()  end");
    }

    @Override
    public void destroy() {
        logger.info("MyFilterOne-destroy()");
    }
}
