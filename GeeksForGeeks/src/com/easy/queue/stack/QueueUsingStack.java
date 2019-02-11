package com.easy.queue.stack;

import java.util.Stack;

public class QueueUsingStack {
    Stack<Integer> enqueueStack = new Stack<Integer>();
    Stack<Integer> dequeueStack = new Stack<Integer>();
    /* The method insert to push element into the queue */
    void insert(int B)
    {
        enqueueStack.push(B);
    }
		
    
    /*The method remove which return the element popped out of the queue*/
    int remove()
    {
        if(dequeueStack.isEmpty())
            while(!enqueueStack.isEmpty())
                dequeueStack.push(enqueueStack.pop());
        if(dequeueStack.isEmpty())
            return -1;
        return dequeueStack.pop();
    }
}
