package structural.composite;

import java.util.ArrayList;
import java.util.List;

//Composite/container that can can contain sub-elements (sub-concentrations). In this case, other concentrations, creating a hierarchical structure.
public class BossConcentration extends Concentration {
    String name;
    String description;
    List<Concentration> concentrations = new ArrayList<>();

    public BossConcentration(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public void add(Concentration concentration) {
        concentrations.add(concentration);
    }

    public void remove(Concentration concentration) {
        concentrations.remove(concentration);
    }


    public String format() {
        System.out.println(name + ": " + description);
        StringBuilder str = new StringBuilder();
        System.out.println("\nSub Concentrations and descriptions: ");

        for (Concentration c : concentrations) {
            str.append(c.format() + "\n");
        }
        return str.toString();
    }
}
