/**  

* <p>Title: Test12.java</p>  

* <p>Description: </p>  

* <p>Copyright: Copyright (c) 2018</p>  

* @author zhangx  

* @date Apr 9, 2018  

* @version 1.0  

*/
package com.zhangx.java.initialzation;

/**
 * 编写名为Tank的类，此类的状态可以是“满的”或“空的”，其终结条件是：对象被清理时必须是空的状态。 请编写finalize以验证终结条件是否成立。
 * 在main()中测试Tank可能发生的几种使用方式
 * 
 * @author zhangx
 *
 */
public class Test12 {

	public static void main(String[] args) {
		new Tank().empty();
		new Tank();
		System.gc();
		System.runFinalization();
	}

	static class Tank {

		static int counter = 0;
		int id = counter++;

		/**
		 * false 表示空 true 表示满
		 */
		boolean full;

		public Tank() {
			System.out.println("Tank " + id + " created");
			full = true;
		}

		public void empty() {
			full = false;
		}

		@Override
		protected void finalize() throws Throwable {
			super.finalize();
			if (full)
				System.out.println("Error Tank " + id + " must be empty at clean up");
			else
				System.out.println("Tank " + id + " clean up is OK!");
		}

		@Override
		public String toString() {
			return "Tank " + id;
		}
	}
}
