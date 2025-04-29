package Level1.SerializaionAndDeserialization;

import java.io.*;

public class Deserialization {
    public static void main(String args[]) throws IOException, ClassNotFoundException {
        Emp emp;
        FileInputStream fileInputStream = new FileInputStream("C:\\Users\\user\\Desktop\\serializationdata.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        emp = (Emp) objectInputStream.readObject();
        objectInputStream.close();
        fileInputStream.close();
        System.out.println("serialized data name: " + emp.name);
        System.out.println("serialized data address: " + emp.address);
    }
}