package com.interface_;

import com.entity.Account;

/**
 * 测试类, 使用接口的线程使用
 * @author Administrator
 *
 */
public class Test {

	public static void main(String[] args) {
		
		//1. 创建自定义线程的对象
		MyThread m = new MyThread();
		
		//设置账户
		m.setAccount(new Account(500));
		
		//2. 将自定义线程对象作为参数, 创建可执行的线程对象
		Thread t1 = new Thread(m, "韩梅梅");
		Thread t2 = new Thread(m, "李雷");
		
		//3. 启动线程
		t1.start();
		t2.start();
	}
}


















