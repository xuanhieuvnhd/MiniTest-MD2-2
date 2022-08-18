package views;

import controller.MaterialManager;
import model.CrispyFlour;
import model.Material;
import model.Meat;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Material botMi = new CrispyFlour("01", "Bot Mi", getLocalDate(2022, 8, 15), 20000, 10);
        Material botTom = new CrispyFlour("02", "Bot Tom", getLocalDate(2021, 7, 15), 2000, 99);
        Material botThongCong = new CrispyFlour("03", "Bot Thong Cong", getLocalDate(2022, 6, 15), 15000, 60);
        Material botDa = new CrispyFlour("04", "Bot Da", getLocalDate(2022, 5, 15), 200000, 100);
        Material botCanh = new CrispyFlour("05", "bot Canh", getLocalDate(2022, 4, 16), 200000, 60);

        Material thitNhau = new Meat("01", "Thit Nhau", getLocalDate(2022, 1, 15), 500000, 50);
        Material thitNguoi = new Meat("02", "Thit Nguoi", getLocalDate(2022, 2, 15), 5000000, 1);
        Material thitChuot = new Meat("03", "Thit Chuot", getLocalDate(2022, 3, 15), 50000, 2);
        Material thitLon = new Meat("04", "Thit Lon", getLocalDate(2022, 4, 15), 130000, 3);
        Material thitHeo = new Meat("05", "Thit Heo", getLocalDate(2022, 5, 15), 130000, 4);
        Material thitH = new Meat("?", "Thit Heo", getLocalDate(2022, 5, 15), 130000, 4);
        MaterialManager materialManage = new MaterialManager();

        materialManage.addMaterial(botMi);
        materialManage.addMaterial(botTom);
        materialManage.addMaterial(botThongCong);
        materialManage.addMaterial(botDa);
        materialManage.addMaterial(botCanh);
        materialManage.addMaterial(thitNhau);
        materialManage.addMaterial(thitNguoi);
        materialManage.addMaterial(thitChuot);
        materialManage.addMaterial(thitLon);
        materialManage.addMaterial(thitHeo);

        materialManage.displayAll();

        System.out.println(materialManage.getRealMoney());
        System.out.println(materialManage.getDifference());


    }

    private static LocalDate getLocalDate(int year, int month, int day) {
        return LocalDate.of(year, month, day);
    }
}
