package server;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.List;

public interface IStrategy {
    String execute(List<String> request) throws IOException, URISyntaxException;
}
