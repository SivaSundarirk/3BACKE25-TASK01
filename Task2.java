//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args)
    /**
     * Hotel Bill Calculator;
     * Adds item,prices,applies GST and prints the total bill
     * @param args
     */
    {
        double whitepasta=200;
    double Mangojucie=120;
    double chocolateicecream=89;
    double price=whitepasta+Mangojucie+chocolateicecream;
    double GST=price*0.12;
    double totalprice=price+GST;
    System.out.println("Whitepasta:" +whitepasta);
    System.out.println("Mangojuice:" +Mangojucie);
    System.out.println("Chocolateicecream:" +chocolateicecream);
    System.out.println("Price=" +price);
    System.out.println("GST=" +GST);
    System.out.println("Totalprice=" +totalprice);

    }
}
