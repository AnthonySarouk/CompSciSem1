// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
	
	int num1;
	char op1;
	char op2;

	cout << "Enter a symbol" <<  endl;
	cin >> op1;
	cout << "Enter line length" << endl;
	cin >> num1;
	cout << "Enter horizontal, vertical, or diagonal" << endl;
	cin >> op2;
	
	if(op2 == 'h'){
		int x = 0;
		while(true){
			cout << op1;
			if(x == num1){
				break;
			}
			x++;
		}
	}
	
	if(op2 == 'v'){
		int x = 0;
		while(true){
			cout << op1 << endl;
			if(x == num1){
				break;
			}
			x++;
		}
	}
	if(op2 == 'd'){
	  for(int x = 1; x <= num1; x++){
	  	gotoxy(x, x + 5);
	  	cout << op1 << endl;
	  }
	  
	}

}
