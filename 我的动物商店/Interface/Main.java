package org.example;

import Interface.AnimalShop;
import Interface.MyAnimalShop;
import entity.Animal;
import entity.Cat;
import entity.ChinaDog;
import entity.Customer;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Animal chinaDog = new ChinaDog("二毛", 1, "male", 200.0);
        Animal cat = new Cat("喵喵", 2, "female", 500.0);
        List<Animal> animalList = new ArrayList<>();
        animalList.add(chinaDog);
        animalList.add(cat);
        List<Customer> customerList = new ArrayList<>();
        //余额不足情况
//        AnimalShop myAnimal = new MyAnimalShop(10.0, animalList, customerList,true,0.0);
//        myAnimal.buyAnimal(chinaDog);
        //余额充足
        AnimalShop myAnimals = new MyAnimalShop(1000.0, animalList, customerList, true);

        Animal chinaDog1 = new ChinaDog("狗狗", 1, "female", 100.0);
        myAnimals.buyAnimal(chinaDog1);

        Customer customer = new Customer();
        customer.setCustomerName("zhangsan");
        customer.setVisitsDate(LocalDate.now());
        customer.setVisitsNum(1);
        myAnimals.entertainClients(customer);
        //没有此动物
//      Animal cat1 = new Cat("meimei",2,"female",100.0);
//      myAnimals.saleAnimal(cat1);
        myAnimals.saleAnimal(cat);
        myAnimals.saleAnimal(chinaDog);
        //x歇业并计算盈利
        myAnimals.closeShop();
    }
}