import java.util.Scanner;

public class Shipment{
    private static Scanner s;

        public static void main(String[] args)
        {
                s = new Scanner(System.in);
               
                double length=0, width=0, height=0;
                double vol1=0, vol2=0, price1=0, price2=0;
                
                System.out.println("Welcome to Carlos Arevalo's shipping calculator");
             
                System.out.print("Enter the length of first Package: ");
                length= s.nextDouble(); 
                System.out.print("Enter the width of first Package: ");
                width= s.nextDouble(); 
                System.out.print("Enter the height of first Package: ");
                height= s.nextDouble(); 
              
                Package p1=new Package(length, width, height);
                
                Package p2=new Package();
              
                System.out.println("Enter the dimensions of the second package:");
                p2.inputHeight();
                p2.inputLength();
                p2.inputWidth();
              
                vol1 = p1.calcVolume();
                vol2 = p2.calcVolume();
               
                price1 = 3+vol1-1;
                price2 = 3+vol2-1;
                
                
              
                if(price1==price2)
                        System.out.println("The cost for both packages is the same: $"+price1);
                else 
                {
                        if(price1 >price2) 
                        {
                                if(price1 < 2 *price2) 
                                        System.out.println("Package 1 costs slightly more than Package 2");
                                else if(price1 < 3 * price2)
                                        System.out.println("Package 1 is twice as expensive as Package 2");
                                else if(price1 < 4 * price2)
                                        System.out.println("Package 1 is triple the cost of Package 2");
                                else if(price1 < 5 * price2)
                                        System.out.println("Package 1 is quadruple the cost of Package 2");
                                else 
                                        System.out.println("Package 1 is "+(int)(price1/price2)+"times more expensive than Package 2");
                               
                                System.out.println("Package 1 is more costly than Package 2 with a price difference of:$"+(price1-price2));
                                System.out.println("Package 1 will cost $"+(double)price1+" to ship");
                                
                                System.out.println("Package 2 will cost $"+(double)price2+" to ship");
                        }
                        
                        if(price2>price1) 
                        {
                                if(price2 < 2 * price1) 
                                        System.out.println("Package 2 costs more than Package 1");
                                else if(price2 < 3 * price1)
                                        System.out.println("Package 2 costs twice as much as Package 1");
                                else if(price2 < 4 * price1)
                                        System.out.println("Package 2 is triple the cost of Package 1");
                                else if(price2 < 5 * price1)
                                        System.out.println("Package 2 is quadruple the cost of Package 1");
                                else 
                                        System.out.println("Package 2 costs "+(int)(price2/price1) + " times as much as Package 1");
                             
                           
                               System.out.println("Package 2 is more expensive than Package 1 with price difference of: $"+(price2-price1));
                               
                               System.out.println("Package 1 will cost $"+(double)price1+" to ship");
                               
                               System.out.println("Package 2 will cost $"+(double)price2+" to ship");
                               s.close(); 
                        }
                }
        }
}
                
               
        