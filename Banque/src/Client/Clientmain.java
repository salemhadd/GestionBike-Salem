package Client;

        import common.Bike;
        import common.Compte;

        import java.rmi.RemoteException;

   //     import javax.xml.rpc.ServiceException;
/*
        import DefaultNamespace.Compte;
        import DefaultNamespace.CompteServiceLocator;
        import DefaultNamespace.CompteSoapBindingStub;
*/
public class Clientmain {

    public static void main(String[] args) /*throws ServiceException, RemoteException*/ {

        Compte c = new Compte("10236","salem","Haddad",20);
        Bike testBike = new Bike("2", "2", "vélo 2", 1);

        c.boolverisolde(testBike,"10236");

        ///houni tsir l buy product wala location

    }
}
