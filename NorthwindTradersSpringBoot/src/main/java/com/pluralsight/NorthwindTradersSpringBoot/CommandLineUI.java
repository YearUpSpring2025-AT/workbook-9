package com.pluralsight.NorthwindTradersSpringBoot;

import com.pluralsight.NorthwindTradersSpringBoot.data.ProductDAO;
import com.pluralsight.NorthwindTradersSpringBoot.models.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import java.util.List;

public class CommandLineUI implements CommandLineRunner {
    private ProductDAO productDAO;
    private Console console;

    @Autowired
    public CommandLineUI(ProductDAO productDAO, Console console) {
        this.productDAO = productDAO;
        this.console = console;
    }

    public void run(String... args){


        while (true) {
            System.out.println();
            System.out.println();


            String[] menuOptions = {
                    "List Product",
                    "Add Product",
                    "exit"
            };
            int userChoice = console.promptForOption(menuOptions);
            switch (userChoice) {
                case 1:
                    listProducts();
                    break;
                case 2:
					addProducts();
                    break;
                case 3:
                    System.exit(0);
            }

			console.promptForString("Please press <ENTER> to continue...", true);
        }
    }

    public void listProducts() {
        List<Product> products = this.productDAO.getAll();
        for (Product p : products) {
            System.out.println(p);
        }
    }

    public void addProducts() {

    }
}
