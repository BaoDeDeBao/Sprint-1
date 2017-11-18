/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NgDeBao;


public class OrderedItem {
    
    private String orderedItemId;
    private String quantity;

    public OrderedItem(String orderedItemId, String quantity) {
        this.orderedItemId = orderedItemId;
        this.quantity = quantity;
    }

    public void setOrderedItemId(String orderedItemId) {
        this.orderedItemId = orderedItemId;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getOrderedItemId() {
        return orderedItemId;
    }

    public String getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "ID: " + orderedItemId + "  Quantity: " + quantity + "\n";
    }
    
}
