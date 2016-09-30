package impl.ds;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;


public class ConnectedGraph {

	public static void main(String[] args) {
		Graph myGraph = new Graph();
		System.out.println(ConnectedGraph.isConnectedBFS(myGraph.map,1));
		System.out.println(ConnectedGraph.isConnectedDFS(myGraph.map,1));
		
	}
	
	private static char[] isConnectedDFS(HashMap<Integer, ArrayList<Node>> map, int i) {
		
		return null;
	}

	private static boolean isConnectedBFS(HashMap<Integer, ArrayList<Node>> map, int source) {
		
		Node src = new Node();
		src.data = source;
		int countNode = 0;
		ArrayList<Integer> visited  = new ArrayList<Integer>();
	
		ArrayList<Integer> queue = new ArrayList<Integer>();
		queue.add(src.data);
		visited.add(src.data);
		
		while(!queue.isEmpty()) {
		
			int parent = queue.remove(0);
			Iterator it1 = map.get(parent).iterator();
			while(it1.hasNext()) {
				Node temp = (Node)it1.next();
				if(!visited.contains(temp.data)) {
					queue.add(temp.data);
					visited.add(temp.data);
				}
			}
			
			
		}
		
		if(visited.size() != map.size())
			return false;
		else
			return true;
		
		
	}

	

}
