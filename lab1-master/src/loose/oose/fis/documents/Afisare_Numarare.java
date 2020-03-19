package loose.oose.fis.documents;

public class Afisare_Numarare {
   public static void ecgr2(int a,int b,int c) {
       double delta,x1,x2;
       delta =b*b-4*a*c;
       x1=(Math.sqrt(delta)-b)/2*a;
       x2=((-b)-Math.sqrt(delta))/2*a;
       System.out.println("delta e:"+delta);
       System.out.println("solutiile sunt:"+x1+ ","+x2);

   }
}
