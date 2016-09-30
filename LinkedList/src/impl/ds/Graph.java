package impl.ds;
import java.util.ArrayList;
import java.util.HashMap;




public class Graph {

	HashMap<Integer, ArrayList<Node>> map = new HashMap<Integer, ArrayList<Node>>();
	
	Graph() {
		ArrayList<Node> dest1 = new ArrayList<Node>();
		dest1.add(new Node(2));
		dest1.add(new Node(3));
		
		ArrayList<Node> dest2 = new ArrayList<Node>();
		dest2.add(new Node(1));
		dest2.add(new Node(3));
		dest2.add(new Node(4));
		
		ArrayList<Node> dest3 = new ArrayList<Node>();
		dest3.add(new Node(1));
		dest3.add(new Node(2));
		dest3.add(new Node(4));
		
		ArrayList<Node> dest4 = new ArrayList<Node>();
		dest4.add(new Node(2));
		dest4.add(new Node(3));
		
		map.put(1, dest1);
		map.put(2, dest2);
		map.put(3, dest3);
		map.put(4, dest4);
		map.put(5, null);
	
	}
	
//	
//	public static void main(String[] args) {
//		Graph g = new Graph();
//	}
	
	
	
	
}
