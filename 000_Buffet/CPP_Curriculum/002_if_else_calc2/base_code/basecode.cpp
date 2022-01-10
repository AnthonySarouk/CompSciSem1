// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
	// write code here
	int num1;
	int num2;
	char op;
	int ans;
	cout<<"enter integer: ";
	cin>>num1;
	cout<<"enter operater: ";
	cin >> op;
	cout <<"enter integer: ";
	cin >> num2;
	
	if(op == '+'){
		ans = num1 + num2;
		cout << ans;
	}

   else if(op == '*'){
   	    ans = num1 * num2;
   	    cout << ans;
   }
   
   else if(op == '-'){
   	    ans = num1 - num2;
   	    cout << ans;
   }
   
   else if(op == '/'){
   	    ans = num1 / num2;
   	    cout << ans;
   }
   
   else{
   	  cout << "Error" << endl;
   }
   
   
   

}
