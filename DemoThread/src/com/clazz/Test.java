package com.clazz;

import com.entity.Account;

/**
 * 测试类, 使用线程
 * @author Administrator
 *
 */
public class Test {

	public static void main(String[] args) {
		
		//1. 创建线程对象
		/*MyThread m1 = new MyThread();
		MyThread m2 = new MyThread();*/
		MyThread m1 = new MyThread("线程A");
		MyThread m2 = new MyThread("线程B");
		
		//设置线程名称
		/*m1.setName("线程A");
		m2.setName("线程B");*/
		
		//设置线程的优先级, 争抢资源的能力的高低(几率)
		//几率值范围由低到高  1~10, 默认为5
		m1.setPriority(4);
		m2.setPriority(6);
		
		//设置账户
		m1.setAccount(new Account(500));
		m2.setAccount(new Account(500));
		
		//2. 启动线程
		m1.start();
		m2.start();
	}
}


















