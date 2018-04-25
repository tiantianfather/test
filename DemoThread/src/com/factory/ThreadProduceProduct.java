package com.factory;

/**
 * 线程类, 产品生产
 * @author Administrator
 *
 */
public class ThreadProduceProduct implements Runnable {

	/** 产品对象 */
	private Product product;
	
	/**
	 * 有参构造方法
	 * @param product 产品
	 */
	public ThreadProduceProduct(Product product) {
		this.product = product;
	}

	@Override
	public void run() {
		
		//循环, 生产产品
		while(true){
			
			try {
				Thread.sleep((int)(Math.random()*3000));
			} catch (InterruptedException e) {
			}
			
			//生产产品, 调用方法
			this.product.producer();
		}
	}
	
	

}
