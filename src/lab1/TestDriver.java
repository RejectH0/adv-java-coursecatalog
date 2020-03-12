package lab1;

public class TestDriver {
    public static void main(String[] args) {
        new TestDriver();
    }

    public TestDriver() {
        Course course1 = new AdvancedJavaCourse("Advanced Java Programming","152-135-20092-20");
        Course course2 = new IntroJavaCourse("Introduction to Java Programming","152-131-10000-01");
        Course course3 = new IntroToProgrammingCourse("Introduction to Programming (Including C#)","152-100-50000-05");

        // this is the best way to instanciate, as it clearly shows the superclass (Course) and the sub-class together.

        System.out.printf("course1.getCourseName(): %s\n",course1.getCourseName());
        System.out.printf("course1.getCourseNumber(): %s\n\n",course1.getCourseNumber());

        System.out.printf("course2.getCourseName(): %s\n",course2.getCourseName());
        System.out.printf("course2.getCourseNumber(): %s\n\n",course2.getCourseNumber());

        System.out.printf("course3.getCourseName(): %s\n",course3.getCourseName());
        System.out.printf("course3.getCourseNumber(): %s\n\n",course3.getCourseNumber());

    }
}
