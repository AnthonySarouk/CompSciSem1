// base code file
#include "./hfiles/poole.h"
#include <thread>
///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
	char op1;
	cout << "Choose symbol for snowflake" << endl;
	cin >> op1;
	
	for(int x = 2; x < 20; x++){
		gotoxy(5, x + 5);
		cout << op1 << endl;
		sleep(1);
		//cout << endl;
		gotoxy(5, x + 5);
		cout << ' ' << endl;
	}
	
	
	
	

}
