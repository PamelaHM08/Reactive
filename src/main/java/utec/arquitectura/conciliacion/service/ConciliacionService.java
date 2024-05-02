package utec.arquitectura.conciliacion.service;

import org.springframework.stereotype.Service;
import utec.arquitectura.conciliacion.dominio.ConciliacionDominio;

import java.util.Date;
import java.util.List;

@Service
public interface ConciliacionService {

    List<ConciliacionDominio> obtenerConciliaciones(Integer autorizacion, Integer codigoComercio, String fechaProceso);

}
