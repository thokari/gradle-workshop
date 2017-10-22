import static spark.Spark.*;

public class AppStart {

    public static void main(String[] args) {

        staticFiles.location("/public");

        get("/hello", (req, res) -> "Hello World");
    }
}
