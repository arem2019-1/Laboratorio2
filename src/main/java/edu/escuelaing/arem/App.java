package edu.escuelaing.arem;

import static spark.Spark.*;

/**
 * Hello world!
 *
 */
public class App {

    public static void main(String[] args) {
        get("/hello", (req, res) -> "Hello Heroku");
        System.out.println("Hello World!");
    }

    static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567; //returns default port if heroku-port isn't set
        //(i.e.on localhost)
    }

}
