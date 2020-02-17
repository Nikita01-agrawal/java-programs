
class P42{

    public static void main(String args[]){
        int sum = 0;
        int first_sum = 0;
        for(int x = 1000;x<=9999;x++){
            
            for(int j =1;j<=4;j++){
                l = x%10;
                x=x/2;
                if(l%2!=0){
                  
                }
                else{
                    first_sum = first_sum*10+x;
                }
            }  
        }
        int Num = first_sum*100+sum;
        System.out.println(Num);
    }
}

