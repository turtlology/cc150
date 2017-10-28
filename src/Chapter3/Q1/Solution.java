package Chapter3.Q1;

public class Solution {
	public int[] mergeString(int[] a, int[] b) {
		int[]result = new int[a.length];
		int i = 0, j=0;
		int k = 0;
		while(a[i]!=0 && j!=b.length-1) {
			if(a[i]>b[j]) {
				result[k] = b[j];
				j++;
			}else {
				result[k] = a[i];
				i++;
			}
			k++;
		}
		while(a[i]!=0) {
			result[k] = a[i];
			i++;
			k++;
		}
		
		while(b[j]!=b.length-1) {
			result[k] = b[j];
			j++;
			k++;
		}
		
		return result;
	}
	
	public void move(int[]a, int loc, int val) {
		for(int i = loc+1; i<a.length-1; i++) {
			a[i] = a[i-1];
		}
		a[loc] = val;
	}
}
