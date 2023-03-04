package com.my.project.actionlog.filter;

import com.my.project.actionlog.event.publish.SystemActionLogEventPublish;
import jakarta.servlet.*;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
@RequiredArgsConstructor
public class SystemActionLogFilter implements Filter {
    private final SystemActionLogEventPublish systemActionLogEventPublish;

    @Override
    public void doFilter(
            ServletRequest request,
            ServletResponse response,
            FilterChain chain
    ) throws ServletException, IOException {
        var httpServletRequest = (HttpServletRequest) request;

        systemActionLogEventPublish.publish(httpServletRequest);

        chain.doFilter(request, response);
    }
}
