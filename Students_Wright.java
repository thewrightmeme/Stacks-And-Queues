public class Students_Wright {
    private String firstName;
    private String lastName;
    private int id;
    private boolean recentlyUsedBR;

    public Students_Wright(String firstName, String lastName, int id){
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.recentlyUsedBR = false;
    }

    //Student stuff
    public void setRecentlyUsedBR(boolean recentlyUsedBR){
        this.recentlyUsedBR = recentlyUsedBR;
    }
    public boolean hasRecentlyLeftbathroom(){
        return recentlyUsedBR;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public String getFirstName(){
        return firstName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public String getLastName(){
        return lastName;
    }
    public void setId(int id){
        this.id = id;
    }
    public int getId(){
        return id;
    }
    //methods
    public boolean isEqualTo(Students_Wright otherStudent){
        return (this.id) == (otherStudent.getId());
    }

    @Override
    public String toString() {
        return "This is student " + firstName + " " + lastName + ", and their id is: " + id;
    }

}
