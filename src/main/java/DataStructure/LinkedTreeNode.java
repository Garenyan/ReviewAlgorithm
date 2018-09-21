package DataStructure;

import java.util.List;

/**
 * Created by garen on 2018/8/8.
 */
public class LinkedTreeNode {
    private Object mData; //存储的数据
    private LinkedTreeNode mParent;   //父亲节点的下标
    private List<LinkedTreeNode> mChildNodeList;    //孩子节点的引用

    public LinkedTreeNode(Object data, LinkedTreeNode parent) {
        mData = data;
        mParent = parent;
    }

    public Object getData() {
        return mData;
    }

    public void setData(Object data) {
        mData = data;
    }

    public Object getParent() {
        return mParent;
    }

    public void setParent(LinkedTreeNode parent) {
        mParent = parent;
    }

    public List<LinkedTreeNode> getChild() {
        return mChildNodeList;
    }

    public void setChild(List<LinkedTreeNode> childList) {
        mChildNodeList = childList;
    }

}


