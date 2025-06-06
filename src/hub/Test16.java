package hub;

public class Test16 {

    public static void main(String[] args) {
        /*
         * 가운데 글자 가져오기
         *
         * 문제 설명
         * 단어 s의 가운데 글자를 반환하는 함수, solution을 만들어 보세요.
         * 단어의 길이가 짝수라면 가운데 두글자를 반환하면 됩니다.
         *
         *
         *  s	        return
         * "abcde"	    "c"
         * "qwer"	    "we"
         *
         *
         */
        class Solution {
            public String solution(String s) {
                String answer = "";
                int length = s.length();
                System.out.println(length);
                int middle = length / 2;

                if (length % 2 == 0) {
                    return s.substring(middle - 1, middle + 1);
                } else {
                    return s.substring(middle, middle + 1);
                }
            }
        }

        Solution sol = new Solution();
        sol.solution("abcde");
    }
}
