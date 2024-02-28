
package graph_classes;


public class DijkstraAlgorithm {
     
    
    // Number of cities
    private static final int V = 15;

    // Method to find the vertex with the minimum distance value
    private int minDistance(int[] dist, boolean[] visited) {
        int min = Integer.MAX_VALUE, minIndex = -1;
        for (int v = 0; v < V; v++) {
            if (!visited[v] && dist[v] <= min) {
                min = dist[v];
                minIndex = v;
            }
        }
        return minIndex;
    }
    
    
    // Method to find index of a city in the cities array
    private int getIndex(String city, String[] cities) {
        for (int i = 0; i < cities.length; i++) {
            if (cities[i].equals(city)) {
                return i;
            }
        }
        return -1;
    }
    
    
    // Method to find the shortest path to the given location from Vito Pizza (restaurant)
    public int findShortestDistanceToLocation(int[][] graph, String[] locations, String destination) {
        int[] dist = new int[V]; // Array to store shortest distance from restaurant to each location
        boolean[] visited = new boolean[V]; // Array to track visited locations

        // Initialize distances to each location as infinite and visited[] as false
        for (int i = 0; i < V; i++) {
            dist[i] = Integer.MAX_VALUE;
            visited[i] = false;
        }

        // Distance from Vito Pizza to itself is 0
        dist[0] = 0;

        // Find shortest paths for all locations
        for (int count = 0; count < V - 1; count++) {
            int u = minDistance(dist, visited); // Pick the minimum distance location from the set of locations not yet visited
            visited[u] = true; // Mark the picked location as visited

            // Update dist value of the adjacent locations of the picked location
            for (int v = 0; v < V; v++) {
                if (!visited[v] && graph[u][v] != 0 && dist[u] != Integer.MAX_VALUE && dist[u] + graph[u][v] < dist[v]) {
                    dist[v] = dist[u] + graph[u][v];
                }
            }
        }

        // Return the shortest distance to the given destination location
        int destIndex = getIndex(destination, locations);
        if (destIndex == -1) {
            System.out.println("Destination location not found!");
            return -1;
        }
        return dist[destIndex];
    }
    
    
    
    
    // Method to construct and return the shortest path string from restaurant to a given location
    public String findShortestPathToLocation(int[][] graph, String[] locations, String destination) {
        int[] dist = new int[V]; // Array to store shortest distance from restaurant to each location
        boolean[] visited = new boolean[V]; // Array to track visited locations
        int[] prev = new int[V]; // Array to store the previous location in the shortest path

        // Initialize distances to each location as infinite and visited[] as false
        for (int i = 0; i < V; i++) {
            dist[i] = Integer.MAX_VALUE;
            visited[i] = false;
            prev[i] = -1; // Initialize previous location as -1
        }

        // Distance from Vito Pizza to itself is 0
        dist[0] = 0;

        // Find shortest paths for all locations
        for (int count = 0; count < V - 1; count++) {
            int u = minDistance(dist, visited); // Pick the minimum distance location from the set of locations not yet visited
            visited[u] = true; // Mark the picked location as visited

            // Update dist value of the adjacent locations of the picked location
            for (int v = 0; v < V; v++) {
                if (!visited[v] && graph[u][v] != 0 && dist[u] != Integer.MAX_VALUE && dist[u] + graph[u][v] < dist[v]) {
                    dist[v] = dist[u] + graph[u][v];
                    prev[v] = u; // Update previous location for v
                }
            }
        }

        // Construct the shortest path string
        return constructPathString(dist, prev, destination, locations);
    }

    // Method to construct the shortest path string from restaurant to a given location
    private String constructPathString(int[] dist, int[] prev, String destination, String[] locations) {
        int destIndex = getIndex(destination, locations);
        if (destIndex == -1) {
            return "Destination location not found!";
        }

        StringBuilder path = new StringBuilder();
        int currentIndex = destIndex;
        while (currentIndex != -1) {
            path.insert(0, locations[currentIndex] + " -> ");
            currentIndex = prev[currentIndex];
        }
        return path.toString().substring(0, path.length() - 4); // Remove the extra "<-"
    }
    
    
}
