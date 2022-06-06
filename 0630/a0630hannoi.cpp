#include<stdio.h>

void hannoi(int discNum,char from,char buffer,char to) {
		if(discNum==1) {
			printf("將碟子從[%c]",from);
			printf("移動到[%c]\n",to);
		}
		else {
			hannoi(discNum-1,from,to,buffer);
			printf("將碟子從[%c]",from);
			printf("移動到[%c]\n",to);
			hannoi(discNum-1,buffer,from,to);
		}
	}
	
int main(){
	int discNum;
	printf("輸入圓盤數量:\n");
	scanf("%d",&discNum);
	hannoi(discNum,'A','B','C');

}
