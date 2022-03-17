package Lesson13;

public abstract class Animal {
    private String species;
    private int height;
    private int weight;
    private int age;
    private String color;
    private Boolean wildAnimal = false;
    private Boolean male = false;
    private Boolean carnivore = false;
    private Boolean vertebrates = false;

    public Animal() {
    }

    public int getAge() {
        return age;
    }

    protected void setAge(int age) {
        this.age = age;
    }

    protected String getSpecies() {
        return species;
    }

    protected void setSpecies(String species) {
        this.species = species;
    }

    protected Boolean getVertebrates() {
        return vertebrates;
    }

    protected void setVertebrates(Boolean vertebrates) {
        this.vertebrates = vertebrates;
    }

    protected int getHeight() {
        return height;
    }

    protected void setHeight(int height) {
        this.height = height;
    }

    protected int getWeight() {
        return weight;
    }

    protected void setWeight(int weight) {
        this.weight = weight;
    }

    protected String getColor() {
        return color;
    }

    protected void setColor(String color) {
        this.color = color;
    }

    protected Boolean getWildAnimal() {
        return wildAnimal;
    }

    protected void setWildAnimal(Boolean wildAnimal) {
        this.wildAnimal = wildAnimal;
    }

    protected Boolean getMale() {
        return male;
    }

    protected void setMale(Boolean male) {
        this.male = male;
    }

    protected Boolean getCarnivore() {
        return carnivore;
    }

    protected void setCarnivore(Boolean carnivore) {
        this.carnivore = carnivore;
    }

    protected Boolean isMale(){
        return this.male;
    }

    protected String maleOrFemale (){
        if(isMale()){
            return "male ";
        }else {
            return "female ";
        }
    }

    protected void isCarnivore(){
        if(this.carnivore){
            System.out.println("Loves to eat meat.");
        }else {
            System.out.println("Does not love to eat meat.");
        }
    }

    protected void isWildAnimal(){
        if(this.wildAnimal){
            System.out.println("This " + this.species + " is not a domestic animal.");
        }else {
            System.out.println("This " + this.species + " is a domestic animal.");
        }
    }

    public void animalGeneralInfo(){
        System.out.println("This " + this.species + " is " + this.color + " color and weights: " + weight + " kg."+
                            "\nThis " + this.species + " is " + age + " years old."+
                            "\nIts height is: " + height + " cm.");
    }
}





//1. Napraviti apstraktnu klasu Lesson13.Animal i dodati atribute i metode
//        2. Napraviti child klasu Dog koja nasljedjuje Lesson13.Animal
//        3. Napraviti child klasu Cat koja nasljedjuje Lesson13.Animal
//        4. Napraviti child klasu SiameseCat koja nasljedjuje Cat
//        --
//
//        U mainu treba:
//        - instancirati Dog, Cat, SiameseCat
//        - iz svakog objekta pozvati i vlastite ali i parent metode
//
//        Note: Paziti na to sta ce se expose-ati preko gettera/settera,
//        koristiti protected za metode, atribute koji ne bi trebali
//        da budu dostupni javno korisniku klasa.