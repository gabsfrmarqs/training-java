public class functions {

    public static void saySomething(int param){
        System.out.println("ayo");
        if (param == 39){
            System.out.println("OOO EEE OOO");
        }else{
            System.out.println("lelelele");
        }
    }

    public static int number(){
        return 39;
    }

    public static void main(String[] args){
        saySomething(39);
        System.out.println(number());
    }
}
