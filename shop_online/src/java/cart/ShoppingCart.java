/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cart;

import dao.ListDao;
import entity.Product;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author Shahidul
 */
@ManagedBean
@SessionScoped
public class ShoppingCart {

    private List<Item> cart = new ArrayList<>();
    private double total;
    int cartsize;
    String item = "item";

    public List<Item> getCart() {
        return cart;
    }

    public void setCart(List<Item> cart) {
        this.cart = cart;
    }

    public double getTotal() {

        total = 0.0;
        for (Item item : cart) {
            total = total + (item.getQuantity() * item.getP().getProPrice());

        }
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public int getCartsize() {
        cartsize = cart.size();
        return cartsize;
    }

    public void setCartsize(int cartsize) {
        this.cartsize = cartsize;
    }

    public String getItem() {
        if (cartsize > 1) {
            item = "items";

        }
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public String addtoCart(Product p) {
        if (cart.size() > 0) {

            for (Item item : cart) {
                if (item.getP().getProaId().equals(p.getProaId())) {
                    item.setQuantity(item.getQuantity() + 1);
                    return "cart";
                }

            }

        }
        Item i = new Item();
        i.setQuantity(1);
        i.setP(p);
        cart.add(i);
        System.out.println("i am here..... ");
        return "cart";
    }

    public void updateCart() {

    }

    public void removeCart(Item i) {
        for (Item item : cart) {
            if (item.equals(i)) {
                cart.remove(i);
                break;

            }

        }
    }
    
    public String payment(){
        
        return "payment";
    }
    
    

    // display product info
    Product product = new Product();

    private Product selectedProduct;

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Product getSelectedProduct() {
        return selectedProduct;
    }

    public void setSelectedProduct(Product selectedProduct) {
        this.selectedProduct = selectedProduct;
    }

    public List<Product> getAllProduct() {

        List<Product> plist = new ListDao().allProductList();
        return plist;
    }

}
