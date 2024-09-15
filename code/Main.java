/**
 * This module is an example of an abstract class to define a calculator operations.
 *<p>
 * Copyright (C) 2024  Mathew Zahav Rodriguez Clavijo <mzclavijor1204@gmail.com>
 *<p>
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *<p>
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *<p>
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package code;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] xrctvybunijm) {
        Scanner sc = new Scanner(System.in);
        Product[] laLista = {
                new Product("Rasberri pi", "Lenovo", "Programming"),
                new Product("Rasberri pi", "Logitech", "Programming"),
                new Product("Keyboard", "Corsair", "Programming"),
                new Product("Keyboard", "Logitech", "Programming"),
                new Product("Laptop gamer", "AMD", "Programming"),
                new Product("Laptop gamer", "Lenovo", "Programming"),
                new Product("Laptop gamer", "Intel", "Programming"),
                new Product("Laptop gamer", "Asus", "Programming"),
                new Product("Tv", "Samsung", "Entertaiment"),
                new Product("Tv", "Lg", "Entertaiment"),
                new Product("Multi-socket charger", "AMD", "Daily life"),
                new Product("Rice cooker", "Samsung", "Daily life"),
                new Product("Rice cooker", "AMD", "Daily life"),
                new Product("Rice cooker", "Lg", "Daily life"),
                new Product("Refrigerator", "Samsung", "Daily life"),
                new Product("Refrigerator", "Lg", "Daily life"),
                new Product("Refrigerator", "AMD", "Daily life"),
                new Product("Blender", "Lg", "Daily life"),
                new Product("Blender", "Samsung", "Daily life"),
                new Product("Blender", "Asus", "Daily life"),
                new Product("Processor", "AMD", "Programming"),
                new Product("Processor", "Intel", "Programming"),
                new Product("Ram memory", "Corsair", "Programming"),
                new Product("Ram memory", "AMD", "Programming"),
                new Product("Screen", "Lenovo", "Programming"),
                new Product("Screen", "Asus", "Programming"),
                new Product("Console", "Xbox", "Entertaiment"),
                new Product("Console", "Play Station", "Entertaiment"),
                new Product("Memory SSD", "Samsung", "Programming"),
                new Product("Memory SSD", "Corsair", "Programming"),
                new Product("Memory SSD", "Intel", "Programming")
        };
        Catalog catalogo = new Catalog(laLista);
        Cart carrito = new Cart();
        int option, selection = 0;
        System.out.println("Welcome to a catalog of electronic devices.");
        System.out.println("1. All products \n2. Categories\n3. Filter by brand\n4. Display shopping cart\n5. Exit");
        option = sc.nextInt();
        while (option != 5) {
            if (option == 1) {
                selection = 0;
                while (selection != 1) {
                    System.out.println("Products:");
                    catalogo.displayUsableList(true);
                    System.out.println("Choose a product");
                    selection = sc.nextInt();
                    catalogo.giveProduct(selection).display();
                    System.out.println("Would you like to add this product to your shopping cart?\n1. Yes       2. No");
                    option = sc.nextInt();
                    if (option == 1) {
                        carrito.addProduct(catalogo.giveProduct(selection));
                    }
                    System.out.println("What do you want to do?\n1. Go to main menu        2.Back to previous list");
                    selection = sc.nextInt();
                }
            } else if (option == 2) {
                selection = 0;
                while (selection != 1) {
                    System.out.println("Categories:");
                    catalogo.displayCategories();
                    System.out.println("Which category do you want?");
                    selection = sc.nextInt();
                    catalogo.productCategory(selection - 1);
                    catalogo.displayUsableList();
                    System.out.println("Choose a product");
                    selection = sc.nextInt();
                    catalogo.giveProduct(selection).display();
                    System.out.println("Would you like to add this product to your shopping cart?\n1. Yes       2. No");
                    option = sc.nextInt();
                    if (option == 1) {
                        carrito.addProduct(catalogo.giveProduct(selection));
                        System.out.println("The product was added");
                    }
                    System.out.println("What do you want to do?\n1. Go to main menu        2.Back to previous list");
                    selection = sc.nextInt();
                }
            } else if (option == 3) {
                selection = 0;
                while (selection != 1) {
                    System.out.println("Brands:");
                    catalogo.displayBrand();
                    System.out.println("Which brand do you want?");
                    selection = sc.nextInt();
                    catalogo.productBrand(selection - 1);
                    catalogo.displayUsableList();
                    System.out.println("Choose a product");
                    selection = sc.nextInt();
                    catalogo.giveProduct(selection).display();
                    System.out.println("Would you like to add this product to your shopping cart?\n1. Yes       2. No");
                    option = sc.nextInt();
                    if (option == 1) {
                        carrito.addProduct(catalogo.giveProduct(selection));
                        System.out.println("The product was added");
                    }
                    System.out.println("What do you want to do?\n1. Go to main menu        2.Back to previous list");
                    selection = sc.nextInt();
                }

            } else if(option == 4){
                System.out.println("Here are your products");
                carrito.displayCart();
                System.out.println("Do you want to checkout and place your order?\n1. Yes       2. No");
                selection = sc.nextInt();
                if (selection == 1){
                    System.out.println("Enter your name");
                    String name = sc.nextLine();
                    System.out.println("Enter your address");
                    String d = sc.nextLine();
                    System.out.printf("Products will be shipped to %s in %s",name,d);
                    System.exit(0);
                }
            }
            System.out.println("1. All products \n2. Categories\n3. Filter by brand\n4. Display shopping cart\n5. Exit");
            option = sc.nextInt();
        }
    }
}
