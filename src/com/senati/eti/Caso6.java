package com.senati.eti;

import com.senati.eti.model.Alumno;

import java.util.Scanner;

import java.io.*;

public class Caso6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		FileWriter archivo = null;
		PrintWriter pw = null;
		
		try {
			archivo = new FileWriter("info.txt", true);
			pw = new PrintWriter(archivo);
			
			System.out.println("REGISTRO DE DATOS");
			System.out.println("=================");
			System.out.print("Nombre...........: ");
			String nom = sc.nextLine();
			
			System.out.print("Apellido.........: ");
			String ape = sc.nextLine();
			
			System.out.print("Genero [M-F].....: ");
			String gen = sc.nextLine();
			
		    System.out.print("Edad[15-30]......: ");
			int ed = sc.nextInt();
			
			String estado = "";
			
			if (ed >= 18) {
				estado = "Mayor de edad";
			}
			else 
				estado ="Menor de edad";
			
			Alumno alu = new Alumno(nom, ape, gen, ed);

			pw.println("Datos Registrados");
			pw.println("-----------------");
			
			pw.println("Nombre y Apellido....: " + alu.NombreCompleto());
			pw.println("Genero...............: " + alu.MostrarGenero());
			pw.println("Estado...............: " + alu.MostrarEstado());
			
			System.out.println("EL archivo fue creado correctamente");
			
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			//Cierre del archivo
			try {
				if (archivo != null)
					archivo.close();
			} catch (Exception ex2) {
				ex2.printStackTrace();
			}
			
		}

	}

}
