package com.factory;

public class TestProduct {

	public static void main(String[] args) throws Exception {
		
		//创建对象
		Product product = new Product(1); //产品对象
		ThreadSaleProduct tsp = new ThreadSaleProduct(product); //卖产品线程对象
		ThreadProduceProduct tpp = new ThreadProduceProduct(product); //生产产品线程对象
		
		//创建线程
		Thread tspA = new Thread(tsp, "卖场");
		Thread tspB = new Thread(tpp, "工厂");
		
		//开始线程
		tspB.start();
		tspA.start();
	}
}
