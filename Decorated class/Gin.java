/******************************************************************************

Welcome to GDB Online.
  GDB online is an online compiler and debugger tool for C, C++, Python, PHP, Ruby, 
  C#, OCaml, VB, Perl, Swift, Prolog, Javascript, Pascal, COBOL, HTML, CSS, JS
  Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
class Gin extends Decorated{
    Gin(Offering offering){
        this.offering =offering;
    }
    String getName(){
        return offering.getName()+"With Gin";
    }
    int getPrice(){
        return offering.getPrice()+95;
    }
}