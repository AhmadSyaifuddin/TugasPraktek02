
package tugaspraktek02;
public class Rectangle {
  double panjang;
  double lebar;
  
  void cetakInfo(){
      System.out.println("=======================");
      System.out.println("Panjang : "+panjang);
      System.out.println("Panjang : "+lebar);
      System.out.println("=======================");
  }
  double hitungLuas(){
      double luas;
      luas=panjang*lebar;
      return luas;
  }
}
