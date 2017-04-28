package Ustawienia;

import java.util.Properties;

/**
 * Created by kamil on 24.04.17.
 */
public class KonfiguracjaLoader {
    private final String nazwaPliku;

    public KonfiguracjaLoader(String nazwaPliku) {
        this.nazwaPliku = nazwaPliku;
    }



    public KonfiguracjaUstaw zaladuj(){

        Properties properties = new Properties();
        KonfiguracjaUstaw  ustaw = new KonfiguracjaUstaw();
        ustaw.setURL(properties.getProperty("URL"));
        return ustaw;

    }


}
