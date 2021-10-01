/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package convocatoriarueda;

import java.util.Scanner;

/**
 *
 * @author sebas
 */
public class ConvocatoriaRueda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Scanner entrada = new Scanner(System.in);
        int opcion, contador=0,num;
        Jugador[] jugador = new Jugador[23];
        
        for(int i= 0; i<23;i++){
            jugador[i] = new Jugador();
        }
        
        do{
            System.out.println("Bienvenido a la convocatoria");
            System.out.println("seleccione una de las siguientes opciones");
            System.out.println("1. agregar jugador");
            System.out.println("2. buscar jugador");
            System.out.println("3. editar jugador");
            System.out.println("4. mostrar jugadores");
            System.out.println("5. salir");
            System.out.println("escriba la opcion: ");
            opcion = entrada.nextInt();
            
            switch(opcion){
                case 1:
                    if(contador<23){
                        System.out.println("agregar jugador\n");
                        int aux=0;
                        do{
                            System.out.println("escriba el numero de la camisa: ");
                            num= entrada.nextInt();
                            for(int i=0; i<23; i++){
                                if(num== jugador[i].getNumeroCamisa() ){
                                    System.out.println("este numero de camiseta ya existe ");
                                    i=23; aux=0;
                                }else{
                                    aux=1;
                                }
                            }
                        }while(aux==0);
                        jugador[contador].setNumeroCamisa(num);
                        entrada.nextLine();
                        System.out.println("nombre: ");
                        jugador[contador].setNombre(entrada.nextLine());
                        System.out.println("apellidos: ");
                        jugador[contador].setApellido(entrada.nextLine());
                        System.out.println("posicion: ");
                        jugador[contador].setPosicion(entrada.nextLine());
                        System.out.println("edad: ");
                        jugador[contador].setEdad(entrada.nextInt());
                        entrada.nextLine();
                        System.out.println("equipo: ");
                        jugador[contador].setEquipo(entrada.nextLine());
                        contador++;
                       
                    }
                    else{
                        System.out.println("tienes un total de 23 jugadores, la convocatoria esta llena");
                    }
                    break;
                case 2:
                    System.out.println("mostrar jugador\n");
                    System.out.println("escriba numero de la camisa: ");
                    int camisa =entrada.nextInt();
                    boolean x=false;
                    for(int i=0; i<23; i++){
                        if(camisa==jugador[i].getNumeroCamisa()){
                            x=true;
                            camisa= i;
                            i=23;
                                    
                        }}
                    if (x){
                        System.out.println("camisa: "+jugador[camisa].getNumeroCamisa());
                        System.out.println("nombre: "+jugador[camisa].getNombre());
                        System.out.println("apellido: "+jugador[camisa].getApellido());
                        System.out.println("posicion: "+jugador[camisa].getPosicion());
                        System.out.println("edad: "+jugador[camisa].getEdad());
                        System.out.println("equipo: "+jugador[camisa].getEquipo());
                        
                    }else{
                        System.out.println("este numero de camiseta no existe");
                    }
                        
                    break;
                case 3:
                    System.out.println("editar jugador");
                    System.out.println("igrese numero de camisa");
                    int camisa2= entrada.nextInt();
                    int opcion2;
                    for(int i=0; i<23; i++){
                        if(camisa2== jugador[i].getNumeroCamisa()){
                            do{
                                System.out.println("datos del jugador");
                                System.out.println("1. Número camisa: "+jugador[i].getNumeroCamisa());
                                System.out.println("2. Nombres: "+jugador[i].getNombre());
                                System.out.println("3. Apellidos: "+jugador[i].getApellido());
                                System.out.println("4. Posición: "+jugador[i].getPosicion());
                                System.out.println("5. Edad: "+jugador[i].getEdad());
                                System.out.println("6. Equipo: "+jugador[i].getEquipo());
                                System.out.println("7. Cancelar");
                                System.out.println("");
                                System.out.println("escriba la opcion que desea cambiar");
                                opcion2= entrada.nextInt();
                                entrada.nextLine();
                                switch(opcion2){
                                    case 1:
                                        System.out.println("escriba el nuevo numero de la camisa");
                                        jugador[i].setNumeroCamisa(entrada.nextInt());
                                        opcion2=7;
                                        break;
                                    case 2:
                                        System.out.println("escriba el nuevo nombre");
                                        jugador[i].setNombre(entrada.nextLine());
                                        opcion2=7;
                                        break;
                                    case 3:
                                        System.out.println("escriba el nuevo apellido");
                                        jugador[i].setApellido(entrada.nextLine());
                                        opcion2=7;
                                        break;
                                    case 4:
                                        System.out.println("escriba la nueva posicion");
                                        jugador[i].setPosicion(entrada.nextLine());
                                        opcion2=7;
                                        break;
                                    case 5:
                                        System.out.println("escriba la nueva edad");
                                        jugador[i].setEdad(entrada.nextInt());
                                        opcion2=7;
                                        break;
                                    case 6:
                                        System.out.println("escriba el nuevo equipo");
                                        jugador[i].setEquipo(entrada.nextLine());
                                        opcion2=7;
                                        break;
                                    case 7:
                                        System.out.println("cambio cancelado");
                                        break;
                                    default:
                                        System.out.println("la opcion ingresada no es valida");
                                     
                                }
                            }while(opcion2!=7);
                        }
                    }
                    break;
                case 4:
                    System.out.println("lista de jugadores");
                    for(int i=0; i<23; i++){
                        if(jugador[i].getNumeroCamisa()>0){
                            System.out.println("Número camisa: "+jugador[i].getNumeroCamisa());
                            System.out.println("Nombres: "+jugador[i].getNombre());
                            System.out.println("Apellidos: "+jugador[i].getApellido());
                            System.out.println("Posición: "+jugador[i].getPosicion());
                            System.out.println("Edad: "+jugador[i].getEdad());
                            System.out.println("Equipo: "+jugador[i].getEquipo());
                            System.out.println("");
                        }
                    }
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("la opcion ingresada no es valida");
                    
            }
        }while(opcion!=5);
    }
    
}
