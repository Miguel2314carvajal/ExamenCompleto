public class Comida {
    //Atributos
    public String Comida;
    public Double Precio;
    public Comida (String Comida,Double Precio){
        this.Comida = Comida;
        this.Precio = Precio;
    }

    public String getComida() {
        return Comida;
    }

    public void setComida(String comida) {
        Comida = comida;
    }

    public Double getPrecio() {
        return Precio;
    }

    public void setPrecio(Double precio) {
        Precio = precio;
    }

    public void MostrarInformacion(){
        System.out.println("La comida es: "+ Comida + " y su precio es de "+ Precio);
    }
}
