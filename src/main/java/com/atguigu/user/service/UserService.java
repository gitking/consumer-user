package com.atguigu.user.service;

import org.springframework.stereotype.Service;
import com.alibaba.dubbo.config.annotation.Reference;
import com.atguigu.ticket.service.TicketService;

@Service
public class UserService {
	
	@Reference
	TicketService ticketService;
	
	/*
	 * 运行消费者项目consumer-user之前,服务提供者的provider-ticket项目必须先启动成功
	 */
	public void hello() {//RPC远程调用服务提供者的provider-ticket提供的方法,这有点想java的远程调用，RMI远程调用
		String ticket = ticketService.getTicket();
		System.out.println("买到票了，" + ticket);
	}
}
