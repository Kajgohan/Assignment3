public class JobSeeker {

    String jobSeekerID;
    String jobSeekerName;
    private float salary;


    public JobSeeker(String jobSeekerID, String jobSeekerName, float salary) {
        this.jobSeekerID = jobSeekerID;
        this.jobSeekerName = jobSeekerName;
        this.salary = salary;
    }

    String getJobSeekerID() {
        return jobSeekerID;
    }

    void setJobSeekerID(String jobSeekerID) {
        this.jobSeekerID = jobSeekerID;
    }

    String getJobSeekerName() {
        return jobSeekerName;
    }

    void setJobSeekerName(String jobSeekerName) {
        this.jobSeekerName = jobSeekerName;
    }

    void setSalary() {

    }

    public double getSalary() {
        return (salary);
    }

    @Override
    public String toString() {
        return "JobSeeker{" +
                "jobSeekerID='" + jobSeekerID + '\'' +
                ", jobSeekerName='" + jobSeekerName + '\'' +
                ", salary=" + salary +
                '}';
    }
}
