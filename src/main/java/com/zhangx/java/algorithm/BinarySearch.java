/**  

* <p>Title: BinarySearch.java</p>  

* <p>Description: </p>  

* <p>Copyright: Copyright (c) 2018</p>  

* @author zhangx  

* @date 2018年5月28日  

* @version 1.0  

*/
package com.zhangx.java.algorithm;

/**
 * 二分查找
 * 
 * @author zhangx
 *
 */
public class BinarySearch {

	public static void main(String[] args) {
		int[] array = new int[] { 1, 3, 6, 8, 10, 52, 68, 94, 102, 541, 4125, 6666, 44785 };

		// 需要查找的数字
		int num = 102;

		// 开始位置
		int start = 0;
		// 结束位置
		int end = array.length - 1;
		// 中间位置
		int middle = 0;

		while (start <= end) {
			middle = (end + start) / 2;
			if (array[middle] == num) {
				System.out.println("找到了，索引为：" + middle);
				return;
			} else if (array[middle] < num) {
				start = middle + 1;
			} else if (array[middle] > num) {
				end = middle - 1;
			}
		}
		System.out.println("没有找到");

	}

}
