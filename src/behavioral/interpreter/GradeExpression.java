package behavioral.interpreter;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class GradeExpression implements Expression {
    List<Integer> gradesInt = new ArrayList<>();
    public List<Integer> interpret(Collection<Character> context){
        for(Character c: context){
            if(c == 'A'){ gradesInt.add(4);}
            else if(c == 'B'){ gradesInt.add(3);}
            else if(c == 'C'){ gradesInt.add(2);}
            else if(c == 'D'){ gradesInt.add(1);}
            else{ gradesInt.add(0);}
        }
        return gradesInt;
    }
}
