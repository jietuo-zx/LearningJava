/**  

* <p>Title: Test2.java</p>  

* <p>Description: </p>  

* <p>Copyright: Copyright (c) 2018</p>  

* @author zhangx  

* @date Apr 10, 2018  

* @version 1.0  

*/
package com.zhangx.java.innerclass;

/**
 * <p>
 * 创建一个类,它持有一个String,并且有一个显示这个String的toString()方法.
 * 将你的新类的若干个对象添加到一个Sequence对象中,然后显示它们
 * </p>
 * 
 * @author zhangx
 *
 */
public class Test2 {

	public static void main(String[] args) {
	}
}

class StringHolder {

	private String str;

	public StringHolder(String str) {
		this.str = str;
	}

	@Override
	public String toString() {
		return str;
	}
}
