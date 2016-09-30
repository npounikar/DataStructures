
public class StairCase {

	public static void main(String[] args) {
		int stairs[][] = {
				{3,5,7,9,10,12,4,6},    //cost of moving up the left side
				{1,1,12,13,14,14,5,6},  //cost of moving to the right
				{4,6,10,10,1,10,9,8},   //cost of moving to the left
				{1,5,7,9,3,12,8,2}      //cost of moving up the right side
		};
		
		System.out.println(StairCase.minCost(stairs));

	}

	private static int minCost(int[][] stairs) {
		
		int curLevel = 0;
		int costOption = 0;
		int minCostThusFar[] = {0, 0};
		
		while (curLevel < stairs[0].length-1){
			
			//Is it better to move up the left side, or move up the right side and go across?
			costOption = stairs[3][curLevel] + stairs[2][curLevel+1] + minCostThusFar[0];
			
			if (stairs[0][curLevel] + minCostThusFar[0] <= costOption){
				minCostThusFar[0] += stairs[0][curLevel];
			}
			else{
				minCostThusFar[0] += costOption;
			}
			
			//Is it better to move up right right side, or move up the left side and go across?
			costOption = stairs[0][curLevel] + stairs[1][curLevel+1] + minCostThusFar[1];
			if (stairs[3][curLevel] + minCostThusFar[1] <= costOption ){
				minCostThusFar[1] += stairs[3][curLevel];
			}
			else{
				minCostThusFar[1] += costOption;
			}
			
			curLevel++;
		}
		
		//Of the 2 final solutions, which is the smaller?
		if (minCostThusFar[0] <= minCostThusFar[1]) 
			return minCostThusFar[0];
		else 
			return minCostThusFar[1];
		
	}

	
	
}
