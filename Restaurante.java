public class Restaurante extends Comida{
    //Atributos
    public String Locacion;
    public Restaurante(String Comida,Double Precio,String Locacion){
        super(Comida,Precio);
        this.Locacion = Locacion;
    }
    @Override
    public void MostrarInformacion(){
        super.MostrarInformacion();
        System.out.println("La locación del restaurante es: "+ Locacion);
    }
}
