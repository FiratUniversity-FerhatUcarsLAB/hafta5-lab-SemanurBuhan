/*
 * Ad Soyad: SEMANUR BUHAN
 * Ogrenci No: 250541007
 * Tarih: 9.11.2025
 * Aciklama: Gorev 2 - Fizik Formulu Asistani
 */

import java.util.Scanner;

public class FizikFormul {

    // Sabit: Yercekimi ivmesi
    final static double GRAVITY = 9.8; 

    //  Hız hesapla 
    public static double calculateVelocity(double distance, double time) {
        return distance / time; 
    }

    //  İvme hesapla 
    public static double calculateAcceleration(double velocityChange, double time) {
         return velocityChange / time; 
    }

    // Kuvvet hesapla 
    public static double calculateForce(double mass, double acceleration) {
        // F = kutle * ivme
        return mass * acceleration; 
    }

    // İş hesapla 
    public static double calculateWork(double force, double distance) {
        return force * distance; 
    }

    //  Güç hesapla 
    public static double calculatePower(double work, double time) {
        return work / time; 
    }

    //Kinetik enerji (KE = 0.5 * m * v²)
    public static double calculateKineticEnergy(double mass, double velocity) {
        return 0.5 * mass * Math.pow(velocity,2); 
    }

    //  Potansiyel enerji 
    public static double calculatePotentialEnergy(double mass, double gravity, double height) {
        return mass * gravity * height; 
    }

    //  Momentum 
    public static double calculateMomentum(double mass, double velocity) {
        return mass * velocity; 
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== FIZIK FORMÜL ASİSTANI ===");
        System.out.println();

        // Temel olcumler 
        System.out.println("TEMEL OLCUMLER:");
        System.out.print("Kutle (kg): ");
        double mass = input.nextDouble();

        System.out.print("Mesafe (m): ");
        double distance = input.nextDouble();

        System.out.print("Zaman (s): ");
        double time = input.nextDouble();

        System.out.print("Hiz degisimi (m/s): ");
        double deltaV = input.nextDouble();

        System.out.print("Yukseklik (m): ");
        double height = input.nextDouble();

        // Hesaplamalar yapıldı metodlar çaığrıldı
        double velocity = calculateVelocity(distance, time);
        double acceleration = calculateAcceleration(deltaV, time);
        double force = calculateForce(mass, acceleration);
        double work = calculateWork(force, distance);
        double power = calculatePower(work, time);
        double kineticEnergy = calculateKineticEnergy(mass, velocity);
        double potentialEnergy = calculatePotentialEnergy(mass, GRAVITY, height);
        double momentum = calculateMomentum(mass, velocity);

        
  


        // SONUCLARI YAZDIR
        System.out.println("\n========================================");
        System.out.println("        HESAPLAMA SONUCLARI");
        System.out.println("========================================");

        System.out.println("\nHIZ ve HAREKET:");
        System.out.printf("  Hiz (v = s/t)             : %.2f m/s\n", velocity);
        System.out.printf("  Ivme (a = Δv/t)           : %.2f m/s²\n", acceleration);

        System.out.println("\nKUVVET ve IS:");
        System.out.printf("  Kuvvet (F = m*a)          : %.2f N\n", force);
        System.out.printf("  Is (W = F*d)              : %.2f J\n", work);
        System.out.printf("  Guc (P = W/t)             : %.2f W\n", power);

        System.out.println("\nENERJI:");
        System.out.printf("  Kinetik Enerji (KE)       : %.2f J\n", kineticEnergy);
        System.out.printf("  Potansiyel Enerji (PE)    : %.2f J\n", potentialEnergy);
        // Toplam enerji = KE + PE
        System.out.printf("  Toplam Enerji             : %.2f J\n", (kineticEnergy + potentialEnergy)); 

        System.out.println("\nMOMENTUM:");
        System.out.printf("  Momentum (p = m*v)        : %.2f kg·m/s\n", momentum);

        System.out.println("\n========================================");

        input.close();
    }
}
