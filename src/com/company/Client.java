package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

/**
 * Created by raphael on 1/13/15.
 */
public class Client {

    public void clientConnection(){

        Socket sock = null;
        try {
            sock = new Socket("localhost", 1234);
            BufferedReader in = new BufferedReader(new InputStreamReader(sock.getInputStream()));
            System.out.println("received String");

            while (!in.ready()){

            }
            System.out.println(in.readLine());
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Connection Failed");
        }



    }
}
