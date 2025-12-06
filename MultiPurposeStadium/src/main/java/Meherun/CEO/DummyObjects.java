package Meherun.CEO;

import Meherun.Client.Client;

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
    }
}
