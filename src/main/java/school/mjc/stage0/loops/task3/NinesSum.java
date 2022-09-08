package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        int sum = 0;
        String temp = "";
        for (int i = 1; i <= lengthOfLastNumber; i++){
            for (int j = 0; j < i; j++){
                temp += "9";
            }
            sum += Integer.parseInt(temp);
            temp = "";
        }
        System.out.println(sum);
    }
}
