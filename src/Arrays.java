import java.sql.Array;

public class Arrays {

    public int[] nums;

    public static void main(String[] args) {
        System.out.println(" Welcome to awesome arrays ");
        new Arrays();
    }

    public Arrays() {

        nums = new int[10];
        nums[9] = 11;
        nums[8] = 13;
        nums[7] = 155;
        nums[6] = 5;
        nums[5] = 10;
        nums[4] = 93;
        nums[3] = 76;
        nums[2] = 3;
        nums[1] = 1;
        nums[0] = 90;
        System.out.println(nums[9]);

        for (int i = 0; i < nums.length; i++) {
            nums[i] = (int) (Math.random() * 100) + 1;
            System.out.println(nums[9]);
        }
        displayArray();
    }

    public void displayArray() {
        for (int x = 0; x < nums.length; x++) {
            System.out.println( x+";"+nums[x]);
        }
    }
    public void sumArray(){
        int total=0;
    for (int x=0; x<nums.length;x++){
      total += + nums[x];
    }
        System.out.println(total);
    }
    public void averageNum(){
        int total=0;
        for (int x=0; x<nums.length; x++){
            total+=nums[x];
        }
        System.out.println("Average:" );
    }
    public void maxNum(){
        int max= nums[0];
        for (int x=1; x<nums.length; x++){
if (nums[x]>max){
    max=nums[x];
        }
        }

        System.out.println("Max Number:" + max);
    }
    public void minNum(){
        int min=nums[0];

        for ( int x=1;x<nums.length; x++){
            if (nums[x]<min){
                min=nums[x];
            }
        }
        System.out.println("Min number:" + min);
    }
}


