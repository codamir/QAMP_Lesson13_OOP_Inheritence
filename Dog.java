package Lesson13;

public class Dog extends Animal {
    private String dogBreed;
    private String name;
    private Boolean trained = false;

    public Dog (String species, int height, int weight, String color, Boolean isWildAnimal,
               Boolean male, Boolean carnivore, Boolean vertebrates, int age, String dogBreed, String name, Boolean trained){
        this.setSpecies(species);
        this.setHeight(height);
        this.setWeight(weight);
        this.setColor(color);
        this.setWildAnimal(isWildAnimal);
        this.setMale(male);
        this.setCarnivore(carnivore);
        this.setVertebrates(vertebrates);
        this.setAge(age);
        this.dogBreed = dogBreed;
        this.name = name;
        this.trained = trained;
    }

    public String getDogBreed() {
        return dogBreed;
    }

    protected void setDogBreed(String dogBreed) {
        this.dogBreed = dogBreed;
    }

    public String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    public Boolean getTrained() {
        return trained;
    }

    protected void setTrained(Boolean trained) {
        this.trained = trained;
    }

    public void dogBasicInfo() {
        System.out.println("This dogs name is " + this.name +".");
        System.out.println(this.name + " is " + maleOrFemale() + "dog.");
        isCarnivore();
        isWildAnimal();
    }

    public void printSpecies() {
        System.out.println(this.name + " is " + getDogBreed()+".");
        if (this.trained) {
            System.out.println(this.name + " is trained dog.");
        } else {
            System.out.println(this.name + " is not a trained dog.");
        }
    }

}




