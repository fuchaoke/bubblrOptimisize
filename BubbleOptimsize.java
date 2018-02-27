public class BubbleOptimsize {
    public static void main(String[]args){
        int charr[]={6,7,3,4,7,1,0,9,5};
        System.out.println("Before sort");
        for(int nums:charr){
            System.out.print(nums+"");
        }
        for(int i=0;i<charr.length-1;i++){
            for(int j=0;j<charr.length-1+i;j++){
                if(charr[j+1]>charr[j]){
                    int temp=charr[j];
                    charr[j]=charr[j+1];
                    charr[j+1]=temp;
                }
            }
        }
        for(int muns:charr){
            System.out.println("After sort");
            System.out.print(muns+"");
        }
    }
}
