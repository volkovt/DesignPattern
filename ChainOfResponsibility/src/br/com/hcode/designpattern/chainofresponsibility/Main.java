package br.com.hcode.designpattern.chainofresponsibility;

import br.com.hcode.designpattern.chainofresponsibility.middlewares.CheckPermissionMiddleware;
import br.com.hcode.designpattern.chainofresponsibility.middlewares.CheckUserMiddleware;
import br.com.hcode.designpattern.chainofresponsibility.middlewares.Middleware;
import br.com.hcode.designpattern.chainofresponsibility.server.Server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    private static final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static Server server;

    public static void init() {
        server = new Server();
        server.registerUser("master@hcode.com.br", "182398as9dawheaejh");
        server.registerUser("user@hcode.com.br", "123456");

        Middleware middleware = new CheckUserMiddleware(server);
        middleware.linkWith(new CheckPermissionMiddleware());

        server.setMiddleware(middleware);
    }
    public static void main(String[] args) throws IOException {
	    init();

        boolean done;

        do {
            System.out.println("Digite o email: ");
            String email = reader.readLine();
            System.out.println("Digite a sua senha: ");
            String password = reader.readLine();
            done = server.login(email, password);
        }while(!done);
    }
}
