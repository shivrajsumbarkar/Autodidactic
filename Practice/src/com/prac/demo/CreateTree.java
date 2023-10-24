package com.prac.demo;

public class CreateTree {

	public static void main(String[] args) {
		Node<String> root = createTree();
		printTree(root, " ");

	}

	private static Node<String> createTree() {
		// Create the Root node. Since the root node has no parent, we set the parent as
		// null.
		Node<String> root = new Node<>("root");

		// Add the first child to the root node. addChild adds the child to the node and
		// also assigns the parent to the added node.
		Node<String> node1 = root.addChild(new Node<String>("node 1"));

		Node<String> node11 = node1.addChild(new Node<String>("node 11"));
		Node<String> node111 = node11.addChild(new Node<String>("node 111"));
		Node<String> node112 = node11.addChild(new Node<String>("node 112"));

		Node<String> node12 = node1.addChild(new Node<String>("node 12"));

		Node<String> node2 = root.addChild(new Node<String>("node 2"));

		Node<String> node21 = node2.addChild(new Node<String>("node 21"));
		Node<String> node211 = node2.addChild(new Node<String>("node 22"));
		return root;
	}

	private static <T> void printTree(Node<T> node, String appender) {
		System.out.println(appender + node.getData());
		node.getChildren().forEach(each -> printTree(each, appender + appender));
	}
}