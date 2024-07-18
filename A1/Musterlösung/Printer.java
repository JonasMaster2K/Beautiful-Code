package A1.Musterlösung;

public class Printer {
    public void print(IPrintable printable ){
        printable.printOrder();
        System.out.println("------------------------------------");
    }
}
