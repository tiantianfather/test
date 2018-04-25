package com.bank;

/**
 * 银行帐户类
 * @author Administrator
 * 
 */
public class Account {
	
	/** 余额 */
	private int balance = 600; 

	/**
	 * 获取余额
	 * @return 账户余额
	 */
	public int getBalance() {
		return balance;
	}

	/**
	 * 取款
	 * @param amount 取款数额
	 */
	public void withdraw(int amount) {
		balance -= amount;
	}
}
