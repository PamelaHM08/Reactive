package utec.arquitectura.conciliacion.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import utec.arquitectura.conciliacion.dominio.ConciliacionDominio;


import java.util.List;

@Repository
public interface ConciliacionRepository extends MongoRepository<ConciliacionDominio, String> {


    List<ConciliacionDominio> findByCodigoComercioAndFechaProceso(Integer codigoComercio,String fechaProceso);
    List<ConciliacionDominio> findByAutorizacionAndFechaProceso(Integer autorizacion,String fechaProceso);

    List<ConciliacionDominio> findByCodigoComercioAndAutorizacionAndFechaProceso(Integer codigoComercio , Integer autorizacion, String fechaProceso);

  /*  @Transactional
    @Query("{'codigoComercio': :#{#codigoComercio}}, 'fechaProceso': {$gte: :#{#fechaProcesoInicio}}, $lte: :#{#fechaProcesoFin}}}")
    List<ConciliacionDominio> findByCodigoComercioAndFechaProcesoInicioAndFechaProcesoFin(@Param("codigoComercio") String codigoComercio,
                                                                                          @Param("fechaProcesoInicio") String fechaProcesoInicio,
                                                                                          @Param("fechaProcesoFin")  String fechaProcesoFin);

    List<ConciliacionDominio> findByAutorizacionAndFechaProcesoInicioAndFechaProcesoFin(@Param("autorizacion") String autorizacion,
                                                                                        @Param("fechaProcesoInicio") Date fechaProcesoInicio,
                                                                                        @Param("fechaProcesoFin")  Date fechaProcesoFin);

    List<ConciliacionDominio> findByCodigoComercioAndAutorizacionAndFechaProcesoInicioAndFechaProcesoFin(@Param("codigoComercio") String codigoComercio,
                                                                                                         @Param("autorizacion") String autorizacion,
                                                                                                         @Param("fechaProcesoInicio") Date fechaProcesoInicio,
                                                                                                         @Param("fechaProcesoFin")  Date fechaProcesoFin);

    List<ConciliacionDominio> findByFechaProcesoBetween(Date startDate,Date endDate);*/

}
