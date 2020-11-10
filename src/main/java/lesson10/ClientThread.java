package lesson10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class ClientThread {

    private static Socket socket = null;
    private static BufferedReader in = null;
    private static PrintWriter out = null;

    public static void main(String[] args) throws IOException {
        final String SERVER_ADDR = "localhost";
        final int SERVER_PORT = 8080;

        try {
            socket = new Socket(SERVER_ADDR, SERVER_PORT);
            in = new BufferedReader(new InputStreamReader(socket.getInputStream(), StandardCharsets.UTF_8));
            out = new PrintWriter(socket.getOutputStream());
            System.out.println("Enter a message:");
            new Thread() {
                @Override
                public void run() {
                    try {
                        while (true) {
                            String strFromServer;
                            if ((strFromServer = in.readLine()) != null) {
                                System.out.println("Server: " + strFromServer);
                            }
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }.start();

            new Thread() {
                @Override
                public void run() {
                    try {
                        while (true) {
                            Scanner scn = new Scanner(System.in);
                            String strClient = scn.nextLine();
                            if (strClient.equals("/end")) {
                                break;
                            }
                            out.println(strClient);
                            out.flush();
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }.start();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
