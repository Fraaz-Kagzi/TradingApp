public class StockTrading extends Trading{
    public String BuyIntel(int amount){
        if(amount <= this.getMyGBP()){
            double bought = ConvertTwoDP(amount*45.67);
            this.myINTC += amount;
            this.myGBP -= bought ;
            return ("Bought: " +amount+" shares of Intel Corporation for: £"+bought);
        }
        else return "Not enough GBP to buy this amount";

    }
    public String BuyApple(int amount){
        if(amount <= this.getMyGBP()){
            double bought = ConvertTwoDP(amount*165.29);
            this.myAAPL += amount;
            this.myGBP -= bought;
            return ("Bought: " +amount+" shares of Apple inc for: £"+bought);
        }
        else return "Not enough GBP to buy this amount";
    }
    public String BuyGoogle(int amount){
        if(amount <= this.getMyGBP()){
            double bought = ConvertTwoDP(amount*2545.06);
            this.myGOOG += amount;
            this.myGBP -= bought;
            return ("Bought: " +amount+" shares of Alphabet inc for: £"+bought);
        }
        else return "Not enough GBP to buy this amount";

    }
    public String SellIntel(double amount) {
        if(amount <= this.getMyINTC()){
            double soldConvert = amount*45.67 ;
            String amountString = (String.format("%.12f",amount));
            this.myGBP += soldConvert;
            this.myINTC -= amount;
            String output = "Sold: " + amountString +" Intel for: £";
            output+=(ConvertTwoDP(soldConvert));
            return output;
        }
        else return "You don't have this many shares of Intel Cooperation ";
    }
    public String SellApple(double amount) {
        if(amount <= this.getMyAAPL()){
            double soldConvert = amount*45.67 ;
            String amountString = (String.format("%.12f",amount));
            this.myGBP += soldConvert;
            this.myAAPL -= amount;
            String output = "Sold: " + amountString +" Apple for: £";
            output+=(ConvertTwoDP(soldConvert));
            return output;
        }
        else return "You don't have this many shares of Apple inc ";
    }
    public String SellGoogle(double amount) {
        if(amount <= this.getMyGOOG()){
            double soldConvert = amount*45.67 ;
            String amountString = (String.format("%.12f",amount));
            this.myGBP += soldConvert;
            this.myGOOG -= amount;
            String output = "Sold: " + amountString +" google for: £";
            output+=(ConvertTwoDP(soldConvert));
            return output;
        }
        else return "You don't have this many shares of Alphabet inc ";
    }
}

