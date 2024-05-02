package utec.arquitectura.conciliacion.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import utec.arquitectura.conciliacion.dominio.ConciliacionDominio;
import utec.arquitectura.conciliacion.service.ConciliacionService;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
@Api(value = "ConciliacionRest", produces = "application/json", tags = {"Controlador Conciliacion"})
public class ConciliacionController {

    @Autowired
    private ConciliacionService conciliacionService;

    @ApiOperation(value = "", notes = "")
    @GetMapping("/trxs")
    public List<ConciliacionDominio> getAllTrxs(@RequestParam(required = false) Integer autorizacion,
                                                @RequestParam(required = false) Integer codigoComercio,
                                                @RequestParam String fechaProceso)
    {
        return conciliacionService.obtenerConciliaciones(autorizacion,codigoComercio, fechaProceso);
    }

}
