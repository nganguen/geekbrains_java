package lesson10;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class ClientDemo {

    public static void main(String[] args) throws IOException {
        final String SERVER_ADDR = "localhost";
        final int SERVER_PORT = 8080;

        DataOutputStream out = null;

        try (Socket socket = new Socket(SERVER_ADDR, SERVER_PORT)) {
            out = new DataOutputStream(socket.getOutputStream());
            System.out.println("Enter a message:");
            while (true) {
                Scanner scn = new Scanner(System.in);
                String strClient = scn.nextLine();
                if (strClient.equals("/end")) {
                    break;
                }
                out.writeUTF(strClient);
                out.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            out.close();
        }
    }
}
