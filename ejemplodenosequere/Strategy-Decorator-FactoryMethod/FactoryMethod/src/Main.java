
public class Main {

	public static void main(String[] args) {
		NotificacionFactory nf = new NotificacionFactory();
		Notificacion n = nf.createNotification("SMS");
		n.notificarUsuario();

	}

}
