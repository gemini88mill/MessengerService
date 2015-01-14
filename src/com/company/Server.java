package com.company;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by raphael on 1/13/15.
 */
public class Server {



    public void contactServer(){
        String data = "test";

        ServerSocket serv = null;
        try {
            serv = new ServerSocket(1234);
            Socket skt = serv.accept();
            System.out.println("Server Connected");
            PrintWriter out = new PrintWriter(skt.getOutputStream(), true);
            System.out.println("Sending string: '" + data);
            out.print(data);
            out.close();
            skt.close();
            serv.close();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Connection Failed");
        }

    }
}
