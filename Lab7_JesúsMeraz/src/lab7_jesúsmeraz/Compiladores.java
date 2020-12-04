package lab7_jesúsmeraz;

import java.io.Serializable;
import java.util.ArrayList;

public class Compiladores implements Serializable {

    private String NombreCompiladores;
    private String NombreCreador;
    private int numero_LineasCodigos;
    private ArrayList<Fase_Analisis> fase_Analisis = new ArrayList();
    private ArrayList<Fase_sintesis> Fase_sintesis = new ArrayList();

    public ArrayList<Fase_Analisis> getFase_Analisis() {
        return fase_Analisis;
    }

    public void setFase_Analisis(ArrayList<Fase_Analisis> fase_Analisis) {
        this.fase_Analisis = fase_Analisis;
    }

    public ArrayList<Fase_sintesis> getFase_sintesis() {
        return Fase_sintesis;
    }

    public void setFase_sintesis(ArrayList<Fase_sintesis> Fase_sintesis) {
        this.Fase_sintesis = Fase_sintesis;
    }

    public Compiladores(String NombreCompiladores, String NombreCreador, int numero_LineasCodigos) {
        this.NombreCompiladores = NombreCompiladores;
        this.NombreCreador = NombreCreador;
        this.numero_LineasCodigos = numero_LineasCodigos;
    }
    private static final long SerialVersionUID = 999L;

    public Compiladores() {
    }

    public String getNombreCompiladores() {
        return NombreCompiladores;
    }

    public void setNombreCompiladores(String NombreCompiladores) {
        this.NombreCompiladores = NombreCompiladores;
    }

    public String getNombreCreador() {
        return NombreCreador;
    }

    public void setNombreCreador(String NombreCreador) {
        this.NombreCreador = NombreCreador;
    }

    public int getNumero_LineasCodigos() {
        return numero_LineasCodigos;
    }

    public void setNumero_LineasCodigos(int numero_LineasCodigos) {
        this.numero_LineasCodigos = numero_LineasCodigos;
    }

    @Override
    public String toString() {
        return NombreCompiladores;
    }

}
