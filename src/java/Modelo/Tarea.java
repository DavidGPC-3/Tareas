package Modelo;

public class Tarea {
    private int id_tarea;
    private String nombre_tarea;
    private boolean tarea_finalizada;
    private String fecha;

    public Tarea() {
    }

    public Tarea(int id_tarea, String nombre_tarea, boolean tarea_finalizada, String fecha) {
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

    public boolean isTarea_finalizada() {
        return tarea_finalizada;
    }

    public void setTarea_finalizada(boolean tarea_finalizada) {
        this.tarea_finalizada = tarea_finalizada;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
    
}


