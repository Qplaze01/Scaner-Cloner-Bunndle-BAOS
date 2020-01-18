import java.io.Serializable;

public class Owner implements Serializable,Cloneable {
    private String name;

    public Owner() {
    }

    public Owner(Owner owner) {
        name = owner.getName();
    }

    public Owner(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
    	return "Owner [name=" + name + "]";
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        // TODO Auto-generated method stub
        return super.clone();
    }
}
