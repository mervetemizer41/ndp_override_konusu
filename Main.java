

import java.util.List;
import java.util.ArrayList;


public class Main
{
        public static void main(String[] args) {
                Arac b = new Bisiklet();
                b.tekerlekSayisiSoyle();
                Arac o = new Otomobil();
                o.tekerlekSayisiSoyle();
		Arac t = new Tir();
		t.tekerlekSayisiSoyle();

		List<Arac> aracListesi = new ArrayList<Arac>();
		aracListesi.add(b); // Listemize b adlı örneğimizi(instance, nesne) ekliyoruz. Bu bir Bisiklet sınıfı instance'ıdır. Bisiklet Arac'ı extend ettiği için (bkz. Bisiklet.java) bir Arac listesine eklenebilir.
		aracListesi.add(o); // Listemize o adlı örneğimizi(instance, nesne) ekliyoruz. Bu bir Otomobil instance'ıdır. Otomobil Arac'ı extend ettiği için (bkz. Otomobil.java) bir Arac olarak listeye eklenebilir.
		aracListesi.add(t);// Listemize t adlı örneğimizi(instance, nesne) ekliyoruz. Bu bir Tir instance'ıdır. Tir Arac'ı extend ettiği için (bkz. Arac.java) bir Arac olarak listeye eklenebilir.


		for(Arac a: aracListesi){//Listemizdeki;
			a.tekerlekSayisiSoyle();//bütün arac örneklerini,
		}				   //aynı for each içinde döndürebiliriz.
                
        }
}
