import java.util.Scanner;
class Invoice{
Sting Part_number;
String Part_description;
int quantity;
double price_item;
public double total=0;
Invoice(){
String Part_number=" ";
String Part_description=" ";
int quantity=0;
double price_item=0.0;

}public String getPart_number(){
return Part_number;
}public void setPart_number(String part_number){
this.Part_number=Part_number;
}public String get Part_description(){
return part_description;
}public void setpart_description(){
this.part_description=part_description;
} 
}public int get quantity(){return quantity;
}
public void setQuantity(int quantity){
if(quantity<0)
     quantity=0;
else 
   this.quantity=quantity;
}
public double get Price_item(){
return Price_item;
}
public void setprice_item(double Price_item){
       if(Price_item<0)
          Price_item=0.0;
       else
         this.Price.item=Price_item;
}
double getinvoiceAmount(){
totalPrice();
      return total;
}
void totalPrice(){
total=total+getquantity()*get Price_item();
}
}
public class main{
      public static void main(String[]args){
        Scanner sc=new scanner(system.in);
            Invoice in=new Invoice();
System.out.println("enter part number:");
in.setpart_number(sc.nextline());
System.out.println("enter part description:");
in.setpart_description(sc.nextline());
System.out.println("enter no of items:");
in.setpart_item(sc.nextint());
System.out.println("enter price per item:")
in.setpart_Quantity(sc.nextDouble());
System.out.println("item details\n");
System.out.println("part number:"+in.get Part_description);
System.out.println("\npart description:"+inget.Part_description);
System.out.println("\nTotal Biling amount:"+in.getinvoiceAmount());


}}
