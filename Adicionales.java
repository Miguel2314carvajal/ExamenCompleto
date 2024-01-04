public class Adicionales extends Restaurante{
    //Atributos
    private int CantidadPersonas;
    public Adicionales (String Comida,Double Precio,String Locacion, int CantidadPersonas){
        super(Comida,Precio,Locacion);
        this.CantidadPersonas = CantidadPersonas;
    }

    @Override
    public void MostrarInformacion(){
        super.MostrarInformacion();
        System.out.println("La cantidad de personas que puede haber en el restaurante es de: "+ CantidadPersonas);
    }
}
