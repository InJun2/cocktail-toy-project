package com.my.cocktail.actionlog.model;

import com.my.cocktail.common.entity.BaseEntity;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
@Getter
@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "system_action_log")
public class SystemActionLog extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "ip_address")
    private String ipAddress;

    private String path;

    @Column(name = "http_method")
    private String httpMethod;

    @Column(name = "user_agent")
    private String userAgent;

    private String host;

    private String referer;

    public SystemActionLog(String ipAddress, String path, String httpMethod, String userAgent, String host, String referer) {
        this.ipAddress = ipAddress;
        this.path = path;
        this.httpMethod = httpMethod;
        this.userAgent = userAgent;
        this.host = host;
        this.referer = referer;
    }
}
