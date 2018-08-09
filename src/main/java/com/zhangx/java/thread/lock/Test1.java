/**  

* <p>Title: Test1.java</p>  

* <p>Description: </p>  

* <p>Copyright: Copyright (c) 2018</p>  

* @author zhangx  

* @date 2018年6月20日  

* @version 1.0  

*/
package com.zhangx.java.thread.lock;

/**
 * @author zhangx
 *
 */
public class Test1 {

	public static void main(String[] args) {

		RenntrantLockTest renntrantLockTest = new RenntrantLockTest();
		TestRenntrantLock lock1 = new TestRenntrantLock(renntrantLockTest);
		TestRenntrantLock lock2= new TestRenntrantLock(renntrantLockTest);
		TestRenntrantLock lock3 = new TestRenntrantLock(renntrantLockTest);
		TestRenntrantLock lock4 = new TestRenntrantLock(renntrantLockTest);
		TestRenntrantLock lock5 = new TestRenntrantLock(renntrantLockTest);
		
		lock1.start();
		lock2.start();
		lock3.start();
		lock4.start();
		lock5.start();

	}

	public static class TestRenntrantLock extends Thread {

		private RenntrantLockTest renntrantLockTest;

		public TestRenntrantLock(RenntrantLockTest renntrantLockTest) {
			super();
			this.renntrantLockTest = renntrantLockTest;
		}

		@Override
		public void run() {
			renntrantLockTest.printTask();
		}

	}
}
