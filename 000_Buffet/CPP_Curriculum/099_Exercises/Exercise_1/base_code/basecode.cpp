// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
	int x = 1;
	int counter = 5;
	while(true){
		cout<<counter<<endl;
		if(counter == 25) {
			break;
		}
		counter = x + counter;
	}
	 cout<<endl;
		int y = 1;
		int Counter = 15;
		while(true){
			cout<<Counter<<endl;
			if(Counter == 5) {
				break;
			}
			Counter = Counter - y;
		}
	
		cout<<endl;
		for(int i = 5; i <= 25; i = i + 1){
			cout<<i<<endl;
		}
		cout<<endl;
		for(int r = 15; r >= 5; r = r - 1){
			cout<<r<<endl;
		}
		


}
