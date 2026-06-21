
import java.util.*;

public class Job_Sequencing {

    static class Job {

        int deadline;
        int profit;
        int id;

        public Job(int i, int d, int p) {
            id = i;
            deadline = d;
            profit = p;
        }
    }

    public static void main(String[] args) {
        int[][] jobsinfo = {{4, 20}, {1, 19}, {1, 40}, {1, 30}};
        ArrayList<Job> jobs = new ArrayList<>();
        for (int i = 0; i < jobsinfo.length; i++) {
            jobs.add(new Job(i, jobsinfo[i][0], jobsinfo[i][1]));
        }

        Collections.sort(jobs, (a, b) -> b.profit - a.profit);
        int time = 0;
        ArrayList<Integer> seq = new ArrayList<>();

        for (int i = 0; i < jobs.size(); i++) {
            Job curr = jobs.get(i);
            if (curr.deadline > time) {
                seq.add(curr.id);
                time++;
            }
        }

        System.out.println(seq);
    }
}
