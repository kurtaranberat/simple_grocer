import  java.util.Scanner;
public class simple_grocer {
     public  static  void  main(String[]args){
           Scanner brt =new Scanner(System.in);
           String menu ="armut =2,14 \n"
                        +"elma =3,67 \n"
                        +"domates =1,11\n"
                        +"muz =0,95 \n"
                        +"patlıcan = 5,00";
           System.out.println(menu);

           System.out.print(" nekadar armut  almak istediniz = ");
        double  armut =brt.nextByte();
           System.out.print(" nekadar elma  almak istediniz =");
         double  elma =brt.nextByte();
          System.out.print(" nekadar domates  almak istediniz =");
         double  domates =brt.nextByte();
         System.out.print(" nekadar muz   almak istediniz =");
         double  muz=brt.nextByte();
         System.out.print(" nekadar patlıcan   almak istediniz =");
         double  patlıcan =brt.nextByte();


         System.out.println("toplam armut fiyatı "+(armut*2.14));
         System.out.println("toplam elma fiyatı"+(elma*3.67));
         System.out.println("toplam domates fiyatı "+(domates*1.11));
         System.out.println("toplam muz fiyatı "+(muz*0.95));
         System.out.println("toplam patlıcan fiyatı "+(patlıcan*5));
     }
}
