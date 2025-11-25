package Chapter6;

import java.io.FileReader;
import java.io.IOException;

public class ExceptionLesson {
    public static void main(String[] args) throws Exception {
        //throw new Exception("Bad Code"); // checked exception
        throw new RuntimeException("Worse Code"); // unchecked exception
    }
}

class ExceptionLesson2 {
    public static void main(String[] args) {
        try { // unchecked exception // may throw ArrayIndexOutOfBoundsException
            //System.out.println(args[0]); // may not be reached
            System.out.println(12 / 0);
        } catch (ArrayIndexOutOfBoundsException e) { // handling the exception
            System.out.println("Tanga wala na"); // custom message
            System.exit(0);
        }catch(RuntimeException e) { 
            System.out.println(e);
        }finally { // always runs
            System.out.println("This always runs"); // cleanup code
        }

        System.out.println("done"); // continues execution
    }
}

class ExceptionLesson3 {

    public static FileReader read() throws IOException {
        FileReader reader = new FileReader("file.txt");
        return reader;
    }

    public static void main(String[] args) {

        FileReader reader = null;

        try {
            reader  = read();
        } catch (IOException e) {
            try {
                if(reader != null) {
                    reader.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}

class ExceptionLesson4 {
    public static void main(String[] args) {
        try {
            
        } catch (Exception e) {
        }
    }    
}