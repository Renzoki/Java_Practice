public class OddOrEven1{
    int num;

    public OddOrEven1(int num){
        this.num = num;
    }

    //Method returns 1 if number is even and 0 if not
    public int getOddOrEven(){
        if(num % 2 == 0)
            return 1;
        else
            return 0;
    }
}