package com.aseara.rmi;

import java.nio.channels.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

/**
 * Created with IntelliJ IDEA.
 * User: aseara
 * Date: 2014/6/9
 * Time: 13:56
 */
public class RmiTestServer {

    public static void main(String[] args)
            throws AlreadyBoundException, RemoteException {
        RmiTestImpl t = new RmiTestImpl();
        RmiTestInterface tt = (RmiTestInterface) UnicastRemoteObject.exportObject(t, 0);
        // Bind the remote object's stub in the registry
        Registry registry = LocateRegistry.createRegistry(2001);
        registry.rebind("test", tt);
        System.out.println("server is start");
    }
}
