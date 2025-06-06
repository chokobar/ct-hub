package hub;

public class Test15 {

    public static void main(String[] args) {
        /*
         * 핸드폰 번호 가리기
         *
         * 문제 설명
         * 프로그래머스 모바일은 개인정보 보호를 위해 고지서를 보낼 때 고객들의 전화번호의 일부를 가립니다.
         * 전화번호가 문자열 phone_number로 주어졌을 때, 전화번호의 뒷 4자리를 제외한 나머지 숫자를 전부 *으로 가린 문자열을 리턴하는 함수,
         * solution을 완성해주세요.
         *
         *
         *  phone_number	    return
         * "01033334444"	"*******4444"
         * "027778888"	"*****8888"
         *
         *
         */
        class Solution {
            public String solution(String phone_number) {
                int length = phone_number.length();
                String hidden = "*".repeat(length - 4);
                String lastFour = phone_number.substring(length - 4);
                return hidden + lastFour;
            }
        }

        Solution sol = new Solution();
        sol.solution("01033334444");
    }
}
