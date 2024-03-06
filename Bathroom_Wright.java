import java.util.concurrent.LinkedTransferQueue;
import java.util.concurrent.TransferQueue;
public class Bathroom_Wright {
    private int capacity;
    private TransferQueue<Students_Wright> line;
    private Students_Wright currentlyInBathroom;

    public Bathroom_Wright(int capacity){
        this.capacity = capacity;
        this.line = new LinkedTransferQueue<>();
        this.currentlyInBathroom = null;
    }

    public void setCapacity(int capacity){
        this.capacity = capacity;
    }

    public void clearData(){
        line.clear();
        currentlyInBathroom = null;
    }

    public Students_Wright studentIsInBR(){
        return currentlyInBathroom ;
    }

    public String searchStudent(Students_Wright student) {
        String result;
        if (line.contains(student)) {
            result = student.getFirstName() + " " + student.getLastName() + " is in the line";
        } else if (student == currentlyInBathroom) {
            result = student.getFirstName() + " " + student.getLastName() + " is in the poo poo room";
        } else if (student.hasRecentlyLeftbathroom()) {
            result = student.getFirstName() + " " + student.getLastName() + " dipped out of the bathroom recently";
        } else {
            result = student.getFirstName() + " " + student.getLastName() + " wasn't even in line";
        }
        return result;
    }

    public boolean addStudent(Students_Wright student){
        boolean yesOrNo ;
        if(line.contains(student)){
            System.out.println(student.getFirstName() +" "+ student.getLastName()+ " is already in the line");
            yesOrNo = false;
        } else if (student.equals(currentlyInBathroom)) {
            System.out.println(student.getFirstName() +" "+ student.getLastName()+ " has recently been in the bathroom");
            yesOrNo = false;
        } else if(line.size() < capacity) {
            System.out.println(student.getFirstName() + " " + student.getLastName() + " may join the line");
            yesOrNo =true;
            line.add(student);
        }else {
            yesOrNo = false;
        }
        return yesOrNo;
    }

    public int getBathroomLine(){
        return line.size();
    }

    public void enteredBathroom(Students_Wright student){
        currentlyInBathroom = student;
        line.poll();
    }
    public Integer test(){
        return null;
    }
}


