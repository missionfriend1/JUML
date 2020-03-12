import java.util.*; // For scanner and arrayList
import java.io.File;  // Needed to handle the file work
import java.io.FileWriter; //for writing to the files.
import java.io.IOException; // Needed to handle exceptions of the file variety

class Juml{

    public static void main(String[] args){
        String input = "";
        boolean loopVar = true;
        ArrayList<String> methods = new ArrayList<String>();
        ArrayList<Character> publicity = new ArrayList<Character>();
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Please enter the name of the class");
        String nameOfClass = scan.nextLine();

        System.out.println("Enter the names of the methods you intend to use in the file and their types:\nEx: getStrng(): String (return)");

        try{
            File myObj = new File(nameOfClass+".txt");
        }
        catch(IOException ioe){
            System.out.println("There was an error making the file");
        }







        while(loopVar){ // This loop allows you to give the names of the methods.
            input = scan.nextLine();
            methods.add(input);
            
            if (input.indexOf("(") == -1){
                loopVar = false;

            }
        }

        for (int i=0;i<methods.size()-1;i++){ // This loop lets you set each method as either public or private.
            System.out.println("Do you want " + methods.get(i) + " to be public? + = yess - = no");
            publicity.add(scan.next().charAt(0));


        }

        sPrintCli(publicity,methods,nameOfClass);
        



    }


    public static void sPrintCli(ArrayList<Character> ch, ArrayList<String> str, String nameOfClass){
        System.out.println("#####################################################################################");
        System.out.println("#");
        System.out.println("#                              " + nameOfClass);
        System.out.println("#");
        System.out.println("#####################################################################################");
        System.out.println("#");
        System.out.println("#");
        for (int i = 0; i<str.size();i++ ){
            System.out.println("#\t"+ ch.get(i) + " " + str.get(i));
            System.out.println("#");


        }



        
    }



    public static void sPrintTxt( ArrayList<String> str, String nameOfClass){

        try {
            FileWriter myWriter = new FileWriter(nameOfClass+".txt");
            myWriter.write("#####################################################################################");
            myWriter.write("#");
            for (int i = 0; i<str.size();i++ ){
                myWriter.write("#\t"+ ch.get(i) + " " + str.get(i));
                myWriter.write("#");


        }
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
    } 
        catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
    }






    }









}