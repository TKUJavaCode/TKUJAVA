#include<stdio.h>

void hannoi(int discNum,char from,char buffer,char to) {
		if(discNum==1) {
			printf("�N�Фl�q[%c]",from);
			printf("���ʨ�[%c]\n",to);
		}
		else {
			hannoi(discNum-1,from,to,buffer);
			printf("�N�Фl�q[%c]",from);
			printf("���ʨ�[%c]\n",to);
			hannoi(discNum-1,buffer,from,to);
		}
	}
	
int main(){
	int discNum;
	printf("��J��L�ƶq:\n");
	scanf("%d",&discNum);
	hannoi(discNum,'A','B','C');

}
