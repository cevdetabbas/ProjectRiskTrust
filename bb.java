import java.io.*;

public class bb
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new FileReader("aa.txt"));
        StringBuilder sb = new StringBuilder();
        String line = br.readLine();
        while (line != null) { sb.append(line).append("\n"); line = br.readLine(); }
        String un = sb.toString();
        String a = un.replace("--add","--remove");
        a = a+"\nfirewall-cmd --reload\nfirewall-cmd --list-all";
        System.out.println(a);

        BufferedWriter writer = new BufferedWriter( new FileWriter("bb.txt"));
        writer.write(a);
        writer.close();



    }
}
