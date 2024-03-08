
class ganesh{
    void fi(){
        System.out.println("hello");
    }
}
class raju extends ganesh{
    void sec(){
        System.out.println("good morning");
    }
}
class surender extends ganesh{
    void th(){
        System.out.println("thank you");
    }
}

public class multilevel2 {
    public static void main(String[] args) {
        surender s=new surender();

        s.th();
        s.fi();
        raju r =new raju();
        r.sec();
        r.fi();
    }
}
