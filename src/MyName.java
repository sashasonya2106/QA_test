public class MyName {
    public static void main(String[] args) {
int min = -99;
int max = 99;
int a = (int)(min+Math.random()*(Math.abs(min)+Math.abs(max)));
        //System.out.println(a);

        int[][] nums = new int[5][8];
int maxV = min;
        for (int i=0; i<nums.length ;i++){
            for (int j=0; j<nums[i].length;j++){
                nums[i][j] = (int)(min+Math.random()*(Math.abs(min)+Math.abs(max)));
                if( maxV < nums[i][j]){
                    maxV = nums[i][j];
                }
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }
 /*for (int i=0; i<nums.length ;i++){
            for (int j=0; j<nums[i].length;j++){

                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }*/
        System.out.println(maxV);



    }
}
