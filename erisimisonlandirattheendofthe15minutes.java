import java.io.*;

public class erisimisonlandirattheendofthe15minutes
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new FileReader("erisimsaglafor15minutes.txt"));
        StringBuilder sb = new StringBuilder();
        String line = br.readLine();
        while (line != null) { sb.append(line).append("\n"); line = br.readLine(); }
        String un = sb.toString();
        String a = un.replace("--add","--remove");
        System.out.println(a);

        BufferedWriter writer = new BufferedWriter( new FileWriter("erisimisonlandirattheendofthe15minutes.txt"));
        writer.write(a);
        writer.close();



    }
}
