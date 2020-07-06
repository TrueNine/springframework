package cn.TrueNine.controller;

import cn.TrueNine.pojo.User;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * @author TrueNine
 * @version 1.0
 * @date 2020/6/30
 */
@Configuration
public class SpringApplicationContextConfig {

    @Bean
    @Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public User getUser() {
        return new User();
    }
}