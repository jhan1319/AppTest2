package edu.pucmm.eict;

import io.javalin.Javalin;
import io.javalin.plugin.rendering.JavalinRenderer;
import io.javalin.plugin.rendering.template.JavalinThymeleaf;

public class main {

    public static void main(String[] args){


        Javalin app = Javalin.create(config -> {

        }).start(8002);

        JavalinRenderer.register(JavalinThymeleaf.INSTANCE, ".html");


        app.get("/", ctx -> {

            ctx.result("Bienvenido a aplicacion 2.");


        });
    }

}
