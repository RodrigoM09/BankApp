public interface InterestRate {

    // Method that returns base rate
    default double getBaseRate(){
        return 2.5;
    }

}
