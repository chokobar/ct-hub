package hub;

import java.util.Arrays;

public class Test20 {

    public static void main(String[] args) {
        /*
         * 제일 작은 수 제거하기
         *
         * 문제 설명
         * 정수를 저장한 배열, arr 에서 가장 작은 수를 제거한 배열을 리턴하는 함수,
         * solution을 완성해주세요. 단, 리턴하려는 배열이 빈 배열인 경우엔 배열에 -1을 채워 리턴하세요.
         * 예를들어 arr이 [4,3,2,1]인 경우는 [4,3,2]를 리턴 하고,
         * [10]면 [-1]을 리턴 합니다.
         *
         *
         *  arr	        return
         * [4,3,2,1]	[4,3,2]
         * [10]	        [-1]
         *
         *
         */
        class Solution {
            public int[] solution(int[] arr) {
                int[] answer = new int[arr.length - 1];

                //빈 배열인 경우 -1 채우기
                if(arr.length ==1) {
                    return new int[]{-1};
                }

                //최솟값 구하기
                int minValue = arr[0];
                for (int i = 0; i < arr.length; i++) {
                    if (arr[i] < minValue) {
                        minValue = arr[i];
                    }
                }

                //배열 채우기
                int index = 0;
                for (int i = 0; i < arr.length; i++) {
                    if (arr[i] != minValue) {
                        answer[index] = arr[i];
                        index++;
                    }
                }
                System.out.println(Arrays.toString(answer));
                return answer;
            }
        }
        Solution sol = new Solution();
        sol.solution(new int[]{4,3,2,1});
    }
}
