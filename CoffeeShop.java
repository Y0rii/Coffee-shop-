import java.util.Scanner;
public class CoffeeShop {
    public static void main(String[] args) {
        
    System.out.println("-- WELCOME TO YARA'S COFFEE SHOP --");
   
   Scanner sc=new Scanner(System.in);
   System.out.println("Would you like to order:(enter a number) \n1.Coffee only \n2.Coffee with Dessert");
   int answer=sc.nextInt();
   
  
  if(answer==1)
{
System.out.println("Enter coffee type: (black/latte/flat-white)");
String type=sc.next();
System.out.println("Enter coffee size: (small/medium/large)");
String size=sc.next();
System.out.println("Do you want extra shot: (true/false)");
boolean extrashot=sc.nextBoolean();
System.out.println("What type of milk do you like: (regular/oat/almond)");
String milk=sc.next();

Coffee coffee=new Coffee(type,size,extrashot,milk);   
System.out.print(coffee.DisplayOrder());
}

 if(answer==2){
System.out.println("Enter coffee type: (black/latte/flat-white)");
String type=sc.next();
System.out.println("Enter coffee size: (small/medium/large)");
String size=sc.next();
System.out.println("Do you want extra shot: (true/false)");
boolean extrashot=sc.nextBoolean();
System.out.println("What type of milk do you like: (regular/oat/almond)");
String milk=sc.next();
System.out.println("Enter Dessert: (muffin/brownie)");
String name=sc.next();


Coffee coffee=new Coffee(type,size,extrashot,milk);   
Dessert dessert=new Dessert(name);
System.out.print(coffee.DisplayOrder());
System.out.print(dessert.DisplayOrder());
System.out.println("\n"+(coffee.getprice()+dessert.getprice()));
}

 }
}
