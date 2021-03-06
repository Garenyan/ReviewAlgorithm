package DataStructure;

/**
 * Created by garen on 2018/8/7.
 */
public class Stack {
    private int size;
    private int top;
    private int[] stackArray;
    //构造函数
    public Stack(int size){
        stackArray = new int [size];
        top = -1; //初始化栈的时候，栈内无元素，栈顶下标设为-1
        this.size = size;
    }

    //入栈，同时，栈顶元素的下标加一
    public void push(int elem){
        stackArray[++top] = elem; //插入栈顶
    }

    //出栈，删除栈顶元素，同时，栈顶元素的下标减一
    public int pop(){
        return stackArray[top--];
    }

    //查看栈顶元素，但不删除
    public int peek(){
        return stackArray[top];
    }

}
