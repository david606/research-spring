package org.david.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author david
 */
@ConfigurationProperties(prefix = "david.redis")
@Data
public class RedissonProperties {
    private String host;
    private String password;
    private int port;
    private int timeout;
    private boolean ssl;
}
