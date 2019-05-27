package com.mclamee.tools.sample.config;

import com.mclamee.tools.sample.SampleBean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {SampleBean.BASE_PACKAGE})
public class SampleConfiguration {

}
