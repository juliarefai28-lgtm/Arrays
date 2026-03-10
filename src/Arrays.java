import java.sql.Array;

public class Arrays {

    public int[] nums;
    public Astronout[] astros;

    public static void main(String[] args) {
        System.out.println(" Welcome to awesome arrays ");
        new Arrays();
    }

    public Arrays() {

        nums = new int[10];

        astros = new Astronout[7];
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
        sumArray();
        minNum();

        Astronout a1=new Astronout();
        astros[1]= new Astronout();
        astros[1].eyes=30;
        astros[1].name="gerald";
        astros[1].printInfo();


        Astronout a2=new Astronout();
        astros[2]= new Astronout();
        astros[2].eyes=93;
        astros[2].name="Sally";
        astros[2].printInfo();


        Astronout a3=new Astronout();
        astros[3]= new Astronout();
        astros[3].eyes=30;
        astros[3].name="Rebecca";
        astros[3].printInfo();


        Astronout a4=new Astronout();
        astros[4]= new Astronout();
        astros[4].eyes=49;
        astros[4].name="Ronald";
        astros[4].printInfo();


        Astronout a5=new Astronout();
        astros[5]= new Astronout();
        astros[5].eyes=39;
        astros[5].name="Christopher";
        astros[5].printInfo();


        Astronout a6=new Astronout();
        astros[6]= new Astronout();
        astros[6].eyes=1;
        astros[6].name="Lily";
        astros[6].printInfo();


        Astronout a7=new Astronout();
        astros[7]= new Astronout();
        astros[7].eyes=7;
        astros[7].name="John";
        astros[7].printInfo();


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
        int smallest= nums[0];

        for ( int x=1;x<nums.length; x++){
            if (nums[x]<smallest){
                smallest=nums[x];
            }
        }
        System.out.println("Min number:" + smallest);
    }
}


