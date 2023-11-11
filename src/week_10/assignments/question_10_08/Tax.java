package week_10.assignments.question_10_08;

public class Tax {
//            +--------------------------------+
//            |              Tax               |
//            +--------------------------------+
//            | - filingStatus: int            |
//            | - brackets: int[][]             |
//            | - rates: double[]               |
//            | - taxableIncome: double         |
//            +--------------------------------+
//            | + SINGLE_FILER: int = 0         |
//            | + MARRIED_JOINTLY_OR_QUALIFYING_WIDOW: int = 1 |
//            | + MARRIED_SEPARATELY: int = 2   |
//            | + HEAD_OF_HOUSEHOLD: int = 3    |
//            +--------------------------------+
//            | + Tax()                         |
//            | + Tax(filingStatus: int, brackets: int[][], rates: double[], taxableIncome: double) |
//            | + getFilingStatus(): int        |
//            | + setFilingStatus(status: int): void |
//            | + getBrackets(): int[][]        |
//            | + setBrackets(brackets: int[][]): void |
//            | + getRates(): double[]          |
//            | + setRates(rates: double[]): void |
//            | + getTaxableIncome(): double    |
//            | + setTaxableIncome(income: double): void |
//            | + getTax(): double              |
//            +--------------------------------+
// Constants for filing status
    public static final int SINGLE_FILER = 0;
    public static final int MARRIED_JOINTLY_OR_QUALIFYING_WIDOW = 1;
    public static final int MARRIED_SEPARATELY = 2;
    public static final int HEAD_OF_HOUSEHOLD = 3;

    // Instance data fields
    private int filingStatus;
    private int[][] brackets;
    private double[] rates;
    private double taxableIncome;

    // Constructors
    public Tax() {
        // Default constructor
    }

    public Tax(int filingStatus, int[][] brackets, double[] rates, double taxableIncome) {
        this.filingStatus = filingStatus;
        this.brackets = brackets;
        this.rates = rates;
        this.taxableIncome = taxableIncome;
    }

    // Getter and setter methods
    public int getFilingStatus() {
        return filingStatus;
    }

    public void setFilingStatus(int filingStatus) {
        this.filingStatus = filingStatus;
    }

    public int[][] getBrackets() {
        return brackets;
    }

    public void setBrackets(int[][] brackets) {
        this.brackets = brackets;
    }

    public double[] getRates() {
        return rates;
    }

    public void setRates(double[] rates) {
        this.rates = rates;
    }

    public double getTaxableIncome() {
        return taxableIncome;
    }

    public void setTaxableIncome(double taxableIncome) {
        this.taxableIncome = taxableIncome;
    }

    // Method to calculate tax
    public double getTax(double income, int[] bracket, double[] rates) {
        double tax = 0;
        if (income <= bracket[0]) {
            tax = income * rates[0];
        } else if (income <= bracket[1]) {
            tax = bracket[0] * rates[0] + (income - bracket[0]) * rates[1];
        } else if (income <= bracket[2]) {
            tax = bracket[0] * rates[0] + (bracket[1] - bracket[0]) * rates[1] + (income - bracket[1]) * rates[2];
        } else if (income <= bracket[3]) {
            tax = bracket[0] * rates[0] + (bracket[1] - bracket[0]) * rates[1] + (bracket[2] - bracket[1]) * rates[2]
                    + (income - bracket[2]) * rates[3];
        } else if (income <= bracket[4]) {
            tax = bracket[0] * rates[0] + (bracket[1] - bracket[0]) * rates[1] + (bracket[2] - bracket[1]) * rates[2]
                    + (bracket[3] - bracket[2]) * rates[3] + (income - bracket[4]) * rates[4];
        } else
            tax = bracket[0] * rates[0] + (bracket[1] - bracket[0]) * rates[1] + (bracket[2] - bracket[1]) * rates[2]
                    + (bracket[3] - bracket[2]) * rates[3] + (bracket[4] - bracket[3]) * rates[4] + (income - bracket[4]) * rates[5];

        return tax;
    }
}
