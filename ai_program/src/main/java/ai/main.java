package ai;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(config.class);
        IAService service = context.getBean(IAService.class);
        User usuario = new User("Juan");
        String respuesta = service.responderConsulta("¿Qué es la vida?", usuario);
        System.out.println(respuesta);
        context.close();
    }
} 