package com.thirtydayleetcoding.apr2020.week2;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class LastStoneWeight {
    public int lastStoneWeight(int[] stones) {
        if(stones.length == 1)
            return stones[0];

        Queue<Integer> heap = new PriorityQueue<>(Comparator.reverseOrder());

        for(int x : stones)
            heap.add(x);

        while(heap.size() > 1) {
            int first = heap.poll();
            int second = heap.poll();

            if(first != second)
                heap.add(Math.abs(first - second));
        }

        return heap.size() == 0 ? 0 : heap.poll();
    }
}
