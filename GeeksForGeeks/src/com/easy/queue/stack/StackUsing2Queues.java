package com.easy.queue.stack;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsing2Queues {
    Queue<Integer> pushQ = new LinkedList<Integer>();
    Queue<Integer> popQ = new LinkedList<Integer>();
    
    /*The method pop which return the element poped out of the stack*/
    int pop()
    {
    	if(popQ.isEmpty())
    		return -1;
    	return popQ.poll();
    }
	
    /* The method push to push element into the stack */
    void push(int a)
    {
    	pushQ.add(a);
    	while(!popQ.isEmpty())
    		pushQ.add(popQ.poll());
    	swapQRefs();
    }

	private void swapQRefs() {
		Queue<Integer> temp = pushQ;
		pushQ = popQ;
		popQ = temp;
	}
}
