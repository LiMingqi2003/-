package Interface;

import entity.*;

import java.time.LocalDate;
import java.util.*;

public class MyAnimalShop implements AnimalShop {

    /**
     * 余额
     */
    private double balance;
    /**
     * 动物列表
     */
    private List<Animal> animalList;
    /**
     * 顾客列表
     */
    private List<Customer> customerList;

    private boolean isOpen;

    private double tempBalance;

    public MyAnimalShop(double balance, List<Animal> animalList, List<Customer> customerList, boolean isOpen) {
        this.balance = balance;
        this.animalList = animalList;
        this.customerList = customerList;
        this.isOpen = isOpen;
        this.tempBalance = balance;
    }

    /**
     * 购买动物
     *
     * @param animal
     */
    @Override
    public void buyAnimal(Animal animal) {
        Animal animals = new ChinaDog(animal.animalName, animal.age, animal.sex, animal.price);
        if (tempBalance < animal.price) {
            throw new InsuffcientBalabceException("余额不足，不可购买");
        } else {
            animalList.add(animal);
            tempBalance = tempBalance - animals.price;
            System.out.println("购入" + animal.toString());
        }
    }

    /**
     * 招待顾客
     */
    @Override
    public void entertainClients(Customer customer) {
        customerList.add(customer);
    }

    @Override
    public void closeShop() {

        for (Customer item : customerList) {
            if (item.getVisitsDate().isEqual(LocalDate.now())) {
                System.out.println(item);
                System.out.println("当天盈利:" + String.valueOf(tempBalance - balance));
            }

        }
    }

    @Override
    public void saleAnimal(Animal animal) {
        boolean flag = false;
        for (Animal index : animalList) {
            if (index.animalName.equals(animal.animalName)) {
                flag = true;
                break;
            }
        }
        if (flag) {
            animalList.remove(animal);
            System.out.printf(animal.toString());
            tempBalance = tempBalance + animal.price;
        } else {
            throw new AnimalNotFoundException("店内没有此动物");
        }
    }
}
