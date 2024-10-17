package ObjectClass;

import java.util.Scanner;

public class DriverClass {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Pilih Kategori Shape\n 1. Rectangle\n 2. Circle");
        String pilihan = s.nextLine();
        if (pilihan.equals("1")) {
            System.out.println("Cube? (Yes/No)");
            String input = s.nextLine();
            if (input.equalsIgnoreCase("Yes")) {
                System.out.println("--Cube--");
                System.out.println("Name: ");
                String name = s.nextLine();
                System.out.println("Color: ");
                String color = s.nextLine();
                System.out.println("Lenght: ");
                int lenght = s.nextInt();
                System.out.println("Width: ");
                int width = s.nextInt();
                System.out.println("Height");
                int height = s.nextInt();
                Cube a = new Cube (name, color, lenght, width, height);
                a.print();
                a.calculate();
            }else if (input.equalsIgnoreCase("No")) {
                System.out.println("--Rectangle--");
                System.out.println("Name: ");
                String name = s.nextLine();
                System.out.println("Color: ");
                String color = s.nextLine();
                System.out.println("Lenght: ");
                int lenght = s.nextInt();
                System.out.println("Width: ");
                int width = s.nextInt();
                Rectangle b = new Rectangle(name, color, lenght, width);
                b.print();
                b.calculate();
            }
            
        }else if (pilihan.equals("2")) {
                System.out.println("--Novel--");
                System.out.println("Name: ");
                String name = s.nextLine();
                System.out.println("Color: ");
                String color = s.nextLine();
                System.out.println("Radius: ");
                int radius = s.nextInt();
                Circle c = new Circle(name, color, radius);
                c.print();
                c.calculate();
            }else{
                System.out.println("Kategori Tidak Tersedia");
            }
            s.close();
        } 
    }


    

