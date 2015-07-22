void setup(){
	size(600, 600);


	background(#FFFFFF);
	for(int i = 0; i < 10; i++){
		for(int j = 0; j < 10; j++){
			fill(color(30, 30*i, 50*j));
			rect(50*j,50*i,50,50);
		}
	
	}
	


}