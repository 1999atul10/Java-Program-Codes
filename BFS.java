import java.util.Iterator;
import java.util.LinkedList;

public class BFS {
    private int V;
    private LinkedList<Integer>adj[];
    BFS(int v)
    {
        V=v;
        adj=new LinkedList[v];
        for(int i=0;i<v;++i)
        adj[i]=new LinkedList();
    }
    void addEdge(int v,int w)
    {
        adj[v].add(w);
    }

    void breadthfirstsearch(int s)
    {
        boolean visited[]=new boolean[V];
        LinkedList<Integer>queue=new LinkedList<Integer>();
        visited[s]=true;
        queue.add(s);
        while(queue.size()!=0)
        {
            s=queue.poll();
            System.out.println(s+" ");
            Iterator<Integer>i=adj[s].listIterator();
            while(i.hasNext())
            {
                int n=i.next();
                if(!visited[n])
                {
                    visited[n]=true;
                    queue.add(n);
                }
            }
        }
    }


    public static void main(String args[])
    {
        BFS obj=new BFS(4);
        obj.addEdge(0, 1);
        obj.addEdge(0, 2);
        obj.addEdge(1, 2);
        obj.addEdge(2, 0);
        obj.addEdge(2, 3);
        obj.addEdge(3, 3);

        System.out.println("Following is Breadth first Traversal "+"(starting from vertex 2)");
        obj.breadthfirstsearch(2);

    }
    
}
