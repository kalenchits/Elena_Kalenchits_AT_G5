package main.java.tasks.classwork.classWork8;

import java.util.Scanner;

public class ConsoleReader {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            String incoming = scanner.nextLine();
           /* if(incoming.equals("stop")){    //останавливает цикл, если получено слово stop
                break;
            }*/
            if("stop".equalsIgnoreCase(incoming)){
                break;
            }
            System.out.printf("Just got '%s' text!", incoming);

        }
    }
}

