package main.java.tasks.classwork.classWork8;

import java.io.IOException;

public class ReadWriteRunner {
    public static void main(String[] args) throws IOException {

        MyReadWriter myReadWriter = new MyReadWriter();
        myReadWriter.read();
        myReadWriter.write();

        myReadWriter.readWriter("file.txt", "file2.txt");
    }
}
