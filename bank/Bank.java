package bank;

class Account1{
   public String name;
   protected String email;
   private String password;

   public String getPassword() {
       return this.password;
   }


   public void setPassword(String password) {
       this.password = password;
   
}


}

public class Bank {
    public static void main(String args[]) {
       Account1 a1 = new Account1();
       a1.name = "Apna College";
       a1.setPassword("abcd");
       a1.email = "hello@apnacollege.com";

       System.out.println("Name: " + a1.name);
       System.out.println("Email: " + a1.email);
       System.out.println("Password: " + a1.getPassword()); // This will now work because we're using the getter method

   }

}
