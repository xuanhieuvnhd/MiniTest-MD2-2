package controller;

import model.Discount;
import model.Material;

import java.util.LinkedList;
import java.util.List;

public class MaterialManager<E> {
    public static List<Material> materials = new LinkedList<>();


    public void addMaterial(Material material){
        materials.add(material);
    }
    public void displayAll(){
        for (Material m:materials
        ) {
            System.out.println(m);
        }
    }
    public void setMaterial(Material material, int index){
        materials.set(index,material);
    }
    public void deleteMaterial(int index){
        materials.remove(index);
    }

    public double getRealMoney(){
        double total=0;
        for (int i = 0; i < materials.size(); i++) {
            if (materials.get(i) instanceof Discount)
            {
                Discount discount = (Discount) materials.get(i);
                total += discount.getRealMoney();
            }
        }
        return total;
    }
    public double getTotalMoney(){
        double total=0;
        for (int i = 0; i < materials.size(); i++) {
            total += materials.get(i).getAmount();
        }
        return total;
    }

    // tinh chenh lech
    public double getDifference(){
        double difference = getTotalMoney() - getRealMoney();
        return difference;
    }
}
