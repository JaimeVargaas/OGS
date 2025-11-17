package unidad33;

import org.jetbrains.annotations.NotNull;

public class pruebaJava {
    public static void main(String[] args) {
        Persona persona;
        String nombreb = "Federico";


        persona = new Persona("1234","Antonio") {

            String Nombreb = "federico";
            public String mostrar() {

                return "Nombre: "+ Nombreb;
            }
        };

        System.out.println(persona.mostrar());
        nombreb = "Jacinto";
        System.out.println(persona.mostrar());
    }
}
