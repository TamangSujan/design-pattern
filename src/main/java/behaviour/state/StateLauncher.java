package behaviour.state;

import behaviour.state.implementation.*;

public class StateLauncher {
    public static void main(String[] args) {
        User ram = new BlogUser();
        Document ramDocument = new BlogDocument(ram);

        User shyam = new BlogUser();
        Document shyamDocument = new BlogDocument(shyam);

        ramDocument.write("Hello, its me Ram!");
        shyamDocument.write("Hello, its me Shyam!");

        shyamDocument.readBy(ram);
        ramDocument.readBy(ram);

        State published = new PublishedState();
        shyamDocument.updateState(published);

        shyamDocument.write("Adding extra after published!");
        shyamDocument.readBy(ram);
    }
}
