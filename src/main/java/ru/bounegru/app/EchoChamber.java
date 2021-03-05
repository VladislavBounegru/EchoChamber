package ru.bounegru.app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EchoChamber {
    public static void main(String[] args) {
        resolve();
    }

    private static void resolve() {
        String line;
        Scanner scanner = new Scanner(System.in);
        List<String> lines = new ArrayList<>();
        
        while (!(line = scanner.nextLine()).equals("")) {
            lines.add(line);
        }
        for (String str: lines){
            System.out.println(str);
        }
    }
}
