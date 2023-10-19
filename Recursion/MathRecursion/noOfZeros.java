
public class noOfZeros {
    
    static int c=0;
    public static void main(String[] args) {
        
        int n=3020010;
        System.out.println(count(n,c));
    }
    
    static int count(int n,int c){
        if(n==0){
            return c;
        }
        if(n%10==0){
           return count(n/10,c+1);
        }
        return count(n/10,c);
    }
}

