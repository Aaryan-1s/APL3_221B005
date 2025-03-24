/******************************************************************************

Welcome to GDB Online.
  GDB online is an online compiler and debugger tool for C, C++, Python, PHP, Ruby, 
  C#, OCaml, VB, Perl, Swift, Prolog, Javascript, Pascal, COBOL, HTML, CSS, JS
  Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main{
    public static void main(String[]args){
        Offering offering =new Coffee();
         offering =new Rum(offering);
         offering =new Gin(offering);
        System.out.println(offering.getName()+" "+"& Total Price is "+ offering.getPrice());
        
        Offering off=new Tea();
        off=new Rum(off);
        off=new Gin(off);
        System.out.println(off.getName()+" "+" & Total Price is "+off.getPrice());
    }
}