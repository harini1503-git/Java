public class pattern{
    public static void main(String[] args) {

        //pattern 1:
        for(int i=1; i<=4; i++){
            for(int j=1; j<=5; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        //pattern 2:
        for(int i=1; i<=4; i++){
            for(int j=1; j<=5; j++){
                if(i==1 || i==4 || j==1 || j==5){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();

        //pattern 3:
        for(int i=4; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        //pattern 4:
        for(int i=1; i<=4; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        //pattern 5:
        for(int i=1; i<=4; i++){
            //inner loop for spaces.
            for(int j=1; j<=4-i; j++){
                System.out.print(" ");
            }
            //inner loop for stars.
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        
        //pattern 6: (Number pattern):
        for(int i=1; i<=5; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println();

        //pattern 7:
        for(int i=4; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println();

        //pattern 8:
        int sum=1;
        for(int i=0; i<5; i++){
            for(int j=0; j<i; j++){
                System.out.print(sum);
                sum++;
            }
            System.out.println();
        }
        System.out.println();

        //pattern 9:
        for(int i=1; i<=5;i++){
            for(int j=1; j<=i; j++){
                if((i+j)%2 ==0){
                    System.out.print("1"+" ");
                }else{
                    System.out.print("0"+" ");
                }
            }
            System.out.println();
        }
        System.out.println();

        //pattern 10:
        //upper half
        for(int i=0; i<=4; i++){
            //part 1:
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            //spaces
            for(int j=1; j<= 2*(4-i); j++){
                System.out.print(" ");
            }
            //part 2:
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        // lower half
        for(int i=4; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            for(int j=1; j<= 2*(4-i); j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        //pattern 11:
        for(int i=1; i<=5; i++){
            for(int j=1; j<=5-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=5; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        //pattern 12:
        for(int i=1; i<=5; i++){
            for(int j=1; j<=5-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=5; j++){
                if(i==1 || i==5 || j==1 || j==5){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
        //pattern 13:
        for(int i=1; i<=5; i++){
            for(int j=1; j<=5-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print(i+ " ");
            }
            System.out.println();
        }
        System.out.println();
        //pattern 14:
        for(int i=1; i<=5; i++){
            for(int j=1; j<=5-i; j++){
                System.out.print(" ");
            }
            for(int j=i; j>=1; j--){
                System.out.print(j);
            }
            for(int j=2; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println();
        //pattern 15:
        for(int i=1; i<=4; i++){
            for(int j=1; j<=4-i;j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            for(int j=2; j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=4; i>=1; i--){
            for(int j=1; j<=4-i;j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            for(int j=2; j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        //pattern 16:
        for(int i=1; i<=4; i++){
            for(int j=1; j<=i; j++){
                if(j==1 || j==i){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            for(int j=1; j<=2*(4-i); j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                if(j==1 || j==i){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for(int i=4; i>=1; i--){
            for(int j=1; j<=i; j++){
                if(j==1 || j==i){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            for(int j=1; j<=2*(4-i); j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                if(j==1 || j==i){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
        //pattern 17:
        for(int i=1; i<=5; i++){
            for(int j=1; j<= 5-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=5; j++){
                if(j==1 || j==5 || i==1 || i==5){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
        //pattern 18:
        for(int i=1; i<=5; i++){
            for(int j=1; j<=5-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print(j+ " ");
            }
            System.out.println();
        }
        //pattern 19:
        for(int i=4; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print(i);
            }
            System.out.println();
        }
        System.out.println();
        //pattern 20:
        for(int i=1; i<=4; i++){
            for(int j=1; j<=4+1-i; j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
        System.out.println();
        //pattern 21:
        for(int i=1; i<=4; i++){
            for(int j=1; j<=4+1-i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        System.out.println();
        //pattern 22:
        for(int i=1; i<=5; i++){
            for(int j=1; j<= 5-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
        System.out.println();
        //pattern 23:
        for(int i=1; i<=5; i++){
            for(int j=1; j<= 6-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                if (j==1 || j==i || i==5) {
                    System.out.print("*"+" ");
                }else{
                    System.out.print(" "+" ");
                }
            }
            System.out.println();
        }
        //pattern 24:
        for(int i=1; i<=6; i++){
            for(int j=1; j<=i; j++){
                System.out.print(" ");
            }
            for(int j=i; j<=6; j++){
                System.out.print(j+ " ");
            }
            System.out.println();
        }
        for(int i=6; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print(" ");
            }
            for(int j=i; j<=6; j++){
                System.out.print(j+ " ");
            }
            System.out.println();
        }
        System.out.println();
        //pattern 25:
        for(int i=1; i<=4; i++){
            for(int j=1; j<= 4-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                if (j==1 || j==i) {
                    System.out.print("*"+" ");
                }else{
                    System.out.print(" "+ " ");
                }
            }
            System.out.println();
        }
        for(int i=4; i>=1; i--){
            for(int j=1; j<= 4-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                if (j==1 || j==i) {
                    System.out.print("*"+" ");
                }else{
                    System.out.print(" "+ " ");
                }
            }
            System.out.println();
        }
        System.out.println();
        //pattern 26:
        for(int i=1; i<=6; i++){
            for(int j=1; j<=i; j++){
                System.out.print(" ");
            }
            for(int j=i; j<=6; j++){
                System.out.print("*"+ " ");
            }
            System.out.println();
        }
        for(int i=6; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print(" ");
            }
            for(int j=i; j<=6; j++){
                System.out.print("*"+ " ");
            }
            System.out.println();
        }
        System.out.println();
        //pattern 27:
        for(int i=1; i<=6; i++){
            for(int j=1; j<=i; j++){
                System.out.print(" ");
            }
            for(int j=i; j<=6; j++){
                if (j==i|| j==6 || i==1) {
                    System.out.print("*"+" ");
                }else{
                    System.out.print(" "+ " ");
                }
            }
            System.out.println();
        }
        for(int i=6; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print(" ");
            }
            for(int j=i; j<=6; j++){
                if (j==i|| j==6 || i==1) {
                    System.out.print("*"+" ");
                }else{
                    System.out.print(" "+ " ");
                }
            }
            System.out.println();
        }
        System.out.println();


        for(int i=1; i<=5; i++){
            for(int j=1; j<=5; j++){
                if (i==1 || i==4 || i==5 || j==1 || j==4 ||j==5) {
                    System.out.print("*"+" ");
                }else{
                    System.out.print(" "+" ");
                }
            }
            System.out.println();
        }
    }
}