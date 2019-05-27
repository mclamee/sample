package com.mclamee.tools.tests.sample;

import com.mclamee.tools.sample.SampleBean;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = SampleTestConfig.class)
@Slf4j
public class SampleTest {

    @Autowired
    private SampleBean bean;

    @Test
    public void defaultTest() {
        Assert.assertEquals("I am Sample!", bean.getName());
    }
}