class vehicle {
    void f1() {
        System.out.println("thank you");
    }
}

    class electronics {
        void f1() {
            System.out.println("have a nice day");
        }
    }
        class mobile extends electronics,vehicle {
            void sec() {
                System.out.println("programming");
            }
        }

     public class Multiple3 {
    public static void main(String[] args) {
       mobile m =new mobile ();
          m.sec ();
          m.f1();
    }
}
