/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.dragonknight.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author gee
 */
public class Inventory implements Serializable {
    private String itemName;
    private String itemDescription;
    private String itemType;
    private int itemDamage;
    private int itemHeal;
    private int itemAmount;

    public Inventory() {
    }
    
    public Inventory(String itemName, String itemDescription, int itemDamage, int itemHeal, int itemAmount) {
        this.itemName = itemName;
        this.itemDescription = itemDescription;
        this.itemDamage = itemDamage;
        this.itemHeal = itemHeal;
        this.itemAmount = itemAmount;
        
    }
    
    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }
    
    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    public String getItemType() {
        return itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    public int getItemDamage() {
        return itemDamage;
    }

    public void setItemDamage(int itemDamage) {
        this.itemDamage = itemDamage;
    }

    public int getItemHeal() {
        return itemHeal;
    }

    public void setItemHeal(int itemHeal) {
        this.itemHeal = itemHeal;
    }

    public int getItemAmount() {
        return itemAmount;
    }

    public void setItemAmount(int itemAmount) {
        this.itemAmount = itemAmount;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.itemDescription);
        hash = 97 * hash + Objects.hashCode(this.itemType);
        hash = 97 * hash + this.itemDamage;
        hash = 97 * hash + this.itemHeal;
        hash = 97 * hash + this.itemAmount;
        return hash;
    }

    @Override
    public String toString() {
        return "Items{" + "itemDescription=" + itemDescription + ", itemType=" + itemType + ", itemDamage=" + itemDamage + ", itemHeal=" + itemHeal + ", itemAmout=" + itemAmount + '}';
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Inventory other = (Inventory) obj;
        if (this.itemDamage != other.itemDamage) {
            return false;
        }
        if (this.itemHeal != other.itemHeal) {
            return false;
        }
        if (this.itemAmount != other.itemAmount) {
            return false;
        }
        if (!Objects.equals(this.itemDescription, other.itemDescription)) {
            return false;
        }
        if (!Objects.equals(this.itemType, other.itemType)) {
            return false;
        }
        return true;
    }
    
    
    
}