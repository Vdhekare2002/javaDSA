package Graphs.java;
import java.util.*;
//FOr given src & dest,tell if a path exists from src to dest
public class HasPathUsingDFS {
	//O(V+E)
	public static boolean hasPath(ArrayList<Edge>[] graph , int src,int dest,boolean vis[]) {
		
	
	if(src == dest) {
		return true;
	}
	
		vis[src]=true;
		for(int i1 =0; i1<graph[src].size();i1++) {
			Edge e = graph[src].get(i1);
			// e.dest= neighbour
			if(! vis[e.dest]&& hasPath(graph,e.dest,dest,vis)) {
				return true;
			}
		}
		return false;
	}
   

	public static void main(String[] args) {
		/*
		    1---3
		  /     |\
		 0      | 5--6
		  \2----4/
		 */
		
		int v=7;
		ArrayList<Edge>graph[] = new ArrayList[v];
		createGraph(graph);
		System.out.println(hasPath(graph , 0,5, new boolean [v]));
	}

}
