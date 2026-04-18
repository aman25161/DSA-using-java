import java.util.*;
public class GraphImplement {
    private LinkedList<Integer> adjacency[];
    GraphImplement(int v){
        adjacency=new LinkedList[v];
        for(int i=0;i<v;i++){
            adjacency[i]=new LinkedList<>();
        }
    }
    public void insertEdge(int s, int d){
        adjacency[s].add(d);
        adjacency[d].add(s);
    }
    public void bfs(int source){
        boolean visited[]=new boolean[adjacency.length];
        int parent[]=new int[adjacency.length];
        Queue<Integer> q=new LinkedList<>();
        q.add(source);
        parent[source]=-1;
        visited[source]=true;
        while(!q.isEmpty()){
            int p=q.poll();
            System.out.print(p+" ");
            for(int i : adjacency[p]){
                if(visited[i]!=true){
                    visited[i]=true;
                    q.add(i);
                    parent[i]=p;
                }
            }
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter number of vertices : ");
        int v=sc.nextInt();
        System.out.println(" Enter number of edges : ");
        int e=sc.nextInt();
        System.out.println("Enter source and destination: ");
        GraphImplement g=new GraphImplement(v);
        for(int i=0;i<e;i++){
            int s=sc.nextInt();
            int d=sc.nextInt();
            g.insertEdge(s,d);
        }
        System.out.println("Enter source from which traversal starts : ");
        int source=sc.nextInt();
        g.bfs(source);
    }
}
