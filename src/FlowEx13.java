public class FlowEx13 {
    public static void main(String[] args) {
        int sum = 0;

        for(int i=1;i<=10;i++){
            sum += i;                   // sum = sum+i
            System.out.printf("1부터 %2d까지의 합 : %2d\n", i, sum);          // 1부터 1 까지의 합 : 1 ~
                                                                            // 1부터 10까지의 합 : 55
        }
    }
}
