package com.my.cocktail.actionlog.service;

import com.my.cocktail.actionlog.model.SystemActionLog;
import com.my.cocktail.actionlog.repository.SystemActionLogRepository;
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
