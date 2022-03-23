package Lesson13;

public class SiameseCat extends Cat {
    private int price;
    private String birthPlace;

    public SiameseCat(String species, int height, int weight, String color, Boolean isWildAnimal,
                      Boolean male, Boolean carnivore, Boolean vertebrates, int age, String catBreed, String name, Boolean owner,
                      int price, String birthPlace){
        this.setSpecies(species);
        this.setHeight(height);
        this.setWeight(weight);
        this.setColor(color);
        this.setWildAnimal(isWildAnimal);
        this.setMale(male);
        this.setCarnivore(carnivore);
        this.setVertebrates(vertebrates);
        this.setAge(age);
        this.setCatBreed(catBreed);
        this.setName(name);
        this.setOwner(owner);
        this.price=price;
        this.birthPlace=birthPlace;
    }

    public int getPrice() {
        return price;
    }

    private void setPrice(int price) {
        this.price = price;
    }

    public String getBirthPlace() {
        return birthPlace;
    }

    private void setBirthPlace(String birthPlace) {
        this.birthPlace = birthPlace;
    }

    public void siameseCatInfo() {
        System.out.println("The cat is born in: " + this.birthPlace);
        System.out.println("The price is: " + this.price);
    }
}
