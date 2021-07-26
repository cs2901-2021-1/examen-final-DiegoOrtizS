package cs.lab;

import java.util.logging.Logger;
import java.util.Scanner;

public class ApplicationMain {
    static final Logger logger = Logger.getLogger(ApplicationMain.class.getName());

    public static void main(String[] args){
        logger.info("CS-UTEC Software Engineering I");
        Scanner sc = new Scanner(System.in);
        logger.info("Ingrese usuario: ");
        String username = sc.nextLine();
        logger.info("Ingrese contraseña: ");
        String password = sc.nextLine();
        User user = new User(username, password);
        if (user.login()) {
            logger.info("Login correcto");
            while (true) {
                logger.info("Ver porcentaje de vacunados (3): ");
                logger.info("Salir de la aplicación (4): ");
                String option = sc.nextLine();
                if (option.equals("3")) {
                    logger.info("Ingrese rango de edad: ");
                    String rangoDeEdad = sc.nextLine();
                    logger.info(user.getPorcentaje(rangoDeEdad).toString());
                }
                if (option.equals("4")) {
                    user.logout();
                    break;
                }
            }
        }
        else {
            logger.info("Usuario o contraseña incorrectos");
        }
        sc.close();
    }
}