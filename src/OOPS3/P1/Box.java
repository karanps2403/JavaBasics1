package OOPS3.P1;

class Parent{
    Parent(){
        System.out.println("I'm Parent");
    }
    void greet(){
        System.out.println("Hi");
    }

}
class child1 extends Parent{
    child1(){
        System.out.println("I'm child1");
    }
    @Override
    void greet(){
        System.out.println("Hello");
    }

}
class child2 extends Parent{
    child2(){
        System.out.println("I'm child2");
    }

}