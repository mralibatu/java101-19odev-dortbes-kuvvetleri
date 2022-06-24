import java.util.Scanner;
public class DortBesKuvvetleri {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i = 0;
        int sayi = input.nextInt();

        while(i<=sayi){
            if(i % 4 == 0 && i>0){
                System.out.println("4 un kuvvetleri : " +i);
            }
            if(i % 5 == 0 && i>0){
                System.out.println("5 in kuvvetleri : " +i);
            }
            if(i % 20 ==0 && i>0){
                System.out.println("Ortak katlari : " +i);
            }
            i++;
        }

    }
}