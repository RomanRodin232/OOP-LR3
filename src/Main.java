import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите числа, разделяя их пробелами: ");
        System.out.println("После отправки всех чисел отправьте 's'");
        Scanner in = new Scanner(System.in);
        List<Integer> Chisla = new ArrayList<>();
        String vvod = in.nextLine();
        while (!vvod.equals("s")){
            String[] chasti = vvod.split(" ");
            for (String chast : chasti) {
                try {
                    Chisla.add(Integer.parseInt(chast));
                } catch (NumberFormatException e) {
                    System.out.println("Некорректный ввод. Введите целое число.");
                }
            }
            vvod = in.nextLine();

        }
        perebros(Chisla);
        System.out.println(Chisla);
    }


    public static void perebros(List<Integer> Chisla){
        int left = 0;
        int right = Chisla.size() - 1;
        while (left < right){
            if (Chisla.get(left) < 0 && Chisla.get(right) >= 0){
                int znach = Chisla.get(left);
                Chisla.set(left, Chisla.get(right));
                Chisla.set(right, znach);
                left++;
                right--;
            }
            else if (Chisla.get(left) >= 0 ) {
                left++;
            }
            else if (Chisla.get(right) < 0) {
                right--;
            }
        }
    }
}