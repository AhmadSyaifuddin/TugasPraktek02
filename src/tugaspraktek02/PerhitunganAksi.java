package tugaspraktek02;

public class PerhitunganAksi {
  public static void main(String[] args){   
          Perhitungan r1 = new Perhitungan(); 
          r1.P = 15;
          r1.L = 5; 
          
          r1.cetakInfo();
          System.out.println("Luas Perhitungan = "+r1.hitungLuas());
          r1.cetakLuas();
          
          Perhitungan r2 = new Perhitungan();
          r2.cetakInfo();
          
          Perhitungan r3 = new Perhitungan(70,40);
          r3.cetakInfo();
          
  }
  
  
}