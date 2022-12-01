//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package common;

import java.io.Serializable;
import java.util.ArrayList;

public class Bike implements Serializable {
    private static final long serialVersionUID = 192L;
    public String id;
    String ownerId;
    String name;
    public Boolean available;
    public int price = 0;

    public Bike(String id, String ownerId, String name, int price) {
        this.id = id;
        this.ownerId = ownerId;
        this.name = name;
        this.available = true;
        this.price = price;
    }
}
