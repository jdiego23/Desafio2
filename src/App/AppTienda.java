package App;

import Domain.*;

import java.util.ArrayList;
import java.util.Arrays;

public class AppTienda {
    public static void main(String[] args) {
        
        Nomina tCamara = new Nomina();
        Directo juan = new Directo("Juan",4840000);
        Vendedor julian = new Vendedor("Julian",2050000,45510000);
        Freelance johanna = new Freelance("Johanna",71000,89);
        Vendedor carolina = new Vendedor("Carolina",980000,35989000);
        Promotor pedro = new Promotor("Pedro",1200,300,62);
        Directo david = new Directo("David",3975000);
        Freelance gustavo = new Freelance("Gustavo",42500,65);


        tCamara.getEmpleado().add(juan);
        tCamara.getEmpleado().add(julian);
        tCamara.getEmpleado().add(johanna);
        tCamara.getEmpleado().add(carolina);
        tCamara.getEmpleado().add(pedro);
        tCamara.getEmpleado().add(david);
        tCamara.getEmpleado().add(gustavo);

        tCamara.calcularNomina();
        System.out.println("\n");
        tCamara.listarDirectos();
        tCamara.listarFreelancers();
        tCamara.listarPromotores();
    }
}
