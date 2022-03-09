package main.java.tasks.classwork.classWork8;

import java.io.*;

public class MyReadWriter {

    public void read() throws IOException{

        BufferedReader in = new BufferedReader(new FileReader("file.txt"));
        String line;
        while ((line = in.readLine()) != null){  //вычитывает не пустой файл
            System.out.println(line);
        }
        in.close();
    }

    public void write() throws IOException{

        BufferedWriter out = new BufferedWriter(new FileWriter("new_file.txt"));
        out.write("мама мыла раму");
        out.close();
    }

    public void readWriter(String fileFrom, String fileTo) throws IOException{

        BufferedReader in = new BufferedReader(new FileReader(fileFrom));
        BufferedWriter out = new BufferedWriter(new FileWriter(fileTo));
        String line2;
        while ((line2 = in.readLine()) != null){  //вычитывает не пустой файл fileFrom
            //out.write(line2);                     // записывает его сожержимое в fileTo
            out.append(line2);
            out.newLine();

        }
        in.close();
        out.close();
    }

}
