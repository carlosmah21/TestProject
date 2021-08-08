import java.util.Scanner;
 class Package {
 public static void main(String[] args) {
 
 }

        private double length;
        private double width;
        private double height;
      
        private Scanner input=new Scanner(System.in);
        
        public Package()
        {
                length=1;
                width=1;
                height=1;
        }
        public Package(double length, double width, double height) {
                super();
                this.length = length;
                this.width = width;
                this.height = height;
        }
       
        public Package(Package p)
        {
                length=p.length;
                width=p.width;
                height=p.height;
        }
        
        public void inputLength()
        {
                System.out.print("Enter length: ");
                length=input.nextDouble();
        }
       
        public void inputWidth()
        {
                System.out.print("Enter Width: ");
                width=input.nextDouble();
        }
       
        public void inputHeight()
        {
                System.out.print("Enter Height: ");
                height=input.nextDouble();
        }
       
        public void displayDimensions()
        {
                System.out.println("Dimensions are: "+length+"X"+width+"X"+height);
        }
     
        public double calcVolume()
        {
                return length*width*height;
        }
}

 
