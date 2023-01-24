package Day6Assign;

public class ReverseNo {
    public static void main(String[] args) {
        int n=1234;
        int sum=0;
        for(;n>0;n=n/10)
        {
            int r = n%10;
            sum=sum*10+r;

        }
        System.out.println(sum);
    }
}


