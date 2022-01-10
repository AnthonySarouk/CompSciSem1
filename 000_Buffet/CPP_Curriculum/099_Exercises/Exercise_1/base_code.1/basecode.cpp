// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
	gotoxy(10,5);
	cout<< "🦃";
	gotoxy(9,5);
	cout<<"🦃";
    gotoxy(8,5);
    cout<<"🦃";
    gotoxy(8,4);
    cout<<"🦃";
    gotoxy(9,3);
    cout<<"🦃";
	for(int i = 10; i < 15; i++){
		gotoxy(i,i + 3);
		cout<<'🦃';
	}
    for(int i = 5; i < 10; i++){
    	gotoxy(i,i + 4);
    	cout<<"🦃";
    }
   for(int i = 15; i < 30; i++){
   	gotoxy(i,i + 3);
   	cout<<"🦃";
   }
   for(int i = 20; i < 45; i++){
   	gotoxy(i,i + 2);
   	cout<<"🦃";
   }
   for(int i = 25; i < 65; i++){
   	gotoxy(i,i + 5);
   	cout<<"🦃";
   }
   
   for(int i = 8; i <= 25; i++){
   	gotoxy(i,i + 1);
   	cout<<"🦃";
   }
   for(int i = 5; i < 15; i++){
   	gotoxy(i,i + 1);
   	cout<<"🦃";
   }
   for(int i = 1; i < 20; i++){
   	gotoxy(i,i + 1);
   	cout<<"🦃";
   }
}
