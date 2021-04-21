package com.atguigu.user;

import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * https://developer.aliyun.com/lesson_1913_16408?spm=5176.10731542.0.0.89621b49lzHGx9#_16408
 * 第6章 » 课时34 SpringBoot、Dubbo、Zookeeper整合
 * provider-ticket 这个是项目时服务提供者,需要使用dubbo将服务提供者项目注册到zookeeper的注册中心里面,
 * 然后消费者项目consumer-user去zookeeper的注册中心去找服务提供者,找到之后zookeeper会把服务提供者的信息返回给消费者,
 * 接下来消费者项目通过dubbo进行		RPC(远程调用)服务就行了。
 * 1,
 * 2,配置dubbo的注册中心地址
 * 3,引用服务
 */
@SpringBootApplication
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
}
