import java.util.ArrayList;
import java.util.Collections;

public class Recruiter implements Comparable<JobSeeker>{

    public int compareTo(JobSeeker other) {
        return jobSeekerName.compareTo(other.jobSeekerName);
    }


    protected Manager manager;
    protected int recruiterID;
    private ArrayList<JobSeeker> recruitees;

    public Recruiter(Manager manager, int recruiterID) {
        this.manager = manager;
        this.recruiterID = recruiterID;
        this.recruitees = new ArrayList<JobSeeker>();
    }

    Manager getManager() {
        return manager;
    }

    void setManager(Manager manager) {
        this.manager = manager;
    }

    int getRecruitedID() {
        return recruiterID;
    }

    void setRecruitedID(int recruiterID) {
        this.recruiterID = recruiterID;
    }

    double bonus() {

        return()
    }

    void addJobSeeker() {

    }

    public ArrayList<JobSeeker> getJobSeekers() {

    }

    public void addJobSeeker(JobSeeker newRecruit){

        recruitees.add(newRecruit);
        Collections.sort(recruitees);

    }



    @Override
    public String toString() {
        return "Recruiter{" +
                "manager=" + manager +
                ", recruitedID=" + recruitedID +
                '}';
    }
}
