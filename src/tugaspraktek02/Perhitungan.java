
package tugaspraktek02;
public class Perhitungan {
  double P;
  double L;
  
  public Perhitungan(){
      P=15;
      L=5;
  }
  
  public Perhitungan(double P,double L){
      this.P = P;
      this.L = L;
  }
  
  void cetakInfo(){
      System.out.println("=======================");
      System.out.println("P : "+P);
      System.out.println("L : "+L);
      System.out.println("=======================");
  }
  double hitungLuas(){
      double luas;
      luas=P*L;
      return L;
  }
  
  void cetakLuas(){
       System.out.println("Luasnya adalah: "+hitungLuas());
  }
}