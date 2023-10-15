package Graphs.java;
import java.util.*;
import java.util.ArrayList;



public class MinimumSpanningTree {
	//note-doesnot work for Negative Weight Cycles
		static class Edge{
			int src;
			int dest;
			int wt;
			public Edge(int s, int d,int w) {
				this.src=s;
				this.dest=d;
				this.wt=w;
			}
		}
	static void creategraph(ArrayList<Edge>graph[]) {
		for(int i=0;i<graph.length;i++) {
			graph[i]=new ArrayList<>();
		}
		graph[0].add(new Edge(0,1,2));
		graph[0].add(new Edge(0,2,4));
		graph[1].add(new Edge(1,2,-4));
		graph[2].add(new Edge(2,3,2));
		graph[3].add(new Edge(3,4,4));
		graph[4].add(new Edge(4,1,-1));
	}
	static class Pair implements Comparable<Pair>{
		int v;
		int cost;
		public Pair(int v,int c) {
			this.v=v;
			this.cost=c;
		}
		@Override
		public int compareTo(Pair p2) {
			return this.cost-p2.cost;
		}
	}
	public static void prims(ArrayList<Edge>graph[]) {
		boolean vis[]=new boolean [graph.length];
		PriorityQueue<Pair>pq=new PriorityQueue<>();
		pq.add(new Pair(0,0));
		int finalCost = 0; // MST Cost /Total min  Weight
		while(!pq.isEmpty()) {
			Pair curr = pq.remove();
			if(!vis[curr.v]) {
				vis[curr.v]=true;
				finalCost +=curr.cost;
				for(int i=0;i<graph[curr.v].size();i++) {
					Edge e = graph[curr.v].get(i);
					pq.add(new Pair ( e.dest,e.wt));
				}
			}
		}
		System.out.println("final(min) cost of MST = "+ finalCost);;
	}
	public static void main(String[] args) {
		//Prim"s Algorithm
		int V=4;
		ArrayList<Edge>graph[]= new ArrayList[V];
		creategraph(graph);
        prims(graph);
	}
	
}
