package com.bharat.spring.learning;

/*
 * Developer : Bharat Verma
 * Created : Wed 05-Aug-2020 02:21 PM
 **/

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("kwik")
public class QuickSort implements SortAlgorithm {

    @Override
    public int[] sort(int[] nums) {
        System.out.println("Called Quick Sort Algorithm");
        return new int[0];
    }
}
