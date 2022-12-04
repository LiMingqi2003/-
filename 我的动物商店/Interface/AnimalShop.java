package Interface;

import entity.Animal;
import entity.Customer;

import javax.lang.model.element.AnnotationMirror;

public interface AnimalShop {
    /**
     * 购买动物
     */
    void buyAnimal(Animal animal);

    /**
     * 招待客户
     */
    void entertainClients(Customer customer);

    /**
     * 歇业
     */
    void closeShop();

    void saleAnimal(Animal animal);
}
