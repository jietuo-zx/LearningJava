package com.zhangx.java.dailyexercise;

import java.util.concurrent.atomic.AtomicInteger;

public class SaleRunnable implements Runnable {
	private static AtomicInteger ticketCounts = new AtomicInteger(500);

	public void run() {
		while (true) {
			synchronized (SaleRunnable.this) {
				if (ticketCounts.get() <= 0) {
					System.out.println(Thread.currentThread().getName() + ":票卖完了," + ticketCounts.get());
					break;
				}
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				ticketCounts.getAndDecrement();
				System.out.println(Thread.currentThread().getName() + "卖了一张票，还剩余：" + ticketCounts.get());
			}
		}

	}

}
