---
tags: NWT
---
```java
import java.util.ArrayList;  
import java.util.Comparator;  
import java.util.PriorityQueue;  
  
public class Main {  
    public static void main(String[] args) {  
        class PathVal{  
            int index;  
            int length;  
            PathVal(int index,int length){  
                this.index = index;  
                this.length = length;  
            }  
        }  
  
  
  
        class Solution  
        {  
            static int[] dijkstra(int v, ArrayList<ArrayList<ArrayList<Integer>>> adj, int s)  
            {  
                int pl[] = new int[v+1];  
                PriorityQueue<PathVal> pq = new PriorityQueue<>(new Comparator<PathVal>(){  
                    @Override  
                    public int compare(PathVal a,PathVal b){  
                        return a.length - b.length;  
                    }  
                });  
                for(int i=0;i<v;i++){  
                    pl[i] = Integer.MAX_VALUE;  
                }  
                pq.add(new PathVal(s,0));  
                pl[s] = 0;  
                while(!pq.isEmpty()){  
                    PathVal val = pq.poll();  
                    int ind = val.index;  
                    ArrayList<ArrayList<Integer>> list = adj.get(ind);  
                    for(int i=0;i<list.size();i++){  
                        if( pl[ind]+list.get(i).get(1) < pl[list.get(i).get(0)] ){  
                            pl[list.get(i).get(0)] = pl[ind] + list.get(i).get(1);  
                            pq.add(new PathVal(list.get(i).get(0),pl[list.get(i).get(0)]));  
                        }  
                    }  
                }  
                return pl;  
            }  
        }  
    }  
}
```

Zugriff: Array besser zum Speichern von Distanzen

