/**  

* <p>Title: MyLinkedList.java</p>  

* <p>Description: </p>  

* <p>Copyright: Copyright (c) 2018</p>  

* @author zhangx  

* @date 2018年7月13日  

* @version 1.0  

*/
package com.zhangx.java.datastructure;

/**
 * @author zhangx
 *
 */
public class MyLinkedList<T> {

	private int size;

	/** 链表的表头，表头里面不包含任何数据 */
	private Node<T> header = new Node<T>(null, null, null);

	public MyLinkedList() {
		clear();
	}

	/**
	 * 清空链表
	 */
	private void clear() {
		header.pre = header.next = header;
		size = 0;
	}

	public boolean add(T t) {
		linkLast(t);
		return true;
	}

	public boolean addFirst(T t) {
		Node<T> next = header.next;
		Node<T> newNode = new Node<T>(header, t, next.pre);
		header.next = newNode;
		next.pre = newNode.next;
		size++;
		return true;
	}

	public boolean addLast(T t) {
		linkLast(t);
		return true;
	}

	public T removeFirst() {

		return null;
	}

	public T removeLast() {
		return null;
	}

	public boolean add(T t, int index) {

		return true;
	}

	public T get(int index) {
		return null;
	}

	public T remove(int index) {
		return null;
	}

	public T remove(T t) {
		return null;
	}

	public int indexOf(T t) {
		return -1;
	}

	/**
	 * 在链表后端添加一个元素
	 * 
	 * @param t
	 */
	private void linkLast(T t) {
		// 获取最后一个元素
		Node<T> last = header.pre;
		Node<T> newNode = new Node<T>(last.next, t, header.pre);
		last.next = newNode.pre;
		header.pre = newNode;
		size++;
	}

	public String toString() {

		return null;
	}

	private static class Node<T> {

		Node<T> pre;

		Node<T> next;

		T element;

		public Node(Node<T> pre, T element, Node<T> next) {
			this.pre = pre;
			this.next = next;
			this.element = element;
		}
	}
}
