package hub;

public class Test22 {

    public static void main(String[] args) {
        /*
         * 최댓값과 최소값
         *
         * 문제 설명
         * JadenCase란 모든 단어의 첫 문자가 대문자이고,
         * 그 외의 알파벳은 소문자인 문자열입니다. 단, 첫 문자가 알파벳이 아닐 때에는 이어지는 알파벳은 소문자로 쓰면 됩니다.
         * (첫 번째 입출력 예 참고)
         * 문자열 s가 주어졌을 때, s를 JadenCase로 바꾼 문자열을 리턴하는 함수, solution을 완성해주세요.
         *
         *  s	                    return
         * "3people unFollowed me"	"3people Unfollowed Me"
         * "for the last week"	    "For The Last Week"
         *
         *
         */
        class Solution {
            public String solution(String s) {
                StringBuilder sb = new StringBuilder(s.length());
                boolean startOfWord = true;

                for (int i = 0; i < s.length(); i++) {
                    char c = s.charAt(i);

                    if (c == ' ') {
                        sb.append(c);
                        startOfWord = true;
                        continue;
                    }

                    if (startOfWord) {
                        if (Character.isLetter(c)) {
                            sb.append(Character.toUpperCase(c));
                        } else {
                            sb.append(c);
                        }
                        startOfWord = false;
                    } else {
                        if (Character.isLetter(c)) {
                            sb.append(Character.toLowerCase(c));
                        } else {
                            sb.append(c);
                        }
                    }
                }
                System.out.println(sb.toString());
                return sb.toString();
            }
        }

        Solution sol = new Solution();
        sol.solution("3people unFollowed me");
    }
}
