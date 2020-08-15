package com.djw.controller;


import com.djw.Log4j2DemoApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Author: dai jiawei
 * @Date: 2020/8/15 9:02
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = Log4j2DemoApplication.class)
public class LogControllerTest {

    private static Logger log = LoggerFactory.getLogger(LogController.class);

    @Test
    public void test() {
        log.info("成功！");
    }
}