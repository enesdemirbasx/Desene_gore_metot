public class Main {
    static void desen(int sayi){
        int a=sayi;
        while (sayi>=1){
            System.out.print(sayi+" ");
            sayi=sayi-5;
        }
        while (sayi<=a){
            System.out.print(sayi+" ");
            sayi=sayi+5;

        }
    }
    public static void main(String[] args) {
        desen(16);
    }
}