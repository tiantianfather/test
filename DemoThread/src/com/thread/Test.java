package com.thread;

import com.clazz.MyThread;

/**
 * 测试类, 线程调度
 * @author Administrator
 *
 */
public class Test {

	public static void main(String[] args) {
		
		//获取主线程对象
		Thread main = Thread.currentThread();
		//设置主线程名称
		main.setName("主线程");
		
		//创建分线程对象
		MyThread m1 = new MyThread("分线程-1");
		
		//启动分线程
		m1.start();
		/*try {
			m1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		for(int i = 1; i <= 100; i++) {
			
			//判断, 休眠的情况
			/*if(i % 5 == 0) {
				//暂停
				try {
					main.sleep(1000*2);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}*/
			
			//礼让
			/*if(i % 3 == 0) {
				System.out.println(main.getName()+"礼让");
				main.yield();
			}*/
			
			System.out.println(main.getName() + " : " + i);
		}
	}
}











