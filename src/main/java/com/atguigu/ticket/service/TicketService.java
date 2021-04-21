package com.atguigu.ticket.service;

/*
 * 消费者项目consumer-user要调用服务提供者项目的服务,就必须在自己的项目里面创建一个跟服务提供者项目一样的接口,全路径都必须一样
 * 比如com.atguigu.ticket.service.TicketService;
 */
public interface TicketService {
	public String getTicket();
}
