package io.spring.hibernatemapping.manyToMany;

import io.spring.hibernatemapping.manyToMany.domain.Item;
import io.spring.hibernatemapping.manyToMany.domain.Order;
import io.spring.hibernatemapping.manyToMany.repository.ItemRepository;
import io.spring.hibernatemapping.manyToMany.repository.OrderRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Component
@Slf4j
public class DbMTMInitializer implements CommandLineRunner {

    private final ItemRepository itemRepository;
    private final OrderRepository orderRepository;

    public DbMTMInitializer(ItemRepository itemRepository, OrderRepository orderRepository) {
        this.itemRepository = itemRepository;
        this.orderRepository = orderRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        log.info("Creating test db for many to many (orders items). START");

        Item zelda = new Item(
                "Legend of Zelda Master Sword",
                "To obtain the legendary Master Sword in any of the Zelda games,you first must prove your worthiness.");

        Item gameOfThrones = new Item(
                "Game of Thrones Eddard Stark Mobile Case",
                "Once upon a time, the Starks were a happy family.");

        Item oldBookBackpack = new Item(
                "Old Book Backpack",
                "See, the Olde Book Backpack looks like a book, and it also holds your books.");


        Order firstOrder = new Order(LocalDateTime.now().minusHours(1L), BigDecimal.valueOf(53.69));
        firstOrder.getItems().add(zelda);
        firstOrder.getItems().add(oldBookBackpack);
        orderRepository.save(firstOrder);

        Order secondOrder = new Order(LocalDateTime.now().minusHours(5L), BigDecimal.valueOf(69.99));
        firstOrder.getItems().add(zelda);
        firstOrder.getItems().add(gameOfThrones);
        orderRepository.save(secondOrder);

        zelda.getOrders().add(firstOrder);
        zelda.getOrders().add(secondOrder);

        gameOfThrones.getOrders().add(secondOrder);

        oldBookBackpack.getOrders().add(firstOrder);

        itemRepository.save(zelda);
        itemRepository.save(gameOfThrones);
        itemRepository.save(oldBookBackpack);

        log.info("Creating test db for many to many (orders items). END");
    }

}
