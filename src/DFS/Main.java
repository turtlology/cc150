package DFS;

import java.util.HashMap;
import java.util.Map;

public class Main {
	
	public static void main(String arg[]) {
		GraphNode start = new GraphNode("a");
		GraphNode n1 = new GraphNode("b");
		GraphNode n2 = new GraphNode("c");
		GraphNode n3 = new GraphNode("d");
		GraphNode n4 = new GraphNode("e");
		GraphNode n5 = new GraphNode("f");
		start.neighbor.add(n1);
		start.neighbor.add(n3);
		n1.neighbor.add(start);
		n1.neighbor.add(n2);
		n2.neighbor.add(n1);
		n2.neighbor.add(n3);
		n2.neighbor.add(n5);
		n3.neighbor.add(start);
		n3.neighbor.add(n4);
		n3.neighbor.add(n2);
		n4.neighbor.add(n5);
		n4.neighbor.add(n3);
		n5.neighbor.add(n4);
		n5.neighbor.add(n2);
		Solution s = new Solution();
		System.out.println(s.find(start, "t"));
	}
}
