import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.webapp.WebAppContext;

/**
 * Start jetty for web app configuration.
 *
 * @author Daniel Tuerk
 */
public class HelloWorld {

    public static void main(String[] args)
            throws Exception {
        Server server = new Server(8080);
        server.setHandler(new WebAppContext("src/main/webapp", ""));
        server.start();
        server.join();
    }

}
