import java.awt.*;
import java.util.ArrayList;

public class StocksClass extends Stock{
    private ArrayList<Stock> stocksArray=new ArrayList<Stock>();
    protected Stock stock;
    private String ouput="";

    public StocksClass(){
        stocksArray.add(IntelStock());
        stocksArray.add(AppleStock());
        stocksArray.add(GoogleStock());
        TradingApp.updateStocks(ouput);
    }
    public Stock IntelStock(){
        Stock intel = new Stock();
        this.name="Intel Corporation";
        this.symbol="INTC";
        this.rate= 45.67;
        ouput+=this.name+"("+ this.symbol+"): "+"\n" + "Rate:" + this.rate+"\n";
        ouput+="\n";
        return intel;
    }
    public Stock AppleStock(){
        Stock apple = new Stock();
        this.name="Apple Inc.";
        this.symbol="AAPL";
        this.rate= 165.29;
        ouput+=this.name+"("+ this.symbol+"): "+"\n" + "Rate:" + this.rate+"\n";
        ouput+="\n";
        return apple;
    }

    public Stock GoogleStock(){
        Stock google = new Stock();
        this.name="Alphabet inc";
        this.symbol="GOOG";
        this.rate= 2545.06;
        ouput+=this.name+"("+ this.symbol+"): "+"\n" + "Rate:" + this.rate+"\n";
        return google;
    }


}
