public class FlowEx1 {
    public static void main(String[] args) {
        int x = 0;
        System.out.printf("x=%d일 때, 참인 것은 \n", x);          // x=0일 때, 참인 것은

        if(x==0) System.out.println("x==0");                   // x==0
        if(x!=0) System.out.println("x!=0");
        if(!(x==0)) System.out.println("!(x==0");
        if(!(x!=0)) System.out.println("!(x!=0");              // !(x!=0)

        x = 1;
        System.out.printf("x=%d일 때, 참인 것은 \n", x);          // x=1일 때, 참인 것은

        if(x==0) System.out.println("x==0");
        if(x!=0) System.out.println("x!=0");                    // x!=0
        if(!(x==0)) System.out.println("!(x==0");               // !(x==0)
        if(!(x!=0)) System.out.println("!(x!=0");

    }
}
