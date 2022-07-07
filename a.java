import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

public class a
{
    public static void main( String args[] ) throws IOException, InterruptedException
    {
        UUID randomUUID = UUID.randomUUID();
        String un = randomUUID.toString().replaceAll("-", "");
        System.out.println("su saatin username i = " + un);
        String useraddComutu ="useradd "+un;
        Process process = Runtime.getRuntime().exec(useraddComutu);
        System.out.println(un+" useri eklendi raad olcan");
        BufferedWriter writer = new BufferedWriter( new FileWriter("/root/un.txt"));
        writer.write(un);
        writer.close();
        System.out.println("username un.txt ye yazildi");

        SimpleDateFormat formatter = new SimpleDateFormat("MMddyyyyHH");
        Date date = new Date();
        String currentUserPassword = "Minosetplus."+formatter.format(date);

        String a = "sudo su -l -c 'printf \""+currentUserPassword+"\\n"+currentUserPassword+"\\n\\n\" | passwd "+un+"'\n";
        BufferedWriter writer2 = new BufferedWriter( new FileWriter("/root/a.txt"));
        writer2.write(a);
        writer2.close();
        Process process2 = Runtime.getRuntime().exec("chmod 700 ./a.txt");
        Process process3 = Runtime.getRuntime().exec("./a.txt");



    }
}
