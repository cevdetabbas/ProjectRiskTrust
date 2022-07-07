import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class b
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new FileReader("un.txt"));
        StringBuilder sb = new StringBuilder();
        String line = br.readLine();
        while (line != null) { sb.append(line).append("\n"); line = br.readLine(); }
        String un = sb.toString();
        String a = "userdel -rf "+un;
        Process process = Runtime.getRuntime().exec(a);


    }
}
