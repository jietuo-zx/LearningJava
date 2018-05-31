/**  

* <p>Title: Test4.java</p>  

* <p>Description: </p>  

* <p>Copyright: Copyright (c) 2018</p>  

* @author zhangx  

* @date Apr 12, 2018  

* @version 1.0  

*/  
package com.zhangx.java.dailyexercise;

import java.io.File;

/**
 * @author zhangx
 *
 */
public class Test4 {
	
	public static void main(String[] args) {
		try {
			File file = new File("");
			String name = file.getName();
			System.out.println("name = " + name); 
		} catch (Exception e) {
			System.out.println("-----------------------------");
			System.out.println("toString 内容：" + e.toString());
			System.out.println("-----------------------------");
			System.out.println("getMessage 内容：" + e.getMessage());
		}
		
	}

}
