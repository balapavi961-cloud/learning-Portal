import java.util.List;

public class Course {
    private int id;
    private String title;
    private String filePath;
    private List<Question> questions;

    public Course(int id, String title, String filePath, List<Question> questions) {
        this.id = id;
        this.title = title;
        this.filePath = filePath;
        this.questions = questions;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getFilePath() {
        return filePath;
    }

    public List<Question> getQuestions() {
        return questions;
    }
}
