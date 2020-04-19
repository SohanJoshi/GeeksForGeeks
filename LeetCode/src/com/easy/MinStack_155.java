package com.easy;

import java.util.Deque;
import java.util.LinkedList;

/**
 * MinStack_155
 */

public class MinStack_155 {
    /** initialize your data structure here. */
    private class MinStackNode {
        int value;
        int min;
        MinStackNode(int value, int min)
        {
            this.value = value;
            this.min = min;
        }
    }

    private Deque<MinStackNode> stack;

    public MinStack_155() {
        stack = new LinkedList<>();
    }

    public void push(int x) {
        int min;
        if(stack.isEmpty())
            min = x;
        else
            min = Math.min(x, stack.peek().min);

        stack.push(new MinStackNode(x, min));
    }

    public void pop() {
        stack.pop();
    }

    public int top() {
        return stack.peek().value;
    }

    public int getMin() {
        return stack.peek().min;
    }
}
