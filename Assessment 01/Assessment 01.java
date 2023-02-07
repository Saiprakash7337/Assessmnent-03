public class User {

  int id;
  String username;
  double walletBalance ;
  String email;    
      
  public int getId() {
    return id;
  }


  public void setId(int id) {
    this.id = id;
  }


  public String getUsername() {
    return username;
  }


  public void setUsername(String username) {
    this.username = username;
  }
  
  public String getEmail() {
    return email;
  }


  public void setEmail(String email) {
    this.email = email;
  }

  public double getWalletBalance() {
    return walletBalance;
  }


  public void setWalletBalance(double walletBalance) {
    this.walletBalance = walletBalance;
  }


    public void makePayment(double billAmount)
    {
      double balance;
      balance = getWalletBalance();
      
      if(billAmount < balance)
        System.out.println(" Sorry "+getId()+"not enough balance to make payment");
      else
      {
        balance-=billAmount;
        System.out.println("Congratulations "+getId()+"paymnet of "+billAmount+" was successfull");
        System.out.println("Your wallet balance is "+balance);
      }
      
    }
    
    
    
  }
  
  class KYCUser extends User{
    
    public void makePayment(double billAmount)
    {
      int rewaredPoints =(int) Math.ceil( billAmount * 0.1) ;
      double balance;
      balance = getWalletBalance();
      
      if(billAmount < balance)
        System.out.println(" Sorry "+getId()+"not enough balance to make payment");
      else
      {
        balance-=billAmount;
        System.out.println("Congratulations "+getId()+"paymnet of "+billAmount+" was successfull");
        System.out.println("Your wallet balance is "+balance);
        System.out.println("You have "+rewaredPoints+" reward points");
      }
      
    }
  }}
