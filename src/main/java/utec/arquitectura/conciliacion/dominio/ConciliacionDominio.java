package utec.arquitectura.conciliacion.dominio;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@Document(collection  = "conciliacion")
public class ConciliacionDominio {

    @Id
    @JsonProperty("_id")
    private String id;
    @Field("CodigoComercio")
    private String codigoComercio;

    @Field("TipoOperacion")
    private String tipoOperacion;

    @Field("FechaOperacion")
    private String fechaOperacion;

    @Field("HoraOperacion")
    private String horaOperacion;
    @Field("NumeroReferencia")
    private String numeroReferencia;

    @Field("Emisor")
    private String emisor;

    @Field("FechaProceso")
    private String fechaProceso;

    @Field("ImporteBruto")
    private double importeBruto;

    @Field("ComEmisor")
    private double comEmisor;

    @Field("ComMerchant")
    private double comMerchant;

    @Field("ComTotal")
    private double comTotal;

    @Field("Igv")
    private double ivg;

    @Field("ImporteNeto")
    private double importeNeto;



    @Field("CodigoMon")
    private double codigoMonCodigoMon;

    @Field("TarjetaMask")
    private String tarjetaMask;

    @Field("Ruc")
    private String ruc;

    @Field("Autorizacion")
    private int autorizacion;

    @Field("CodVisanet")
    private int codVisanet;

    @Field("FechaAbono")
    private int fechaAbono;

}
