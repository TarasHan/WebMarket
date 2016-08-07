package ua.lviv.lgs.entity;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Kerol on 07.08.2016.
 */
@Entity
public class Objects {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int id;
    @Column
    private String name;
    @Column
    private  String price;
@ManyToMany(fetch = FetchType.LAZY)
@JoinTable(name = "userObjects",joinColumns = @JoinColumn(name = "id_object"),inverseJoinColumns = @JoinColumn(name = "id_user"))
    private List<User>userListObjects;
@Override
    public String toString() {
        return "Objects{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price='" + price + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Objects(String name, String price) {

        this.name = name;
        this.price = price;
    }

    public Objects() {

    }
}
