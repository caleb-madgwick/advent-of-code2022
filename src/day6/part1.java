package day6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class part1 {
    public static void main(String[] args) {
        Scanner sc;
        try {
            sc = new Scanner(new File("src/day6/input.txt"));

            while (sc.hasNextLine())
            {
                String line = sc.nextLine();

                for (int i = 0; i < line.length(); i++) {
                    HashSet<Character> set = new HashSet<>();
                    for (int j = 0; j < 4; j++) {
                        char c = line.charAt(i+j);
                        set.add(c);
                    }
                    if(set.size()==4){
                        System.out.println(i+4);
                        return;
                    }
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
