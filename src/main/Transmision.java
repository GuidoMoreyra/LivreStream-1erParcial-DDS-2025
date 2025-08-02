package main;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Transmision {
    private String titulo;
    private List<String> categoria ;
    private final LocalDateTime fechaDeInicio = LocalDateTime.now();
    private LocalDateTime fechaDeFinalizacion = null;
    private int participantesMaximos = 0;
    private int participantesActuales = 0;
    private List<Mensaje> historialDelChat = new ArrayList<>();

    public Transmision(String titulo, List<String> categoria) {
        this.titulo = titulo;
        this.categoria = categoria;
    }
    public void finalizar() {
        if(this.fechaDeFinalizacion != null) {
            throw new IllegalStateException("La transmision ya termino");
        }
       this.fechaDeFinalizacion = LocalDateTime.now();
    }

    public void recibirMensaje (Mensaje mensaje) {
        this.historialDelChat.add(mensaje);
    }

    public void añadirParticipante(){
        if( ++this.participantesActuales > this.participantesMaximos) {
            this.participantesMaximos = this.participantesActuales;
        }
    }
    public void removerParticipante() {
        this.participantesActuales--;
    }
}
