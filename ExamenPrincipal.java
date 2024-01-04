public class ExamenPrincipal {
    public static void main (String [] args){

        Comida comida1 = new Comida("Encebollado", 3.50);
        Restaurante restaurante1 = new Restaurante("Pizza", 1.50, "San Jose de moran");
        Adicionales adicionales1 = new Adicionales("Lazaña", 5.25, "Carapungo", 10);
        //Arreglos
        try {
            Comida arrayObjetos[] = new Comida[3];
            arrayObjetos[0] = comida1;
            arrayObjetos[1] = restaurante1;
            arrayObjetos[3] = adicionales1;
            arrayObjetos[4].getComida();
        }catch (Exception e){
            System.out.println("Error");
        }

        comida1.MostrarInformacion();
        restaurante1.MostrarInformacion();
        adicionales1.MostrarInformacion();

    }
}
