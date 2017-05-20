package leetCode.tree;

import static org.junit.Assert.*;

import org.junit.Test;

import leetCode.helper.TreeNode;

/**
 * LeetCode Problem 104: Maximum Depth of Binary Tree
 * 
 * @author Swapnil Gaikwad
 *
 */
public class MaxDepth {

	public int maxDepth(TreeNode root) {
		if (root == null) {
			return 0;
		}
		return (int) Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
	}

	@Test
	public void test() {
		TreeNode root = null;
		assertEquals(0, maxDepth(root));
		root = new TreeNode(1);
		assertEquals(1, maxDepth(root));
		root.left = new TreeNode(2);
		assertEquals(2, maxDepth(root));
		root.right = new TreeNode(3);
		assertEquals(2, maxDepth(root));
	}

}
