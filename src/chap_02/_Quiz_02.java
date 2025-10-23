package chap_02;

public class _Quiz_02 {
    public static void main(String[] args) {
        // 어린이 키에 따른 놀이 기구 탑승 가능 여부를 확인하는 프로그램을 작성하시오.
        // 조건 : 키가 120cm 이상인 경우에만 탑승 가능, 삼항 연산자 이용


        int height = 115;
        int height2 = 121;

        int min = (height < height2) ? height : height2;
        System.out.println("키가 " + min + "cm 이므로 탑승 불가능합니다."); // 값이 115인 경우

        int max = (height > height2) ? height : height2;
        System.out.println("키가 " + max + "cm 이므로 탑승 가능합니다."); // 값이 121인 경우

        // 나도코딩님 답안
        height = 115; // or 121 입력
        String result = (height >= 120) ? "탑승 가능합니다" : "탑승 불가능합니다";
        System.out.println("키가 " + height + "cm 이므로 " + result);

    }
}
