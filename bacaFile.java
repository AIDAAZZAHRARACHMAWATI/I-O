import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


public class bacaFile {
    public static void main(String[] args) {
        FileInputStream input = nul;
        int data ;
        // Membuka File
        try
        {
            input = new FileInputStream("C:/PBO-PEWARISAN/bacalah.txt") ;

        }catch(FileNotFoundException e)
        {
            System.out.println("File tidak ditemukan");
        }

        try
        {
            while((data = input.read())!= -1)
            {
                System.out.print((char)data);
            }
            System.out.println();
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }

        try{
            input.close();

        }
        catch(IOException E)
        {

        }
    }
}