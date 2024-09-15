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
import java.util.Arrays;
import java.util.Objects;

/**
 * This class represents the information and behavior that makes up a catalog
 */
public class Catalog {
    private final Product[] productList;
    private final ArrayList<Product> usableList;
    private final ArrayList<String> categories;
    private final ArrayList<String> brands;
    public Catalog(Product[] productList){
        this.productList = productList;
        this.usableList = new ArrayList<>();
        this.categories = new ArrayList<>();
        this.brands = new ArrayList<>();
        for (Product i : this.productList) {
            if (!this.categories.contains(i.getCategory())) {
                this.categories.add(i.getCategory());
            }
            if (!this.brands.contains(i.getBrand())) {
                this.brands.add(i.getBrand());
            }

        }
    }

    /**
     * This method return a Product by his number in the usableList.
     * @param i the number in the usableList of the produc to return.
     * @return The Product required.
     */
    public Product giveProduct(int i){
        return this.usableList.get(i-1);
    }
    /**
     * This method display by console the products inside usableList.
     * <p>
     * This method use a cyclo for to scroll the list and display each product.
     */
    public void displayUsableList(){
        for (int i = 0; i < this.usableList.size(); i++) {
            System.out.printf("%d. %s -%s\n", i + 1, this.usableList.get(i).getName(), this.usableList.get(i).getBrand());
        }
    }

    /**
     * This method is made to display all the complete list of Products.
     * <p>
     * This method adds all productList to usableList and displays it in console.
     * @param True Use the True to display the entire list of Products.
     */
    public void displayUsableList(boolean True ){
        this.usableList.clear();
        this.usableList.addAll(Arrays.asList(this.productList));
        this.displayUsableList();
    }
    /**
     * This method display by console the product's categories
     * <p>
     * This method use a cyclo for to scroll the list and display each category
     */
    public void displayCategories(){
        for(int i=0; i<this.categories.size();i++){
            System.out.printf("%d. %s\n",i+1,this.categories.get(i));
        }
    }
    /**
     * This method display by console the product's brands
     * <p>
     * This method use a cyclo for to scroll the list and display each brand
     */
    public void displayBrand(){
        for(int i=0; i<this.brands.size();i++){
            System.out.printf("%d. %s\n",i+1,this.brands.get(i));
        }
    }
    /**
     * This method makes the list of product of the required category
     * <p>
     * In this method the category attrbute of each Product in the productList
     * are compared with the required category, if them are the same, the product
     * is added to the usableList.
     * <p>
     * The usableList is aresed when the method is used again.
     * @param category String of the required category.
     */
    public void productCategory(int category){
        this.usableList.clear();
        for (Product i : this.productList){
            if (i.getCategory() == this.categories.get(category)){
                this.usableList.add(i);
            }
        }
    }

    /**
     * This method makes the list of products of the required brand
     * <p>
     * In this method the brand attrbute of each Product in the productList
     * are compared with the required brand, if them are the same, the product
     * is added to the usableList.
     * <p>
     * The usableList is aresed when the method is used again.
     * @param brand Intero of the required brand.
     */
    public void productBrand(int brand){
        this.usableList.clear();
        for (Product i : this.productList){
            if (i.getBrand() == this.brands.get(brand)){
                this.usableList.add(i);
            }
        }
    }

}
