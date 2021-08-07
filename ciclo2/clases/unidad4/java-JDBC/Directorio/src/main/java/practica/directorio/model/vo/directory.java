/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.directorio.model.vo;

/**
 *
 * @author ediei
 */
public class directory {

    private String owner;
    private String name;
    private String cellphone;
    private String email;

    public directory(String owner, String name, String cellphone, String email) {
        this.owner = owner;
        this.name = name;
        this.cellphone = cellphone;
        this.email = email;
    }

    public directory() {}
    
    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCellphone(String cellphone) {
        this.cellphone = cellphone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getOwner() {
        return owner;
    }

    public String getName() {
        return name;
    }

    public String getCellphone() {
        return cellphone;
    }

    public String getEmail() {
        return email;
    }
}
