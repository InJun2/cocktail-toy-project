package com.my.cocktail.actionlog.repository;

import com.my.cocktail.actionlog.model.SystemActionLog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SystemActionLogRepository extends JpaRepository<SystemActionLog, Long> {
    
}
