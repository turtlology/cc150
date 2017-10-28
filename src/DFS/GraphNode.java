package DFS;

import java.util.ArrayList;

public class GraphNode {
	String value;
	ArrayList<GraphNode> neighbor = new ArrayList<GraphNode>();

	public GraphNode(String val) {
		this.value = val;
	}
}
