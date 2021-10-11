class Solution {
   public  int[] kWeakestRows(int[][] matrix, int k) {
		int rows = matrix.length;
		int col = matrix[0].length;
		int i = 0;
		int[] soldiers = new int[rows];
		int[] answer = new int[k];
		while (i < rows) {
			if (matrix[i][0] == 1) {
				// binary search starts
				int l = 0;
				int r = col - 1;
				int result = 0;
				while (l <= r) {
					int mid = (l + r) / 2;
					if (1 == matrix[i][mid]) {
						result = mid;
						l = mid + 1; // This is to find the last occurrance of 1
					} else if (matrix[i][mid] < 1)
						r = mid - 1;
				}
				soldiers[i] = result + 1; // There is already one hence adding it to the last occurrance index
				// binary search ends
			} else if (matrix[i][0] == 0) {
				soldiers[i] = 0; // no point as the soldiers are the ones standing in front :) 
			}
			i++;
		}
		for (int x = 0; x < k; x++) {
			int index = 0;
			int min = col + 1;
			for (int y = 0; y < soldiers.length; y++) {
				if (soldiers[y] < min) {
					min = soldiers[y];
					index = y;
				}
			}
			soldiers[index] = col + 1; // this is to make sure that this index is not touched again
			answer[x] = index;
		}
		return answer;
	}
}
