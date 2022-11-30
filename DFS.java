import java.util.Iterator;

public class DFS {

    private int V;
    private LinkedList<Integer> adj[];

    @SuppressWarnings("Unchecked")
    DFS(int v) {
        V = v;
        adj = new LinkedList[V];
        for (int i = 0; i < v; ++i)
            adj[i] = new LinkedList();
    }

    void addEdge(int v, int w) {
        adj[v].add(w);
    }

    void depthfirstsearchutil(int v, boolean visited[]) {
        visited[v] = true;
        System.out.println(v + " ");
        Iterator<Integer> i = adj[v].listIterator();
        while (i.hasNext()) {
            int n = i.next();
            if (!visited[n])
                depthfirstsearch(n, visited);
        }
    }

    void depthfirstsearch(int v) {
        boolean visited[] = new boolean[V];
        depthfirstsearchutil(v, visited);
    }

    public static void main(String args[]) {
        DFS obj = new DFS(4);
        obj.addEdge(0, 1);
        obj.addEdge(0, 2);
        obj.addEdge(1, 2);
        obj.addEdge(2, 0);
        obj.addEdge(2, 3);
        obj.addEdge(3, 3);
        System.out.println(
                "Following is Depth First Traversal "
                        + "(starting from vertex 2)");

        obj.depthfirstsearch(2);

    }

}
