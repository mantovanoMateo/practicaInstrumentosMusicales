import Contenedora.MusicShop;
import Models.AcousticStringInstrument;
import Models.Bass;
import Models.Battery;
import Models.ElectricGuitar;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Bass bassOne=new Bass("MarcaGenericaUno",3500.0,4,"Modelo uno","magneticos");
        Battery batteryOne=new Battery("MarcaDeBaterias",4,3);
        ElectricGuitar electricGuitarOne=new ElectricGuitar("Marca dos",6000.0,6,"modelo generico",22);
        AcousticStringInstrument acousticStringInstrumentOne=new AcousticStringInstrument("marca de acusticos",4500.0,6,"caoba");
        MusicShop m1=new MusicShop();

        m1.addInstruments(bassOne);
        m1.addInstruments(batteryOne);
        m1.addInstruments(electricGuitarOne);
        m1.addInstruments(acousticStringInstrumentOne);


        System.out.println("listamos los instrumentos"+m1.listInstruments()+"\n");
        System.out.println("usamos los amplificadores\n"+bassOne.amplifiedSound()+"\n"+electricGuitarOne.amplifiedSound()+"\n");
        System.out.println("Cambiamos los precios\n"+m1.changePrice(5,10,15,20));
    }
}