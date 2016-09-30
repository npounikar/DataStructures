import java.util.Scanner;

public class DirectoryStructure {

	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter DIR : ");
		String start = sc.nextLine();
		System.out.println("");
		printfile("/" + start.trim(), 0);
	}

	private static void printfile(String path,int preTabs) {

		if(sc == null)
			return;
		
		String currentStr = sc.nextLine();
		
		if(currentStr.trim()=="")
			return;
		
		int currentTabs = countTabs(currentStr);
		if(currentStr.trim().contains(".jpg")){
			String temp = path + "/" + currentStr.trim();
			System.out.println(temp);
			printfile(path, preTabs);
		}

		if(currentTabs > preTabs){
			printfile(path + "/" + currentStr.trim(), currentTabs);
		}

		if(currentTabs <= preTabs){
			String[] upDir = path.split("/");
			String temp = "";
			for(int i =0;i <= currentTabs;i++){
				temp = temp + upDir[i] + "/";
			}
			printfile(temp + currentStr.trim(), currentTabs);
		}
		
		return;
	}

	private static int countTabs(String currentStr) {
		String[] splits = currentStr.split("\t");
		return (splits.length - 1);
	}

}
