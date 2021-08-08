package com.company;

public class con_for {
    public static void main(String[] args){
        //전형적인 for 문 예시
        /*
        String[] numbers = {"one", "two", "three"};
        for(int i = 0; i<numbers.length; i++){ //for(초기값; 조건문; 증가값)
            System.out.println(numbers[i]);
        }
         */
        //예시 2
        /*
        int[] marks = {90, 25, 67, 45, 80};
        for (int i = 0; i<marks.length; i++){
            if (marks[i] >= 60){
                System.out.println((i+1)+"합격");
            } else {
                System.out.println((i+1)+"불합격");
            }
        }
         */
        //for 와 continue
        //while 문의 continue 도 for 문에서 동일하게 적용됨. -> for 문 안의 문장을 수행하는 도중 continue 문을 만나면 for 문의 처음으로 돌아감
        int[] marks1 = {90, 25, 67, 45, 80};
        for (int i = 0; i<marks1.length; i++) {
            if (marks1[i] < 60) {
                continue;
            }
            System.out.println((i+1) + "합격");
        }

        //예시3 구구단
        for (int i = 2; i < 10 ; i++){
            for (int j = 1; j < 10; j++){
                System.out.println(i*j+" ");
            }
            System.out.println("");
        }

    }
}
