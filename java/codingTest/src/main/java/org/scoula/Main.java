package org.scoula;

import java.util.*;

public class Main {
    static Map<Integer, List<Integer>> graph = new HashMap<>();
    static Map<Integer, Boolean> visited = new HashMap<>();

    public static void bfs(int startValues) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(startValues);
        visited.put(startValues,true);

        while(!queue.isEmpty()) {
            int curVertex = queue.poll();
            System.out.print(curVertex + " ");
            if (curVertex == 5) {
                System.out.println("찾았다람쥐!");
            }
            for (int nextVertex : graph.get(curVertex)) {
                if (!visited.containsKey(nextVertex)) {
                    queue.offer(nextVertex);
                    visited.put(nextVertex, true);
                }
            }
        }
    }
    public static void makeGraph() {
        graph.put(0,Arrays.asList(1,3,6));
        graph.put(1,Arrays.asList(0,3));
        graph.put(2,Arrays.asList(3));
        graph.put(3,Arrays.asList(0,1,2,7));
        graph.put(4,Arrays.asList(5));
        graph.put(5,Arrays.asList(4,6,7));
        graph.put(6,Arrays.asList(0,5));
        graph.put(7,Arrays.asList(3,5));
    }
        public static void main(String[] args) {
        makeGraph();
        bfs(0);
    }
}