package creational.factory;
import creational.singleton.SingletonCS;

//Product abstract class and concrete products.
public abstract class Degree{
    String type;
    String major;
    public abstract void major(String major);
    public String getType(){ return type;}
    public String getMajor(){ return major;}
}

class Undergraduate extends Degree{
    public void major(String major) {
        type = "Undergraduate Degree (B.S.)";

        this.major = major;
        int years = 4;
        SingletonCS.getInstance().addDegree(this);
        System.out.println(type + " created: " + major + ", " + years + " years.");
    }
}

class Graduate extends Degree{
    public void major(String major) {
        type = "Graduate Degree (M.S.)";

        this.major = major;
        int years = 2;
        SingletonCS.getInstance().addDegree(this);
        System.out.println(type + ": " + major + ", " + years + " years.");
    }
}

class Certificate extends Degree{
    public void major(String concentration) {
        type = "Certificate";

        this.major = concentration;
        SingletonCS.getInstance().addDegree(this);
        System.out.println(type + " created: " + major);
    }
}

