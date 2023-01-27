package OOPS1.P2;

/**
 * THE DEFAULT CONSTRUCTOR REMAINS AS LONG AS YOU DON'T MANUALLY DEFINE A CONSTRUCTOR IN A CLASS
 *
 */
class GrandDad{
    int g1;
    int sage;
    int g2;

    public GrandDad(int g1) {
        this.g1 = g1;
    }
}
class Parent extends GrandDad{
    int p;
    
    public Parent(int g1) {
        super(g1);
    }

    public Parent(int g1, int p, int g2) {
        super(g1);
        super.g2 = g2;
        this.p = p;
    }
    int age;
}
class Child extends Parent{
    int c;
    String hobby = "Default";
    int j = super.sage;
    public Child(int g1, int c) {
        super(g1);
        this.c = c;
    }
}
public class inheritance {
    public static void main(String[] args) {
        /** This is called upcasting which is when a reference of parent type is used to reference an instance of child type
         * But the parent type reference can't access the attributes of child type instance */
        Parent p1 = new Child(3,3);
        // p1.hobby;  ---> is not allowed
        /** Java allows explicit down-casting by */
        Child c1 = (Child) p1;
        // This is done in order to ensure that we have the particular instance in case we want to perform some particular function
        if(p1 instanceof Child) System.out.println(c1.hobby);
        ;
    }
}
