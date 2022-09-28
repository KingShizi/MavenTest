import java.io.IOException;
import java.util.Scanner;

public class Logger {

    //1
    //No.
    public static void main(String[] args) throws IOException {

        LogToFileSingelton logToFile = LogToFileSingelton.getLog();
        //logToFile.writeLogToFile("hello world!");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name");
        logToFile.getLog().writeLogToFile(scanner.next());
        System.out.println("Please enter your age");
        logToFile.getLog().writeLogToFile(scanner.next());
        System.out.println("Please enter your address");
        logToFile.getLog().writeLogToFile(scanner.next());
        System.out.println("Please enter your phone number");
        logToFile.getLog().writeLogToFile(scanner.next());
        System.out.println("Thanks");

    }

}
