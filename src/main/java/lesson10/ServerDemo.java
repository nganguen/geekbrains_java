package lesson10;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo {

    public static void main(String[] args) throws IOException {
        Socket socket = null;
        DataInputStream in = null;

        try (ServerSocket serverSocket = new ServerSocket(8080)) {
            System.out.println("Сервер запущен, ожидаем подключения...");
            socket = serverSocket.accept();
            System.out.println("Клиент подключился");
            in = new DataInputStream(socket.getInputStream());
            while (true) {
                String strClient = in.readUTF();
                System.out.println("Client: " + strClient);
                if (strClient.equals("/end")) {
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            socket.close();
            in.close();
        }
    }
}
