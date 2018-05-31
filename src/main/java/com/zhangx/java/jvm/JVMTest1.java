/**  

* <p>Title: JVMTest1.java</p>  

* <p>Description: </p>  

* <p>Copyright: Copyright (c) 2018</p>  

* @author zhangx  

* @date 2018年5月16日  

* @version 1.0  

*/
package com.zhangx.java.jvm;

/**
 * @author zhangx
 *
 */
public class JVMTest1 {

	public static void main(String[] args) {
		String st1 = new StringBuilder().append("计算机").append("软件").toString();
		System.out.println(st1.intern() == st1);

		String st2 = new StringBuilder().append("ja").append("va").toString();
		System.out.println(st2.intern() == st2);
		
	}

}
