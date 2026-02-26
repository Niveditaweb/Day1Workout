class Bank{
   private int balance;
   public int getBalance(){
    return balance;
   } 
   public void setBalance(int balance){
    this.balance=balance;
   }
}public class Encapsulation {
    public static void main(String[] args) {
        Bank b1=new Bank();
        b1.setBalance(1000);
        Bank b2=new Bank();
        b2.setBalance(100);
        System.out.println(b2.getBalance());
        System.out.println(b1.getBalance());
    }
}
