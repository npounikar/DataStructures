
public class Nqueens {

	public static void main(String[] args) {
		
		int n = 8;
		int[][] a = new int[n][n];
		
		for(int i = 0 ; i<n ; i++) {
			for(int j = 0 ; j<n ; j++) {
				a[i][j] = 0;
			}
		}
		
		//print(a,n);
		int i= 0, j = 0;
		while(a[i][j] == 0 && a[i][j] != -1 && a[i][j] != 1 && i<n) {
			a[i][j] = 1;
			a = setIJ(a,i,j, n);
			print(a,n);
			j++;
			i++;
		}
	}
	
	private static int[][] setIJ(int[][] a, int i, int j, int n) {
		for(int x = i+1 ; x<n ; x++) {
			a[i][x] = -1;
		}
		for(int x = j+1 ; x<n ; x++) {
			a[x][j] = -1;
		}
		for(int x = i+1 ; x<n ; x++) {
			for(int y = j+1 ; y<n ; y++) {
				if(x==y)
					a[x][y] = -1;
			}
		}
		print(a,n);
		return a;
	}

	static void print(int[][] a, int n) {
		for(int i = 0 ; i<n ; i++) {
			for(int j = 0 ; j<n ; j++) {
				System.out.print(a[i][j]+"  ");
			}
			System.out.println("");
		}
	}

}
