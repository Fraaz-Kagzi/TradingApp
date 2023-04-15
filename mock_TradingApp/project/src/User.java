public class User extends UserName implements ProfileActions {
    private Profile ua;

    public User(String name){
        super(name);
        this.ua=new Profile();
    }
    public String deposit(int amount){
        return this.ua.deposit(amount);
    }
    public String withdraw(int amount){
        return this.ua.withdraw(amount);
    }

    public String getWallet(){
        String output="";
        output += (this.getName() +"\n");
        output += ua.getWallet();
        return output;
    }
    public String BuyIntel(int amount){
        return ua.BuyIntel(amount);
    }
    public String BuyApple(int amount){
        return ua.BuyApple(amount);
    }
    public String BuyGoogle(int amount){
        return ua.BuyGoogle(amount);
    }
    public String SellIntel(double amount){
        return ua.SellIntel(amount);
    }
    public String SellApple(double amount){
        return ua.SellApple(amount);
    }
    public String SellGoogle(double amount){
        return ua.SellGoogle(amount);
    }



}
