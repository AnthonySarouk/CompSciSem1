// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
	// write code here
   
    char quit = 'x';
	int x = 0;
   	while(true){
		cout << "you've been gnomed";
		cin >> quit;
		if(quit == 'q'){
			cout << "you owe me money";
			break;
		}
		    
		if(x == 100){
			break;
		}
		x = x + 1;
	}
}
