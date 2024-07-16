import java.util.*;

class Solution {
    public int solution(int[] queue1, int[] queue2) {
        Queue<Integer> que1 = new ArrayDeque<>();
        Queue<Integer> que2 = new ArrayDeque<>();
        int answer = 0;

        while(sum(que1)!=sum(que2)) {
            if (sum(que1)>sum(que2)) {
                int value= que1.remove();
                que2.add(value);
            } else if (sum(que2)>sum(que1)) {
                int value = que2.remove();
                que1.add(value);
            }
            answer += 1;
        }

        return answer;
    }

    public int sum(Queue<Integer> que) {
        int sum = 0;
        for (int value: que) {
            sum += value;
        }
        return sum;
    }
    public static void  main(String[] args) {
        int[] queue1 = {3, 2, 7, 2};
        int[] queue2 = {4, 6, 5, 1};

        Solution solution = new Solution();
        int answer = solution.solution(queue1,queue2);
        System.out.println(answer);
    }
}