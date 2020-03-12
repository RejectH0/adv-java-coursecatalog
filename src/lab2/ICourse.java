package lab2;

public interface ICourse {
    String getCourseNumber();
    String getCourseName();
    double getCredits();
    String getPrerequisites();
    void setCourseName(String courseName);
    void setCourseNumber(String courseNumber);
    void setCredits(double credits);
    void setPrerequisites(String prerequisites);
}
