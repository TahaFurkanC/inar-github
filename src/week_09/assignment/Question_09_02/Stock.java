package week_09.assignment.Question_09_02;

public class Stock {
    //         ---------------------
//            |    Stock          |
//            ---------------------
//            | symbol: String     |
//            | name: String    |
//             | previousClosingPrice : double |
    //        | currentPrice : double  |
//            ---------------------
//            | Stock()      |
//            | Stock(symbol:String, name:String)  |
//            | getChangePercent(): double |
//            ---------------------
    String symbol;
    String name;
    double previousClosingPrice;
    double currentPrice;

    Stock(
    ){

    }
    Stock(String symbol, String name){
        this.symbol = symbol;
        this.name = name;
    }

    public double getChangePercent(){
        return ((currentPrice - previousClosingPrice) * 100) / previousClosingPrice;
    }
    public void setCurrentPrice(double current){
        this.currentPrice = current;
    }
    public void setPreviousClosingPrice(double previous){
        this.previousClosingPrice = previous;
    }

}

