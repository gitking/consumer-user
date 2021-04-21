package com.atguigu.user;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.atguigu.user.service.UserService;

/**
 * Unit test for simple App.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class AppTest 
{
	
	@Autowired
	UserService userService;
	
	
	/*
	 * 运行消费者项目consumer-user之前,服务提供者的provider-ticket项目必须先启动成功
	 */
    @Test
    public void shouldAnswerWithTrue()
    {
    	userService.hello();
    }
}
