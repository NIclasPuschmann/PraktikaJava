import java.net.*;
import java.io.*;
import java.util.*;
import java.lang.*;

public class Server {
    public static void main(String argv[]) throws IOException {
        
        //ServerSocket(int port)
        //Creates a server socket, bound to the specified port.
        ServerSocket ss = new ServerSocket(Integer.parseInt(argv[0]));

        while(true) new TinyServerConn(ss.accept());
    }
}