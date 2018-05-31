/**  

* <p>Title: ChooseQuestion.java</p>  

* <p>Description: </p>  

* <p>Copyright: Copyright (c) 2018</p>  

* @author zhangx  

* @date 2018年5月8日  

* @version 1.0  

*/
package com.zhangx.java.algorithm;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * 设有N个数，而要确定其中第K个最大者
 * 
 * @author zhangx
 *
 */
public class ChooseQuestion {

	public static void main(String[] args) {
		// step1: 生产N个数
		Integer[] nums = createNumber(10);
		System.out.println("原始数据：" + Arrays.toString(nums));
		// 方法一： 冒泡排序
		// bubble_Sort1(nums);
		// 方法二：冒泡排序
		bubble_Sort2(nums);
		System.out.println("排序完成：" + Arrays.toString(nums));
	}

	/**
	 * 冒泡排序2
	 * @param nums
	 */
	private static void bubble_Sort2(Integer[] nums) {

		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums.length - 1 - i; j++) {
				int temp;
				if (nums[j] > nums[j + 1]) {
					temp = nums[j];
					nums[j] = nums[j + 1];
					nums[j + 1] = temp;
				}
			}
		}

	}

	/**
	 * 冒泡排序1
	 * 
	 * @param nums
	 * @return
	 */
	private static void bubble_Sort1(Integer[] nums) {
		boolean flag;
		do {
			flag = false;
			for (int i = 0; i < nums.length - 1; i++) {
				if (nums[i] > nums[i + 1]) {
					int temp = nums[i];
					nums[i] = nums[i + 1];
					nums[i + 1] = temp;
					flag = true;
				}
			}
		} while (flag);
	}

	/**
	 * 选择排序
	 * 
	 * @param nums
	 * @return
	 */
	private static List<Integer> SelectionSort(List<Integer> nums) {
		if (nums == null || nums.size() <= 0) {
			return null;
		}
		for (int i = 0; i < nums.size() - 1; i++) {
			int temp = -1;
			for (int j = i + 1; j < nums.size(); j++) {
				if (nums.get(i) > nums.get(j)) {
					temp = nums.get(i);
					nums.set(i, nums.get(j));
					nums.set(j, temp);
				}
			}
			System.out.println("第" + i + "趟--------");
			System.out.println(nums.toString());
		}
		return nums;
	}

	/**
	 * 产生N个随机整数
	 * 
	 * @param i
	 * @return
	 */
	private static Integer[] createNumber(int n) {
		if (n <= 0) {
			return null;
		}
		Random random = new Random();
		Integer[] arr = new Integer[n];
		for (int i = 0; i < n; i++) {
			arr[i] = random.nextInt(n);
		}
		return arr;
	}

}
