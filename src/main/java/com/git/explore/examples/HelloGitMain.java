package com.git.explore.examples;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.stream.Stream;

public class HelloGitMain {
    public static void main(String[] args) {
        System.out.println("Hello Git main !!");
        new HelloGitMain().printMe();
    }

    private void printMe() {
        Method[] declaredMethods = this.getClass().getDeclaredMethods();
        Stream<Object> stream = Arrays.stream(Arrays.stream(declaredMethods).toArray());
        stream.forEach(a -> System.out.println("method names are:::" + a));
    }
    private void initializeFoodItems(){
        System.out.println("initializeFoodItems !!!");
        new Food().setFoodItemId(100);
        new Food().setNameOfRestaurent("name of the restaurant !!");
    }

}
