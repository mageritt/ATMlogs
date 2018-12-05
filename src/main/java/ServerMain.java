import server.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ServerMain {
    public static void main(String[] args) throws IOException {
        IStorage storage1 = new StorageFile("data");
        IStorage storage2 = new StorageBase("data/atm.db");
        Socketor socketor = new Socketor(8000);
        Context context = new Context();
        Logs obj = new Logs();


        System.out.println("Laukiame klientu prisijungima");
        while (true) {
            socketor.accept();
            System.out.println("Klientas prisijunge");
            List<String> request = socketor.getRequest();
            String response = context.execute(storage2, request);
            socketor.sendResponse(response);
            try { Thread.sleep(500); } catch (InterruptedException e) { }
            socketor.closeClient();
            System.out.println(request.get(0));
            System.out.println(response);
            obj.loger(request.get(0));
            obj.loger(request.get(1));
            obj.loger(response);
            obj.createLog(request.get(0));
            obj.createLog(request.get(1));
            obj.createLog(response);
            obj.log(request.get(0));
            obj.log(request.get(1));
            obj.log(response);
        }
    }
}
