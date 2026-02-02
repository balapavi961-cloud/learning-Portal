import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CourseService {

    private ArrayList<Course> courses = new ArrayList<>();

    public CourseService() {

        // Get the folder where the program is running
        String basePath = System.getProperty("user.dir");
        String courseFolder = basePath + File.separator + "courses" + File.separator;

        List<Question> javaQuestions = Arrays.asList(
                new Question("Which keyword is used for inheritance?",
                        new String[]{"extends", "this", "super"}, 1)
        );

        List<Question> dsQuestions = Arrays.asList(
                new Question("Which follows FIFO?",
                        new String[]{"Stack", "Queue", "Tree"}, 2)
        );

        List<Question> webQuestions = Arrays.asList(
                new Question("Which language styles web pages?",
                        new String[]{"HTML", "CSS", "JavaScript"}, 2)
        );

        courses.add(new Course(1, "Java Basics", courseFolder + "course/java.txt", javaQuestions));
        courses.add(new Course(2, "Data Structures", courseFolder + "course/ds.txt", dsQuestions));
        courses.add(new Course(3, "Web Development", courseFolder + "course/web.txt", webQuestions));
    }

    public void showCourses() {
        for (Course c : courses) {
            System.out.println(c.getId() + ". " + c.getTitle());
        }
    }

    public Course getCourseById(int id) {
        for (Course c : courses) {
            if (c.getId() == id)
                return c;
        }
        return null;
    }
}
