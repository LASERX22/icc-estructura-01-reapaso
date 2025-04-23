
import Controllers.PersonaController;
import Models.Persona;
import Views.ViewsConsole;

public class App {
    public static void main(String[] args) throws Exception {
        Persona[] personas = new Persona[] {
                new Persona("Juan", 25),
                new Persona("Maria", 30),
                new Persona("Carlos", 22),
                new Persona("Ana", 28),
                new Persona("Luis", 35),
                new Persona("Sofia", 27),
                new Persona("Miguel", 40),
                new Persona("Laura", 32),
                new Persona("Pedro", 29),
                new Persona("Elena", 26),
        };
        PersonaController pC = new PersonaController();
        ViewsConsole vC = new ViewsConsole();
        vC.printMessage("Arreglo personas");
        vC.printPersonsArray(personas);
        vC.printMessage("Arreglo de personas Ordenado");
        pC.ordenarPorEdad(personas);
        vC.printPersonsArray(personas);

        vC.printMessage("Buscar persona con edad 40");
        Persona personaBuscada = pC.buscarPorEdad(personas, 40);
        if (personaBuscada == null) {
            vC.printMessage("No se encontro persona con edad 40");
        } else {
            vC.printMessage("Se encontro persona con edad 40");
            vC.printMessage(personaBuscada.toString());
        }

        vC.printMessage("Buscar persona con edad 99");
        Persona personaBuscada2 = pC.buscarPorEdad(personas, 99);
        if (personaBuscada2 == null) {
            vC.printMessage("No se encontro persona con edad 99");
        } else {
            vC.printMessage("Se encontro persona con edad 99");
            vC.printMessage(personaBuscada.toString());
        }
    }
}
