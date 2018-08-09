/**  

* <p>Title: RenntrantLockTest.java</p>  

* <p>Description: </p>  

* <p>Copyright: Copyright (c) 2018</p>  

* @author zhangx  

* @date 2018年6月20日  

* @version 1.0  

*/
package com.zhangx.java.thread.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author zhangx
 *
 */
public class RenntrantLockTest {

	private Lock lock = new ReentrantLock();

	public void printTask() {

		lock.lock();

		for (int i = 0; i < 5; i++) {
			System.out.println("进入的线程为：" + Thread.currentThread().getName() + ", i = " + i);
		}
		try {
			Thread.sleep(50);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		lock.unlock();
	}

}
