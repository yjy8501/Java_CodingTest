package Inplements;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Croatia_Alphabet {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String line = bf.readLine().trim();

        line = line.replaceAll("c=", " ");
        line = line.replaceAll("c-", " ");
        line = line.replaceAll("dz=", " ");
        line = line.replaceAll("d-", " ");
        line = line.replaceAll("lj", " ");
        line = line.replaceAll("nj", " ");
        line = line.replaceAll("s=", " ");
        line = line.replaceAll("z=", " ");

        System.out.print(line.length());
    }
}
