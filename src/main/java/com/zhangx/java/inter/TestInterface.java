/**  

* <p>Title: TestInterface.java</p>  

* <p>Description: </p>  

* <p>Copyright: Copyright (c) 2018</p>  

* @author zhangx  

* @date 2018年7月10日  

* @version 1.0  

*/
package com.zhangx.java.inter;

/**
 * @author zhangx
 *
 */
public interface TestInterface {

	public final String name = "zhangx";
	
	public static String getName() {
		return name;
	}
	

	public static void main(String[] args) {
		System.out.println("接口中的方法:" + getName());
	}

}
