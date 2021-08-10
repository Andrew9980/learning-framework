package com.andrew.test.bio.multi;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class ClientMultiPrint {

    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1", 9999);
        OutputStream outputStream = socket.getOutputStream();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String msg = scanner.nextLine();
            PrintStream printStream = new PrintStream(outputStream);
            printStream.println(msg);
            printStream.flush();
        }
    }

}
