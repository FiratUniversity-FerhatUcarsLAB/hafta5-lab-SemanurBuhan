/*
 * Ad Soyad: SEMANUR BUHAN
 * Ogrenci No: 250541007
 * Tarih: 8.11.2025
 * Aciklama: Gorev 1 - Geometrik Sekil Hesaplayici
 */

import java.util.Scanner;

public class GeometriHesap {
    
    //Kare alani
    public static double calculateSquareArea(double side) {
         return side * side; 
    }
    
    // Kare cevresi
    public static double calculateSquarePerimeter(double side) {
         return 4 * side; 
    }
    
    // Dikdortgen alani
    public static double calculateRectangleArea(double width, double height) {
          return width * height;
    }
    
    // Dikdortgen cevresi
    public static double calculateRectanglePerimeter(double width, double height) {
         return 2 * (width + height);
    }
    
    //  Daire alani
    public static double calculateCircleArea(double radius) {
         return Math.PI * Math.pow(radius,2); 
    }
    
    //  Daire cevresi
    public static double calculateCircleCircumference(double radius) {
          return 2 * Math.PI * radius; 
    }
    
    //Ucgen alani 
    public static double calculateTriangleArea(double base, double height) {
         return base * height / 2;
    }
    
    //  Ucgen cevresi
    public static double calculateTrianglePerimeter(double a, double b, double c) {
          return a + b + c; 
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("=== GEOMETRIK ŞEKİL HESAPLAYICI ===");
        System.out.println();
        
        // KARE 
        System.out.println("KARE: ");
        System.out.print("Kenar uzunlugu (cm): ");
        double squareSide = input.nextDouble();
        
        // DIKDORTGEN 
        System.out.println("\nDİKDÖRTGEN:");
        System.out.print("KIsa kenar (cm): ");
        double rectWidth = input.nextDouble();
        System.out.print("Uzun kenar (cm): ");
        double rectHeight = input.nextDouble();
        
        // DAIRE 
        System.out.println("\nDAIRE:");
        System.out.print("Yarıçap (cm): ");
        double radius = input.nextDouble();
        
        // UCGEN 
        System.out.println("\nÜÇGEN:");
        System.out.print("Taban (cm): ");
        double base = input.nextDouble();
        System.out.print("Yukseklik (cm): ");
        double height = input.nextDouble();
        System.out.print("1. kenar (cm): ");
        double side1 = input.nextDouble();
        System.out.print("2. kenar (cm): ");
        double side2 = input.nextDouble();
        System.out.print("3. kenar (cm): ");
        double side3 = input.nextDouble();
        
        // Hesaplamalar yapıldı metodlar cagrildi
        

        double squareArea = calculateSquareArea(squareSide);
        double squarePerimeter = calculateSquarePerimeter(squareSide);
        double rectangleArea = calculateRectangleArea(rectWidth, rectHeight);
        double rectanglePerimeter = calculateRectanglePerimeter(rectWidth, rectHeight);
        double circleArea = calculateCircleArea(radius);
        double circleCircumference = calculateCircleCircumference(radius);
        double triangleArea = calculateTriangleArea(base, height);
        double trianglePerimeter = calculateTrianglePerimeter(side1, side2, side3);
        
        
        // SONUCLARI YAZDIR
        System.out.println("\n========================================");
        System.out.println("         HESAPLAMA SONUCLARI");
        System.out.println("========================================");
        
        System.out.printf("\nKARE (kenar: %.1f cm):\n", squareSide);
        System.out.printf("Alan: %.2f cm²\n", squareArea);
        System.out.printf("Cevre: %.2f cm\n", squarePerimeter);
        
        
        System.out.printf("\nDIKDORTGEN (%.1f x %.1f cm):\n", rectWidth, rectHeight);
        System.out.printf("\nDIKDORTGEN (%.1f x %.1f cm):\n", rectWidth, rectHeight);
        System.out.printf("Alan: %.2f cm²\n", rectangleArea);
        System.out.printf("Cevre: %.2f cm\n", rectanglePerimeter);
        
        
        System.out.printf("\nDAIRE (yaricap: %.1f cm):\n", radius);
        System.out.printf("Alan: %.2f cm²\n", circleArea);
        System.out.printf("Cevre: %.2f cm\n", circleCircumference);
        
        
        System.out.printf("\nUCGEN (taban: %.1f, yukseklik: %.1f cm):\n", base, height);
        System.out.printf("Alan: %.2f cm²\n", triangleArea);
        System.out.printf("Cevre: %.2f cm\n", trianglePerimeter);
        
        
        System.out.println("========================================");
        
        input.close();
    }
}
