import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.nio.file.Files;
import java.nio.file.Paths;

public class MainTest {

    @Test
    void works(){
        String[] string = new String[3];
        string[0] = "src/main/resources/persoane.csv";
        string[1] = "6";
        string[2] = "src/main/resources/persoane2.csv";
        try{
            Main.main(string);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        Assertions.assertTrue(Files.exists(Paths.get(string[2])));
    }
}