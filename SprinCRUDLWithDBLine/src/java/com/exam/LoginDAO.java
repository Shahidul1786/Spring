/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.exam;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author HP
 */
public class LoginDAO {

    public void doSave(Login p) {
        Session s = NewHibernateUtil.getSessionFactory().openSession();
        s.beginTransaction();
        s.save(p);
        s.getTransaction().commit();
        s.close();

    }

    public void doDelete(Login p) {
        Session s = NewHibernateUtil.getSessionFactory().openSession();
        s.beginTransaction();
        s.delete(p);
        s.getTransaction().commit();
        s.close();

    }

    public void doUpdate(Login p) {
        Session s = NewHibernateUtil.getSessionFactory().openSession();
        s.beginTransaction();
        s.update(p);
        s.getTransaction().commit();
        s.close();

    }

    public List<Login> doShow(Login p) {
        List<Login> show = new ArrayList<>();
        Session s = NewHibernateUtil.getSessionFactory().openSession();
        show = s.createCriteria(Login.class).list();
        s.close();

        return show;

    }

    public List<Login> show2(Login p) {
        List<Login> li= new ArrayList<>();
        Session s = NewHibernateUtil.getSessionFactory().openSession();
        s.beginTransaction();
        Query q = s.createQuery("from Login");
        li=q.list();
      

        return li;

    }
    
    public boolean checkUser(int id,String p){
        List<Login> li = new ArrayList<>();
        Session s = NewHibernateUtil.getSessionFactory().openSession();
        Query q =s.createQuery("from Login where id="+id+"and password='"+p+"'");
        li=q.list();
        if (li.size()>0) {
            return true;
            
        } else {
            return false;
        }
        
        
    }

}
