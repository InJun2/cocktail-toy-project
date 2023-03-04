package com.my.project.actionlog.service;

import com.my.project.actionlog.model.SystemActionLog;
import com.my.project.actionlog.repository.SystemActionLogRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SystemActionLogService {
    private final SystemActionLogRepository systemActionLogRepository;

    public void insert(SystemActionLog systemActionLog) {
        systemActionLogRepository.save(systemActionLog);
    }
}
