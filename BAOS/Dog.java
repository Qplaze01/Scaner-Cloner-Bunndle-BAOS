import java.io.Serializable;

public class Dog implements Serializable , Cloneable {
    private String name;
    private int age;
    private Owner owner;

    public Dog() {
    }

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Dog(Dog dog) {
        name = dog.getName();
        age = dog.getAge();
        owner = new Owner(dog.owner);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
    	this.name = name;
    }

    public int getAge() {
    	return age;
    }

    public void setAge(int age) {
    	this.age = age;
    }

    public Owner getOwner() {
    	return owner;
    }

    public void setOwner(Owner owner) {
    	this.owner = owner;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Owner cloneOwner = (Owner) owner.clone();
        Dog cloneDog = (Dog) super.clone();
        cloneDog.setOwner(cloneOwner);

        return cloneDog;
    }

    @Override
    public String toString() {
        return "Dog [name=" + name + ", age=" + age + ", owner=" + owner + "]";
    }
}
