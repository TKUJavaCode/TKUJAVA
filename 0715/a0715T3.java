import java.util.Scanner;
public class a0715T3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("块﹃计耞琌琌癹ゅ计(筁ㄓ穦妓)");
        String num = sc.next();
        StringBuffer ss = new StringBuffer(num);
        ss.reverse();
        int flag = 0;
        for(int i = 0;i < num.length();i++) {
            if(num.charAt(i) != ss.charAt(i)) {
            	//﹍计蛤は锣计ゑ癸 ぃ妓flag=0
                flag = 1;
                break;
            }
        }
        System.out.println("计Τ碭:"+num.length()+"");
        if(flag == 1) {
        	System.out.printf("琌ぃ琌癹ゅ计:");
            System.out.println("ぃ琌");
        }
        else {
        	System.out.printf("琌ぃ琌癹ゅ计:");
            System.out.println("琌");
        }
    }
}