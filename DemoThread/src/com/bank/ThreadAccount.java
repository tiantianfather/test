package com.bank;

/**
 * 线程类, 取款
 * @author Administrator
 *
 */
public class ThreadAccount implements Runnable {
	
	/**
	 * 所有使用ThreadAccount对象创建的线程共享同一个帐户对象
	 */
	private Account acct = new Account();

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			
			//调用方法,  取款
			makeWithdrawal(100);
			
			//判断, 账户余额
			if (acct.getBalance() < 0) { //透支
				System.out.println("账户透支了!");
			}
		}
	}

	/**
	 * 取款
	 * @param amt 取款金额
	 */
	private void makeWithdrawal(int amt) {	
//	private synchronized void makeWithdrawal(int amt) {	
		
		synchronized (acct) {
			//判断, 余额是否充足
			if (acct.getBalance() >= amt) { //余额充足

				//提示, XXX准备取款
				System.out.println(Thread.currentThread().getName() + " 准备取款");

				try {
					//0.5秒后实现取款
					Thread.sleep(500);
				} catch (InterruptedException ex) {
				}

				//取款
				acct.withdraw(amt);
				

				//提示, XXX完成取款
				System.out.println(Thread.currentThread().getName() + " 完成取款, 余额为" + acct.getBalance());

			} else { //余额不足

				//提示, 余额不足
				System.out.println("余额不足以支付 " + Thread.currentThread().getName() + " 的取款，余额为 " + acct.getBalance());
			}
		}
		try {
			Thread.sleep(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
