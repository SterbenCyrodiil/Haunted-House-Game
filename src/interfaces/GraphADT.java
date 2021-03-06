package interfaces;

import collections.exceptions.ElementNotFoundException;
import collections.exceptions.EmptyCollectionException;

import java.util.Iterator;

public interface GraphADT<T> {

    void addVertex(T vertex);

    public void removeVertex(T vertex);

    /**
     * Inserts an edge between two vertices of this graph.
     * 
     * @param vertex1 the first vertex
     * @param vertex2 the second vertex
     */
    public void addEdge(T vertex1, T vertex2);

    /**
     * Removes an edge between two vertices of this graph.
     * 
     * @param vertex1 the first vertex
     * @param vertex2 the second vertex
     */
    public void removeEdge(T vertex1, T vertex2);

    /**
     * Returns a breadth first iterator starting with the given vertex.
     * 
     * @param startVertex the starting vertex
     * @return a breadth first iterator beginning at the given vertex
     * @throws collections.exceptions.EmptyCollectionException if collection in empty
     */
    public Iterator iteratorBFS(T startVertex) throws EmptyCollectionException;

    /**
     * Returns a depth first iterator starting with the given vertex.
     * 
     * @param startVertex the starting vertex
     * @return a depth first iterator starting at the given vertex
     * @throws collections.exceptions.EmptyCollectionException if collection in empty
     */
    public Iterator iteratorDFS(T startVertex) throws EmptyCollectionException;

    /**
     * Returns an iterator that contains the shortest path between the two vertices.
     * 
     * @param startVertex the starting vertex
     * @param targetVertex the ending vertex
     * @return an iterator that contains the shortest path between the two vertices
     * @throws collections.exceptions.EmptyCollectionException if collection in empty
     * @throws collections.exceptions.ElementNotFoundException if target is not found
     */
    public Iterator iteratorShortestPath(T startVertex, T targetVertex) throws EmptyCollectionException, ElementNotFoundException;

    /**
     * Returns true if this graph is empty, false otherwise.
     * 
     * @return true if this graph is empty
     */
    public boolean isEmpty();

    /**
     * Returns true if this graph is connected, false otherwise.
     * 
     * @return true if this graph is connected
     * @throws collections.exceptions.EmptyCollectionException if collection in empty
     */
    public boolean isConnected() throws EmptyCollectionException;

    /**
     * Returns the number of vertices in this graph.
     * 
     * @return the integer number of vertices in this graph
     */
    public int size();

    /**
     * Returns a string representation of the adjacency matrix.
     * 
     * @return a string representation of the adjacency matrix
     */
    public String toString();


}
