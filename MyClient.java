import java.rmi.*; 
import java.rmi.registry.*;
public class MyClient
{ 
public static void main(String args[])
{ 
try
{
Calculator st=(Calculator)
Naming.lookup("rmi://localhost:8000"+"/cal"); 
System.out.println("Successfully Connected! using RMI");
st.calculatorRun(); 
System.out.println("This is Calculator"); }
catch (Exception e)
{
System.err.println("Client Side exception: " + e.toString()); 
 e.printStackTrace();
} 
} 
} 