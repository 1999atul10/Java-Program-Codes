import java.util.Iterator;
import java.util.LinkedList;

public class detectcycle {
    private int V;
    private LinkedList<Integer>adj[];
    detectcycle(int v)
    {
        V=v;
        for(int i=0;i<v;i++)
        {
            adj[i]=new LinkedList<Integer>();
        }
    }
    void addEdge(int v,int w)
    {
        adj[v].add(w);
        adj[w].add(v);
    }
    Boolean iscycleutil(int v,Boolean visited[],int parent)
    {
        visited[v]=true;
        Integer i;
        Iterator<Integer>it=adj[v].iterator();
        while(i.hasNext())
        {
            i=it.next();
            if(!visited[i]){
                if(iscycleutil(i, visited, parent))
                return true;
            }
            elseif(i!=parent)
            return true;
        }
        return false;

    }
    Boolean iscyclic()
    {
        Boolean visited[]=new Boolean[V];
        for(int i=0;i<V;i++)
        {
            visited[i]=false;
            
        }
        for(int u=0;u<V;u++)
        {
            if(!visited[u])
            if(iscycleutil(u, visited, parent))
            return true;
        }
        return false;
    }

    public static void main(String args[])
    {
       detectcycle obj=new detectcycle(5);
       obj.addEdge(1, 0);
        obj.addEdge(0, 2);
        obj.addEdge(2, 1);
        obj.addEdge(0, 3);
        obj.addEdge(3, 4);
        if(obj.iscyclic())
        {
            System.out.println("graph contain cycle");
        }
        else{
            System.out.println("Graph does'nt conatin cycle");
        }
        detectcycle obj2=new detectcycle(3);
        obj2.addEdge(0, 1);
        obj2.addEdge(1, 2);
        if(obj2.iscyclic())
        System.out.println("graph contain cycle");
        else{
            System.out.println("System does't contain cycle");
        }

    }
    
}
