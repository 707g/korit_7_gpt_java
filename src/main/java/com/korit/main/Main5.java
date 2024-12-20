package com.korit.main;

@FunctionalInterface
interface  무기 {
    String 공격(Integer 데미지);
}

class 총 implements 무기 {

    @Override
    public String 공격(Integer 데미지) {
        System.out.println("데미지: " + 데미지);
        System.out.println("총을 쏜다");
        return "총 데미지: " + 데미지;
    }
}

public class Main5 {
    public static void main(String[] args) {
        무기 wp1 = new 총();
        wp1.공격(100);

        무기 wp2 = new 무기() {
            @Override
            public String 공격(Integer 데미지) {
                System.out.println("데미지: " + 데미지);
                System.out.println("내가 만든 무기로 공격");
                return "총 데미지: " + 데미지;
            }
        };
        wp2.공격(200);

        무기 wp3 = (Integer 데미지) -> {
            System.out.println("데미지: " + 데미지);
            System.out.println("람다로 만든 무기로 공격");
            return "람다 무기 데미지: " + 데미지;
        };
        wp3.공격(300);

        // 매개변수 자료형 생략 가능
        무기 wp4 = (데미지) -> {
            System.out.println("데미지: " + 데미지);
            System.out.println("람다로 만든 무기로 공격");
            return "람다 무기 데미지: " + 데미지;
        };
        wp3.공격(500);

        // 매개변수가 하나면 () 생략 가능
        무기 wp5 = 데미지 -> {
            System.out.println("데미지: " + 데미지);
            System.out.println("람다로 만든 무기로 공격");
            return "람다 무기 데미지: " + 데미지;
        };
        wp3.공격(700);

        // 리턴 값이 있는 경우 중괄호{}를 생략하고 바로 리턴 값을 입력하면 된다.
        무기 wp6 = 데미지 ->  "람다 무기 데미지: " + 데미지;
        wp3.공격(1000);
    }
}
