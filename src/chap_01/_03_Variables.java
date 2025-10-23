package chap_01;

public class _03_Variables {
    public static void main(String[] args) {
        String name = "오은지"; // 문자형
        int hour = 15; // 정수형, 너무 큰 숫자는 입력 불가(-21억=<int<=21억)

        System.out.println(name + "님, 배송이 시작됩니다. " + hour + "시에 방문 예정입니다.");
        System.out.println(name + "님, 배송 완료되었습니다.");

        double score = 98.5; // 실수형
        char grade = 'A'; // 문자형(하나의 문자)
        name = "와우";
        System.out.println(name + "님의 평균 점수는 " + score + "점입니다.");
        System.out.println("학점은 " + grade + "입니다.");

        boolean pass = true; // 참, 거짓
        System.out.println("이번 시험에 합격했을까요? " + pass);

        double d = 3.14123456789;
        float f = 3.14123456789f; // double보다 정밀한 값을 넣지 못해서 값 옆에 f/F를 입력해야 함
        System.out.println(d);
        System.out.println(f);

        long l = 1000000000000l; // int보다 큰 범위의 값을 입력 가능(long>21억)
        l = 1_000_000_000_000l;
        System.out.println(l);
    }
}

// int, long - 정수형 float, double - 실수형 char, String - 문자형 boolean - 조건