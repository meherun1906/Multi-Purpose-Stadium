package Zarin.MaintenanceManager;

import Zarin.HeadOfSecurity.DummyObjects;
import Zarin.HeadOfSecurity.HeadOfSecurity;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class DummyObject {
    public static void main (String[] args){
        new DummyObject().createDummyObjects();
    }
    public void createDummyObjects(){
        MaintenanceManager mm = new MaintenanceManager("123456","Marry","marry@gmail.com","+12345634","MaintenanceManager","mm123");
        try{
            FileOutputStream fos = new FileOutputStream("Maintenance.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(mm);
            oos.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
