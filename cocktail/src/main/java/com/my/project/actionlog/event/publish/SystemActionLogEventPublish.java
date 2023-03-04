package com.my.project.actionlog.event.publish;

import com.my.project.actionlog.event.model.SystemActionLogEventModel;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;


@Component
@RequiredArgsConstructor
public class SystemActionLogEventPublish {
    private final ApplicationEventPublisher applicationEventPublisher;

    public void publish(HttpServletRequest request) {
        var event = new SystemActionLogEventModel(request);
        applicationEventPublisher.publishEvent(event);
    }
}
