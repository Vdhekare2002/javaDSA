package GreedyAlgo;
import java.util.*;
public class FractionalKnapsack {
/*
 * Given the weights and vlues of N items, put these items in a knapsack of
 * capacity W to get the maximum total value in the knapsack.
 */
	public static void main(String[] args) {
		//int pairs[][]= {{5,24},{39,60},{5,28},{27,40},{50,90}};
    int val[]= {60,100,120};
    int weight[]= {10,20,30};
    int W= 50;
    double ratio[][]=new double[val.length][2];
    //oth column=>idx; 1st col => ratio
    for(int i=0;i<val.length;i++) {
    	ratio[i][0]=i;
    	ratio[i][1]= val[i]/(double)weight[i];
    }
    //ascending order sorting
    Arrays.sort(ratio,Comparator.comparingDouble(o->o[1]));
    int capacity= W;
    int finalval = 0;
    for(int i=ratio.length-1;i>=0;i--) {
    	int idx= (int)ratio[i][0];
    	if(capacity>= weight[idx]) {//include full item
    		finalval+=val[idx];
    		capacity-= weight[idx];
    		
    	}else {
    		//include fractional item
    		finalval+=(ratio[i][1]*capacity);
    		capacity=0;
    		break;
    	}
    }System.out.println("final value = "+ finalval);
	}

}
