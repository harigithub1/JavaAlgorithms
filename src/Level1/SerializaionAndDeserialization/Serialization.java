package Level1.SerializaionAndDeserialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serialization {
    public static void main (String args[]) throws IOException {
        Emp emp = new Emp();
        emp.name = "hari";
        emp.address = "hyd";
        FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\user\\Desktop\\serializationdata.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(emp);
        objectOutputStream.close();
        fileOutputStream.close();
        System.out.println("serialized data is stored in C:\\Users\\user\\Desktop\\serializationdata.txt");
    }
}
