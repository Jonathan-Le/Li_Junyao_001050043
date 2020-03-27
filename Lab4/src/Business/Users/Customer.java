/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Users;

import Business.Abstract.User;
import Business.ProductDirectory;
import java.util.Date;

/**
 *
 * @author AEDSpring2019
 */
public class Customer extends User{
    
    private ProductDirectory directory;

    public Customer(String password, String userName) {
        super(password, userName, "Customer");
        directory = new ProductDirectory();
    }

    public ProductDirectory getDirectory() {
        return directory;
    }

    public void setDirectory(ProductDirectory directory) {
        this.directory = directory;
    }
    
    

    @Override
    public boolean verify(String password) {
            if(password.equals(getPassword()))
            return true;
            return false;
    }
    
}
