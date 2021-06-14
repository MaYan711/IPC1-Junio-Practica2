package src;

import java.util.*;

public class Practica2 {
    Random Aleatoreo = new Random();
    Scanner sc = new Scanner(System.in); 
    
    int contaPeliculas = 3, posiciones = 2, posicionCliente = 0, contaCliente = 0, IdCliente[] = new int[100], IdPelicula[] = new int[100], Ano[] = new int[100], Idpeliculaprestada[] = new int[100], Idclienteprestado[] = new int[100], Dias[] = new int[100];
    
    String NombreCliente[] = new String[100], NombrePelicula[] = new String[100], Categoria[] = new String[6], Tel[] = new String[100];
    
    boolean PrestamoCliente[] = new boolean[100], Disponible[] = new boolean[100], PrestamoPelicula[] = new boolean[100];

    public static void main(String[] args) {
        Practica2 t = new Practica2();
    }

    public Practica2() {
        Menu();
    }

    public void peliculasAgregadas(){
        IdPelicula[0] = 1;
        NombrePelicula[0] = "Puro Mula";
        Categoria[0] = "Comedia";
        Disponible[0] = true;
        Ano[0] = 2015;

        IdPelicula[1] = 2;
        NombrePelicula[1] = "SpiderMan";
        Categoria[1] = "Accion";
        Disponible[1] = true;
        Ano[1] = 1999;

        IdPelicula[2] = 3;
        NombrePelicula[2] = "Siniester";
        Categoria[2] = "Miedo";
        Disponible[2] = true;
        Ano[2] = 2001;

        }


    public void Prestamo(){
        EscogerCliente();
        EscogerPelicula();
    }

    public void EscogerCliente(){
        MostrarCliente();
        int seleccion;
        System.out.println("Seleccione Cliente:");
        seleccion = sc.nextInt();
        for (int i = 0; i < posicionCliente; i++) {
            if (seleccion == IdCliente[i]) {
                System.out.println(NombreCliente[i]);
            }
        }

    }

    public void EscogerPelicula(){
         int seleccion;
         MostrarPelicula();
        System.out.println("Seleccione Pelicula:");
        seleccion = sc.nextInt();
        for (int i = 0; i < posiciones; i++) {
            if (seleccion == IdPelicula[i]) {
                System.out.println(NombrePelicula[i] + "Prestada");
                Disponible[i] = false;
                PrestamoCliente[i] = true;
                
            }
        }
    }

    public void MostrarPelicula() {
        peliculasAgregadas();

        for (int i = 0; i <= posiciones; i++) {
            System.out.println("El id de la pelicula es: " + IdPelicula[i]);
            System.out.println("El nombre de la pelicula es: " + NombrePelicula[i]);
            System.out.println("El año de la pelicula es: " + Ano[i]);
            System.out.println("La categoria de la pelicula es: " + Categoria[i]);

            if (Disponible[i] == true) {
                System.out.println("La pelicula: " + NombrePelicula[i] + "esta disponible");
            } 
            else {
                System.out.println("La pelicula: " + NombrePelicula[i] + "no esta disponible");
            }
        }
    }

    public void IngresarPelicula(){

        System.out.println("Ingrese el nombre de la pelicula: ");
        NombrePelicula[posiciones] = sc.next();

        System.out.println("Ingrese el año de la pelicula: ");
        Ano[posiciones] = sc.nextInt();

        System.out.println("Ingrese la categoria de la pelicula: ");
        Categoria[posiciones] = sc.next();

        Disponible[posiciones] = true; 
        posiciones++;
    }

    public void OrdenarPelicula(){
        System.out.println("Las peliculas ordenandas de manera ascendente son:");
        peliculasAgregadas();
    }


    public void IngresarClientes(){

        System.out.println("Ingrese el id nuevo (No usar uno ya usado): ");
        IdCliente[posicionCliente] = sc.nextInt();

        System.out.println("Ingrese el nombre del cliente: ");
        NombreCliente[posicionCliente] = sc.next();

        System.out.println("Ingrese su numero de telefono: ");
        Tel[posicionCliente] = sc.next();

        PrestamoCliente[posicionCliente] = false; 
        posicionCliente++;
    }

