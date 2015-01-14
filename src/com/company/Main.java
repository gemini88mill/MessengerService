package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Server serv = new Server();
        Client client = new Client();


        client.clientConnection();
        serv.contactServer();
    }
}
