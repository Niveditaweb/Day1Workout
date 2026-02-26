public class method {
    static void printing(){
        System.out.println("Hello World");
    }
    static void sum(int a,int b){
     System.out.println(a+b);
    }
    static int print(){
        return 0;
    }
    static int add(int c,int d){
        return c+d;
    }
    public static void main(String[] args) {
        printing();
        sum(10,20);
        System.out.println(print());
        System.out.println(add(35,89));
    }
    
}
