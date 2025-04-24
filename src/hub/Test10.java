package hub;

public class Test10 {

    public static void main(String[] args) {
        /*
         * 문자열내 p와 y의 개수
         *
         * 문제 설명
         * 대문자와 소문자가 섞여있는 문자열 s가 주어집니다.
         * s에 'p'의 개수와 'y'의 개수를 비교해 같으면 True,
         * 다르면 False를 return 하는 solution를 완성하세요. 'p', 'y' 모두 하나도 없는 경우는 항상 True를 리턴합니다.
         * 단, 개수를 비교할 때 대문자와 소문자는 구별하지 않습니다.
         * 예를 들어 s가 "pPoooyY"면 true를 return하고
         * "Pyy"라면 false를 return합니다.
         *
         *
         *  s	        answer
         * "pPoooyY"	true
         * "Pyy"	    false

         *
         *
         */
        class Solution {
            boolean solution(String s) {
                boolean answer = true;
                int pStrCount = 0;
                int yStrCount = 0;
                String resultS = s.toLowerCase();
                for (int i = 0; i < resultS.length(); i++) {
                    if (resultS.charAt(i) == 'p') {
                        pStrCount++;
                    }else if (resultS.charAt(i) == 'y') {
                        yStrCount++;
                    }
                }
                if (pStrCount == yStrCount) {
                    answer = true;
                } else {
                    answer = false;
                }

                return answer;
            }
        }

        Solution sol = new Solution();
        sol.solution("pPoooyY");
    }
}
