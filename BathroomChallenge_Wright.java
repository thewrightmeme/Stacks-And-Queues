public class BathroomChallenge_Wright {
    public static void main(String[] args){
        //Bathroom
        Bathroom_Wright bathroom1 = new Bathroom_Wright(2);
        Bathroom_Wright bathroom2 = new Bathroom_Wright(3);

        Students_Wright james = new Students_Wright("James","Washington",1);
        Students_Wright david = new Students_Wright("David","Monte",2);
        Students_Wright charlie = new Students_Wright("Charlie","Jackson",3);
        Students_Wright johnny = new Students_Wright("Johnny","Johnson",4);
        Students_Wright davis = new Students_Wright("Davis","Davidson",5);
        Students_Wright rachel = new Students_Wright("Rachel","Bobson",6);
        Students_Wright chuck = new Students_Wright("Chuck","Gary",7);
        Students_Wright johnSmith = new Students_Wright("John","Smith",8);
        Students_Wright johnDoe = new Students_Wright("John","Doe",9);
        Students_Wright jane = new Students_Wright("Jane","Doe",10);
        Students_Wright janette = new Students_Wright("Janette","Reed",11);
        Students_Wright michele = new Students_Wright("Michele","Mickey",12);

        bathroom1.addStudent(james);
        bathroom1.addStudent(david);
        bathroom1.addStudent(johnSmith);
        bathroom1.addStudent(johnDoe);
        bathroom1.addStudent(chuck);

        bathroom2.addStudent(janette);
        bathroom2.addStudent(jane);
        bathroom2.addStudent(rachel);
        bathroom2.addStudent(michele);

        System.out.println(bathroom1.studentIsInBR());
        System.out.println(bathroom2.studentIsInBR());
        System.out.println(bathroom1.searchStudent(james));
        System.out.println(bathroom1.searchStudent(chuck));
        System.out.println(bathroom2.searchStudent(james));
        System.out.println(bathroom2.searchStudent(davis));

        bathroom1.enteredBathroom(james);
        bathroom2.enteredBathroom(jane);

        bathroom1.test();
        bathroom2.test();
        bathroom1.clearData();
        bathroom1.test();


    }
}
