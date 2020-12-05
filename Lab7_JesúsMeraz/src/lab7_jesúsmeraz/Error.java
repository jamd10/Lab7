package lab7_jesúsmeraz;

public class Error {

    private String CodigoError;
    private String Descripcion; 

    public Error(String CodigoError, String Descripcion) {
        this.CodigoError = CodigoError;
        this.Descripcion = Descripcion;
    }

    public String getCodigoError() {
        return CodigoError;
    }

    public void setCodigoError(String CodigoError) {
        this.CodigoError = CodigoError;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    @Override
    public String toString() {
        return "Error{" + "CodigoError=" + CodigoError + ", Descripcion=" + Descripcion + '}';
    }
    
}
