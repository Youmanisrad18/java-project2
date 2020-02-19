import java.util.Scanner;
class Main
{
  public static void main(String[] args){
  double eggs = (4);  
  double coco = (2);
  double milk = (3);
  double eggs2 = (eggs / 12);
  double coco2 = (coco / 12);
  double milk2 = (milk / 12);
  Scanner scanner = new Scanner(System.in);
  System.out.println( "How many Brownies? ");
  double brownies = scanner.nextDouble();
  double eggs3 = (eggs2 * brownies);
  double coco3 = (coco2 * brownies);
  double milk3 = (milk2 * brownies);
  System.out.println("you need " + eggs3 + " eggs");
  System.out.println("you need " + coco3 + " coco");
  System.out.println("you need " + milk3 + " milk");
  }
}