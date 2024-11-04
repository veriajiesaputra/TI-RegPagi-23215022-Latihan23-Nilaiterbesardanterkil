/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan5;

/*Nama :veri ajie saputra
 *KELAS:pbo
 *NIM  :23215017
 * 
 */
import java.util.Scanner;

public class Latihan_23_Nilaiterbesardanterkecil {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Meminta nama petugas
        System.out.println("=====Program Nilai Terbesar dan Terkecil Nilai Mahasiswa=====");
        System.out.print("Masukkan Nama Petugas: ");
        String namaPetugas = input.nextLine();
        
        // Meminta banyaknya nilai mahasiswa
        System.out.print("Masukkan Banyaknya Nilai Mahasiswa: ");
        int jumlahMahasiswa = input.nextInt();
        
        int[] nilaiMahasiswa = new int[jumlahMahasiswa];
        
        // Memasukkan nilai setiap mahasiswa
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.print("Masukkan Nilai Mahasiswa Ke-" + (i + 1) + " = ");
            nilaiMahasiswa[i] = input.nextInt();
        }
        
        // Inisialisasi nilai terbesar dan terkecil
        int nilaiTerbesar = nilaiMahasiswa[0];
        int nilaiTerkecil = nilaiMahasiswa[0];
        
        // Mencari nilai terbesar dan terkecil
        for (int i = 1; i < jumlahMahasiswa; i++) {
            if (nilaiMahasiswa[i] > nilaiTerbesar) {
                nilaiTerbesar = nilaiMahasiswa[i];
            }
            if (nilaiMahasiswa[i] < nilaiTerkecil) {
                nilaiTerkecil = nilaiMahasiswa[i];
            }
        }
        
        // Menampilkan hasil
        System.out.println("=====Hasil Nilai Mahasiswa=====");
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.println("Nilai Mahasiswa Ke-" + (i + 1) + " = " + nilaiMahasiswa[i]);
        }
        
        System.out.println("\nNilai Terbesar adalah " + nilaiTerbesar);
        System.out.println("Nilai Terkecil adalah " + nilaiTerkecil);
        System.out.println("Petugas : " + namaPetugas);
    }
}

