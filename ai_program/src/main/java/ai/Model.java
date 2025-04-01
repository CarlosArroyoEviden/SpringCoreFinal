package ai;

import org.springframework.stereotype.Component;

@Component
public class Model implements IAModel {
    @Override
    public String procesarConsulta(Query query) {
        return "Respuesta para " + query.getUsuario().getUsername() + ": " + query.getTexto();
    }
}

