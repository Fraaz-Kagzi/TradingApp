public class Profile extends StockTrading implements ProfileActions {
    private Wallet wallet;

    public Profile(){
        this.wallet=new Wallet();
    }
    Profile(int amount){
        this.myGBP =amount;
    }

    public String deposit(int amount){
        this.myGBP += ConvertTwoDP(amount);
        return ("£"+amount+" deposited in to account");
    }

    public String withdraw(int amount) {
        if (amount <= this.getMyGBP()) {
            this.myGBP -= amount;
            return ("£"+amount+" withdrawn from account");
        }
        else return "You don't have enough to withdraw this amount";

    }


}
