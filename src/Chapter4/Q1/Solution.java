package Chapter4.Q1;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
	public boolean findWay(GNode start,GNode target) {
		Queue<GNode> traversal = new LinkedList<GNode>();
		traversal.add(start);
		for(GNode t:traversal) {
			if(t.equals(target)) {
				return true;
			}
			for(GNode n:t.neighbor) {
				traversal.add(n);
			}
		}
		return false;
	}
	class GNode{
		int value;
		GNode[] neighbor;
	}
}
