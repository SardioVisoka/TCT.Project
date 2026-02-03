package Librari.skedaret;

import java.io.File;

public class FileExample {
    public static final String FINAL_LOCATION_TCT = "/Users/megiismaili/Desktop/TCT";

    public static void main(String[] args) {
        File file1 = new File(FINAL_LOCATION_TCT);

        System.out.println(file1.getAbsolutePath());
        File[] listOfFiles = file1.listFiles();

        System.out.println("Filet qe ndodhen brenda folderit TCT: ");
        for(File files: listOfFiles){
            System.out.println(files.getName());

            if(files.isDirectory()){
                System.out.println("Ne folderin TCT ndodhet nje direktori " + files.getName() + " dhe brenda saj ka " + files.listFiles().length);
            }else{
                System.out.println("Ne folderin TCT ndodhet nje file me emertimin: " + files.getName());
            }
        }


    }
}
