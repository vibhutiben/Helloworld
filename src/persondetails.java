

public class persondetails {

     String name ="Shrey kanani";
     int age = 22;
     String address ="64 Rudherford,new jersy,usa";
     String  dob = "19/9/1995";
// user define method  no return types no parameter
    static void name(){
        System.out.println("shrey kanani");
    }
    static void age (){ System.out.println(22);
    }
    static void address (){
        System.out.println("64,rudherford,new jersy,usa");
    }
    static void dob (){ System.out.println("19/9/1995");
    }
    // java main method
    public static void main(String[]args){
        name();
        age();
        address();
        dob();
    }


}
