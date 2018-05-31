/**  

* <p>Title: Test1Outer.java</p>  

* <p>Description: </p>  

* <p>Copyright: Copyright (c) 2018</p>  

* @author zhangx  

* @date Apr 10, 2018  

* @version 1.0  

*/
package com.zhangx.java.innerclass;

import com.zhangx.java.innerclass.Outer.Inner;

/**
 * <p>
 * 编写一个名为Outer的类，它包含一个名为Inner的类。在Outer中添加
 * 一个方法，它返回一个Inner类型的对象。在main()中，创建并初始化一个指向某个Inner对象的引用
 * </p>
 * 
 * @author zhangx
 *
 */
public class Test1 {

	public static void main(String[] args) {
		Outer outer = new Outer();
		outer.getInner();
	}
}

class Outer {
	class Inner {
		public Inner() {
			System.out.println("create Inner class");
		}
	}

	Inner getInner() {
		return new Inner();
	}
}
