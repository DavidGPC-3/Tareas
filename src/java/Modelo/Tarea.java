package Modelo;

public class Tarea {
    int id_tarea;
    String nombre_tarea;
    boolean tarea_finalizada;
    String fecha;
    
    public Tarea(){

    }
    
    public Tarea(int id_tarea, String nombre_tarea, boolean tarea_finalizada, String fecha){
        this.id_tarea = id_tarea;
        this.nombre_tarea = nombre_tarea;
        this.tarea_finalizada = tarea_finalizada;
        this.fecha = fecha;
    }

    public int getId_tarea() {
        return id_tarea;
    }

    public void setId_tarea(int id_tarea) {
        this.id_tarea = id_tarea;
    }

    public String getNombre_tarea() {
        return nombre_tarea;
    }

    public void setNombre_tarea(String nombre_tarea) {
        this.nombre_tarea = nombre_tarea;
    }

    public boolean isTarea_realizado() {
        return tarea_finalizada;
    }

    public void setTarea_realizado(boolean tarea_realizado) {
        this.tarea_finalizada = tarea_realizado;
    }

    public String getFecha_hora() {
        return fecha;
    }

    public void setFecha_hora(String fecha_hora) {
        this.fecha = fecha_hora;
    }
}


