/**  

* <p>Title: MyArrayListTest1.java</p>  

* <p>Description: </p>  

* <p>Copyright: Copyright (c) 2018</p>  

* @author zhangx  

* @date 2018年7月17日  

* @version 1.0  

*/
package com.zhangx.java.datastructure;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.zhangx.java.datastructure.MyArrayList.MyArrayListIterator;

/**
 * @author zhangx
 *
 */
class MyArrayListTest {

	private MyArrayList myArrayList = null;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		myArrayList = new MyArrayList();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterEach
	void tearDown() throws Exception {
		System.out.println(myArrayList.toString());
		System.out.println(myArrayList.size());
	}

	/**
	 * Test method for
	 * {@link com.zhangx.java.datastructure.MyArrayList#MyArrayList()}.
	 */
	@Test
	void testMyArrayList() {

	}

	/**
	 * Test method for
	 * {@link com.zhangx.java.datastructure.MyArrayList#add(java.lang.Object)}.
	 */
	@Test
	void testAddObject() {
		myArrayList.add("A");
		myArrayList.add("B");
	}

	/**
	 * Test method for
	 * {@link com.zhangx.java.datastructure.MyArrayList#add(java.lang.Object, int)}.
	 */
	@Test
	void testAddObjectInt() {
		testAddObject();
		myArrayList.add("haha", 1);
	}

	/**
	 * Test method for {@link com.zhangx.java.datastructure.MyArrayList#get(int)}.
	 */
	@Test
	void testGet() {
		testAddObjectInt();
		Object object = myArrayList.get(0);
		System.out.println(object);
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.zhangx.java.datastructure.MyArrayList#size()}.
	 */
	@Test
	void testSize() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for
	 * {@link com.zhangx.java.datastructure.MyArrayList#remove(int)}.
	 */
	@Test
	void testRemoveInt() {
		testAddObjectInt();
		Object remove = myArrayList.remove(1);
		System.out.println("remove:" + remove);
	}

	/**
	 * Test method for
	 * {@link com.zhangx.java.datastructure.MyArrayList#remove(java.lang.Object)}.
	 */
	@Test
	void testRemoveObject() {
		testAddObjectInt();
		Boolean remove = myArrayList.remove("A");
		System.out.println(remove);
	}

	/**
	 * Test method for {@link com.zhangx.java.datastructure.MyArrayList#clear()}.
	 */
	@Test
	void testClear() {
		testAddObjectInt();
		myArrayList.clear();
	}

	/**
	 * Test method for
	 * {@link com.zhangx.java.datastructure.MyArrayList#contains(java.lang.Object)}.
	 */
	@Test
	void testContains() {
		testAddObjectInt();
		Boolean contains = myArrayList.contains("S");
		System.out.println(contains);
	}

	/**
	 * Test method for {@link com.zhangx.java.datastructure.MyArrayList#iterator()}.
	 */
	@Test
	void testIterator() {
		testAddObjectInt();
		MyArrayListIterator iterator = myArrayList.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());

		}

	}

}
