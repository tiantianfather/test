package com.interface_;

import com.entity.Account;

/**
 * 我的线程类
 * @author Administrator
 *
 */
/* 实现线程的API, 2: 实现接口, Runnable */
public class MyThread implements Runnable {

	private int i = 1;
	
	/** 账户对象 */
	private Account account;
	
	@Override
	public synchronized void run() {
		/* 输出1~100 */
		/*for(; i <= 100; i++) {
			//输出内容
			System.out.println(
					Thread.currentThread().getName()//当前线程的名字
					+ " : " + i
			);
		}*/
		int i = 0;
		
		while(account.getBalance() > 0) {
			
			account.setBalance(account.getBalance()-100);
			
			System.out.println(Thread.currentThread().getName()+
					"第"+ ++i + "次操作, 当前余额为" + account.getBalance());
		}
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

}
