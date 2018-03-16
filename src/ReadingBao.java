
import java.io.IOException;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class ReadingBao {
     public static void generateMenu() throws IOException {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("===========================Tin Tức ============================");
            System.out.println("1. Sự Kiện ");
            System.out.println("2. Xã Hội.");
            System.out.println("3. Sức Khỏe .");
            System.out.println("4. Thể Thao .");
            System.out.println("5. Thế Giới ");
            System.out.println("6. Exit ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
//                    // get content from url.
//                    System.out.println("Please enter url (from vnexpress.net only): ");
//                    String url = scanner.nextLine();
//               //     News n = getNewsFromUrl(url);
//                    if (n != null) {
//                        listNews.add(n);
//                    }
                    break;
                case 2:
//                    // list content.
//                    printListNews();
//                    break;
                case 3:
//                    getSportLinks();
//                    break;
                case 4:
//                    printSportLink();
//                    break;
                case 5:
                    System.out.println("See you later!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice.");
                    break;
                case 6 :
                    System.out.println(" EXIT");
            }
        }
    
}
}
     
