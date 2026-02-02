import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        UserService userService = new UserService();
        CourseService courseService = new CourseService();
        QuizService quizService = new QuizService();
        FileService fileService = new FileService();

        while (true) {
            System.out.println("\n--- EDUQUEST PLATFORM ---");
            System.out.println("1. Register");
            System.out.println("2. Login");
            System.out.println("3. Exit");

            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {
                System.out.print("Username: ");
                String u = sc.nextLine();
                System.out.print("Password: ");
                String p = sc.nextLine();
                userService.registerUser(u, p);
            }
            else if (choice == 2) {
                System.out.print("Username: ");
                String u = sc.nextLine();
                System.out.print("Password: ");
                String p = sc.nextLine();

                if (userService.loginUser(u, p)) {
                    System.out.println("Login Successful!");

                    boolean loggedIn = true;
                    while (loggedIn) {
                        System.out.println("\n--- COURSE LIST ---");
                        courseService.showCourses();
                        System.out.println("0. Logout");

                        int courseChoice = sc.nextInt();
                        sc.nextLine();

                        if (courseChoice == 0) {
                            loggedIn = false;
                        } else {
                            Course selected = courseService.getCourseById(courseChoice);

                            if (selected != null) {
                                boolean inCourse = true;
                                while (inCourse) {
                                    System.out.println("\n--- " + selected.getTitle() + " ---");
                                    System.out.println("1. View Study Material");
                                    System.out.println("2. Take Mock Test");
                                    System.out.println("3. Back");

                                    int option = sc.nextInt();
                                    sc.nextLine();

                                    if (option == 1) {
                                        System.out.println("\n--- COURSE CONTENT ---\n");
                                        fileService.displayFile(selected.getFilePath());
                                    }
                                    else if (option == 2) {
                                        quizService.conductQuiz(selected.getQuestions());
                                    }
                                    else {
                                        inCourse = false;
                                    }
                                }
                            }
                        }
                    }
                } else {
                    System.out.println("Invalid Login!");
                }
            }
            else {
                System.out.println("System Closed.");
                break;
            }
        }
        sc.close();
    }
}
