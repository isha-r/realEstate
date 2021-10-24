import java.util.ArrayList;
import java.util.Scanner;


public class PropertyTester {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    
    Property prop=new Property(new ArrayList<ExtractPropertyInfo>(), new ArrayList<String>());
    /**
    Scanner scr = new Scanner(System.in); // Create a Scanner object

    System.out.println("If you want to start adding a house to compare, press y. Otherwise, press n");
    String response = scr.nextLine();
    if (response.equals("y"))
      while (!scr.nextLine().equals("n")) {
        System.out.println("What's the name of the image png file (include .png) that you would "
            + "like to extract data from? Make sure this file exists and is in the right folder!");
        String fileName = scr.nextLine(); 
        //response=fileName;
        System.out.println("What's the name you'd like to give the property (second house, "
            + "favorite investment, etc.). Please choose a unique name you haven't used before, "
            + "and since this will automatically generate a text file on its own, do NOT include .txt in the name.");
        String txtName = scr.nextLine();
        //response=txtName;
        prop.addNewData(fileName, txtName);
      }
    System.out.println("terminated");
    */
      
    prop.addNewData("house5.png", "brown condo");
    prop.addNewData("house4.png", "suburban condo");

    prop.addNewData("house3.png", "old condo");
    /**
    for (int i=0;i<prop.getArray().size();i++) {
      System.out.println(prop.getArray().get(i).Extract());
    }
    */
    
    prop.extractAllProperties();
    ArrayList<String> data = prop.getData();
    for (int i=0;i<data.size();i++) {
      System.out.println(data.get(i).toString());
    }


    int[] priceTester=prop.getPrice();
    
    for (int i=0;i<prop.getPrice().length;i++) {
      System.out.println("The price of "+ prop.getTxtNames().get(i)+ " is " +priceTester[i]); 
    }
int[] yearTester=prop.getYear();
    
    for (int i=0;i<prop.getYear().length;i++) {
      System.out.println("The year the "+ prop.getTxtNames().get(i)+ " is built is " +yearTester[i]);
    }
    
int[] HOATester=prop.getHOA();
    
    for (int i=0;i<prop.getYear().length;i++) {
      System.out.println("The HOA of "+ prop.getTxtNames().get(i)+ " is $" +HOATester[i]+" per month");
    }

/**

    Scanner sc = new Scanner(System.in); // Create a Scanner object

    System.out.println(
        "If you want to start/continue adding a house to compare, press y. Otherwise, press n");

    String street = sc.nextLine();
    if (street.contains("y") || street.contains("Y")) {
      System.out.print("press enter");
      while (!sc.nextLine().equals("n") || !sc.nextLine().equals("N")) {
        System.out.println(
            "Enter png name with the .png at the end. Please make sure it's in the right project folder");
        String name = sc.nextLine(); // Read user input
        System.out.println(
            "Enter txt output file name withOUT the .txt at the end. You don't need to create this file.");
        String txt = sc.nextLine(); // Read user input
        Property.addNewData(name, txt);
        System.out.println("Would you like to add more? y/n");
        
        
      }

    }
*/


  }

}
