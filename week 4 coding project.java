/*
Online Java - IDE, Code Editor, Compiler

Online Java is a quick and easy tool that helps you to build, compile, test your programs online.
*/

public class Main
{
    public static void main(String[] args) {
        System.out.println("Step 1 init");
        int[] ages = {3,9,23,4,2,8,28,93};
        System.out.println("First item in array - Last item in array =");
        System.out.println(ages[ages.length - 1] - ages[0]);
        int sumOfVal = 0;
        for(int i=0; i<ages.length; i++){
            sumOfVal += ages[i];
        }
        System.out.println("Average of numbers stored in Array 'ages' =");
        System.out.println(sumOfVal / ages.length );

        ///////////////////////////////////////////////
        System.out.println("Step 2 init");
        String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
        int sumOfLengths = 0;
        String stringsConcat = "";
        for(int i=0; i<names.length; i++){
            sumOfLengths += names[i].length();
            names[i] += " ";
            stringsConcat += names[i];
        }
        System.out.println("Average str length of strings stored in Array 'names' =");
        System.out.println(sumOfLengths / names.length);
        System.out.println("Concatenated string = ");
        System.out.println(stringsConcat);
   
        /////////////////////////////////////////////
        System.out.println("STEP 3 -> I can access the last element of an array by subtracting 1 from the length of the array.");
        System.out.println("STEP 4 -> I can access the first element of an array by using Array[0]");
        System.out.println("Step 5 init");
        int[] nameLengths = new int[names.length];
        int sumOfNameLengths = 0;
        for(int i=0; i<names.length; i++){
            System.out.println(names[i].length());
            nameLengths[i] = names[i].length();
            sumOfNameLengths += nameLengths[i];
        }
        System.out.println("Step 6 init");
        System.out.println("Sum of values in ARRAY 'nameLengths' = " + sumOfNameLengths);
        System.out.println("Step 7 init");

        String concatenatedString1 =  wordConcatenator("hello",5);
        System.out.println("Step 7 Test =" + concatenatedString1);
        
        System.out.println("Step 8 init");
        String concatenatedString2 = concatFnameLname("Gabriel","Gomez");
        System.out.println("Step 8 test = " + concatenatedString2 );
        
        System.out.println("Step 9 init");
        int[] numArray = {20, 20, 10, 40, 20, 50};
        Boolean greaterThanHundred = sumGreaterThanHundred(numArray);
        System.out.println("Step 9 test = " + greaterThanHundred );
        System.out.println("Step 10 init");
        double[] doublesArray1 = {10.30, 90.30, 75.24, 90.45};
        double averageOfDoubles = doubleAverageFinder(doublesArray1);
        System.out.println("Step 10 test = " + averageOfDoubles );
        System.out.println("Step 11 init");
        double[] firstArray = {50.34, 70.25, 8.90, 73.50, 35.0, 76.90};
        double[] secondArray = {45.44, 78.25, 89.84, 23.19, 175.90};
        Boolean isFirstGreaterThanSecond = firstArrayBiggerthanSecondArray(firstArray, secondArray);
        System.out.println("Step 11 test = " + isFirstGreaterThanSecond );
        System.out.println("Step 12 init");
        Boolean isHotOutside = true;
        double moneyInPocket = 33.33;
        boolean willIBuyADrink = willBuyDrink(isHotOutside, moneyInPocket);
        System.out.println("Step 12 test = " + willIBuyADrink);
        System.out.println("Step 13 init");
        String[] correctCasing = ensureCorrectCasing("gAbRiel", "ELyth", "Gomez");
        System.out.println("Step 13 Values inserted are 'gAbRiel', 'ELyth', 'Gomez'");
        System.out.println("Step 13 test = " + correctCasing[0] + " " + correctCasing[1]+ " " + correctCasing[2]);
        
        
        
        
        
        
        
    }
    
    public static String wordConcatenator(String word, int n){
        String concatenatedString = "";
        for(int i=0; i<n; i++ ){
            concatenatedString += word;
        }
        return concatenatedString;
    }
    
    public static String concatFnameLname(String fname, String lname){
        String concatenatedString = fname + " " + lname;
        return concatenatedString;
    }
    
    public static Boolean sumGreaterThanHundred(int[] numArray){
        int sumOfValues = 0;
        for(int i=0; i<numArray.length; i++){
            sumOfValues += numArray[i];
        }
        if(sumOfValues > 100){
            return true;
        }else{
            return false;
        }
        
    }
    
    public static double doubleAverageFinder (double[] doublesArray){
        double doubleSum = 0.0;
        
        for(int i=0; i<doublesArray.length; i++){
            doubleSum += doublesArray[i];
        }
        double doublesAverage = doubleSum/doublesArray.length;
        return doublesAverage;
    }
    
    public static Boolean firstArrayBiggerthanSecondArray(double[] firstArray, double[] secondArray){
        double firstArrayAverage = 0.0;
        double secondArrayAverage = 0.0;
        for(int i=0; i<firstArray.length; i++){
            
            firstArrayAverage += firstArray[i];
            
        }
        
        for(int i=0; i<secondArray.length; i++){
            
            secondArrayAverage += secondArray[i];
            
        }
        
        if(firstArrayAverage > secondArrayAverage){
            return true;
        }else{
            return false;
        }
    }
    
    public static Boolean willBuyDrink(Boolean isHotOutside, double moneyInPocket){
        if(isHotOutside && moneyInPocket > 10.50){
            
            return true;
            
        }else{
            return false;
        }
    }
    
    //The following method will capitalize the first,middle and last name.
    // The Default value of Middle name will be " "// CORRECTION // I just found out that JAVA does not allow default vals in methods
    // Now we have a reliable way to ensure correct Casing
    //Could be placed before submitting name data to database
    
   public static String[] ensureCorrectCasing(String firstName, String middleName, String lastName) {
    String[] stringArray = new String[3];
    
    // Correct the casing of the first name
    if (firstName.length() > 0) {
        firstName = Character.toUpperCase(firstName.charAt(0)) + firstName.substring(1).toLowerCase();
    }
    stringArray[0] = firstName;
    
    // Correct the casing of the middle name
    if (middleName.equals(" ")) {
        stringArray[1] = middleName; // No middle name
    } else {
        if (middleName.length() > 0) {
            middleName = Character.toUpperCase(middleName.charAt(0)) + middleName.substring(1).toLowerCase();
        }
        stringArray[1] = middleName;
    }
    
    // Correct the casing of the last name
    if (lastName.length() > 0) {
        lastName = Character.toUpperCase(lastName.charAt(0)) + lastName.substring(1).toLowerCase();
    }
    stringArray[2] = lastName;
    
    return stringArray;
  }
}