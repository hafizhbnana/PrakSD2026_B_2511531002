package pekan9_2511531002;

import java.util.*;

public class GraphTraversal_2511531002 {
	private Map<String, List<String>> graph_1002 = new HashMap<>();
	
	// Menambahkan edge (graf tak berarah)
	public void addEdge_1002(String node1_1002, String node2_1002) {
		graph_1002.putIfAbsent(node1_1002, new ArrayList<>());
		graph_1002.putIfAbsent(node2_1002, new ArrayList<>());
		graph_1002.get(node1_1002).add(node2_1002);
		graph_1002.get(node2_1002).add(node1_1002);
	}
	
	// Menambahkan graf awal
	public void printGraph_1002() {
		System.out.println("Graf Awal (Adjacency List): ");
		for (String node_1002 : graph_1002.keySet()) {
			System.out.print(node_1002 + " -> ");
			List<String> neighbors_1002 = graph_1002.get(node_1002);
			System.out.println(String.join(", ", neighbors_1002));
		}
		System.out.println();
	}
	
	// DFS Rekursif
	public void dfs_1002(String start_1002) {
		Set<String> visited_1002 = new HashSet<>();
		System.out.println("Penelusuran DFS: ");
		dfsHelper_1002(start_1002, visited_1002);
		System.out.println();
	}
	public void dfsHelper_1002(String current_1002, Set<String> visited_1002) {
		if (visited_1002.contains(current_1002)) return;
		visited_1002.add(current_1002);
		System.out.print(current_1002 + " ");
		for (String neighbor_1002 : graph_1002.getOrDefault(current_1002, new ArrayList<>()))
			dfsHelper_1002(neighbor_1002, visited_1002);
	}
	
	// BFS Iteratif
	public void bfs_1002(String start_1002) {
		Set<String> visited_1002 = new HashSet<>();
		Queue<String> queue_1002 = new LinkedList<>();
		queue_1002.add(start_1002);
		visited_1002.add(start_1002);
		System.out.println("Penelusuran DFS: ");
		while (!queue_1002.isEmpty()) {
			String current_1002 = queue_1002.poll();
			System.out.print(current_1002 + " ");
			for (String neighbor_1002 : graph_1002.getOrDefault(current_1002, new ArrayList<>())) {
				if (!visited_1002.contains(neighbor_1002)) {
					queue_1002.add(neighbor_1002);
					visited_1002.add(neighbor_1002);
				}
			}
		}
		System.out.println();
	}
	
	// Main
	public static void main(String[] args) {
		GraphTraversal_2511531002 graph_1002 = new GraphTraversal_2511531002();
		
		// Contoh graf: A-B, A-C, B-D, B-E
		graph_1002.addEdge_1002("A", "B");
		graph_1002.addEdge_1002("A", "C");
		graph_1002.addEdge_1002("B", "D");
		graph_1002.addEdge_1002("B", "E");
		
		// Cetak graf awal
		System.out.println("Graf Awal adalah: ");
		graph_1002.printGraph_1002();
		
		// Lakukan penelusuran
		graph_1002.dfs_1002("A");
		graph_1002.bfs_1002("A");
	}
}
