package Contenedora;

import Models.*;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MusicShop {
    ArrayList<Instrument> instruments;

    public MusicShop() {
        instruments=new ArrayList<>();
    }

    public void addInstruments(Instrument newInstrument){
        instruments.add(newInstrument);
    }

    public String listInstruments(){
        String instrumentsList="no hay ningun instrumento";
        if(!instruments.isEmpty()){
            instrumentsList="";
            for (Instrument instrument: instruments){
                instrumentsList+=instrument.toString()+"\n";
            }
        }
        return instrumentsList;

    }

    public String changePrice(int electricGuitarPercentaje,int acousticPercentaje,int batteryPercentaje, int bassPercentaje){
        String comparativePriceTable="";
        for (Instrument instrument: instruments){
            if(instrument instanceof ElectricGuitar){
                comparativePriceTable+="-----------------------------------------\nold price "+instrument.toString()+"\n";
                instrument.setPrice((((double)instrument.getPrice()*(100+electricGuitarPercentaje))/100));
                comparativePriceTable+="new price "+instrument.toString()+"\n";
            } else if (instrument instanceof AcousticStringInstrument) {
                comparativePriceTable+="-----------------------------------------\nold price "+instrument.toString()+"\n";
                instrument.setPrice((((double)instrument.getPrice()*(100+acousticPercentaje))/100));
                comparativePriceTable+="new price "+instrument.toString()+"\n";
            } else if (instrument instanceof Battery) {
                comparativePriceTable+="-----------------------------------------\nold price "+instrument.toString()+"\n";
                instrument.setPrice((((double)instrument.getPrice()*(100+batteryPercentaje))/100));
                comparativePriceTable+="new price "+instrument.toString()+"\n";
            }else{
                comparativePriceTable+="-----------------------------------------\nold price "+instrument.toString()+"\n";
                instrument.setPrice((((double)instrument.getPrice()*(100+bassPercentaje))/100));
                comparativePriceTable+="new price "+instrument.toString()+"\n";
            }
        }
        return comparativePriceTable;
    }

}
