package com.company;

public class con_foreach {
    public static void main(String[] args){
        //for 예시
        String[] numbers = {"one", "two", "three"};
        for (int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i]);
        }
        //위 for 예시 foreach 로 변경
        String[] numbers1 = {"one", "two", "three"};
        for(String number: numbers1){ //for each 문의 구조 for(type var: iterate)
            System.out.println(number);  //{ body-of-loop}
        }
    }
}
