import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class build extends PApplet {

public void setup(){
	size(600, 600);

	int xOffset = (width - 10*50  )/2;
	int yOffset = (height - 10 * 50) / 2;
	background(0xffFFFFFF);
	for(int i = 0; i < 10; i++){
		for(int j = 0; j < 10; j++){
			fill(color(30, 30*i, 50*j));
			rect(50*j + xOffset, 50*i  + yOffset, 50 , 50);
		}
	
	}
	


}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "build" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
