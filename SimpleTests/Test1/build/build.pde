void setup(){
	size(600, 600);

	int xOffset = (width - 10*50  )/2;
	int yOffset = (height - 10 * 50) / 2;
	background(#FFFFFF);
	for(int i = 0; i < 10; i++){
		for(int j = 0; j < 10; j++){
			fill(color(30, 30*i, 50*j));
			rect(50*j + xOffset, 50*i  + yOffset, 50 , 50);
		}
	
	}
	


}