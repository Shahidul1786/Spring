/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import com.sun.faces.action.RequestMapping;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Shahidul
 */

public class ProductController {
    
    public String doSave() {
        
return "result";
    }

   @RequestMapping("update.htm")
    public String doUpdate() {
       
        return "result";

    }

   @RequestMapping("delete.htm")

    public String doDelete() {
      
        return "result";
    }

  @RequestMapping("check.htm")

    public String doShow() {
     

            return "loginPage";
       

    }

  @RequestMapping("show2.htm")

    public String show2() {
    
        return "update";
    }
    
}
