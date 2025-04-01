package ai;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class IAService {
    private final IAModel modelo;

    @Autowired
    public IAService(IAModel modelo) {
        this.modelo = modelo;
    }

    public String responderConsulta(String texto, User usuario) {
        Query query = new Query(texto, usuario);
        return modelo.procesarConsulta(query);
    }
}