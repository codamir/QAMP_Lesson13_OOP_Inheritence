package Lesson13;

public class Cat extends Animal {
    private String catBreed;
    private String name;
    private Boolean owner = false;

    public Cat(String species, int height, int weight, String color, Boolean isWildAnimal,
               Boolean male, Boolean carnivore, Boolean vertebrates, int age, String catBreed,
               String name, Boolean owner) {
        this.setSpecies(species);
        this.setHeight(height);
        this.setWeight(weight);
        this.setColor(color);
        this.setWildAnimal(isWildAnimal);
        this.setMale(male);
        this.setCarnivore(carnivore);
        this.setVertebrates(vertebrates);
        this.setAge(age);
        this.catBreed=catBreed;
        this.name=name;
        this.owner=owner;
    }

    protected Cat() {
    }
    //kreirao sam jos jedan prazan konstruktor jer mi je u child klasi ovog parenta Cat javljalo gresku (da nema default
    //konstruktora. Nadam se da je ovo ok rjesenje, nista mi drugo nije padalo na pamet.


    public String getCatBreed() {
        return catBreed;
    }

    protected void setCatBreed(String catBreed) {
        this.catBreed = catBreed;
    }

    public String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    public Boolean getOwner() {
        return owner;
    }

    protected void setOwner(Boolean owner) {
        this.owner = owner;
    }

    public void catBasicInfo() {
        System.out.println("This cats name is " + this.name +".");
        System.out.println(this.name + " is " + maleOrFemale() + "cat.");
        isCarnivore();
        isWildAnimal();
    }

    public void isCatAabandoned() {
        if (hasOwner()) {
            System.out.println(this.name + " has owner and loves him.");
        } else {
            System.out.println(this.name + " does not have owner, needs shelter :(");
        }
    }

    public void ifFounded() {
        if (hasOwner()) {
            System.out.println("Please contact the owner of the cat.");
        } else {
            System.out.println("Maybe you would like to own a cat :)");
        }
    }

    private Boolean hasOwner() {
        return this.owner;
    }
}
