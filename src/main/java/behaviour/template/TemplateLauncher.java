package behaviour.template;

import behaviour.template.implementation.ESewaGateway;
import behaviour.template.implementation.Gateway;
import behaviour.template.implementation.KhaltiGateway;

public class TemplateLauncher {
    public static void main(String[] args) {
        Gateway eSewa = new ESewaGateway();
        Gateway khalti = new KhaltiGateway();
        eSewa.transact();
        khalti.transact();
    }
}
