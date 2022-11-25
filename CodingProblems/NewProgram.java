package CodingProblems;

public class NewProgram {
    public static void main(String [] args){
        int [] arrayNums = {5, 7, 3, 9, 11, 6, 8, 2, 3, 4};
        int max = 0;
        int cnt = 0;
        for(int i = arrayNums.length - 1; i >= 0; i--){
            if(arrayNums[i] > max) {
                cnt++;
                max = arrayNums[i];
            }
        }
        System.out.println(cnt);
    }
}
