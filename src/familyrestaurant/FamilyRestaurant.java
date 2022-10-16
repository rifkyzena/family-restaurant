package familyrestaurant;

import java.util.ArrayList;
import java.util.Scanner;

public class FamilyRestaurant {

    private Scanner sc = new Scanner(System.in);
    private ArrayList<Regular> regulars = new ArrayList<>();
    private ArrayList<Special> specials = new ArrayList<>();

    private boolean isIntAccepted(String intValue) {

        boolean hasil = false;

        try {
            int value = Integer.valueOf(intValue);

            if (value >= 10000 && value <= 100000) {
                hasil = true;
            }
        } catch (NumberFormatException e) {
        }

        return hasil;
    }

    private void addRegularMenu() {

        String code;
        String name;
        int panjangName;
        String price;

        System.out.println("Add Regular Menu");
        System.out.println("======================");
        sc.nextLine();
        do {
            System.out.print("input menu code [R...]: ");
            code = sc.nextLine();
        } while ((code.charAt(0) != 'R') || (code.length() != 4));

        do {
            System.out.print("input menu name [5-20]: ");
            name = sc.nextLine();
            panjangName = name.length();
        } while (panjangName < 5 || panjangName > 20);

        do {
            System.out.print("input menu price [10000-100000]: ");
            price = sc.nextLine();
        } while (!isIntAccepted(price));

        Regular newRegular = new Regular(code, name, Integer.parseInt(price));
        regulars.add(newRegular);

        System.out.println("Add Success!");

    }

    private void addSpecialMenu() {

        String code;
        String name;
        int panjangName;
        String price;
        int discount;

        System.out.println("Add Special Menu");
        System.out.println("======================");
        sc.nextLine();
        do {
            System.out.print("input menu code [S...]: ");
            code = sc.nextLine();
        } while ((code.charAt(0) != 'S') || (code.length() != 4));

        do {
            System.out.print("input menu name [5-20]: ");
            name = sc.nextLine();
            panjangName = name.length();
        } while (panjangName < 5 || panjangName > 20);

        do {
            System.out.print("input menu price [10000-100000]: ");
            price = sc.nextLine();
        } while (!isIntAccepted(price));

        do {
            System.out.print("input menu discount [10% | 25% | 50%]: ");
            discount = sc.nextInt();
        } while (discount != 10 && discount != 25 && discount != 50);

        Special newSpecial = new Special(discount, code, name, Integer.parseInt(price));
        specials.add(newSpecial);

        System.out.println("Add Success!");

    }

    private void showRegulars() {

        System.out.println("Reguler Menu");

        if (regulars.isEmpty()) {
            System.out.println("Menu reguler kosong!");
            return;
        }

        System.out.println("============================================================");
        System.out.printf("| %-5s | %-7s | %-25s | %-10s |\n", "No.", "Kode", "Nama", "Harga");
        System.out.println("============================================================");
        int countRegular = regulars.size();

        for (int i = 0; i < countRegular; i++) {
            System.out.printf("| %-5d | %-7s | %-25s | %-10d |\n", (i + 1), regulars.get(i).getCode(), regulars.get(i).getName(), regulars.get(i).getPrice());
        }
    }

    private void showSpecials() {

        System.out.println("Special Menu");

        if (specials.isEmpty()) {
            System.out.println("Menu spesial kosong!");
            return;
        }

        System.out.println("==============================================================================");
        System.out.printf("| %-5s | %-7s | %-25s | %-10s | %-15s |\n", "No.", "Kode", "Nama", "Harga", "Diskon");
        System.out.println("==============================================================================");
        int countSpecial = specials.size();

        for (int i = 0; i < countSpecial; i++) {
            System.out.printf("| %-5d | %-7s | %-25s | %-10d | %-10f%5s |\n", (i + 1), specials.get(i).getCode(), specials.get(i).getName(), specials.get(i).getPrice(), specials.get(i).getDiscount(), "%");
        }
    }

    private void showAllMenu() {
        showRegulars();
        System.out.println("\n");
        showSpecials();
    }

    private int isRegularAvail(String code) {
        int countRegular = regulars.size();
        for(int i = 0; i < countRegular; i++) {
            if(regulars.get(i).getCode().equals(code)) {
                return i;
            }
        }
        
        return -1;
    }
    
    private int isSpecialAvail(String code) {
        int countSpecial = specials.size();
        for(int i = 0; i < countSpecial; i++) {
            if(specials.get(i).getCode().equals(code)) {
                return i;
            }
        }
        
        return -1;
    }
    
    private void deleteRegularMenu() {
        
        String code;
        
        System.out.println("Delete Reguler Menu");
        System.out.println("=============================");
        
        if (regulars.isEmpty()) {
            System.out.println("Menu reguler kosong!");
            return;
        }

        sc.nextLine();
        do {
            System.out.print("input menu code [R...]: ");
            code = sc.nextLine();
        } while ((code.charAt(0) != 'R') || (code.length() != 4));

        int deletedRegular;
        if((deletedRegular = isRegularAvail(code)) != -1) {
            regulars.remove(deletedRegular);
            System.out.println("Delete Success!");
        } else {
            System.out.println("Code is Wrong");
        }
    }

    private void deleteSpecialMenu() {

        String code;
        
        System.out.println("Delete Special Menu");
        System.out.println("=============================");
        
        if (specials.isEmpty()) {
            System.out.println("Menu spesial kosong!");
            return;
        }

        sc.nextLine();
        do {
            System.out.print("input menu code [S...]: ");
            code = sc.nextLine();
        } while ((code.charAt(0) != 'S') || (code.length() != 4));

        int deletedSpecial;
        if((deletedSpecial = isSpecialAvail(code)) != -1) {
            specials.remove(deletedSpecial);
            System.out.println("Delete Success!");
        } else {
            System.out.println("Code is Wrong");
        }
    }

    private void menuUtama() {
        int choice;
        do {
            System.out.println("Family Restaurant");
            System.out.println("===========================");
            System.out.println("1. Add Regular Menu");
            System.out.println("2. Add Special Menu");
            System.out.println("3. Show All Menu");
            System.out.println("4. Delete Regular Menu");
            System.out.println("5. Delete Special Menu");
            System.out.println("6. Exit");
            System.out.print("Choice [1-6] : ");
            choice = sc.nextInt();

            System.out.println("");
            if (choice == 1) {
                addRegularMenu();
            } else if (choice == 2) {
                addSpecialMenu();
            } else if (choice == 3) {
                showAllMenu();
            } else if (choice == 4) {
                deleteRegularMenu();
            } else if (choice == 5) {
                deleteSpecialMenu();
            } else if (choice == 6) {
                // exit
            }
            System.out.println("");

        } while (choice != 6);
    }

    public static void main(String[] args) {
        FamilyRestaurant f = new FamilyRestaurant();
        f.menuUtama();
    }

}
