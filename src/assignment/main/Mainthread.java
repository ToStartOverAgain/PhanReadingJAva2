/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.main;

import assignment.model.ReadingModel;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Admin1
 * 
 */
public class Mainthread {
     public static void main(String[] args) throws IOException {
         ReadingModel readingModel = new ReadingModel();
        System.out.println("====Menu======= ");
        System.out.println("1.Chuyên Mục Xã Hội");
        System.out.println("2.Chuyên Mục Thể Thao ");
        System.out.println("3.Chuyên Mục Sức Khỏe ");
        System.out.println("4.Chuyên Mục Pháp Luật ");
        System.out.println("5. Chuyên Mục Du Lịch ");
         System.out.println("6 .exit ");
        int choose;
        System.out.println("moi ban nhap so");
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        while (true) {
            choose = scanner.nextInt();
            switch (choose) {
                case 1:
             readingModel.xaHoi();
                    break;
                case 2:
              readingModel.theThao();
                    break;
                case 3:
              readingModel.sucKhoe();
                    break;
                case 4:
             readingModel.phapLuat();
                case 5:
                  readingModel.giaoDuc();
                    break;
                case 6:
                    System.out.println("exited!");
                    exit = true;
                    break;
                default:
                    System.err.println(" err ");
                    break;

            }
          

    }
     }
}

    

