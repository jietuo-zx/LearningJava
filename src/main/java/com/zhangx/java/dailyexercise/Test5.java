/**  

* <p>Title: Test2.java</p>  

* <p>Description: </p>  

* <p>Copyright: Copyright (c) 2018</p>  

* @author zhangx  

* @date Apr 11, 2018  

* @version 1.0  

*/  
package com.zhangx.java.dailyexercise;

/**
 * @author zhangx
 *
 */
public class Test5 {
	public static void main(String[] args) {
		int count = 0;
		for (int i = 0; i < 10; i++) {
			if (i < 10) {
				count = count ++;
			}
		}
		
		System.out.println("count = " + count); 
	}
	
	// count ++ 是一个有返回值的表达式

}
