package Meherun.CEO;

import Meherun.Client.Client;
import Meherun.Client.Event;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.time.LocalDate;

public class DummyObjects {
    public void createDummyObjects() {
        CEO c1 = new CEO("123", "Charles", "charles@gmail.com", "01888276376", "CEO", "ceoDuh", LocalDate.of(2020, 6, 10), "T1005");
        try {
            FileOutputStream fos = new FileOutputStream("CEO.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(c1);
            oos.close();
        } catch (Exception e) {
            //
        }
        Client cl1 = new Client("1234", "Aaron", "aaron@gamil.com", "01465728234", "Client", "clientDuh", "South Banasree", "Male");
        try {
            FileOutputStream fos1 = new FileOutputStream("Client.bin");
            ObjectOutputStream oos1 = new ObjectOutputStream(fos1);

            oos1.writeObject(cl1);
            oos1.close();
        } catch (Exception e) {
            //
        }

        Event e1 = new Event( "1234", "Aaron", "08947653", "Event1", "Sports", "jnbwuagefvhuedb", "Ronron", "hufh", "ncuaegf", LocalDate.of(2020, 6, 10), LocalDate.of(2020, 6, 19));
        e1.setEventStatus("Completed");
        Event e2 = new Event( "1234", "Aaron", "08947653", "Event2", "Sports", "jnbwuagefvhuedb", "Ronron", "hufh", "ncuaegf", LocalDate.of(2020, 7, 10), LocalDate.of(2020, 7, 19));
        e2.setEventStatus("Completed");
        Event e3 = new Event( "1234", "Aaron", "08947653", "Event3", "Concert", "jnbwuagefvhuedb", "Ronron", "hufh", "ncuaegf", LocalDate.of(2020, 6, 10), LocalDate.of(2020, 6, 19));
        e3.setEventStatus("Completed");
        Event e4 = new Event( "1234", "Aaron", "08947653", "Event4", "Exhibition", "jnbwuagefvhuedb", "Ronron", "hufh", "ncuaegf", LocalDate.of(2020, 6, 10), LocalDate.of(2020, 6, 19));
        e4.setEventStatus("Completed");
        Event e5 = new Event( "2345", "Juliette", "08947653", "Event5", "Sports", "jnbwuagefvhuedb", "Ronron", "hufh", "ncuaegf", LocalDate.of(2025, 12, 15), LocalDate.of(2025, 12, 19));
        e2.setEventStatus("Approved");
        Event e6 = new Event( "3456", "Nazira", "08947653", "Event6", "Concert", "jnbwuagefvhuedb", "Ronron", "hufh", "ncuaegf", LocalDate.of(2026, 1, 5), LocalDate.of(2026, 5, 8));
        e3.setEventStatus("Approved");
        Event e7 = new Event( "2567", "Kenzi", "08947653", "Event7", "Concert", "jnbwuagefvhuedb", "Ronron", "hufh", "ncuaegf", LocalDate.of(2026, 1, 10), LocalDate.of(2026, 1, 14));
        e4.setEventStatus("Approved");

        GenericFileManager.append(e1, "Events.bin");
        GenericFileManager.append(e2, "Events.bin");
        GenericFileManager.append(e3, "Events.bin");
        GenericFileManager.append(e4, "Events.bin");
        GenericFileManager.append(e5, "Events.bin");
        GenericFileManager.append(e6, "Events.bin");
        GenericFileManager.append(e7, "Events.bin");

        CapExBudget capEx1 = new CapExBudget("HalfYearly","Maintenance, Tax, Salary", "11","Pending",200000,LocalDate.of(2025, 12, 1));
        CapExBudget capEx2 = new CapExBudget("Quarterly","Electricity bill, Vendors", "22","Approved",100000,LocalDate.of(2025, 11, 1));
        CapExBudget capEx3 = new CapExBudget("HalfYearly","Employee Salary, Renovation", "33","Pending",800000,LocalDate.of(2025, 12, 5));

        GenericFileManager.append(capEx1, "CapExBudget.bin");
        GenericFileManager.append(capEx2, "CapExBudget.bin");
        GenericFileManager.append(capEx3, "CapExBudget.bin");


    }
}
