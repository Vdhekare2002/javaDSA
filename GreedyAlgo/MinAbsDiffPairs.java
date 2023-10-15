package GreedyAlgo;
import java.util.*;
public class MinAbsDiffPairs {
/* Given two arrays A and B of equal length n.Pair each element of array A to an element in
 * array B,such that sum S of absolute  differences of all the pairs is minimum.
 * A=[1,2,3]
 * B=[2,1,3]
 * ans=0;
 */
	public static void main(String[] args) {
	int A[]	= {4,1,8,7};
	int B[]= {2,3,6,5};
	Arrays.sort(A);
	Arrays.sort(B);
	int minDiff=0;
	for(int i=0;i<A.length;i++) {
		minDiff += Math.abs(A[i]-B[i]);
	}
	System.out.println("min absolute deff of pairs = "+minDiff);
	}

}
