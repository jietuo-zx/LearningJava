/**  

* <p>Title: Test10.java</p>  

* <p>Description: </p>  

* <p>Copyright: Copyright (c) 2018</p>  

* @author zhangx  

* @date Apr 9, 2018  

* @version 1.0  

*/
package com.zhangx.java.initialzation;

/**
 * 编写具有finalize()方法的类，并在方法中打印消息。在main()在为该类创建一个对象。 试解释这个程序的行为。
 * 
 * @author zhangx
 *
 */
public class Test10 {

	public static void main(String[] args) throws Throwable {
		new Test10();
	}

	@Override
	protected void finalize() throws Throwable {
		super.finalize();
		System.out.println("finalize() called");
	}

}
