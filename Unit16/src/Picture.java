import java.awt.*;
import java.awt.font.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.text.*;
import java.util.*;
import java.util.List; // resolves problem with java.awt.List and java.util.List

/**
 * A class that represents a picture.  This class inherits from 
 * SimplePicture and allows the student to add functionality to
 * the Picture class.  
 * 
 * @author Barbara Ericson ericson@cc.gatech.edu
 */
public class Picture extends SimplePicture 
{
  ///////////////////// constructors //////////////////////////////////
  
  /**
   * Constructor that takes no arguments 
   */
  public Picture ()
  {
    /* not needed but use it to show students the implicit call to super()
     * child constructors always call a parent constructor 
     */
    super();  
  }
  
  /**
   * Constructor that takes a file name and creates the picture 
   * @param fileName the name of the file to create the picture from
   */
  public Picture(String fileName)
  {
    // let the parent class handle this fileName
    super(fileName);
  }
  
  /**
   * Constructor that takes the width and height
   * @param height the height of the desired picture
   * @param width the width of the desired picture
   */
  public Picture(int height, int width)
  {
    // let the parent class handle this width and height
    super(width,height);
  }
  
  /**
   * Constructor that takes a picture and creates a 
   * copy of that picture
   * @param copyPicture the picture to copy
   */
  public Picture(Picture copyPicture)
  {
    // let the parent class do the copy
    super(copyPicture);
  }
  
  /**
   * Constructor that takes a buffered image
   * @param image the buffered image to use
   */
  public Picture(BufferedImage image)
  {
    super(image);
  }
  
  ////////////////////// methods ///////////////////////////////////////
  
  /**
   * Method to return a string with information about this picture.
   * @return a string with information about the picture such as fileName,
   * height and width.
   */
  public String toString()
  {
    String output = "Picture, filename " + getFileName() + 
      " height " + getHeight() 
      + " width " + getWidth();
    return output;
    
  }
  
