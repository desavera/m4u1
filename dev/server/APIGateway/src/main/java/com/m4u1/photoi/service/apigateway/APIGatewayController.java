package com.m4u1.photoi.service.apigateway;


import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;

@Component
public class APIGatewayController implements Filter {
        public void init(FilterConfig arg0) throws ServletException {
        }

        public void destroy() {
        }

        public void doFilter(ServletRequest req, ServletResponse resp,
                        FilterChain chain) throws IOException, ServletException {
                HttpServletResponse response = (HttpServletResponse) resp;

                response.setHeader("Access-Control-Allow-Origin", "*");
                response.setHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS");
                response.setHeader("Access-Control-Max-Age", "3600");
                response.setHeader("Access-Control-Allow-Headers",
                                "Origin, X-Requested-With, Content-Type, Accept");

                chain.doFilter(req, resp);
        }
}
