package com.bharat.spring.learning;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/*
 * Developer : Bharat Verma
 * Created : Wed 05-Aug-2020 02:08 PM
 **/
@Component
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class BinarySearchImpl {
    @Autowired
    @Qualifier("kwik")
    SortAlgorithm bubSortAlgorithm;

    public int binarySearch(int [] hayStack, int needle) {


        // Implementation of sorting

        // Bubble Sort
        // Insertion Sort etc
        // Implement Binary Search
        int[] sortedNumbers = bubSortAlgorithm.sort(hayStack);
        System.out.println(bubSortAlgorithm);
        // Search the array
        return 3;

    }
}
