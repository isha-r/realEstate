import java.util.ArrayList;



public class Property {
  
  

  private ArrayList<ExtractPropertyInfo> allProperties; 
  private ArrayList<String> propertyDatas; 
  public Property(ArrayList<ExtractPropertyInfo> toExtract, ArrayList<String> extracted) {
    allProperties=toExtract;
    propertyDatas=extracted;
  }
  public  ArrayList<String> getData(){
    return propertyDatas;
  }

 
  public  void addNewData(String name, String txt) {
    allProperties.add(new ExtractPropertyInfo(name, txt));
  }
  
  public  ArrayList<String> getTxtNames(){
    ArrayList<String> names= new ArrayList<String>();
    for (int i=0;i<allProperties.size();i++) {
      
      names.add(allProperties.get(i).getName());
    }
    return names;
  }
  
  
  public  void extractAllProperties() {
    for (int i=0; i<allProperties.size();i++) {
      propertyDatas.add(i, allProperties.get(i).Extract());
    }
  }
  
  public ArrayList<ExtractPropertyInfo> getArray(){
    return allProperties;
  }
  
  public int[] getPrice() {
    int finalNum = 0;
    int[] enter = new int[propertyDatas.size()];
    String firstline = "";
    String subString = "";
    //String finalString = "";
    for (int i = 0; i < propertyDatas.size(); i++) {
      
      for (int x = 0; x < propertyDatas.get(i).length(); x++) {

        if (propertyDatas.get(i).charAt(x) == '$') {
         
          subString=propertyDatas.get(i).substring(x+1);
          firstline = subString.substring(0, subString.indexOf('$'));
          x = propertyDatas.get(i).length();
        }
      }
      String str="";
      for (int y = 0; y < firstline.length(); y++) {
        //while (firstline.charAt(y)!=' ') {
          if (Character.isDigit(firstline.charAt(y))) {

            //String finalString=new String();
            
            str+=firstline.charAt(y);
            //finalString+= firstline.charAt(y);
            finalNum = (int) Long.parseLong(str);
          }
      //  }
      }

      enter[i] = finalNum;
    }
    return enter;
  }
  
  public int[] getYear() {
    int finalNum = 0;
    int[] enter = new int[propertyDatas.size()];
    String firstline = "";
    int subDex = 0;
    //String finalString = "";
    for (int i = 0; i < propertyDatas.size(); i++) {
      
      for (int x = 0; x < propertyDatas.get(i).length(); x++) {

        //if (propertyDatas.get(i).charAt(x) == '$') {
         
          //subString=propertyDatas.get(i).substring(propertyDatas.get(i).indexOf("Condo"))+6 ;
        subDex=propertyDatas.get(i).indexOf("Condo")+6;
          firstline = propertyDatas.get(i).substring(subDex,subDex+4);
          x = propertyDatas.get(i).length();
        //}
      }
      String str="";
      for (int y = 0; y < firstline.length(); y++) {
        //while (firstline.charAt(y)!=' ') {
          if (Character.isDigit(firstline.charAt(y))) {

            //String finalString=new String();
            
            str+=firstline.charAt(y);
            //finalString+= firstline.charAt(y);
            finalNum = (int) Long.parseLong(str);
          }
      //  }
      }

      enter[i] = finalNum;
    }
    return enter;
  }
  public int[] getHOA() {
    int finalNum = 0;
    int[] enter = new int[propertyDatas.size()];
    String firstline = "";
    int subDex = 0;
    //String finalString = "";
    for (int i = 0; i < propertyDatas.size(); i++) {
      
      for (int x = 0; x < propertyDatas.get(i).length(); x++) {

        //if (propertyDatas.get(i).charAt(x) == '$') {
         
          //subString=propertyDatas.get(i).substring(propertyDatas.get(i).indexOf("Condo"))+6 ;
        subDex=propertyDatas.get(i).indexOf("/month")-4;
          firstline = propertyDatas.get(i).substring(subDex,subDex+4);
          x = propertyDatas.get(i).length();
        //}
      }
      String str="";
      for (int y = 0; y < firstline.length(); y++) {
        //while (firstline.charAt(y)!=' ') {
          if (Character.isDigit(firstline.charAt(y))) {

            //String finalString=new String();
            
            str+=firstline.charAt(y);
            //finalString+= firstline.charAt(y);
            finalNum = (int) Long.parseLong(str);
          }
      //  }
      }

      enter[i] = finalNum;
    }
    return enter;
  }
  

  /**
  public String getHighestPrice() {
    int highest=0;
    int highestI=0;
    for (int i=0; i<allProperties.size();i++) {
      if (allProperties.get(i).getPrice()>highest) {
        highest=allProperties.get(i).getPrice();
        highestI=i;
      }
    }
    return "The property" +allProperties.get(highestI).getName()+"has the highest price at"+allProperties.get(highestI).getPrice();
  }
  */
  

}
