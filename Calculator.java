import java.rmi.*; 
public interface Calculator extends Remote
{ 
void calculatorRun()throws RemoteException; 
}