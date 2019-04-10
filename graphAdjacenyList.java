public class ListGraph {
  // use an array of LinkedList to show relationship between edges so each index in the linked list maps to an array of linked list
  private LinkedList<Integer>[] adj;
  private int V; // number of vertices
  private int E; // number of edges
  
  public ListGraph(int nodes) {
    this.V = nodes
    this.edges = 0
    this.adj = new LinkedList[nodes]
    for(int v = 0; v < V; v++) {
      // initialize a linkedList for each index in the adjList
      adj[v] = new LinkedList<>();
    }
  }

  public void addEdge(int u, int v) {
    // for first call at the index 0 of the original linked list inside the pointer to the new linked list add the v(1 value) with new pointer to null then at index 1 (v) add a new node in the linked list with node of u value pointing to null, then add 1,2 so at index one in the linked list where 0 node points to null it will point to value 2 now and index 2 now has a new node in linked list of value 1
    adj[u].add(v)
    adj[v].add(u)
    E++
  }
  
  public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(V + " vertices, " + E + " edges " + "\n");
		for(int v = 0; v < V; v++) {
			sb.append(v + ": ");
			for(int w : adj[v]) {
				sb.append(w + " ");
			}
			sb.append("\n");
		}
		return sb.toString();
	}
 
	public static void main(String[] args) {
		Graph g = new Graph(4);
		g.addEdge(0, 1);
		g.addEdge(1, 2);
		g.addEdge(2, 3);
		g.addEdge(3, 0);
		System.out.println(g);
	}
}