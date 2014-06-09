package com.aseara.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Created with IntelliJ IDEA.
 * User: aseara
 * Date: 2014/6/9
 * Time: 13:53
 */
public interface RmiTestInterface extends Remote {
    public String getTest() throws RemoteException;
}
