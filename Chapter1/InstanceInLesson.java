package Chapter1;

public class InstanceInLesson {
    public InstanceInLesson() {
        code = 0;
    }

    int code = 1;
    {
        System.out.println(code);
    }

    public static void main(String[] args) {
        InstanceInLesson ini = new InstanceInLesson();
        System.out.println(ini.code);
        {System.out.println("feathers");}
    }    

    {
        System.out.println("Snowy");
        code = 12345;
        
    }
}
