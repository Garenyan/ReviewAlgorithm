package DataStructure;

/**
 * Created by garen on 2018/8/10.
 * 深度优先遍历！！！
 */
public class DFSTraverse {
    private boolean[] visited;

    //从顶点index开始遍历
    public DFSTraverse(Digraph graph, int index) {
        visited = new boolean[graph.getVertexsNum()];
        dfs(graph,index);
    }

    private void dfs(Digraph graph, int index) {
        visited[index] = true;
        for(int i : graph.adj(index)) {
            if(!visited[i])
                dfs(graph,i);
        }
    }
}
