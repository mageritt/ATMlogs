package server;
import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;


public class Message {

    public void openBrowser() throws IOException, URISyntaxException {
        URI uri = new URI("https://www.lightsms.com/external/get/send.php?login=RitaGembutait&signature=a2829a598da2c2d722e7e02e278a426d&phone=37067336285&text=Hello%21&sender=smstest&timestamp=1543997674");
        Desktop dt = Desktop.getDesktop();
        dt.browse(uri);}

    }

