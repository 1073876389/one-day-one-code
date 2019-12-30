package xuwx.top.队列;

import java.util.Stack;

/**
 * leetcode : https://leetcode-cn.com/problems/implement-queue-using-stacks/
 *
 *@ClassName_232_用栈实现队列
 *@Description TODO
 *@Author wx.Xu
 *Date 2019/12/13 10:19
 *Version 1.0
 */
public class _232_用栈实现队列 {

    /**
     * 设计思路:
     * 准备两个栈:inStack  ,outStack
     * 入队时,push到 inStack中
     * 出队时,1.当outStack为空,先将inStack所有元素逐步弹出 push到 outStack中,最后弹出outStack的栈顶元素
     *       2.如果outStack不为空,则将outStack的栈顶元素弹出
     */
    class MyQueue {
        private Stack<Integer> inStack = new Stack<Integer>();
        private Stack<Integer> outStack = new Stack<Integer>();
        /** Initialize your data structure here. */
        public MyQueue() {

        }

        /** Push element x to the back of queue. */
        public void push(int x) {
            inStack.push(x);
        }

        /** Removes the element from in front of queue and returns that element. */
        public int pop() {
            if(outStack.isEmpty()){
                while(!inStack.isEmpty()){
                    outStack.push(inStack.pop());
                }
                return outStack.pop();
            }else{
                return outStack.pop();
            }
        }

        /** Get the front element. */
        public int peek() {
            if(outStack.isEmpty()){
                while(!inStack.isEmpty()){
                    outStack.push(inStack.pop());
                }
                return outStack.peek();
            }else{
                return outStack.peek();
            }
        }

        /** Returns whether the queue is empty. */
        public boolean empty() {
            if (inStack.isEmpty()&&outStack.isEmpty()){
                return true;
            }else {
                return false;
            }
        }
    }

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
}
