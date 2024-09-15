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

import java.util.ArrayList;

/**
 * This class represents the behavior of a shopping cart
 */
public class Cart {
    private final ArrayList<Product> shopping = new ArrayList<>();

    /**
     * This method add a product to the cart.
     * <p>
     * Takes the product given and add it to the cart or the lis shopping.
     * @param product: The product to add at the cart.
     */
    public void addProduct(Product product){
        this.shopping.add(product);
    }

    /**
     * This method display the content of the shopping cart.
     * <p>
     * This method use a cyclo for to scroll the list and display each product.
     */
    public void displayCart(){
        if (!this.shopping.isEmpty()) {
            for (int i = 0; i < this.shopping.size(); i++) {
                System.out.printf("%d. %s -%s\n", i + 1, this.shopping.get(i).getName(), this.shopping.get(i).getBrand());
            }
        }else{
            System.out.println("The shopping cart is empty");
        }
    }

    /**
     * This method return the number of products in the cart.
     * @return The int of the cart's size
     */
    public int size(){
        return this.shopping.size();
    }
}
