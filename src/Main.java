import com.example.rmitest.Text;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ServerSocket ss = new ServerSocket(7777);
        while (true) {
            try {
                Socket socket = ss.accept();
                ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
                Text t = (Text) ois.readObject();
                System.out.println(t.getText());
                socket.close();
            } catch (Exception e) {
                e.printStackTrace();
                return;
            }
        }
        //ss.close();
    }
}
