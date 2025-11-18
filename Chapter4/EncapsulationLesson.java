package Chapter4;

public class EncapsulationLesson {
    public static void main(String[] args) {
        Swan m1 = new Swan();

        // m1.getNumOfEggs = 31;
        m1.setNumOfEggs(31);

        System.out.println(m1.getNumOfEggs());
    }
}

class Swan {
    private int numOfEggs;
    public int getNumOfEggs() {
        return  numOfEggs;
    }

    public void setNumOfEggs(int numOfEggs) {
        if(numOfEggs >= 0) {
            this.numOfEggs = numOfEggs;
        }else {
            System.out.println("don't have eggs");
        }
    }
}