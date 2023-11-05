package com.example;

public class MultiplyTwoNumbers {

    public static void main(String[] args) {

        float first = 1.5f;
        float second = 2.0f;

        System.out.println("The product is: " + multiplyFloats(first,second));
    }

    public static float multiplyFloats(float first, float second) {
        return first * second;
    }
}
