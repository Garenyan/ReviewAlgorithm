package DataStructure;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by garen on 2018/8/10.
 */
public class Digraph {
    public int getVertexsNum() {
        return vertexsNum;
    }

    public void setVertexsNum(int vertexsNum) {
        this.vertexsNum = vertexsNum;
    }

    public int getEdgesNum() {
        return edgesNum;
    }

    public void setEdgesNum(int edgesNum) {
        this.edgesNum = edgesNum;
    }

    private int vertexsNum;
    private int edgesNum;
    private int[][] arc;

    public Digraph(int[][] data, int vertexsNum) {
        this.vertexsNum = vertexsNum;
        this.edgesNum = data.length;
        arc = new int[vertexsNum][vertexsNum];
        for (int i = 0; i < vertexsNum; i++) {
            for (int j = 0; j < vertexsNum; j++) {
                arc[i][j] = Integer.MAX_VALUE;
            }
        }

        for (int i = 0; i < data.length; i++) {
            int tail = data[i][0];
            int head = data[i][1];
            arc[tail][head] = 1;
        }
    }

    //用于测试，返回一个顶点的邻接点
    public Iterable<Integer> adj(int vertex) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < vertexsNum; i++) {
            if (arc[vertex][i] != Integer.MAX_VALUE)
                set.add(i);
        }
        return set;
    }

}
