package com.clazz;

import com.entity.Account;

/**
 * 我的线程
 * @author Administrator
 *
 */
/* 创建线程类的API,1: 继承类 Thread */
/*
 * 重写, run方法
 * */
public class MyThread extends Thread {

	/** 账户对象 */
	private Account account;
	
	public MyThread() {
	}

	/**
	 * 带参构造方法
	 * @param name 线程名称
	 */
	public MyThread(String name) {
		super(name);
	}
	
	@Override
	public void run() {
		
		/* 输出1~100 */
		for(int i = 1; i <= 100; i++) {
			
			//判断, 是否休眠
			/*if(i % 3 == 0) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}*/
			
			//输出内容
			System.out.println(
					Thread.currentThread().getName()//当前线程的名字
					+ " : " + i
			);
		}
		
		/*int i = 0;
		
		while(account.getBalance() > 0) {
			
			account.setBalance(account.getBalance()-100);
			
			System.out.println(Thread.currentThread().getName()+
					"第"+ ++i + "次操作, 当前余额为" + account.getBalance());
		}*/
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}
	
}










