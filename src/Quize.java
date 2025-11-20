import java.io.*;
import java.util.*;
public class Quize {
    public int input;
    private int score;

    Quize(int input){
        this.input = input;
    }
    public int getInput(){
        return input;
    }
    public void answer(){
        Scanner sc = new Scanner(System.in);
        if(input == 1){
            int score =0;
            try {
                File f = new File("C:\\Users\\praka\\Desktop\\LEARNING\\ShivoraLearning\\learning portal\\src\\questionsforC");
                FileReader fr = new FileReader(f);
                BufferedReader br = new BufferedReader(fr);
                String reader;
                while((reader = br.readLine())!= null){
                    System.out.println(reader);
                }
            }
            catch (Exception e){
                System.out.println(e);
            }
            char[] arr = {'b','b','a','b','b'};
            char[] ch = new char[5];
            for(int i=0;i<5;i++){
                ch[i]=sc.next().charAt(0);
            }
            for(int i=0;i<5;i++){
                if(ch[i]==arr[i]){
                    score++;
                }
            }
            System.out.println("Your Score : "+score);
        }
        else{
            int score = 0;
            try {
                File f = new File("C:\\Users\\praka\\Desktop\\LEARNING\\ShivoraLearning\\learning portal\\src\\questionsforJava");
                FileReader fr = new FileReader(f);
                BufferedReader br = new BufferedReader(fr);
                String reader;
                while((reader = br.readLine())!= null){
                    System.out.println(reader);
                }
            }
            catch (Exception e){
                System.out.println(e);
            }
            char[] arr = {'b','c','c','c','a'};
            char[] ch = new char[5];
            for(int i=0;i<5;i++){
                ch[i]=sc.next().charAt(0);
            }
            for(int i=0;i<5;i++){
                if(ch[i]==arr[i]){
                    score++;
                }
            }
            System.out.println("Your Score : "+score);
        }
    }
}