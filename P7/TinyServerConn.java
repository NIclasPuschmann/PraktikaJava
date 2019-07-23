import java.net.*;
import java.io.*;
import java.util.*;
import java.lang.*;


public class TinyServerConn extends Thread {
    Socket sock;
    TinyServerConn(Socket s) {
        sock=s;

        //Causes this thread to begin execution; the Java Virtual Machine calls
        //the run method of this thread.
        start();
    }
    public void run() {
        try {
            String Command = null;
            String req="",S;
            byte buf[] = new byte[128];

            System.out.println("Socket.localPort: "+sock.getLocalPort()+" Socket.port: "+sock.getPort());

            BufferedReader BR = new BufferedReader(new InputStreamReader(sock.getInputStream()));
            // Find die Zeile, die mit GET beginnt!
            while(!(S = BR.readLine()).startsWith("GET")); req=S;
            System.out.println("Request: "+req);

            StringTokenizer st = new StringTokenizer(req);

            if((st.countTokens()>=2) && (Command=st.nextToken()).equals("GET")) {
                
                OutputStream out = sock.getOutputStream();
                if ((req = st.nextToken()).startsWith("/"))req = req.substring(1);
                
                System.out.println("File to send: "+req);
                File F = new File(req);

                if (F.exists() && F.canRead() && F.isFile()) {
                    
                    FileInputStream fis = new FileInputStream(req);
                    int len;
                    while ((len=fis.read(buf))!=-1) System.out.write(buf,0,len);
                } 
                else {
                    System.out.println("Message from Server: " +req+" not found or not readable or no File");
                }
                

                sock.shutdownOutput();
            }

            System.out.println("ready");
            //while((buf = BR.readLine())!=null) System.out.println(buf); System.out.println(buf);
            sock.close();
        } catch(IOException e) {
            System.out.println("I/O Error "+e);
            System.out.println("Message from Server "+e);
            try {
                sock.shutdownOutput();
                sock.close();
            } catch(Exception xyz) {}
        }
    }
}