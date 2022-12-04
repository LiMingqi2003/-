package entity;

public abstract class Animal {

    public String animalName;
    public int age;
    public String sex;
    public double price;

    public Animal(String animalName, int age, String sex, double price) {
        this.animalName = animalName;
        this.age = age;
        this.sex = sex;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "animalName='" + animalName + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", price=" + price +
                '}' + '\n';
    }

}
