import java.util.*;
class Graph1 {
    ArrayList<ArrayList<Integer>> li = new ArrayList<>();
    public Graph1(int data) {
        for (int i = 0; i < data; i++) {
            li.add(new ArrayList<>());
        }
    }
    public void insert(int u, int v) {
        li.get(u).add(v);
        li.get(v).add(u);
    }
    public void display(){
        for(int i=0;i<li.size();i++){
            System.out.print("Elements at index " + i + " are: ");
            for(int val: li.get(i)){
                System.out.println(val + " ");
            }
        }
    }
    public void BFS(int v) {
        boolean[] visited = new boolean[li.size()];
        Queue<Integer> q = new LinkedList<>();
        q.add(v);
        visited[v] = true;

        while (q.size() != 0) {
            int ver=q.remove();
            System.out.print(ver + " ");

            for (int i=0;i<li.get(ver).size();i++) {
                int adj = li.get(ver).get(i);
                if (!visited[adj]) {
                    q.add(adj);
                    visited[adj] = true;
                }
            }
        }
    }
     public void DFS(int v) {
        boolean[] visited = new boolean[li.size()];
        Stack<Integer> s = new Stack<>();
        s.add(v);
        visited[v] = true;

        while (s.size() != 0) {
            int ver=s.pop();
            System.out.print(ver + " ");

            for (int i=0;i<li.get(ver).size();i++) {
                int adj = li.get(ver).get(i);
                if (!visited[adj]) {
                    s.add(adj);
                    visited[adj] = true;
                }
            }
        }
    }
}
public class Graph {
    public static void main(String[] args) {
        Graph1 g = new Graph1(5);
        g.insert(0, 1);
        g.insert(0, 4);
        g.insert(1, 2);
        g.insert(1, 3);
        g.insert(1, 4);
        g.insert(2, 3);
        g.insert(3, 4);
        g.display();
    }
}
