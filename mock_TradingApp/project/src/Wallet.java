public class Wallet {
    protected double myGBP;
    protected double myINTC;
    protected double myAAPL;

    protected double myGOOG;
    public Wallet(){
        this.myGBP =0;
        this.myINTC =0;
        this.myAAPL=0;
        this.myGOOG=0;
    }

    public double getMyGBP(){
        return this.myGBP;
    }

    public double getMyINTC() {
        return this.myINTC;
    }

    public double getMyAAPL() {return myAAPL;}

    public double getMyGOOG() {return myGOOG;}
}
