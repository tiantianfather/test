package com.factory;

/**
 * 线程类, 卖产品
 * @author Administrator
 *
 */
public class ThreadSaleProduct implements Runnable {

	/** 产品 */
	private Product product;

	/**
	 * 有参构造方法
	 * @param product 产品
	 */
	public ThreadSaleProduct(Product product) {
		this.product = product;
	}

	@Override
	public void run() {
		
		//循环, 卖产品
		while(true){
			
			try {
				Thread.sleep((int)(Math.random()*3000));
			} catch (InterruptedException e) {
			}
			
			//卖产品, 调用方法
			this.product.saler();
		}
	}

	
}
