public class Hellos {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int i = 1;
        
        
        while (i<=n) {
            
            if (i%100 >= 11 && i%100 <=20) {
                System.out.println(i+"th Hello");
            }

            else if ((i%10) >= 4) System.out.println(i+"th Hello");
            else if ((i%10) ==1)  System.out.println(i+"st Hello");
            else if ((i%10) == 2) System.out.println(i+"nd Hello");
            else if ((i%10) == 3) System.out.println(i+"rd Hello");
            else System.out.println(i+"th Hello");
    
            i=i+1;
            
        }
    }
    
}







