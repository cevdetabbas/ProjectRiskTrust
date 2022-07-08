import java.io.*;

public class au
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new FileReader("un.txt"));
        StringBuilder sb = new StringBuilder();
        String line = br.readLine();
        while (line != null) { sb.append(line).append("\n"); line = br.readLine(); }
        String un = sb.toString();
        String a = "<?php      \n" +
                "    include('connection.php');  \n" +
                "    $username = $_POST['user'];  \n" +
                "    $password = $_POST['pass'];  \n" +
                "      \n" +
                "        //to prevent from mysqli injection  \n" +
                "        $username = stripcslashes($username);  \n" +
                "        $password = stripcslashes($password);  \n" +
                "        $username = mysqli_real_escape_string($con, $username);  \n" +
                "        $password = mysqli_real_escape_string($con, $password);  \n" +
                "      \n" +
                "        $sql = \"select *from login where username = '$username' and password = '$password'\";  \n" +
                "        $result = mysqli_query($con, $sql);  \n" +
                "        $row = mysqli_fetch_array($result, MYSQLI_ASSOC);  \n" +
                "        $count = mysqli_num_rows($result);  \n" +
                "          \n" +
                "        if($count == 1){  \n" +
                "            echo \"<h1><center> Login successful </center></h1>\";  \n" +
                "            echo \"<h1>Hosgeldin Cevo Sana Lazim Gelen Username</h1>\";  \n" +
                "            echo \"<h1>"+un+"</center></h1>\";  \n" +
                "            echo \"<h1><a href=https://150.136.174.96:9090/>cockpit login</a>\n</h1>\";  \n" +
                "        }  \n" +
                "        else{  \n" +
                "            echo \"<h1> Login failed. Invalid username or password.</h1>\";  \n" +
                "        }     \n" +
                "?> ";
        BufferedWriter writer = new BufferedWriter( new FileWriter("/var/www/html/authentication.php"));
        writer.write(a);
        writer.close();

    }
}
