/* non linear D.S for storing data
It is a set of vertices and a collection of edges that connects a pair of vertices
1. graphs help us implement social networking using a social networking graph e.g people are vertices and edges are friends
2. web content over internet to where vertices are webpages and links are edges connecting the vertices 

Undirected graph
bi-directional relationship e.g A --> B AND B-->A
directed graph
uni-directional relationship e.g A--> B
can be represented as a matrix where if we want to represent an edge use 1 and if no edge use 0 (2 dimensional array) matrix[][]
*/
import java.lang.StringBuilder;
public class Graph {
  // properties of graph and then set in constructor
  private int V; // number of vertices in graph
  private int E; // number of edges in graph
  private int[][] adjMatrix; // 2d array (matrix for storing 1s and 0s depending on if there is an edge)

  // initially just vertices and no edges and initialize the matrix 
  public Graph(int nodes) {
    this.v = nodes;
    this.u = 0;
    this.adjMatrix = new int[nodes][nodes]
  }

  public addEdge(int u, int v) {
    adjMatrix[u][v] = 1; // edge between u --> v
    adjMatrix[v][u] = 1; // edge between v --> u
    // increment number of edges in the graph now since added new one
    E++;
  }

  public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(V + " vertices, " + E + " edges " + "\n");
		for(int v = 0; v < V; v++) {
			sb.append(v + ": ");
			for(int w : adjMatrix[v]) {
				sb.append(w + " ");
			}
			sb.append("\n");
		}
		return sb.toString();
	}
 
  public static void main(String[], args) {
    // graph of 4 nodes and adjency matrix of 4 x 4
    Graph g = new Graph(4);
    g.addEdge(0,1)
    g.addEdge(1,2)
    g.addEdge(2,3)
    g.addEdge(3,0)
    System.out.println(g);
  }
}

