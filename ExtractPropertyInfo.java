
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;




public class ExtractPropertyInfo {
  private String pngPath;
  private String textName;

/**
  public static void main(String[] args) {
    String finalResult = new String();
    ExtractPropertyInfo demo = new ExtractPropertyInfo();
    String pngPath = "house2.png";
    String textName = "ldwolmjko";
    try {
      demo.extractT(pngPath, textName);

    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } catch (InterruptedException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }

    File file =
        new File("C:\\Users\\rusta\\eclipse-workspace\\ProjectTesting\\" + textName + ".txt");
    try {
      BufferedReader br = new BufferedReader(new FileReader(file));
      String st;
      while ((st = br.readLine()) != null)

        // Print the string
        finalResult += (st)+"\n";
      System.out.println(finalResult);
    } catch (IOException e) {
      e.printStackTrace();
    }
    System.out.println(finalResult);

  }
*/
  public ExtractPropertyInfo(String imagePngName, String houseFileName) {
    this.pngPath = imagePngName;
    this.textName = houseFileName;
  }

  public ExtractPropertyInfo() {
    pngPath = "nj.png";
    textName = "anything";
  }

  public String getName() {

    return textName;
  }

  public String Extract() {
    String finalResult = new String();
    ExtractPropertyInfo demo = new ExtractPropertyInfo();

    try {
      demo.extractT(pngPath, textName);

    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } catch (InterruptedException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }

    File file =
        new File("C:\\Users\\rusta\\eclipse-workspace\\ProjectTesting\\" + textName + ".txt");
    try {
      BufferedReader br = new BufferedReader(new FileReader(file));
      String st;
      while ((st = br.readLine()) != null)

        // Print the string
        finalResult += (st)+"\n";

    } catch (IOException e) {
      e.printStackTrace();
    }
    return finalResult;
    
  }

  public void extractT(String pngPath2, String textName2) throws IOException, InterruptedException {
    int x = new ProcessBuilder("tesseract", pngPath2, textName2).inheritIO().start().waitFor();
    if (x != 0) {
      throw new RuntimeException("tesseract command didn't work");
    }


  }



}
