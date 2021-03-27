package edu.pucmm.eict;

import io.javalin.Javalin;

public class main {

    public static void main(String[] args){

        Javalin app = Javalin.create(config -> {
        }).start(8002);
        app.get("/", ctx -> {

            ctx.result("Bienvenido a aplicacion 2");


        });
    }

}
