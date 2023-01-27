package OOPS1.P2;
//SINGLETON CLASS
class SingleTon{
    private SingleTon(){}
    private static SingleTon instance;

    public static SingleTon getInstance() {
        if(instance==null){
            return instance = new SingleTon();
        }
        return instance;
    }
}
public class Main {

    public static void main(String[] args) {
        Main m = new Main();
        System.out.println();
        System.out.println(SingleTon.getInstance());
        System.out.println(SingleTon.getInstance());
    }
}
