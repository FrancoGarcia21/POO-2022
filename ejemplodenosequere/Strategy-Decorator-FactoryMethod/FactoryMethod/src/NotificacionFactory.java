
public class NotificacionFactory {
	
	 public Notificacion createNotification(String metodo)
	    {
	        if (metodo == null || metodo.isEmpty())
	            return null;
	        if ("SMS".equals(metodo)) {
	            return new SMSNotificacion();
	        }
	        else if ("EMAIL".equals(metodo)) {
	            return new EmailNotificacion();
	        }
	        else if ("PUSH".equals(metodo)) {
	            return new PushNotificacion();
	        }
	        return null;
	    }
}
