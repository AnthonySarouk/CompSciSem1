// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));{
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
	 
	 
	}
	
	
	
	
	

}
