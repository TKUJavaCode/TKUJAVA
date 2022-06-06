//大樂透 http://gintama0112.blogspot.com/2016/01/java-1.html

public class a0707T1 {

	public static void main(String[] args) {
		String result="";//印答案
        String result2="";//印排序後答案
        int lottery[]=new int [6];//樂透六個號碼
        int special;//特別號
        boolean flagRepeat=false;//驗證是否重複的旗標
        int x=0;//準備接隨機號
        
        java.util.Random randomInt =new java.util.Random();//宣告亂數
        
		/*int[] dice=new int[5];
		for(int i=0;i<5;i++) {
			dice[i]=(int)(Math.random()*(49-1+1))+1;
			System.out.printf("[%d]",dice[i]);
		}*/
		
		for(int i=0;i<lottery.length;i++){
            do{
                flagRepeat=false;
                x=randomInt.nextInt(49)+1;//取出0~48  +1模擬出1~49
                for(int j=0;j<=i;j++){
                    if(x==lottery[j]){
                        flagRepeat=true;
                        break;
                    }
                }                       
            }while(flagRepeat);//重複繼續做
            lottery[i]=x;//x沒重複 丟進去陣列
        }
		
		result2+="開獎(已排序):\t";
        for(int i=0;i<lottery.length-1;i++){
            for(int j=i+1;j<lottery.length;j++){
                if(lottery[i]<lottery[j]){//lottery[i]<lottery[j]大排到小 lottery[i]>lottery[j]小排到大
                    int temp=0;
                    temp=lottery[i];
                    lottery[i]=lottery[j];
                    lottery[j]=temp;
                }
            }
        }
		
		 
		 
		 for(int i:lottery){
	            result2+=i+"\t";
	            
	        }
		 System.out.println(result2);
		 
		 
		 
		 
		  
		

	}

}