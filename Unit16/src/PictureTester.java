/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
  /** Method to test zeroBlue */
  public static void testZeroBlue()
  {
    Picture beach = new Picture("H:\\APCSA Units\\Unit16Students\\Unit16-Assignments-pixLab\\images\\beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("H:\\APCSA Units\\Unit16Students\\Unit16-Assignments-pixLab\\images\\caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }
  
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("H:\\APCSA Units\\Unit16Students\\Unit16-Assignments-pixLab\\images\\temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("H:\\APCSA Units\\Unit16Students\\Unit16-Assignments-pixLab\\images\\640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("H:\\APCSA Units\\Unit16Students\\Unit16-Assignments-pixLab\\images\\swan.jpg");
    swan.edgeDetection(10);
    swan.explore();
  }
  
  public static void testKeepOnlyBlue()
  {
	  Picture beach = new Picture("H:\\APCSA Units\\Unit16Students\\Unit16-Assignments-pixLab\\images\\beach.jpg");
	  beach.explore();
	  beach.keepOnlyBlue();
	  beach.explore();  
  }
  
  public static void testKeepOnlyRed()
  {
	  Picture beach = new Picture("H:\\APCSA Units\\Unit16Students\\Unit16-Assignments-pixLab\\images\\beach.jpg");
	  beach.explore();
	  beach.keepOnlyRed();
	  beach.explore();  
  }
  
  public static void testKeepOnlyGreen()
  {
	  Picture beach = new Picture("H:\\APCSA Units\\Unit16Students\\Unit16-Assignments-pixLab\\images\\beach.jpg");
	  beach.explore();
	  beach.keepOnlyGreen();
	  beach.explore();  
  }
  
  public static void testNegate()
  {
	  Picture beach = new Picture("H:\\APCSA Units\\Unit16Students\\Unit16-Assignments-pixLab\\images\\beach.jpg");
	  beach.explore();
	  beach.negate();
	  beach.explore();
  }
  
  public static void testGrayscale()
  {
	  Picture beach = new Picture("H:\\APCSA Units\\Unit16Students\\Unit16-Assignments-pixLab\\images\\beach.jpg");
	  beach.explore();
	  beach.grayscale();
	  beach.explore();
  }
  
  public static void testFixUnderwater()
  {
	  Picture water = new Picture("H:\\APCSA Units\\Unit16Students\\Unit16-Assignments-pixLab\\images\\water.jpg");
	  water.explore();
	  water.fixUnderwater();
	  water.explore();
  }
  
  public static void testMirrorVerticalRightToLeft()
  {
	  Picture caterpillar = new Picture("H:\\APCSA Units\\Unit16Students\\Unit16-Assignments-pixLab\\images\\caterpillar.jpg");
	  caterpillar.explore();
	  caterpillar.mirrorVerticalRightToLeft();
	  caterpillar.explore();
  }
  
  public static void testMirrorHorizontal()
  {
	  Picture redMotorcycle = new Picture("H:\\APCSA Units\\Unit16Students\\Unit16-Assignments-pixLab\\images\\redMotorcycle.jpg");
	  redMotorcycle.explore();
	  redMotorcycle.mirrorHorizontal();
	  redMotorcycle.explore();
  }
  
  public static void testMirrorHorizontalBotToTop()
  {
	  Picture redMotorcycle = new Picture("H:\\APCSA Units\\Unit16Students\\Unit16-Assignments-pixLab\\images\\redMotorcycle.jpg");
	  redMotorcycle.explore();
	  redMotorcycle.mirrorHorizontalBotToTop();
	  redMotorcycle.explore();
  }
  
  public static void testMirrorArms()
  {
	  Picture snowman = new Picture("H:\\APCSA Units\\Unit16Students\\Unit16-Assignments-pixLab\\images\\snowman.jpg");
	  snowman.explore();
	  snowman.mirrorArms();
	  snowman.explore();
  }
  
  public static void testMirrorGull()
  {
	  Picture seagull = new Picture("H:\\APCSA Units\\Unit16Students\\Unit16-Assignments-pixLab\\images\\seagull.jpg");
	  seagull.explore();
	  seagull.mirrorGull();
	  seagull.explore();
  }
  
  public static void testCopy()
  {
	  Picture canvas = new Picture("H:\\APCSA Units\\Unit16Students\\Unit16-Assignments-pixLab\\images\\arch.jpg");
	  canvas.copy(new Picture("H:\\APCSA Units\\Unit16Students\\Unit16-Assignments-pixLab\\images\\arch.jpg"), 100, 100);
	  canvas.explore();
  }
  
  public static void testCopy2()
  {
	  Picture flower1 = new Picture("H:\\APCSA Units\\Unit16Students\\Unit16-Assignments-pixLab\\images\\flower1.jpg");
	  Picture canvas = new Picture("H:\\APCSA Units\\Unit16Students\\Unit16-Assignments-pixLab\\images\\640x480.jpg");
	  canvas.copy2(flower1, 0, 50, 0, 100);
	  canvas.copy2(flower1, 50, 100, 0, 50);
	  canvas.explore();
  }
  
  public static void testEdgeDetection2()
  {
    Picture swan = new Picture("H:\\APCSA Units\\Unit16Students\\Unit16-Assignments-pixLab\\images\\swan.jpg");
    swan.edgeDetection2(10);
    swan.explore();
  }
  
  public static void testMirrorDiagonal()
  {
	  Picture beach = new Picture("H:\\APCSA Units\\Unit16Students\\Unit16-Assignments-pixLab\\images\\beach.jpg");
	  beach.explore();
	  beach.mirrorDiagonal();
	  beach.explore();
  }
  
  //Picture Lab tests
  public static void testEncode()
  {
	  Picture beach = new Picture("H:\\APCSA Units\\Unit16Students\\Unit16-Assignments-pixLab\\images\\beach.jpg");
	  beach.explore();
	  Picture message = new Picture("H:\\APCSA Units\\Unit16Students\\Unit16-Assignments-pixLab\\images\\msg.jpg");
	  message.explore();
	  beach.encode(message);
	  beach.explore();
	  beach.decode();
	  beach.explore();
  }
  
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
	  
	  //testEncode();
	  //testDecode();
	  
//    testZeroBlue();
//    testKeepOnlyBlue();
//    testKeepOnlyRed();
//    testKeepOnlyGreen();
//    testNegate();
//    testGrayscale();
//    testFixUnderwater();
//    testMirrorVertical();
//    testMirrorTemple();
//	  testMirrorVerticalRightToLeft();  
//	  testMirrorHorizontal();
//	  testMirrorHorizontalBotToTop();
//    testMirrorArms();
//    testMirrorGull();
//	  testMirrorDiagonal();
//    testCollage();
//    testCopy();
//	  testCopy2();
//    testEdgeDetection();
//    testEdgeDetection2();
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
  }
}