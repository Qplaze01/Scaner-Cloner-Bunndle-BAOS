import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class CloneDogMain {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Dog dog = new Dog("Krevedko", 3);
        Owner owner = new Owner("Alex");
        dog.setOwner(owner);

        try {
            //Dog cloneDog=(Dog)dog.clone();
            Dog cloneDog = new Dog(dog);
            owner.setName("Max");

            System.out.println(dog);
            System.out.println(cloneDog);
        } catch (Exception e) {
            e.printStackTrace();
        }

        /*ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(dog);

        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bais);
        Dog cloneDog = (Dog) ois.readObject();*/

        //System.out.println(cloneDog);
    }
}
