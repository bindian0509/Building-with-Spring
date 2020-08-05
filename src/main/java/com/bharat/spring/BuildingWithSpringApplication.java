package com.bharat.spring;

import com.bharat.spring.learning.BinarySearchImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class BuildingWithSpringApplication {

    public static void main(String[] args) {
        ApplicationContext applicationContext =
                SpringApplication.run(BuildingWithSpringApplication.class, args);
        // by default any bean is singleton in spring
        BinarySearchImpl binarySearch =
                applicationContext.getBean(BinarySearchImpl.class);
        System.out.println(binarySearch);
        BinarySearchImpl binarySearch1 =
                applicationContext.getBean(BinarySearchImpl.class);
        System.out.println(binarySearch1);
        int result =
                binarySearch.binarySearch(new int[] { 12, 4, 6 }, 3);
        System.out.println(result);

/*        BinarySearchImpl binarySearch = new BinarySearchImpl();

        System.out.println(binarySearch.binarySearch(new int[] {1,2,3}, 2));

        SpringApplication.run(Application.class, args);*/
        SpringApplication.run(BuildingWithSpringApplication.class, args);
    }

}
