package com.mycompany.calculadora.rmi;  // MISMO package que el servidor

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Calculadora extends Remote {
    double add(double a, double b) throws RemoteException;
    double subtract(double a, double b) throws RemoteException;
    double multiply(double a, double b) throws RemoteException;
    double divide(double a, double b) throws RemoteException;
    String getMessage() throws RemoteException;
}