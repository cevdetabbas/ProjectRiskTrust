import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class erisimsaglafor15minutes
{
    public static void main (String[] args) throws IOException
    {
        String a="";
        for (String s: args)
        {
            a ="firewall-cmd --permanent --add-rich-rule='rule family=\"ipv4\" source address=\""+s+"\" service name=\"altmisSeksen\" log prefix=\"girenCikan\" level=\"info\" limit value=\"1/m\" accept'";
        }
        BufferedWriter writer = new BufferedWriter( new FileWriter("erisimsaglafor15minutes.txt"));
        writer.write(a);
        writer.close();
        System.out.println(a);


    }
}
