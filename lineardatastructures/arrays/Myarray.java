package lineardatastructures.arrays;

public class Myarray {
    private   int[] items;
    private   int index;
    public Myarray(){
        this.items=new int[5];
        this.index=0;
    }
    public void insert(int value){
        if(index==items.length){
            int[] temp = new int[items.length*2];
            System.arraycopy(items, 0, temp, 0, index);
            items=temp;
        }
        this.items[index]=value;
        index++;
    }
    public void replace(int index,int value){
        this.items[index]=value;
    }
    public void peek(int value){
        boolean flag=false;
        for(int i=0;i<this.index;i++){
            if(items[i]==value) {
                System.out.println("Your value "+value+" is at index "+i);
                flag=true;
            }
        }if(!flag){
            System.out.println("Your value is not available in the array");
        }
        
    }

    // public void removeat(int idx){

    //     if(idx<index){
    //         for( int i = idx;i<this.index;i++){
    //             this.items[i]=this.items[i+1];
    //         }
    //         index--;
    //     }else{
    //         System.out.println("Index is out of bound");
    //     }
        //using exception
        // if(idx>=this.index) throw new IllegalArgumentException();
        // for( int i = idx;i<this.index;i++){
        //     this.items[i]=this.items[i+1];
        // }
        // index--;
    //     }
        public void removeat(int idx) {
            if (idx >= 0 && idx < this.index) { 
                for (int i = idx; i < this.index - 1; i++) {
                    this.items[i] = this.items[i + 1];
                }
                this.items[this.index - 1] = 0; 
                this.index--;
            } else {
                throw new IllegalArgumentException("Index is out of bounds");
            }
        }
    public int max(){
        int res=this.items[0];
        for (int i = 1; i < this.index; i++) {
            if(this.items[i]>res){
                res=this.items[i];
            }
        }
        return res;
    }
    public int min(){
        int res=this.items[0];
        for (int i = 1; i < this.index; i++) {
            if(this.items[i]<res){
                res=this.items[i];
            }
        }
        return res;
    }
    public void reverse(){
        int i =0;
        int j =this.index-1;
        while(j>i){
            int temp=this.items[i];
            this.items[i]=this.items[j];
            this.items[j]=temp;
            i++;
            j--;
        }
    }

    @Override
    public String  toString(){
        StringBuilder str = new StringBuilder();
        str.append("[");
        for(int i=0;i<this.index ;i++){
            str.append(this.items[i]).append(", ");
        }
        // str.setLength(str.length()-2);
        str.append('\b').append('\b').append(']');
        return str.toString();
    }
    public static void main(String[] args) {
        Myarray x = new Myarray();
        x.insert(-10);
        x.insert(20);
        x.insert(80);
        x.insert(30);
        x.insert(50);
        x.insert(300);
        x.insert(9);
        x.removeat(2);
        x.replace(1, 40);
        System.out.println(x.max());
        System.out.println(x.min());
        System.out.println(x);
        x.reverse();
        System.out.println(x);
    }
}
