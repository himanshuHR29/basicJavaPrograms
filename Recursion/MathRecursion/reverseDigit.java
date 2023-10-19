public class reverseDigit {
    public static void main(String[] args) {
        int n=1234567;
        
        //rev(n);
       // System.out.println(reverse);


        int digits=digitCount(n);
        System.out.println(rev2(n,digits));
        
    }
    static int reverse1=0;
    static void rev1(int n){
        if(n==0){
            return;
        }
        reverse1=reverse1*10+n%10;
        rev1(n/10);
    }
    static int digitCount(int n){
        return (int)(Math.log10(n)+1);
    }

    static int rev2(int n,int c){
        if(n%10==n){
            return n;
        }
        return (n%10)*(int)(Math.pow(10,c-1))+rev2(n/10,c-1);
    }
}
