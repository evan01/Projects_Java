package Comp251A4;
/*
Recall the scheduling problem from Section 4.2 in which we sought to minimize the maximum lateness.

There are n jobs, each with a deadline di and a required processing time ti, and all jobs are available to be scheduled
starting at time s. For a job i to be done, it needs to be assigned a period from st>=s to f1 =.... As usual such an assignment of times will be called a schedule

In this problem, we consider the same setup, but want to optimize a different objective. In particular, we consider the case in which each job must either be done by its deadline or not at all. We'll say that a subset J of the jobs is schedulable if there is a schedule for the jobs in J so that each of them finishes by its deadline. Your problem is to select a schedulable subset of maximum possible size and give a schedule for this subset that allows each job to finish by its deadline.

a) Prove that there is an optimal solution J (ie, a schedulable set of maximum size) in which the jobs in J are scheduled in increasing order their deadlines

b) Assume that all deadlines di and required thoses ti are integers. Give an algorithm to find an optimal solution. Your algorithm should run in time polynomial in the number of jobs n, and the maximum deadline D = max di.


ANSWER
http://cs.stackexchange.com/questions/6202/maximum-schedulable-set-zero-lateness-deadline-scheduling

 */
import java.util.Collections;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Stack;

public class Problem28 {

    public static void main(String args[]){
        //First create a set of jobs [deadline, time]
        ArrayList<Job> jobs = new ArrayList<Job>();

        jobs.add(new Job(5,5));
        jobs.add(new Job(5,2));
        jobs.add(new Job(5,2));
        jobs.add(new Job(6,1));
        jobs.add(new Job(6,1));
        jobs.add(new Job(6,1));
        jobs.add(new Job(6,1));


        //Sort the jobs by increasing deadline
        sort(jobs);
        jobs = removeBadJobs(jobs);
        printAllJobs(jobs);

        Stack <Job> schedule = createSchedule2(jobs);
        printSchedule(schedule);

    }

    private static Stack<Job> createSchedule2(ArrayList<Job> jobs){
        //Start with the last job in the list
        //this job is either in or outside of the set that we want to return
        if(jobs.size() == 0){
            return null;
        }

        //Get the last job
        Job lastJ = jobs.get(jobs.size()-1);

        //lastJ is in the set we want to return iff it can finish before its deadline
        //lastJ will finish before its deadline iff the sum of all the times of jobs in the optimal solution
        //+ the lastJ.time is less than lastJ.deadline

        //To find the sum of all the times of jobs in the optimal solution, well just assume you have the optimal solution

        //Say you have 1 job, the job is in the optimal solution if, it can finish before its deadline or 0+j.time<=j.deadline
        //Say you have 2 jobs, then...
        // j2 is in optimal solution,
            //if it is, then solution will be J2 + Opt(p(j2))
                //p(j2) will return 0 if and only if there is no job, that can be completed by j2.deadline - j2.time
                //Usually, p(j2) will return
        // j2 isn't in optimal solution
            //return OPT(j1)


    }

    private static void printSchedule(Stack<Job> schedule) {
        int count = 0;
        Job j;
        System.out.println("----- Schedule -----");
        //Use another stack to print
        while(!schedule.isEmpty()){
            j = schedule.pop();
            System.out.println("Job: "+count+" Deadline: "+j.deadline+" Time "+j.time);
        }
    }

    //this method will take as input a sorted array of jobs by increasing deadline
    private static Stack<Job> createSchedule(ArrayList<Job> jobs) {
        Stack<Job> schedule = new Stack<Job>();
        Job possibleJob;

        schedule.push(jobs.get(0));
        int lft = 0;
        int eft = schedule.peek().time;

        for (int i=1;i<jobs.size();i++){
            //Get a possible job
            possibleJob = jobs.get(i);
            //First figure out if schedule can accomodate both jobs
            if(eft+possibleJob.time<=possibleJob.deadline){
                schedule.add(possibleJob);
                lft = eft;
                eft += possibleJob.time;
            }else{
                //It can't accomodate both
                if(lft+possibleJob.time<eft){
                    //Then the current possible job is more optimal
                    schedule.pop();
                    schedule.push(possibleJob);
                    eft = lft+possibleJob.time;
                }
            }
        }
        return schedule;
    }

    private static ArrayList<Job> sort(ArrayList<Job> jobs){
        Collections.sort(jobs, new Comparator<Job>() {
            @Override public int compare(Job p1, Job p2) {
                return p1.deadline - p2.deadline; // Ascending
            }

        });
        return jobs;
    }

    private static ArrayList<Job> removeBadJobs(ArrayList<Job> jobs){
        Job job;
        ArrayList<Job> newList = new ArrayList<Job>();

        for (int i=0;i<jobs.size();i++){
            job = jobs.get(i);
            if (job.deadline >= job.time){
                newList.add(job);
            }
        }
        return newList;
    }

    private static void printAllJobs(ArrayList<Job> jobs){
        Job j;
        System.out.println("----- All Possible Jobs -----");
        for(int i=0;i<jobs.size();i++){
            j = jobs.get(i);
            System.out.println("Job: "+i+" Deadline: "+j.deadline+" Time: "+j.time);
        }
        System.out.println();
    }



}
