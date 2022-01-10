// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
	char op;
	int num;
	int x;
	int y;
	cout << "Please enter a symbol" <<endl;
	cin >> op;
	cout << "Please enter line length" <<endl;
	cin >> num;
	cout << "Please enter x coordinate" <<endl;
	cin >> x;
	cout << "Please enter y coordinate" <<endl;
	cin >> y;
	
	int j = 0;
	gotoxy(x,y+7);
	while(true){
	    cout << op;
	    if(j == num){
	        break;
	    }
	   j++;
	}
    



  }
