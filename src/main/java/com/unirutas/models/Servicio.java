package main.java.com.unirutas.models;

import java.util.ArrayList;
import java.util.List;

public class Servicio {
    private List<Horario> listadoHorarios;
    private List<Bus> listadoBuses;
    private List<Alerta> listadoAlertas;
    private Ruta ruta;
    private Sentido sentido;

    public Servicio(Ruta ruta, Sentido sentido){
        this.listadoHorarios = new ArrayList<>();
        this.listadoBuses = new ArrayList<>();
        this.listadoAlertas = new ArrayList<>();
        this.ruta = ruta;
        this.sentido = sentido;
    }

    public List<Horario> getHorarios(){
        return this.listadoHorarios;
    }

    public List<Bus> getBuses(){
        return this.listadoBuses;
    }

    public List<Alerta> getAlertas(){
        return this.listadoAlertas;
    }

    public void añadirBus(Bus bus) {
        listadoBuses.add(bus);
    }

    public void añadirHorario(Horario horario) {
        listadoHorarios.add(horario);
    }

    public void añadirAlerta(Alerta alerta) {
        listadoAlertas.add(alerta);
    }

    public void removerBus(Bus bus) {
        listadoBuses.remove(bus);
    }

    public void removerHorario(Horario horario) {
        listadoHorarios.remove(horario);
    }

    public void removerAlerta(Alerta alerta) {
        listadoAlertas.remove(alerta);
    }
}
