/**  

* <p>Title: TestOveride.java</p>  

* <p>Description: </p>  

* <p>Copyright: Copyright (c) 2018</p>  

* @author zhangx  

* @date Apr 10, 2018  

* @version 1.0  

*/
package com.zhangx.java.initialzation;

/**
 * @author zhangx
 *
 */
public class TestOveride {

	private void f() {
		System.out.println("private f()");
	}

	public static void main(String[] args) {
		TestOveride testOveride = new TestOveride().new Test1();
		testOveride.f();
	}

	class Test1 extends TestOveride {
		public void f() {
			System.out.println("public f()");
		}
	}
}
