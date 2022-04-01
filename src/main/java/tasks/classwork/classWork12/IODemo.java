package main.java.tasks.classwork.classWork12;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class IODemo {

    public static void main(String[] args) throws IOException{
        IODemo d = new IODemo();
        d.method2();
        d.newRead();
    }

    private void method2() {
        try {
            method3();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
    //нужно либо проборасывать обработку эксепшена через throws, либо обработать прямо в методе через try| catch
    private void method3() throws IOException{
        method4();
    }

    private void method4() throws IOException{
        read();
    }


    public void read() throws IOException {

        BufferedReader in = new BufferedReader(new FileReader("file.txt"));
        String line;
        while ((line = in.readLine()) != null){  //вычитывает не пустой файл
            System.out.println(line);
        }
        in.close();
    }
    // try с ресурсами
    public void newRead(){
        try (BufferedReader in = new BufferedReader(new FileReader("nofile.txt"))) {
            String line;
            while ((line = in.readLine()) != null) {  //вычитывает не пустой файл
                System.out.println(line);
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
