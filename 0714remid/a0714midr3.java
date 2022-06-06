public class a0714midr3 {

	public static void main(String[] args) {
		String result="";//印答案
        String result2="";//印排序後答案
        int lottery[]=new int [5];//5個號碼
        int special;//特別號
        boolean flagRepeat=false;//驗證是否重複的旗標
        int x=0;//準備接隨機號
        
        java.util.Random randomInt =new java.util.Random();//宣告亂數
		
		for(int i=0;i<lottery.length;i++){
            do{
                flagRepeat=false;
                x=randomInt.nextInt(100-50+1)+50;//取出50~100  +1模擬出50~100
                for(int j=0;j<=i;j++){
                    if(x==lottery[j]){
                        flagRepeat=true;
                        break;
                    }
                }                       
            }while(flagRepeat);//重複繼續做
            lottery[i]=x;//x沒重複 丟進去陣列
        }
		
		result2+="開獎5個號碼(50~100由小到大 已排序):\t";
        for(int i=0;i<lottery.length-1;i++){
            for(int j=i+1;j<lottery.length;j++){
                if(lottery[i]>lottery[j]){//lottery[i]<lottery[j]大排到小 lottery[i]>lottery[j]小排到大
                    int temp=0;
                    temp=lottery[i];
                    lottery[i]=lottery[j];
                    lottery[j]=temp;
                }
            }
        }
        
		 for(int i:lottery){//印出陣列裡的值
	            result2+=i+"\t";
	        }
		 System.out.println(result2);
	}

}