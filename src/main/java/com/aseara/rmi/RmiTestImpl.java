package com.aseara.rmi;

import java.rmi.RemoteException;

/**
 * Created with IntelliJ IDEA.
 * User: aseara
 * Date: 2014/6/9
 * Time: 13:55
 */
public class RmiTestImpl implements RmiTestInterface {
    @Override
    public String getTest() throws RemoteException {
        return "Hello, Test";
    }
}
