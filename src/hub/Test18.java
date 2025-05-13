package hub;

import java.util.Arrays;

public class Test18 {

    public static void main(String[] args) {
        /*
         * 나누어 떨어지는 숫자 배열
         *
         * 문제 설명
         * array의 각 element 중 divisor로 나누어 떨어지는 값을 오름차순으로 정렬한 배열을 반환하는 함수,
         * solution을 작성해주세요.
         * divisor로 나누어 떨어지는 element가 하나도 없다면 배열에 -1을 담아 반환하세요.
         *
         *
         *  arr	            divisor	    return
         * [5, 9, 7, 10]	5	        [5, 10]
         * [2, 36, 1, 3]	1	        [1, 2, 3, 36]
         * [3,2,6]	        10	        [-1]
         *
         *
         */
        class Solution {
            public int[] solution(int[] arr, int divisor) {
                int arrCount = 0;
                for (int i = 0; i < arr.length; i++) {
                    if (arr[i] % divisor == 0) {
                        arrCount++;
                    }
                }
                int[] answer = new int[arrCount];
                int index = 0;

                for (int i = 0; i < arr.length; i++) {
                    if (arr[i] % divisor == 0) {
                        answer[index] = arr[i];
                        index++;
                    }
                }

                if(answer.length <= 0){
                    answer = new int[]{-1};
                }else {
                    Arrays.sort(answer);
                }
                return answer;
            }
        }

        Solution sol = new Solution();
        sol.solution(new int[]{3,2,6} , 10);
    }
}
