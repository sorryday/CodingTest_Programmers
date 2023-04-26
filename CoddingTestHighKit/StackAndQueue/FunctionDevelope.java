package StackAndQueue;

import java.util.*;
class FunctionDevelope {
    static class Job {
        int pro;
        int speed;

        public Job(int pro, int speed) {
            this.pro = pro;
            this.speed = speed;
        }
    }

    public List<Integer> solution(int[] progresses, int[] speeds) {
        List<Integer> answer = new ArrayList<>();
        Queue<Job> q = new ArrayDeque<>();

        for (int i = 0; i < progresses.length; i++) {
            q.add(new Job(progresses[i], speeds[i]));
        }

        while(!q.isEmpty()) {
            int cnt = 1;
            Job j = q.poll();

            int day = (100 - j.pro) / j.speed;
            if ((100 - j.pro) % j.speed != 0) {
                day++;
            }

            while (!q.isEmpty() && (q.peek().speed * day + q.peek().pro >= 100)) {
                q.poll();
                cnt++;
            }
            answer.add(cnt);
        }

        return answer;
    }
}