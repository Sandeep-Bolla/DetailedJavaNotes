package learn2;

public class Recursion {
    public static void main(String[] args) {
        System.out.println(fact(5));
    }
    static public int fact(int val){
        if(val==1)
            return 1;
        else
            return val*fact(val-1);
    }
}

//DP implementation
class Dp{
    public static void main(String[] args) {
        int[] n1 = new int[100];
        n1[1]=n1[0]=1;
        for(int i=1;i<100;i++){
            n1[i]=i*n1[i-1];
        }
        System.out.println((n1[6]));
    }
}

class TowersOfHanoi{ //Refer GFG or some video
    public static int cnt;
    public static void main(String[] args) {
        System.out.println(cal(4));
    }
    public static int cal(int val){
        if(val==1)
            return ++cnt;
        else{
            cal(val-1);cal(val-1);return ++cnt;
        }
    }
}