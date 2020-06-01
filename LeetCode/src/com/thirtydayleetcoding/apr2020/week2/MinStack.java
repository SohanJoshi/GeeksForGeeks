package com.thirtydayleetcoding.apr2020.week2;

class MinStack {

    private static class Element {
        int value;
        int min;
        Element next;

        Element(int value, int min) {
            this.value = value;
            this.min = min;
        }
    }

    Element peek;

    /** initialize your data structure here. */
    public MinStack() {
    }

    public void push(int x) {
        if(peek == null) {
            peek = new Element(x, x);
        } else {
            int min = x < peek.min ? x : peek.min;
            Element element = new Element(x, min);
            element.next = peek;
            peek = element;
        }
    }

    public void pop() {
        peek = peek.next;
    }

    public int top() {
        return peek.value;
    }

    public int getMin() {
        return peek.min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
