import java.io.*;
import java.util.*;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Java_MD5 {

 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(getMD5(sc.nextLine()));
    }

    private static String getMD5(String inputString){
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");

            byte[] messageDigest = md.digest(inputString.getBytes());
            BigInteger no = new BigInteger(1, messageDigest);
            String hashtext = no.toString(16);
            while (hashtext.length() < 32) {
                hashtext = "0" + hashtext;
            }
            return hashtext;
        } catch(NoSuchAlgorithmException e){
            throw new RuntimeException(e);
        }
    }
}