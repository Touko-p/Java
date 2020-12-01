package Test;
/*好心的老板答应包食宿，第1天给他1元钱。
并且，以后的每一天都比前一天多2元钱，直到他有足够的钱买票。
请计算一下，小明在第几天就能凑够108元，返回地球。*/
public class GoHome {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int money=1;
        int day=0;
        int sum=0;
        while(sum==108){
            money=money+2;
            sum=sum+money;
            day=day+1;
        }

    }
}

