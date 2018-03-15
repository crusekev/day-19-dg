package kevincruse;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        //incriment r by 5 on hw
        int[][] myarray = new int[51][51]; //51 coloumns and 51 rows
        //hw for(int t = 5;t <= 50;t+=5)
        //for(v = 5;v <= 50;v+=5)
        for (int r = 1; r <= 12; r++) {
            System.out.printf("%5d", r);
            for (int c = 1; c <= 12; c++) {
                System.out.printf("%5d", r * c);
                myarray[r][c] = r * c;
            }
            System.out.println();
        }
        FileWriter fWriter = new FileWriter("mydata.html");
        PrintWriter outfile = new PrintWriter(fWriter);
        outfile.println("<!DOCTYPE html>");
        outfile.println("<html>");
        outfile.println("<head>");
        outfile.println("<title>Page Kevin Cruse </title>");
        outfile.println("</head>");
        outfile.println("<body>");
        outfile.println("<h1> <center> Multiplication Table </center> </h1>");
        outfile.println("<table style='border: 1px solid black;width:50%;text-align:center;'>");
        for (int r = 1; r <= 12; r++) {
            outfile.println("<tr>");
            //outfile.println("<td>" +  + "</td>");
            for (int c = 1; c <= 12; c++) {
                outfile.println("<td>" + myarray[r][c] + "</td>");
            }
            outfile.println("</tr>");
        }
        outfile.println("</table>");
        outfile.println("</body>");
        outfile.println("</html>");
        outfile.close();
    }
}