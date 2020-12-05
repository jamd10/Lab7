package lab7_jesúsmeraz;

import java.io.Serializable;

public class Fase_Analisis implements Serializable {

    private int Analisis_Lexico;
    private int Analisis_Sintactico;
    private int Analisis_Semantico;
    private static final long SerialVersionUID = 555L;

    public Fase_Analisis(int Analisis_Lexico, int Analisis_Sintactico, int Analisis_Semantico) {
        this.Analisis_Lexico = Analisis_Lexico;
        this.Analisis_Sintactico = Analisis_Sintactico;
        this.Analisis_Semantico = Analisis_Semantico;
    }

    public int getAnalisis_Lexico() {
        return Analisis_Lexico;
    }

    public void setAnalisis_Lexico(int Analisis_Lexico) {
        this.Analisis_Lexico = Analisis_Lexico;
    }

    public int getAnalisis_Sintactico() {
        return Analisis_Sintactico;
    }

    public void setAnalisis_Sintactico(int Analisis_Sintactico) {
        this.Analisis_Sintactico = Analisis_Sintactico;
    }

    public int getAnalisis_Semantico() {
        return Analisis_Semantico;
    }

    public void setAnalisis_Semantico(int Analisis_Semantico) {
        this.Analisis_Semantico = Analisis_Semantico;
    }

    @Override
    public String toString() {
        return "Fase Analisis{" + "Analisis_Lexico=" + Analisis_Lexico + ", Analisis_Sintactico=" + Analisis_Sintactico + ", Analisis_Semantico=" + Analisis_Semantico + '}';
    }

}
