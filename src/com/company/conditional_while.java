package com.company;

public class conditional_while {
    public static void main(String[] args){
        /*
        int treeHit = 0;
        while (treeHit < 10) { //while 조건문 -> 10보다 작은 동안에는 while 문 안의 문장을 계속 실행함
            treeHit++;
            System.out.println("나무를" + treeHit + "번 찍었습니다.");
            if (treeHit == 10){
                System.out.println("나무 넘어감");
            }
        }
         */

        // 무한루프(Loop)
        /*
        무한히 반복한다는 의미
         */
        // 예시
        /*
        while(true) { //while 이 True 이므로 조건문은 항상 참
            System.out.println("Ctrl + c를 눌러야 빠져 나갈 수 있습니다.");
        }
        */

        //while 문 빠져나가기 (break)
        /*
        int coffee = 10;
        int money = 300;

        while (money > 0){
            System.out.println("coffee");
            coffee--;
            System.out.println("남은 커피의 양은" + coffee + "입니다.");
            if (coffee == 0) {
                System.out.println("No Coffee");
                break;
            }
        }
         */

        //while 문 조건문으로 돌아가기 (continue)

        int a = 0;
        while (a<10){
            a++;
            if (a % 2 == 0){
                continue;
            }
            System.out.println(a);
        }
    }
}
