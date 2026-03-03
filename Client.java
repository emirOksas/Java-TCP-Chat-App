import java.io.*;
import java.net.*;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws Exception {
        // Direkt kendi bilgisayarımıza (localhost) bağlanması için 127.0.0.1 yazdık
        Socket socket = new Socket("127.0.0.1", 59001);
        Scanner scanner = new Scanner(System.in);
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

        new Thread(() -> {
            try {
                String serverResponse;
                while ((serverResponse = in.readLine()) != null) {
                    System.out.println("Sunucudan: " + serverResponse);
                }
            } catch (IOException e) {
                System.out.println("Bağlantı kesildi.");
            }
        }).start();

        System.out.println("Mesajınızı yazın (Çıkmak için 'quit'): ");
        while (scanner.hasNextLine()) {
            String message = scanner.nextLine();
            if ("quit".equalsIgnoreCase(message)) {
                break;
            }
            out.println(message);
        }
        
        socket.close();
        scanner.close();
    }
}
