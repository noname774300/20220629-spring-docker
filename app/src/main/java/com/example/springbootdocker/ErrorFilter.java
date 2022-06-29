package com.example.springbootdocker;

import java.io.IOException;
import java.util.logging.Logger;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import org.springframework.http.HttpStatus;
import org.springframework.web.filter.OncePerRequestFilter;
import org.springframework.web.server.ResponseStatusException;

public class ErrorFilter extends OncePerRequestFilter {

    @Override
    public void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain chain) throws IOException, ServletException {
        Logger logger = Logger.getLogger(ErrorFilter.class.getName());
        if (!request.getRequestURI().equals("/")) {
            response.setStatus(HttpStatus.PAYMENT_REQUIRED.value());
            response.setContentType("application/json;charset=UTF-8");
            response.getWriter().write("{\"message\":\"損せぬ人に儲けなし\"}");
            return;
        }
        chain.doFilter(request, response);
    }

}