  /** Method to set the blue to 0 */
  public void zeroBlue()
  {
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels)
    {
      for (Pixel pixelObj : rowArray)
      {
        pixelObj.setBlue(0);
      }
    }
  }
  
  /** Method that mirrors the picture around a 
    * vertical mirror in the center of the picture
    * from left to right */
  public void mirrorVertical()
  {
    Pixel[][] pixels = this.getPixels2D();
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int width = pixels[0].length;
    for (int row = 0; row < pixels.length; row++)
    {
      for (int col = 0; col < width / 2; col++)
      {
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][width - 1 - col];
        rightPixel.setColor(leftPixel.getColor());
      }
    } 
  }
  
  /** Mirror just part of a picture of a temple */
  public void mirrorTemple()
  {
    int mirrorPoint = 276;
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int count = 0;
    Pixel[][] pixels = this.getPixels2D();
    
    // loop through the rows
    for (int row = 27; row < 97; row++)
    {
      // loop from 13 to just before the mirror point
      for (int col = 13; col < mirrorPoint; col++)
      {
        
        leftPixel = pixels[row][col];      
        rightPixel = pixels[row]                       
                         [mirrorPoint - col + mirrorPoint];
        rightPixel.setColor(leftPixel.getColor());
      }
    }
  }
  
  /** copy from the passed fromPic to the
    * specified startRow and startCol in the
    * current picture
    * @param fromPic the picture to copy from
    * @param startRow the start row to copy to
    * @param startCol the start col to copy to
    */
  public void copy(Picture fromPic, 
                 int startRow, int startCol)
  {
    Pixel fromPixel = null;
    Pixel toPixel = null;
    Pixel[][] toPixels = this.getPixels2D();
    Pixel[][] fromPixels = fromPic.getPixels2D();
    for (int fromRow = 0, toRow = startRow; 
         fromRow < fromPixels.length &&
         toRow < toPixels.length; 
         fromRow++, toRow++)
    {
      for (int fromCol = 0, toCol = startCol; 
           fromCol < fromPixels[0].length &&
           toCol < toPixels[0].length;  
           fromCol++, toCol++)
      {
        fromPixel = fromPixels[fromRow][fromCol];
        toPixel = toPixels[toRow][toCol];
        toPixel.setColor(fromPixel.getColor());
      }
    }   
  }
  
  public void copy2(Picture fromPic, int startRow, int endRow, int startCol, int endCol)
  {
	  Pixel fromPixel = null;
	    Pixel toPixel = null;
	    Pixel[][] toPixels = this.getPixels2D();
	    Pixel[][] fromPixels = fromPic.getPixels2D();
	    for (int fromRow = 0, toRow = startRow; 
	         fromRow < endRow &&
	         toRow < endRow; 
	         fromRow++, toRow++)
	    {
	      for (int fromCol = 0, toCol = startCol; 
	           fromCol < endCol &&
	           toCol < endCol;  
	           fromCol++, toCol++)
	      {
	        fromPixel = fromPixels[fromRow][fromCol];
	        toPixel = toPixels[toRow][toCol];
	        toPixel.setColor(fromPixel.getColor());
	      }
	    }
  }

  /** Method to create a collage of several pictures */
  public void createCollage()
  {
    Picture flower1 = new Picture("H:\\APCSA Units\\Unit16Students\\Unit16-Assignments-pixLab\\images\\flower1.jpg");
    Picture flower2 = new Picture("H:\\APCSA Units\\Unit16Students\\Unit16-Assignments-pixLab\\images\\flower2.jpg");
    this.copy(flower1,0,0);
    this.copy(flower2,100,0);
    this.copy(flower1,200,0);
    Picture flowerNoBlue = new Picture(flower2);
    flowerNoBlue.zeroBlue();
    this.copy(flowerNoBlue,300,0);
    this.copy(flower1,400,0);
    this.copy(flower2,500,0);
    this.mirrorVertical();
    this.write("H:\\APCSA Units\\Unit16Students\\Unit16-Assignments-pixLab\\images\\collage.jpg");
  }
  
  
  /** Method to show large changes in color 
    * @param edgeDist the distance for finding edges
    */
  public void edgeDetection(int edgeDist)
  {
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    Pixel[][] pixels = this.getPixels2D();
    Color rightColor = null;
    for (int row = 0; row < pixels.length; row++)
    {
      for (int col = 0; 
           col < pixels[0].length-1; col++)
      {
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][col+1];
        rightColor = rightPixel.getColor();
        if (leftPixel.colorDistance(rightColor) > 
            edgeDist)
          leftPixel.setColor(Color.BLACK);
        else
          leftPixel.setColor(Color.WHITE);
      }
    }
  }
  
  public void edgeDetection2(int edgeDist)
  {
	  Pixel leftPixel = null;
	  	Pixel rightPixel = null;
	  	Pixel topPixel = null;
	  	Pixel botPixel = null;
	    Pixel[][] pixels = this.getPixels2D();
	    Color rightColor = null;
	    Color topColor = null;
	    for (int row = 0; row < pixels.length-1; row++)
	    {
	      for (int col = 0; 
	           col < pixels[0].length-1; col++)
	      {
	        leftPixel = pixels[row][col];
	        rightPixel = pixels[row][col+1];
	        rightColor = rightPixel.getColor();
	        botPixel = pixels[row][col];
	        topPixel = pixels[row+1][col];
	        topColor = topPixel.getColor();
	        if (leftPixel.colorDistance(rightColor) > 
	            edgeDist && botPixel.colorDistance(topColor) > edgeDist) {
	          leftPixel.setColor(Color.BLACK);
	          botPixel.setColor(Color.BLACK);
	        }
	        else {
	        	botPixel.setColor(Color.WHITE);
	        	leftPixel.setColor(Color.WHITE);
	        }
	      }
	    }
	 }
  
  
  public void keepOnlyBlue()
  {
	 Pixel[][] pixels = this.getPixels2D();
	   for (Pixel[] rowArray : pixels) {
	     for (Pixel pixelObj : rowArray) {
	        pixelObj.setRed(0);
	        pixelObj.setGreen(0);
	     }
	   }
  }
  
  public void keepOnlyRed()
  {
	 Pixel[][] pixels = this.getPixels2D();
	   for (Pixel[] rowArray : pixels) {
	     for (Pixel pixelObj : rowArray) {
	        pixelObj.setBlue(0);
	        pixelObj.setGreen(0);
	     }
	   }
  }
  
  public void keepOnlyGreen()
  {
	 Pixel[][] pixels = this.getPixels2D();
	   for (Pixel[] rowArray : pixels) {
	     for (Pixel pixelObj : rowArray) {
	        pixelObj.setRed(0);
	        pixelObj.setBlue(0);
	     }
	   }
  }
  
  public void negate()
  {
	  Pixel[][] pixels = this.getPixels2D();
	   for (Pixel[] rowArray : pixels) {
	     for (Pixel pixelObj : rowArray) {
	        pixelObj.setRed(255 - pixelObj.getRed());
	        pixelObj.setBlue(255 - pixelObj.getBlue());
	        pixelObj.setGreen(255 - pixelObj.getGreen());
	     }
	   }
  }
  
  public void grayscale()
  {
	  Pixel[][] pixels = this.getPixels2D();
	   for (Pixel[] rowArray : pixels) {
	     for (Pixel pixelObj : rowArray) {
	        double avg = (pixelObj.getRed() + pixelObj.getBlue() + pixelObj.getGreen())/3;
	        pixelObj.setRed((int)avg);
	        pixelObj.setBlue((int)avg);
	        pixelObj.setGreen((int)avg);
	     }
	   }
  }
  
  public void fixUnderwater()
  {
	  Pixel[][] pixels = this.getPixels2D();
	   for (Pixel[] rowArray : pixels) {
	     for (Pixel pixelObj : rowArray) {
	        pixelObj.setRed(pixelObj.getRed()*5 -637);
	        pixelObj.setBlue(pixelObj.getBlue()*5 -637);
	        pixelObj.setGreen(pixelObj.getGreen()*5 -637);
	     }
	   }
  }
  
  public void mirrorVerticalRightToLeft()
  {
	  Pixel[][] pixels = this.getPixels2D();
	    Pixel leftPixel = null;
	    Pixel rightPixel = null;
	    int width = pixels[0].length;
	    for (int row = 0; row < pixels.length; row++)
	    {
	      for (int col = 0; col < width / 2; col++)
	      {
	        leftPixel = pixels[row][col];
	        rightPixel = pixels[row][width - 1 - col];
	        leftPixel.setColor(rightPixel.getColor());
	      }
	    } 
  }
  
  public void mirrorHorizontal()
  {
	  Pixel[][] pixels = this.getPixels2D();
	    Pixel topPixel = null;
	    Pixel botPixel = null;
	    int width = pixels[0].length;
	    for (int col = 0; col < width; col++)
	    {
	      for (int row = 0; row < pixels.length/2; row++)
	      {
	        topPixel = pixels[row][col];
	        botPixel = pixels[pixels.length - row - 1][col];
	        botPixel.setColor(topPixel.getColor());
	      }
	    } 
  }
  
  public void mirrorHorizontalBotToTop()
  {
	  Pixel[][] pixels = this.getPixels2D();
	    Pixel topPixel = null;
	    Pixel botPixel = null;
	    int width = pixels[0].length;
	    for (int col = 0; col < width; col++)
	    {
	      for (int row = 0; row < pixels.length/2; row++)
	      {
	        topPixel = pixels[row][col];
	        botPixel = pixels[pixels.length - row - 1][col];
	        topPixel.setColor(botPixel.getColor());
	      }
	    } 
  }
  
  public void mirrorArms()
  {
    int mirrorPoint = 193;
    Pixel[][] pixels = this.getPixels2D();
    Pixel topPixel = null;
    Pixel botPixel = null;
    for (int col = 105; col < 294; col++)
    {
      for (int row = mirrorPoint; row > 162; row--)
      {
        topPixel = pixels[row][col];
        botPixel = pixels[mirrorPoint - row + mirrorPoint][col];
        botPixel.setColor(topPixel.getColor());
      }
    } 
  }
  
  public void mirrorGull()
  {
	  int mirrorPoint = 350;
	    Pixel leftPixel = null;
	    Pixel rightPixel = null;
	    int count = 0;
	    Pixel[][] pixels = this.getPixels2D();
	    
	    // loop through the rows
	    for (int row = 220; row < 330; row++)
	    {
	      // loop from 13 to just before the mirror point
	      for (int col = 220; col < mirrorPoint; col++)
	      {
	        
	        leftPixel = pixels[row][col];      
	        rightPixel = pixels[row][mirrorPoint - col + mirrorPoint];
	        rightPixel.setColor(leftPixel.getColor());
	      }
	    }
   }
  
  public void mirrorDiagonal()
  {
	  Pixel leftPixel = null;
	  Pixel rightPixel = null;
	  Pixel[][] pixels = this.getPixels2D();
	  
	  for (int row=0;row<480;row++) {
		  for (int col=0;col<480;col++) {
			  leftPixel = pixels[col][row];
			  rightPixel = pixels[row][col];
			  rightPixel.setColor(leftPixel.getColor());
		  }
	  }
  }
  
  //Picture Lab methods
  public void encode(Picture messagePic)
  {
	  
  }
  
  public void decode()
  {
	  
  }
  
  /* Main method for testing - each class in Java can have a main 
   * method 
   */
  public static void main(String[] args) 
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  
} // this } is the end of class Picture, put all new methods before this
