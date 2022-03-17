package Lesson13;

public class Runner {
    public static void main(String[] args) {

        Dog myDog = new Dog("dog", 50,30,"brown",false, true,true,
                true,8,"beagle","Donnie",true);

        Cat myCat = new Cat("cat",20,4,"white",false,false,true,
                true,3,"British Shorthair","Garfield",false);

        SiameseCat mySiameseCat = new SiameseCat("cat", 22,3,"white",false,true,
                true,true,2,"Siamese cat","Jackie",true,2000,"Thailand");

        System.out.println("Here is couple information about my dog:");
        myDog.dogBasicInfo();
        space();
        myDog.animalGeneralInfo();
        space();
        myDog.printSpecies();
        space();

        System.out.println("Here is couple information about this cat:");
        myCat.catBasicInfo();
        space();
        myCat.animalGeneralInfo();
        space();
        myCat.isCatAabandoned();
        myCat.ifFounded();
        space();

        System.out.println("Here is couple information about my Siamese cat:");
        mySiameseCat.catBasicInfo();
        space();
        mySiameseCat.siameseCatInfo();
        space();
        mySiameseCat.animalGeneralInfo();
        space();
        System.out.println("In case this cat gets lost:");
        mySiameseCat.ifFounded();

    }

    public static void space(){
        System.out.println("");
    }

}
