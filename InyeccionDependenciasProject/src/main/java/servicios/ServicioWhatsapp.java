package servicios;

import dominio.ServicioMensaje;

public class ServicioWhatsapp implements ServicioMensaje {

    @Override
    public void enviarMensaje(String mensaje) {
        System.out.println(" Enviando whatsapp " + mensaje);
    }
}
