package behavioral.interpreter;

import java.util.Collection;
import java.util.List;

public interface Expression {
    public List<Integer> interpret(Collection<Character> context);
}