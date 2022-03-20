package pao.tema4;

import java.nio.charset.Charset;
import java.util.Random;



public class PasswordMaker {

    final int MAGIC_NUMBER = 5;
    Random rand = new Random();
    int STRING_LENGTH = rand.nextInt(20, 100);
    String MAGIC_STRIG = generateStr(STRING_LENGTH);
    String NAME;

    public PasswordMaker(String NAME) {
        this.NAME = NAME;
    }

    public String getPassword(){
        String RANDOM_STRING = generateStr(MAGIC_NUMBER);
        RANDOM_STRING += MAGIC_STRIG.substring(0, 11) + NAME.length();
        int RANDOM_INT = rand.nextInt(0,100);
        RANDOM_STRING += RANDOM_INT;

        return RANDOM_STRING;
    }

    //generarea unui string cu caractere aleatoare
    String generateStr(int n){
        byte[] array = new byte[256];
        this.rand.nextBytes(array);
        String RANDOM_STRING = new String(array, Charset.forName("UTF-8"));
        String STR = new String();

        for (int i = 0; i < RANDOM_STRING.length() && n > 0; i++){
            char ch = RANDOM_STRING.charAt(i);
            STR += ch;
            n--;
        }

        return STR;
    }
}

