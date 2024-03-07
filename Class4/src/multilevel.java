class first{
    void fi(){
        System.out.println("ok");
    }
}
class second extends first{
    void sec(){
        System.out.println("ok1");
    }
}
class third extends second{
    void th(){
        System.out.println("ok2");
    }
}
public class multilevel {
    public static void main(String[] args) {
        third t=new third();
        t.th();
        t.sec();
        t.fi();

    }
}
