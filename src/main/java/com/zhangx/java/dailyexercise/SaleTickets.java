package com.zhangx.java.dailyexercise;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 卖票问题
 * 
 * @author jietu
 *
 */
public class SaleTickets {

	public static void main(String[] args) {
		ExecutorService pool = Executors.newFixedThreadPool(4);
		SaleRunnable saleRunnable = new SaleRunnable();
		for(int i = 0;i < 4 ;i++) {
			pool.execute(saleRunnable);
		}
//		new Thread(saleRunnable,"窗口二").start();
//		new Thread(saleRunnable,"窗口一").start();
//		new Thread(saleRunnable,"窗口三").start();
//		new Thread(saleRunnable,"窗口四").start();
		System.out.println("开始卖票。。。。。。。。。。"); 

	}

}
