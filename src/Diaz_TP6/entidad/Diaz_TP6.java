package Diaz_TP6.entidad;

public class Diaz_TP6 {

    public static void main(String[] args) {
        Cliente Federico = new Cliente("Federico", "Cruceño", "37716731", "Manzana 265 Casa 10", "San Luis");
        Cliente Ezequiel = new Cliente("Ezequiel", "Diaz", "34229421", "Manzana 265 Casa 10", "San Luis");
        Cliente Lautaro = new Cliente("Lautaro", "Saucedo", "37716733", "Plaza de los Niños", "La Punta");
        Cliente Beatriz = new Cliente("Beatriz", "Hernando", "5919535", "Araoz 636", "CABA");
        Cliente Fabricio = new Cliente("Fabricio", "Molina", "37716732", "Pringles 231", "San Luis");
        Directorio lista = new Directorio();
        lista.agregarCliente("2657312733", Federico);
        lista.agregarCliente("1132185230", Ezequiel);
        lista.agregarCliente("2657312732", Lautaro);
        lista.agregarCliente("1159481383", Beatriz);
        lista.agregarCliente("2664312733", Fabricio);
//        lista.agregarCliente("1132185326", Ezequiel);
//        lista.buscarCliente("2657312733");
//        lista.buscarCliente("1132185230");
//        lista.buscarCliente("1132185326");
//        lista.buscarCliente("2657312732");
//        lista.buscarCliente("2657312736");
//        lista.buscarCliente("1159481383");
//        lista.buscarCliente("2664312733");
//        lista.buscarClientes("San Luis");
//        lista.buscarClientes("Mendoza");
//        lista.buscarClientes("La Punta");
//        lista.buscarClientes("CABA");
//        lista.buscarTelefono("Cruceño");
//        lista.buscarTelefono("Diaz");
//        lista.buscarTelefono("Saucedo");
//        lista.buscarTelefono("Hernando");
//        lista.buscarTelefono("Molina");
//        lista.buscarTelefono("Acevedo");
        lista.borrarCliente("5919535");
        lista.borrarCliente("34229421");
        lista.borrarCliente("37716731");
        lista.borrarCliente("37716733");
        lista.borrarCliente("37716732");
        lista.borrarCliente("1");
//        lista.buscarClientes("San Luis");
//        lista.buscarClientes("Mendoza");
//        lista.buscarClientes("La Punta");
//        lista.buscarClientes("CABA");
//        lista.buscarTelefono("Diaz");
    }
}
