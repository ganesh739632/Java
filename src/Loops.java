public class Loops {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            System.out.println("ganesh" + i);
        }
        for (int i = 4; i >= 1; i--) {
            System.out.println(i);
        }
        for (int i = 2; i <= 10; i++) {
            System.out.println(i);
        }


        int i = 0;
        while (i < 10) {
            System.out.println(i);
            i++;
        }

        int j = 5;
        while (j >= 1) {
            System.out.println(j);
            j--;
        }

        int k=6;
        do{
            System.out.println("ok");
            k++;
        }
        while(k<=10);
    }
}