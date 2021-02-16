import java.net.Socket;
import java.net.ServerSocket;

public class EchoServer {

    // Can't default to 7 as root permission required
    public static int DEFAULT_PORT = 7777;

    public static void main(String... args) {

        System.out.println("Echo server started");
    }
}
