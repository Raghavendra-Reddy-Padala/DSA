package complexity;

public  class order{
    public static void main(String[] args) {
        int[] arr = new  int[]{0,2,5,10,20,40,60,100,-90};
        //this is constant complexity

        // System.out.println(arr[0]);//o(1)

        //O(1) 
        
        //This is linear complexity

        // for(int i : arr)//O(n)
        // {
        //     System.out.println(i);//O(1)
        // }
        //O(n+1)==o(n)



        //Logorithmic complxiety
            // int target=10;
            // int low = 0;
            // int high=arr.length-1;
            // while(low<=high){//O(logn)
            //     int  mid=(high+low)/2;
            //     if(arr[mid] == target){  //O(1)
            //         System.out.println("emlemt found at index "+mid);//O(1)
            //         break;
            //     }else if(arr[mid]<target){//O(1)
            //         low = mid+1;//O(1)
            //     }else{//O(1)
            //         high=mid-1;//O(1)
            //     }
            // }
            //o(1)+O(1)+O(1)+O(1)+O(logn)=O(logn)
            //so this is logrithmic complexity
            

            //quadratic and cubic complexity
            //find the pair with given target
           int x=10;
            for (int i = 0; i < arr.length; i++) {//O(n)
                for (int j = i+1; j < arr.length; j++) {//(n)
                    if(arr[i]+arr[j]==x){//O(1)
                        System.out.printf("The pair is %d + %d == %d\n",arr[i],arr[j],x);//O(1)
                    }

                    //O(1)+O(1)+O(n)*O(n)=O(n^2)
                    //so this is quadratic compplexity
                }
            }
            
    }
}