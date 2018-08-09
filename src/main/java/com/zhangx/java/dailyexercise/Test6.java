/**  

* <p>Title: Test6.java</p>  

* <p>Description: </p>  

* <p>Copyright: Copyright (c) 2018</p>  

* @author zhangx  

* @date 2018年7月13日  

* @version 1.0  

*/
package com.zhangx.java.dailyexercise;

/**
 * @author zhangx
 *
 */
public class Test6 {

	public static void main(String[] args) {
		System.out.println(beforeFinally());
	}

	public static int beforeFinally() {
		int a = 0;
		try {
			a = 1;
			return a;
		} finally {
			a = 2;
			System.out.println("--------------");
		}
	}

}
