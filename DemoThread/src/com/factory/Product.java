package com.factory;

/**
 * 产品实体类
 * @author Administrator
 *
 */
public class Product {

	/** 数量 */
	private int amount;
	
	/**
	 * 无参构造方法
	 */
	public Product() {
	}

	/**
	 * 有参构造方法
	 * @param amount 数量
	 */
	public Product(int amount) {
		this.amount = amount;
	}
	
	/**
	 * 生产产品<br>
	 * 每次生产一个
	 */
	public void produce(){
		//添加一个产品
		this.amount++;
		System.out.println("生产了一个产品, 现有" + this.amount + "个");
	}
	
	/**
	 * 卖出产品<br>
	 * 每次卖出一个
	 */
	public void sale(){
		//卖出一个产品
		this.amount--;
		System.out.println("卖出了一个产品, 还有" + this.amount + "个");
	}
	
	/**
	 * 生产过程
	 */
	public synchronized void producer(){
		
		//判断, 产品数量
		if(this.amount < 6){ //产品未满仓
			
			//提示, XXX生产了一个产品, 还有?个
			System.out.print(Thread.currentThread().getName());
			this.produce(); //生产, 调用方法
			
			//唤醒线程
			notify();
			
		}else{
			
			//提示, 满仓
			System.out.println("仓库已满, 别再做了...");
			
			try {
				//阻塞线程
				wait();
			} catch (InterruptedException e) {
			}
		}
	}
	
	/**
	 * 卖出过程
	 */
	public synchronized void saler(){
		
		//判断, 产品数量
		if(this.amount > 0){ //数量充足
			
			//提示, XXX卖出了一个产品, 还有?个
			System.out.print(Thread.currentThread().getName());
			this.sale(); //卖出, 调用方法
			
			//唤醒线程
			notify();
			
		}else{
			
			//提示, 库存不足
			System.out.println("库存不足, 请耐心等待...");
			
			try {
				//阻塞线程
				wait();
			} catch (InterruptedException e) {
			}
			
		}
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}
	
}
