package com.bank;


/**
 * 测试类, 取款
 * @author Administrator
 *
 */
public class TestWithdrawal {
	
	/**
	 * 程序入口
	 * @param args
	 */
	public static void main(String[] args) {
		
		// 创建两个线程
		ThreadAccount ta = new ThreadAccount(); //取款线程对象
		Thread one = new Thread(ta, "张三"); //线程, 张三
		Thread two = new Thread(ta, "张三的妻子"); //线程, 张三的妻子
		
		// 启动线程
		one.start();
		two.start();
	}
}
