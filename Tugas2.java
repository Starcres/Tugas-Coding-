import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        Scanner Keyboard = new Scanner(System.in);

        int bilangan;
        boolean kondisi = true;
        try {
            while (kondisi) {
                System.out.println("Berikan saya contoh bilangan asli?.");
                bilangan = Keyboard.nextInt();

                if (bilangan > 0) {
                    System.out.println("Selamat anda benar, bilangan yang anda masukkan adalah bilangan positif yang merupakan bilangan asli");
                } else if (bilangan < 0) {
                    System.out.println("Sayang sekali, bilangan yang anda masukkan adalah bilangan negatif yang bukan merupakan bilangan asli");
                } else {
                    System.out.println("Sayang sekali, bilangan yang anda masukkan adalah nol yang bukan merupakan bilangan asli");
                }break;
            }
        } catch (Exception e) {
            System.out.println("Input tidak valid. Mohon masukkan angka bukan huruf");
        }

        System.out.println("Bilangan asli adalah bilangan yang dimulai dari angka 1 sampai dengan positif tak hingga dan juga dari nol(0)");

    }
}
