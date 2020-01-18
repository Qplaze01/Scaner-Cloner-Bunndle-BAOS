import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class DogMain {

    public static void main(String[] args) {
        Dog dog = new Dog("Susleg", 4);
        System.out.println(dog);

        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream("dog.bin"));) {
            dos.writeUTF(dog.getName());
            dos.writeInt(dog.getAge());
            System.out.println("Record complete...");
        } catch (Exception e) {
            e.printStackTrace();
        }

        try (DataInputStream dos = new DataInputStream(new FileInputStream("dog.bin"));) {
            Dog dogCopy = new Dog(dos.readUTF(),
                    dos.readInt());
            System.out.println(dogCopy);
            System.out.println("Read complete...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
