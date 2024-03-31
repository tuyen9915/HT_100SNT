//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int i = 2;
        System.out.print("Hiển thị số nguyên tố nhỏ hơn 100 là: ");
        while (i < 100){
            if (soNguyenTo(i)){
                 System.out.print(i + ", ");
            }
            i ++;
        }
    }
    public static boolean soNguyenTo (int c) {
        if (c <2){
            return false;
        }
        int a = (int)Math.sqrt(c);
        for (int i = 2; i <=a;  i++){
            if (c % i == 0){
                return false;
            }
        }
        return true;
    }
}