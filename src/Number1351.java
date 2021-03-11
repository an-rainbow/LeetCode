
public class Number1351 {
	public int countNegatives(int[][] grid) {
		int total =grid.length* grid[0].length;
		int c=0;
		
		for (int i=0; i<grid.length; i++) {
			for(int j=0; j<grid[0].length; j++) {
				if(grid[i][0]<0) {
					i=grid.length;
					break;
				}
				
				if(grid[i][j]<0)
					break;
				c++;
			}
		}
	return total-c;
	}

	
	
}
