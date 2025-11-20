import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);


        System.out.println("-------------------SHIVORA LEARNING PORTAL-------------------");
        System.out.println("      Login to Shivora      ");
        boolean f = true;
        while(f) {
            System.out.println("Enter your Name : ");
            String name = sc.nextLine();
            System.out.println("Enter your Email(ex : xyz@gmail.com) : ");
            String email = sc.next();
            if (email.contains("@gmail.com")) {
                System.out.println("You have Successfully Logined!!");
                f = false;
            } else {
                System.out.println("Enter valid password...");
            }
        }
        System.out.println();
        System.out.println("======================================================");
        System.out.println("                Programming Languages");
        System.out.println("======================================================");
        System.out.println("1.C programming Language");
        System.out.println("2.Java programming Language");
        System.out.println("Enter what you want to Learn?(click 1 (or) 2): ");
        boolean t = true;
        while(t) {
            int learn = sc.nextInt();

            switch (learn) {
                case 1:
                    try {
                        System.out.println("-------------------------------------------------------");
                        System.out.println("                      C PROGRAM");
                        File file = new File("C:\\Users\\praka\\Desktop\\LEARNING\\ShivoraLearning\\learning portal\\src\\Cprogram.txt");
                        FileReader fr = new FileReader(file);
                        BufferedReader br = new BufferedReader(fr);
                        String reader;
                        while ((reader = br.readLine()) != null) {
                            System.out.println(reader);
                        }
                    } catch (Exception e) {
                        System.out.println(e);
                    }

                    t=false;
                    break;
                case 2:
                    try {
                        System.out.println("-------------------------------------------------------");
                        System.out.println("                      J A V A");
                        File file = new File("C:\\Users\\praka\\Desktop\\LEARNING\\ShivoraLearning\\learning portal\\src\\java.txt");
                        FileReader fr = new FileReader(file);
                        BufferedReader br = new BufferedReader(fr);
                        String reader;
                        while ((reader = br.readLine()) != null) {
                            System.out.println(reader);
                        }
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                    t=false;
                    break;
                default:
                    System.out.println("Course not Found");
                    System.out.println("Enter valid courses...!");
            }
            System.out.println("Take MCQs (y/n)");
            char ch = sc.next().charAt(0);
            if(ch == 'y'){
                Quize q = new Quize(learn);
                q.answer();
            }
        }
    }
}