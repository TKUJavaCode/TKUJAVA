import java.util.Scanner;
public class a0715T2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x = 7, i, ans = 0;//x初始值設為7,從7的一倍開始找
		System.out.println("愛因斯坦階梯問題");
		System.out.println("輸入最多找幾個");
		int h=sc.nextInt();//陣列大小，最多放幾個
		String ele="";//存for each要印的字串
		int cx=0;//來代表陣列的第幾個 savearr[cx]
		int[] savearr=new int[h];
        boolean flag = false;//如果找到答案 flag會=true
        System.out.println("輸入想找7的幾倍以內：");
        int n=sc.nextInt();//n代表跑到7的幾倍
        for (i = 1; i <= n; i++) {// 將迴圈次數定為150，表示尋找範圍為：7～1050之間
            if ((x % 2 == 1) && (x % 3 == 2) && (x % 5 == 4) 
            		&& (x % 6 == 5) && (x % 7 == 0)) {
                ans = x;//ans代表符合的值
                flag = true;
                if(savearr.length>cx)//若cx沒超過陣列大小就繼續放進去
                savearr[cx]=ans;
                cx++;//[0]->[1]......
            }
            x = 7 * (i + 1);//第一次運行完會執行7*2,x=14
        }
        if (true == flag) {
        	System.out.println("答案(0代表沒有)：");
        	for(int p:savearr){//印出陣列裡的值
    			ele+=p+"\t";
            }
    		System.out.println(ele);
        }
           
        else
            System.out.println("在7的1～50倍這個範圍內沒有結果");
	}
}
