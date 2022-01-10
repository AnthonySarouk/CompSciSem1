// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
	int num1;
	char op1;
	char op2;
	
    cout << "enter a symbol" << endl;
	cin >> op1;
	cout << "enter line length" << endl;
	cin >> num1;
	cout << "horizontal or vertical" << endl;
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
    else if(op2 == 'v'){
    int x = 0;
	while(true){
		cout << op1 <<endl;
      if(x == num1){
      	break;
      }
      x++;
	}
   }
	
	
	

}
