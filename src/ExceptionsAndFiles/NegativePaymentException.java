package ExceptionsAndFiles;

public class NegativePaymentException extends Exception {
        double payment;
        //1. Constructor that takes the value that would throw the exception
        //2. Assign value of local variable class
    public NegativePaymentException(double payment) {
        this.payment=payment;
    }

    //3. Override the toString() method to include the specific exception message
    public String toString(){
        return " Cannot take negative payment "+payment;
    }
}
