package DFS;

import java.util.HashMap;
import java.util.Map;

public class Solution {
	Map<GraphNode,Integer> visited = new HashMap<GraphNode,Integer>();
	public boolean find(GraphNode start, String goal) {
		System.out.println("here is "+start.value);
		if(start.value.equals(goal))return true;
		visited.put(start, 1);
		for(GraphNode node:start.neighbor) {
			if(visited.get(node)==null) {
				visited.put(node, 0);
			}
			
			if(visited.get(node)!=1) {
				System.out.println(node.value);
				if(find(node, goal)) {
					return true;
				}
				visited.put(node, 0);
			}
			
		}
		System.out.println("here is end of"+start.value);
		return false;
	}
}
