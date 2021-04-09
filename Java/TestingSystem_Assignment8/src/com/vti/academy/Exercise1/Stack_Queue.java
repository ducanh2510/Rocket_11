package com.vti.academy.Exercise1;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class Stack_Queue {
	private Stack<String> stack;
	private Queue<String> queue;
	
	public Stack_Queue() {
		stack = new Stack<>();
		queue = new ArrayDeque<>();
	}
	public void inputStack() {
		stack.push("Nguyen Van Nam");
		stack.push("Nguyen Van Huyen");
		stack.push("Tran Van Nam");
		stack.push("Nguyen Van A");
	}
	
	public void inputQueue() {
		queue.add("Nguyen Van A");
		queue.add("Tran Van Nam");
		queue.add("Nguyen Van Huyen");
		queue.add("Nguyen Van Nam");
	}
}
