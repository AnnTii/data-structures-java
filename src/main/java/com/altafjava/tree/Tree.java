package com.altafjava.tree;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class Tree {

	private static Node root;

	public static void main(String[] args) {
		Tree tree = new Tree();
		tree.print();
		tree.add(10);
		tree.print();
		tree.add(5);
		tree.print();
		tree.add(15);
		tree.print();
		tree.add(2);
		tree.print();
		tree.add(18);
		tree.print();
		tree.add(12);
		tree.print();
		tree.add(8);
		tree.print();
		tree.iteratePreorder(root);
		tree.iterateInorder(root);
		tree.iteratePostorder(root);
		tree.levelOrderTraversal();
	}

	public int height(Node node) {
		return 0;
	}

	public void add(int num) {
		if (root == null) {
			root = new Node(num);
		} else {
			insert(root, num);
		}
	}

	public void insert(Node node, int num) {
		if (num < node.data) {
			if (node.left != null) {
				insert(node.left, num);
			} else {
				node.left = new Node(num);
			}
		} else {
			if (node.right != null) {
				insert(node.right, num);
			} else {
				node.right = new Node(num);
			}
		}
	}

	public void print() {
		System.out.print("[");
		preorder(root);
//		inorder(root);
//		postorder(root);
		System.out.println("]");
	}

	public void levelOrderTraversal() {
		Queue<Node> queue = new ArrayDeque<>();
		System.out.print("[");
		if (root != null) {
			System.out.print(root.data + " ");
			queue.offer(root);
		}
		Node cn = null;
		while (!queue.isEmpty()) {
			cn = queue.poll();
			if (cn.left != null) {
				System.out.print(cn.left.data + " ");
				queue.offer(cn.left);
			}
			if (cn.right != null) {
				System.out.print(cn.right.data + " ");
				queue.offer(cn.right);
			}
		}
		System.out.println("]");
	}

	public void iteratePreorder(Node node) {
		System.out.print("{");
		Deque<Node> stack = new ArrayDeque<>();
		while (!stack.isEmpty() || node != null) {
			if (node == null) {
				node = stack.pop();
				node = node.right;
			} else {
				System.out.print(node.data + " ");
				stack.push(node);
				node = node.left;
			}
		}
		System.out.println("}");
	}

	public void iterateInorder(Node node) {
		System.out.print("{");
		Deque<Node> stack = new ArrayDeque<>();
		while (!stack.isEmpty() || node != null) {
			if (node == null) {
				node = stack.pop();
				System.out.print(node.data + " ");
				node = node.right;
			} else {
				stack.push(node);
				node = node.left;
			}
		}
		System.out.println("}");
	}

	public void iteratePostorder(Node node) {
		System.out.print("{");
		Deque<Node> stack = new ArrayDeque<>();
		while (!stack.isEmpty() || node != null) {
			if (node != null) {
				stack.push(node);
				node = node.left;
			} else {
				node = stack.pop();
				if (node.data > 0) {
					node.data = -node.data;
					stack.push(node);
					node = node.right;
				} else {
					node.data = -node.data;
					System.out.print(node.data + " ");
					node = null;
				}
			}
		}
		System.out.println("}");
	}

	public void preorder(Node node) {
		if (node != null) {
			System.out.print(node.data + " ");
			preorder(node.left);
			preorder(node.right);
		}
	}

	public void inorder(Node node) {
		if (node != null) {
			inorder(node.left);
			System.out.print(node.data + " ");
			inorder(node.right);
		}
	}

	public void postorder(Node node) {
		if (node != null) {
			postorder(node.left);
			postorder(node.right);
			System.out.print(node.data + " ");
		}
	}

	public class Node {
		int data;
		Node left;
		Node right;

		public Node(int data) {
			this.data = data;
		}

		public Node(int data, Node left, Node right) {
			this.data = data;
			this.left = left;
			this.right = right;
		}
	}
}
