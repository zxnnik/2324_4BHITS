---
tags: SEW
---
```java
package at.htlhl.mulserverclient;  
  
import java.io.IOException;  
import java.io.InputStream;  
import java.io.OutputStream;  
import java.net.ServerSocket;  
import java.net.Socket;  
  
public class MulServer {  
    public MulServer() throws IOException {  
  
        // Bind the IP address and TCP port number 4711 and listen for incoming data  
        // on this address and port (ip address / host is a local one per default)        ServerSocket server = new ServerSocket(4711);  
  
        while (true) {  
            // Accept an incoming client connection  
            Socket client = server.accept();  
  
            // prepare in and out streams for read and write  
            InputStream in = client.getInputStream();  
            OutputStream out = client.getOutputStream();  
  
            // read data (factors)  
            int factor1 = in.read();  
            int factor2 = in.read();  
  
            int result = factor1 * factor2;  
  
            // write data (result of multiplication  
            out.write(result);  
  
            // close the socket connection to the client  
            client.close();  
        }  
    }  
  
    public static void main(String[] args) {  
        try {  
            new MulServer();  
        } catch (IOException ex) {  
            System.err.println("A problem with the server occured: " + ex.getMessage());  
        }  
    }  
}
```

```java
package at.htlhl.mulserverclient;  
  
import java.io.IOException;  
import java.io.InputStream;  
import java.io.OutputStream;  
import java.net.Socket;  
  
public class MulClient {  
    public MulClient() throws IOException {  
        // Create a socket connection to the specified server  
        Socket server = new Socket("localhost", 4711);  
  
        // prepare in and out streams for read and write  
        InputStream in = server.getInputStream();  
        OutputStream out = server.getOutputStream();  
  
        // write data (factors)  
        out.write(4);  
        out.write(9);  
  
        // read data (result of multiplication  
        int result = in.read();  
        System.out.println("Result: " + result);  
  
        // close the socket connection to the server  
        server.close();  
    }  
  
    public static void main(String[] args) {  
        try {  
            new MulClient();  
        } catch (IOException ex) {  
            System.err.println("The Client has a problem: " + ex.getMessage());  
        }  
    }  
}
```