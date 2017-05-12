package leetCode.search;

import static org.junit.Assert.*;

import org.junit.Test;

import sun.applet.Main;

/**
 * LeetCode Problem 200: Number of Islands
 * 
 * @author Swapnil Gaikwad
 *
 */
public class NumberOfIslands {

	public int numIslands(char[][] grid) {
		int count = 0;
		for (int i = 0; i < grid.length; i++) {
			char[] row = grid[i];
			for (int j = 0; j < grid[i].length; j++) {
				char cell = row[j];
				if (cell == '1') {
					count++;
					cell = 'x';
					markVisited(grid, i, j);
				}
			}
		}
		return count;
	}

	public void markVisited(char[][] grid, int i, int j) {
		if (i + 1 < grid.length && grid[i + 1][j] == '1') {
			grid[i + 1][j] = 'x';
			markVisited(grid, i + 1, j);
		}

		if (i - 1 >= 0 && grid[i - 1][j] == '1') {
			grid[i - 1][j] = 'x';
			markVisited(grid, i - 1, j);
		}

		if (j + 1 < grid[0].length && grid[i][j + 1] == '1') {
			grid[i][j + 1] = 'x';
			markVisited(grid, i, j + 1);
		}

		if (j - 1 >= 0 && grid[i][j - 1] == '1') {
			grid[i][j - 1] = 'x';
			markVisited(grid, i, j - 1);
		}
	}

	@Test
	public void test() {
		char[][] example1 = { { '1', '1', '1', '1', '0' }, { '1', '1', '0', '1', '0' }, { '1', '1', '0', '0', '0' },
				{ '0', '0', '0', '0', '0' } };
		assertEquals(1, numIslands(example1));
		char[][] example2 = { { '1', '1', '0', '0', '0' }, { '1', '1', '0', '0', '0' }, { '0', '0', '1', '0', '0' },
				{ '0', '0', '0', '1', '1' } };
		assertEquals(3, numIslands(example2));
		char[][] example3 = { { '1', '1', '1' }, { '0', '1', '0' }, { '1', '1', '1' } };
		assertEquals(1, numIslands(example3));
	}
}
