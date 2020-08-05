package com.bharat.spring.learning;

/*
 * Developer : Bharat Verma
 * Created : Wed 05-Aug-2020 02:21 PM
 **/

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class BubbleSort implements SortAlgorithm {

    @Override
    public int[] sort(int[] nums) {
        System.out.println("Called Bubble Sort Algorithm");

        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }
        return nums;
    }
}

