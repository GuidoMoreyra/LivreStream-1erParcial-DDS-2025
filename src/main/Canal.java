package main;

import main.Excepciones.ExistingTransmitionExeption;
import main.Excepciones.NonExistingTransmitionExeption;
import main.Excepciones.SupportAlreadyGivenException;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Canal {
    private String nombreDelCanal; //Se asume que es unico

    private List<Transmision> transmicionesAnteriores = new ArrayList<Transmision>();
    private Transmision transmicionActual = null;

    private List<Canal> suscripciones = new ArrayList<Canal>();
    private Integer suscriptores = 0 ;

    private List<Integer> muestrasDeApoyoObtenidas = new ArrayList<Integer>();
    private Map<String, Integer> muestrasDeApoyoOtorgadas = new HashMap<>();


    //La verificacion del nombre deberia hacerse previo al constructor
    public Canal(String nombreDelCanal) {
        this.nombreDelCanal = nombreDelCanal ;
    }

    public void iniciarTransmicion(String titulo, List<String> categoria) throws ExistingTransmitionExeption {
        if(transmicionActual != null) {
            throw new ExistingTransmitionExeption("Este canal ya posee una transmicion en curso");
        }
        transmicionActual = new Transmision(titulo,categoria);

    }

    public void terminarTransmicion() throws NonExistingTransmitionExeption {
        if(transmicionActual == null) {
            throw new NonExistingTransmitionExeption("Este canal no se encuentra transmitiendo");
        }
        transmicionActual.finalizar();
        transmicionesAnteriores.add(transmicionActual);
        transmicionActual = null;
    }

    public void otorgarApoyo(Canal canal, Integer apoyo) throws SupportAlreadyGivenException {
        if(muestrasDeApoyoOtorgadas.containsKey(canal)){
            throw new SupportAlreadyGivenException("Ya se le otorgo apoyo a este canal");
        }
        muestrasDeApoyoOtorgadas.put(canal.nombreDelCanal , apoyo);
    }

    public void recibirApoyo(Integer apoyo){
        muestrasDeApoyoObtenidas.add(apoyo);
    }

    public void suscribirse(Canal canal) {
        suscripciones.add(canal);
    }
    public void aumentarSuscriptores () {
        suscriptores++;
    }

    public String getNombreDelCanal(){
        return this.nombreDelCanal;
    }


    public Boolean sonElMismo(Canal canal){
        return canal.getNombreDelCanal().equals(this.nombreDelCanal);
    }
}
