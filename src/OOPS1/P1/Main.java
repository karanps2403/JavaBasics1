package OOPS1.P1;
import java.util.*;
// USE OF STATIC KEYWORD FOR PRIMITIVES
class staticCounter{
    static int count;
    staticCounter(){
        /** Make it a convention to represent static members with class name and not "this"*/
        staticCounter.count++;
    }
}
public class Main {
    // WHY MAIN IS STATIC ...
    // To run a non-static member an object has to be created and to run a program we need to run main first
    // therefore main has to be run without creating an object and the only way to do so is to declare main
    // as STATIC. 
    public static void main(String[] args) {
        /**
         USE OF FINALS
         -> All the primitives when declared FINAL can't be modified
         -> All the objects when declared final can't be referenced to another object
         -> finalize() methods in classes are the functions in which we can specify what will happen when an
         object is destroyed
         */

    }
}
