/*
         For eg. 20
        factors of 20 are 
        1 2 4 5 10 20
        20%1   as 1*20=20
        20%2   as 2*10=20
        20%4   as 5*4=20
        repetition starts same as prime numbers
        20%5   as 4*5=20
        20%10  as 10*2=20
        20%20  as 20*1=20
 */



public class factors {
    public static void main(String[] args) {
        int n=20;
        //findFactors(n);
        System.out.println();
        sqrtfindFactors(n);
    }

    //  O(n) complexity
    // static void findFactors(int n){
    //     for(int i=1;i<=n;i++){
    //         if(n%i==0){
    //             System.out.print(i+" ");
    //         }
    //     }
    // }


    //  O(sqrt(n)) complexity
    /*
     *  20%1   as 1*20=20
        20%2   as 2*10=20
        20%4   as 5*4=20
     */
    static void sqrtfindFactors(int n){
        for(int i=1;i<=Math.sqrt(n);i++){
            if(n%i==0){
                if(n/i==i){
                    System.out.print(n/i+" ");
                }
                else{
                    System.out.print(i+" "+ n/i+" ");
                }
            }
        }
    }
}
