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
            logger.info("Login correcto [FR01]");
            while (true) {
                logger.info("Añadir centro de vacunación (1): ");
                logger.info("Ver centro de vacunación (2)");
                logger.info("Ver porcentaje de no vacunados por edad (3) [FR05]: ");
                logger.info("Salir de la aplicación (4) [FR06]: ");
                String option = sc.nextLine();
                if (option.equals("1")) {
                    logger.info("Ingrese vacunados parciales: ");
                    int vacuParciales = sc.nextInt();
                    logger.info("Ingrese vacunados completos: ");
                    int vacuCompletos = sc.nextInt();
                    user.addNuevoCentro(vacuParciales, vacuCompletos);
                }
                else if (option.equals("2")) {
                    logger.info("Ingrese id de centro de vacunación: ");
                    int id = sc.nextInt();
                    logger.info("Dar de baja (1) [FR04]: ");
                    logger.info("Dar de alta (2) [FR03]: ");
                    logger.info("Información detalla del centromanager (3) [FR02]: ");
                    String option2 = sc.nextLine();
                    if (option2.equals("1")) {
                        user.darDeBaja(id);
                    }
                    else if (option2.equals("2")) {
                        user.darDeAlta(id);
                    }
                    else if (option2.equals("3")) {
                        logger.info(Integer.toString(CentroVacunacionManager.getInstance().getCont()));
                        logger.info(Integer.toString(CentroVacunacionManager.getInstance().getVacunasParciales()));
                        logger.info(Integer.toString(CentroVacunacionManager.getInstance().getVacunasCompletas()));
                        logger.info(Float.toString(CentroVacunacionManager.getInstance().getAvance()));
                        logger.info(Float.toString(CentroVacunacionManager.getInstance().getCobertura()));
                    }
                }
                else if (option.equals("3")) {
                    logger.info("Ingrese rango de edad: ");
                    String rangoDeEdad = sc.nextLine();
                    logger.info(String.valueOf(user.getPorcentaje(rangoDeEdad)));
                }
                else if (option.equals("4")) {
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