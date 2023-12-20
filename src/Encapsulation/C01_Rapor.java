package Encapsulation;

public class C01_Rapor {



/* Requirement:
   - Satış Birimindeki Çalışanlar “satış tutarı” bilgilerini yazabilsinler,
    -Ancak “satış toplamını” sadece görebilsinler, değiştiremesinler, atama yapamasınlar.

 */

    public int getSatisToplami() {
        return satisToplami;
    }

    public void setSatisTutari(int satisTutari) {
        this.satisTutari = satisTutari;
    }


    private int satisTutari;
    private int satisToplami = 2000;

    public String urunAdi;



}
