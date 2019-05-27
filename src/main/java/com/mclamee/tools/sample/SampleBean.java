package com.mclamee.tools.sample;

import javax.annotation.PostConstruct;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class SampleBean implements InitializingBean {
    public static final String BASE_PACKAGE = "com.mclamee.tools.sample";

    private String name;

    @Override
    public void afterPropertiesSet() {
        this.name = "I am Sample!";
        log.info("Bean is initialized! " + this.name);
    }

    @PostConstruct

    public String getName() {
        return this.name;
    }
}
