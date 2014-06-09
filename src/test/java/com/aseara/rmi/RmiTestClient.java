package com.aseara.rmi;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 * Created with IntelliJ IDEA.
 * User: aseara
 * Date: 2014/6/9
 * Time: 14:01
 */
public class RmiTestClient {

    public static void main(String[] args)
            throws RemoteException {
        Registry registry = LocateRegistry.getRegistry("localhost", 2001);
        try {
            RmiTestInterface t = (RmiTestInterface)registry.lookup("test");
            System.out.println("client: " + t.getTest());
        } catch (NotBoundException e) {
            e.printStackTrace();
        }

    }
}
