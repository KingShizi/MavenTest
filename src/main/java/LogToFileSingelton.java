import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class LogToFileSingelton {

    private LogToFileSingelton(){}

    public static LogToFileSingelton getLog(){
        if (log == null){
            log = new LogToFileSingelton();
        }
        return log;
    }

    private static LogToFileSingelton log = null;

    public void writeLogToFile(String content) throws IOException {

        String filePath = "/Users/shirazelbaz/Desktop/1.txt";

        Files.writeString(Paths.get(filePath), content +"\n", StandardOpenOption.APPEND);
    }
}
