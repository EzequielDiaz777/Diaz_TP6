package Diaz_TP6;

public class Diaz_TP6 {

    public static void main(String[] args) {
        Persona Laucha = new Persona("Laucha", "1", "Saucedo", "Naschel", "Manzana 12 Casa 1");
        Persona Laucha2 = new Persona("Laucha", "1", "Saucedo", "Naschel", "Manzana 12 Casa 1");
        Persona Ezequiel = new Persona("Ezequiel", "2", "Diaz", "San Luis", "Manzana 265 Casa 10");
        Persona Fabricio = new Persona("Fabricio", "3", "Molina", "San Luis", "Manzana 45 Casa 8");
        Directorio lista = new Directorio();
        lista.agregarCliente("2664897852", Laucha);
        lista.agregarCliente("2664897853", Laucha2);
        lista.agregarCliente("2664897853", Laucha2);
        lista.buscarTelefono("Saucedo");
        lista.buscarCliente("2664897853");
        lista.buscarCliente("213");
        lista.buscarClientes("Naschel");
        lista.agregarCliente("1132185230", Ezequiel);
        lista.agregarCliente("2664458952", Fabricio);
        lista.agregarCliente("1152304587", Laucha);
        lista.buscarCliente("1132185230");
        lista.buscarCliente("2664897852");
        lista.buscarClientes("San Luis");
        lista.buscarClientes("Naschel");
        lista.buscarCliente("2664897852");
        lista.borrarCliente("1");
        lista.buscarCliente("1");   
    }
}