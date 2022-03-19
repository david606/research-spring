package org.david.config;

import org.redisson.Redisson;
import org.redisson.api.RedissonClient;
import org.redisson.config.Config;
import org.redisson.config.SingleServerConfig;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.StringUtils;

/**
 * @author david
 */
@Configuration
@ConditionalOnClass(Redisson.class)
@EnableConfigurationProperties(RedissonProperties.class)
public class RedissonAutoConfiguration {

    @Bean
    public RedissonClient redissonClient(RedissonProperties properties) {
        Config config = new Config();

        String prefix = "redis://";
        if (properties.isSsl()) {
            prefix = "rediss://";
        }

        SingleServerConfig serverConfig = config.useSingleServer()
                .setAddress(prefix + properties.getHost() + ":" + properties.getPort())
                .setTimeout(properties.getTimeout());

        if (!StringUtils.hasText(properties.getPassword())) {
            serverConfig.setPassword(properties.getPassword());
        }


        return Redisson.create(config);
    }
}
