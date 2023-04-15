public class Stock {
    protected String name;
    protected String symbol;
    protected Double rate;
    public Stock(){
        this.name="";
        this.symbol="";
        this.rate=null;
    }

    public String getName() {
        return name;
    }

    public String getSymbol() {
        return symbol;
    }

    public Double getRate() {
        return rate;
    }

}