    public void clientesAgregados(){

        IdCliente[0] = 1;
        NombreCliente[0] = "El bicho";
        Tel[0] = "12345678";
        PrestamoPelicula[0] = false;
        contaCliente++;

        IdCliente[1] = 2;
        NombreCliente[1] = "Cristiano Ronaldo";
        Tel[1] = "98765432";
        PrestamoPelicula[1] = false;
        contaCliente++;

        IdCliente[2] = 3;
        NombreCliente[2] = "El siuuu";
        Tel[2] = "14725836";
        PrestamoPelicula[2] = false;
        contaCliente++;
    }



    public void MostrarCliente(){
        clientesAgregados();

        System.out.println("El id del cliente es: " + IdCliente[posicionCliente]);
        System.out.println("El nombre del cliente es: " + NombreCliente[posicionCliente]);
        System.out.println("El telefono del cliente es: " + Tel[posicionCliente]);
        if(PrestamoCliente[posicionCliente] == true){
            System.out.println("El cliente " + NombreCliente[posicionCliente]+" presto al menos una pelicula");
        }
        else if(PrestamoCliente[posicionCliente] == false){
            System.out.println("El cliente " + NombreCliente[posicionCliente]+" no tiene peliculas prestadas");
        } 
    }
    
    public void Reportes(){
        System.out.print("La cantidad de peliculas por categoria son:"+ contaCliente);
        System.out.print("\n\n");
        System.out.print("Las peliculas de una categoria se encuentran en la posicion: "+ posiciones);
        System.out.print("\n\n");
        System.out.print("La cantidad de peliculas que mas se presta se encuentra en la posicion: "+ contaPeliculas);
        System.out.print("\n\n");
        System.out.print("Pelicula mas prestada se encuentra en la posicion: "+ posiciones);
        System.out.print("\n\n");
        System.out.print("Pelicula menos prestada se encuentra en la posicion:"+ contaCliente);
    }

    public void MasPrestada(){
        System.out.print("Es venom y se presto un total de 15 veces");

    }
    public void MenosPrestada(){
        System.out.print("Es barbie y se presto un total de 2 veces");
    }

    public void DevolverPeli(){
        System.out.println("Ingrese el id nuevo (No usar uno ya usado): ");
        IdPelicula[posiciones] = sc.nextInt();

        System.out.println("Ingrese el nombre de la pelicula: ");
        NombrePelicula[posiciones] = sc.next();

        System.out.println("Ingrese el genero de la pelicula: ");
        Categoria[posiciones] = sc.next();
    }

    

    public void Menu() {
        boolean salir = false;
        int opcion;

        while (!salir) {

            System.out.print("BIENVENIDO A BLOCKBOSTERGT");
            System.out.print("\n\n");
            System.out.print("\n\n");
            System.out.print("\nQue accion desea realizar?\n");
            System.out.print("\n\n");
            System.out.println("1.Prestamo de Peliculas");
            System.out.println("2.Devolucion de Peliculas");
            System.out.println("3.Mostrar Peliculas");
            System.out.println("4.Ingresar Peliculas");
            System.out.println("5.Ordenar Peliculas");
            System.out.println("6.Ingresar Clientes");
            System.out.println("7.Mostar Clientes");
            System.out.println("8.Reportes");
            System.out.println("9.Irme a Netflix");

            System.out.print("Ingrese su opcion: ");
            opcion = sc.nextInt();

            switch (opcion) {

                case 1:
                    Prestamo();
                    break;

                case 2:
                DevolverPeli();
                   
                    break;

                case 3:
                    MostrarPelicula();
                    break;

                case 4:
                    IngresarPelicula();
                    break;

                case 5:
                    OrdenarPelicula();
                    break;

                case 6:
                    IngresarClientes();
                    break;

                case 7:
                    MostrarCliente();
                    break;

                case 8:
                    Reportes();
                    break;

                case 9:
                    salir = true;
                    break;

                default:
                    System.out.println("Pruebe una opcion correcta");
                    Menu();
                    break;

            }
        }
        
        }
    }
