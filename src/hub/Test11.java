package hub;

public class Test11 {

    public static void main(String[] args) {
        /*
         * 문자열을 정수로 변환하기
         *
         * 문제 설명
         * 문자열 s를 숫자로 변환한 결과를 반환하는 함수, solution을 완성하세요.
         *
         *
         *  s	        answer
         * "-1234"	    1234
         *
         *
         */
        class Solution {
            public int solution(String s) {
                int answer = 0;
                int num = (Integer.parseInt(s));
                answer = num;
                System.out.println(answer);
                return answer;
            }
        }

        Solution sol = new Solution();
        sol.solution("-1234");
    }
}
