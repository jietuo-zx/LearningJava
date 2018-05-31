/**  

* <p>Title: A.java</p>  

* <p>Description: </p>  

* <p>Copyright: Copyright (c) 2018</p>  

* @author zhangx  

* @date Apr 10, 2018  

* @version 1.0  

*/
package com.zhangx.java.innerclass;

/**
 * @author zhangx
 *
 */
class A {

	interface B {
		void f();
	}

	public class BImpl implements B {
		@Override
		public void f() {
		}
	}

	private class BImpl2 implements B {
		@Override
		public void f() {
		}
	}

	public interface C {
		void f();
	}

	class CImpl implements C {

		@Override
		public void f() {
		}
	}

	private class CImpl2 implements C {
		@Override
		public void f() {

		}

	}

	public interface D {
		void f();
	}

	private class DImpl implements D {
		@Override
		public void f() {
		}
	}

	public class DImpl2 implements D {
		@Override
		public void f() {
		}
	}

}

public class NestingInterface {

	public class A{
		
	}
	
	public class B{
		
	}
	public static void main(String[] args) {
		
	}
}
