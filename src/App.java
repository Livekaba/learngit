public class App {
    public static void main(String[] args) throws Exception {
        int[] num = {4, 56, 24, 85, 3, 6, 9};
        int i = 0, sum = 0;
        while(i < num.length) {
            if (num[i] > sum) {
                sum = num[i];
                
            }
            i++;
        }
        System.out.println(sum);
        
    }
}
