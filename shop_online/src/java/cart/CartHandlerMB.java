/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cart;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author Shahidul
 */
@ManagedBean
@SessionScoped
public class CartHandlerMB {

    List<CartBind> cartList = new ArrayList<CartBind>();
    int productId;
    int cartSize;
    String productname;
    int quantity=1;
    double price;
    double total;
    String item = "item";
    String selectedzone;
    
    Map<Integer, CartBind> map = new HashMap<Integer, CartBind>();

    public Map<Integer, CartBind> getMap() {
        return map;
    }

    public void setMap(Map<Integer, CartBind> map) {
        this.map = map;
    }
    
    
    
    public List<CartBind> getCartList() {
        return cartList;
    }

    public void setCartList(List<CartBind> cartList) {
        this.cartList = cartList;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getCartSize() {
        return cartSize;
    }

    public void setCartSize(int cartSize) {
        this.cartSize = cartSize;
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public String getSelectedzone() {
        return selectedzone;
    }

    public void setSelectedzone(String selectedzone) {
        this.selectedzone = selectedzone;
    }
    

   
    public String processCart(int qty) {

        CartBind cb = new CartBind();
        quantity = qty;
        cb.setProductname(productname);
        System.out.println(quantity+"---------");
        cb.setQuantity(quantity);
        cb.setPrice(price);
        cb.setTotal(quantity*price);
        cartList.add(cb);
        map.put(productId, cb);
        cartSize = cartList.size();
        
        for (CartBind bind : cartList) {
            
        }

        if (cartSize>1) {
            item = "items";
        }
        return null;
    }

}
