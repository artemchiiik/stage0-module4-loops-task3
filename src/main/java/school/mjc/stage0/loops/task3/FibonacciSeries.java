package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        int prevNum = 0;
        int currentNum = 1;

        if(lastFibonacci != 0){
            System.out.println(prevNum);
            for (int i = 1; i < lastFibonacci; i++){
                System.out.println(currentNum);
                int temp = currentNum;
                currentNum = prevNum + currentNum;
                prevNum = temp;
            }
        }
    }
}
