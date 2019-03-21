public class Calculator {
    // inside the class - outside the methods with static keyword
    static int a =30;
    static int b =10;
    static void add(){
        System.out.println(a+b);
    }
    static void sub(){ System.out.println(a-b);
    }
    static void multiply(){ System.out.println(a*b);

    }
    static void divide(){
        System.out.println(a/b);
    }
    // java main method
    public static void main(String[]args){
        add();
        sub();
        multiply();
        divide();
    }

}
