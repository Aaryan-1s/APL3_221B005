/******************************************************************************

Welcome to GDB Online.
  GDB online is an online compiler and debugger tool for C, C++, Python, PHP, Ruby, 
  C#, OCaml, VB, Perl, Swift, Prolog, Javascript, Pascal, COBOL, HTML, CSS, JS
  Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
class Rum extends Decorated{
  Rum(Offering offering){
      this.offering=offering;
  }
  String getName(){
      return offering.getName()+"with Rum";
  }
  int getPrice(){
      return offering.getPrice()+55;
  }
}