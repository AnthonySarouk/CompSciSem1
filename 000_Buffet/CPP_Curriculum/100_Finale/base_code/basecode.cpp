// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
   for(int x = 0; x < 10; x++){
		gotoxy(4 + x,3);
		cout << '*';
	 }
	for(int y = 0; y < 10; y++){
		gotoxy(4 + y, 4);
		cout << '*';
	}
	for(int x = 0; x < 10; x++){
		gotoxy(4 + x, 5);
		cout << '*';
	} 
    for(int x = 0; x < 10; x++){
    	gotoxy(4 + x, 6);
    	cout << '*';
    }
	for(int x = 0; x < 10; x++){
		gotoxy(4 + x, 7);
		cout << '*';
	}
	 
char op1;

cout << "Choose symbol for snowflake" << endl;
cin >> op1;
	
for(int x = 2; x < 20; x++){
	gotoxy(5, x + 5);
	cout << op1 << endl;
	sleep(1);
	gotoxy(5, x + 5);
	cout << ' ' << endl;
	}
	

}






