package com.github.com.ValidaCPFJava;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número de CPF: ");
        String CPF = scanner.nextLine();
        Pattern pattern = Pattern.compile("[0-9]{3}\\.[0-9]{3}\\.[0-9]{3}\\-[0-9]{2}");
        Matcher matcher = pattern.matcher(CPF);
        boolean matchFound = matcher.matches();
        if(matchFound){
            System.out.println("Seu CPF é: " + CPF);
        } else{
            System.out.println("Digite um CPF Válido!");
        }
    }
}
