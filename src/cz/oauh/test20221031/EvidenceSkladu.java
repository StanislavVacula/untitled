package cz.oauh.test20221031;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class EvidenceSkladu {
    private SkladovanaPolozka seznam;

    public EvidenceSkladu(SkladovanaPolozka seznam) {
        setSeznam(seznam);
    }

    public SkladovanaPolozka getSeznam() {
        return seznam;
    }

    public void setSeznam(SkladovanaPolozka seznam) {

        this.seznam = seznam;
    }

    public static void main(String[] args) {
        String soubor = "text.txt";
        ArrayList<SkladovanaPolozka> polozka = new ArrayList<>();
        try(
                FileReader fr = new FileReader(soubor);
                BufferedReader br = new BufferedReader(fr);
                Scanner sc = new Scanner(br);
        ){
            String radek;
            while(sc.hasNext()){
                radek = sc.nextLine();
                String[] pole =radek.split("#");
                String nazevSkladovePolozky = pole[0];
                String mnozstviKusuNaSkladeSlovem = pole[1];
                int mnozstviKusuNaSkladeCislem = Integer.parseInt(mnozstviKusuNaSkladeSlovem);
                String hmotnostJednohoKusu = pole[2];
                int hmotnostJednohoKusuCislo = Integer.parseInt(hmotnostJednohoKusu);
                String cenaJednohoKusu = pole[3];
                String zboziVNabidce = pole[4];
                String datumZavedeni = pole[5];
                SkladovanaPolozka skladovanaPolozka = new SkladovanaPolozka(nazevSkladovePolozky, mnozstviKusuNaSkladeCislem, hmotnostJednohoKusuCislo,cenaJednohoKusu, zboziVNabidce, datumZavedeni);
                throw new ZboziVNabidceException("Zboží není v nabídce");

            }
        }
        catch (FileNotFoundException e){
            throw new RuntimeException(e);
        }
        catch (IOException e){
            throw new RuntimeException(e);
        } catch (ZboziVNabidceException e) {
            System.err.println("Chyba: " +e.getMessage());
        }
        SkladovanaPolozka skladovanaPolozka1 = new SkladovanaPolozka("květináč plastový hnědy", 84,  2, 17, false
        , LocalDate.of(2023,10, 23));
        SkladovanaPolozka skladovanaPolozka2 = new SkladovanaPolozka("Poznámkový blok A6", 10, 1, 13, true,
                LocalDate.of(2023,10, 21));
        SkladovanaPolozka skladovanaPolozka3 = new SkladovanaPolozka("Ananas", 11, 0,BigDecimal.valueOf(11), true,
                LocalDate.of(2023,10, 24));
        for(SkladovanaPolozka c : polozka){
            System.out.println("Název skladované položky: "+c.getNazevSkladovePolozky());
            System.out.println("Množství kusů na skladě: "+c.getMnozstviKusuNaSklade());
            System.out.println("Hmotnost jednoho kusu v kg: "+c.getHmotnostJednohoKusu());
            System.out.println("Cena jednoho kusu: "+c.getCenaJednohoKusu());
            System.out.println("Datum uvedení do prodeje: "+c.getDatumZavedeni());
            if(c.getCenaJednohoKusu() > 15 ){
                System.out.println("Názvy položek s cenou přes 15kč: "+c.getNazevSkladovePolozky());
            }




        }
    }


    }


