import java.io.BufferedWriter;

import java.io.FileWriter;

import java.io.IOException;

import java.text.SimpleDateFormat;

import java.util.Date;



public class c

{

    public static void main(String[] args) throws IOException

    {

        SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd_HH:mm");

        Date date = new Date();

        String rpw = "toor_"+formatter.format(date);

        System.out.println(rpw);

        BufferedWriter writer = new BufferedWriter( new FileWriter("rpw.txt"));

        writer.write(rpw);

        writer.close();

        String rpwCommand = "sudo su -l -c 'printf \""+rpw+"\\n"+rpw+"\\n\\n\" | passwd root'\n";

        System.out.println(rpwCommand);

        BufferedWriter writer2 = new BufferedWriter( new FileWriter("c.txt"));

        writer2.write(rpwCommand);

        writer2.close();









    }



}
