import java.math.BigDecimal;
import java.math.RoundingMode;

public class Trading extends Wallet {


    public String getWallet(){
        String output="";
        double Money = ConvertTwoDP(this.getMyGBP());
        output+=("GBP: " + Money + "\n");
        output+="Intel Corporation:";
        output+=(String.format("%.12f",this.getMyINTC()));
        output=output + ("\n");
        output+="Apple inc.:";
        output+=(String.format("%.12f",this.getMyAAPL()));
        output=output + ("\n");
        output+="Alphabet inc:";
        output+=(String.format("%.12f",this.getMyGOOG()));
        output=output + ("\n");
        return output;

    }
    public double ConvertTwoDP(double amount){
        BigDecimal converted = new BigDecimal(amount);
        converted=converted.setScale(2, RoundingMode.HALF_DOWN);
        return converted.doubleValue();
    }
}
