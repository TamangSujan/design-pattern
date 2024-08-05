package structural.proxy;

import structural.proxy.implementation.DatabaseInitializer;
import structural.proxy.implementation.ProxyNoteService;
import structural.proxy.implementation.UserNote;

public class ProxyLauncher {
    public static void main(String[] args) {
        DatabaseInitializer.initialize();
        ProxyNoteService proxyNoteService = new ProxyNoteService("Sujan");
        for(int loopCount=0; loopCount < 5; loopCount++){
            System.out.println(proxyNoteService.getUserNote().getDescription());
        }

        proxyNoteService.updateUserNote("Calling database to update description!");

        for(int loopCount=0; loopCount < 5; loopCount++){
            System.out.println(proxyNoteService.getUserNote().getDescription());
        }
    }
}
