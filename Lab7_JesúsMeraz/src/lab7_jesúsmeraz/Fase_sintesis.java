package lab7_jesúsmeraz;

import java.io.Serializable;

public class Fase_sintesis implements Serializable {

    private int Generacion_CodigoIntermedio;
    private int Generacion_Codigo;
    private int Optimizador_Codigo;
    private static final long SerialVersionUID = 555L;

    public Fase_sintesis(int Generacion_CodigoIntermedio, int Generacion_Codigo, int Optimizador_Codigo) {
        this.Generacion_CodigoIntermedio = Generacion_CodigoIntermedio;
        this.Generacion_Codigo = Generacion_Codigo;
        this.Optimizador_Codigo = Optimizador_Codigo;
    }

    public int getGeneracion_CodigoIntermedio() {
        return Generacion_CodigoIntermedio;
    }

    public void setGeneracion_CodigoIntermedio(int Generacion_CodigoIntermedio) {
        this.Generacion_CodigoIntermedio = Generacion_CodigoIntermedio;
    }

    public int getGeneracion_Codigo() {
        return Generacion_Codigo;
    }

    public void setGeneracion_Codigo(int Generacion_Codigo) {
        this.Generacion_Codigo = Generacion_Codigo;
    }

    public int getOptimizador_Codigo() {
        return Optimizador_Codigo;
    }

    public void setOptimizador_Codigo(int Optimizador_Codigo) {
        this.Optimizador_Codigo = Optimizador_Codigo;
    }

    @Override
    public String toString() {
        return "Fase sintesis{" + "Generacion_CodigoIntermedio=" + Generacion_CodigoIntermedio + ", Generacion_Codigo=" + Generacion_Codigo + ", Optimizador_Codigo=" + Optimizador_Codigo + '}';
    }

   
    
}
