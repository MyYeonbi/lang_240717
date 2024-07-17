package lang.object;

import lang.Child;
import lang.Parent;

import javax.print.attribute.standard.MediaSize;

public class ObjectMain {
    public static void main(String[] args) {
        Parent parent = new Parent();
        Child child = new Child();

        Parent child2 = new Child();
        OtherParent otherParent = new OtherParent();

        Object[] parents = {parent, child, otherParent};

        System.out.println(otherParent.toString());
        parent.toString();
    }
}
