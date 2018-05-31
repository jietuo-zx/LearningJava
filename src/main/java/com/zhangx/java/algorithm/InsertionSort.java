/**  

* <p>Title: InsertionSort.java</p>  

* <p>Description: </p>  

* <p>Copyright: Copyright (c) 2018</p>  

* @author zhangx  

* @date 2018年4月26日  

* @version 1.0  

*/
package com.zhangx.java.algorithm;

import java.util.Arrays;

/**
 * 插入排序
 * 
 * @author zhangx
 *
 */
public class InsertionSort {

	public static void main(String[] args) {
		int[] intArr = new int[] { 20, 64, 1, 54, 87, 22, 32, 11, 55 };

		for (int i = 0; i < intArr.length - 1; i++) {
			for (int j = i + 1; j > 0; j--) {
				if (intArr[j] <= intArr[j-1]) {
					int temp = intArr[j-1];
					intArr[j-1] = intArr[j];
					intArr[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(intArr));
	}
}
