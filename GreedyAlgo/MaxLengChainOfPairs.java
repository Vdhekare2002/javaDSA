package GreedyAlgo;
import java.util.*;
public class MaxLengChainOfPairs {

	public static void main(String[] args) {//O(nlogn)
	int pairs[]	[]= {{5,24},{39,60},{5,28},{27,40},{50,90}};
	Arrays.sort(pairs,Comparator.comparingDouble(o->o[1]));
      int chainLen =1;
      int chainEnd= pairs[0][1];//Last selected   pair end // chair end
      for(int i=0;i<pairs.length;i++) {
    	  if(pairs[i][0]> chainEnd) {
    		  chainLen++;
    		  chainEnd= pairs[i][1];
    	  }
      }
      System.out.println("max length of chain = "+ chainLen);
	}

}
