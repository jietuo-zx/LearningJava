/**  

* <p>Title: Test3.java</p>  

* <p>Description: </p>  

* <p>Copyright: Copyright (c) 2018</p>  

* @author zhangx  

* @date Apr 11, 2018  

* @version 1.0  

*/  
package com.zhangx.java.dailyexercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author zhangx
 *
 */
public class Test3 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(3);
		list.add(5);
		list.add(8);
		list.add(1);
		list.add(4);
		list.add(7);
		list.add(10);
		list.add(2);
		Collections.sort(list, new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return o2 - o1;
			}
		});
		
		System.out.println(list.toString());
	}
}
