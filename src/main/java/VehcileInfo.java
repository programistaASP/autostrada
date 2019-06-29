import javafx.util.converter.LocalDateTimeStringConverter;

import java.time.LocalDateTime;

public class VehcileInfo {
    private String nrRej;
    private CarType typPojazdu;
    private LocalDateTime dataWjazdu;

    public VehcileInfo(String nrRej, CarType typPojazdu, LocalDateTime dataWjazdu) {
        this.nrRej = nrRej;
        this.typPojazdu = typPojazdu;
        this.dataWjazdu = dataWjazdu;
    }

    public String getNrRej() {
        return nrRej;
    }

    public void setNrRej(String nrRej) {
        this.nrRej = nrRej;
    }

    public CarType getTypPojazdu() {
        return typPojazdu;
    }

    public void setTypPojazdu(CarType typPojazdu) {
        this.typPojazdu = typPojazdu;
    }

    public LocalDateTime getDataWjazdu() {
        return dataWjazdu;
    }

    public void setDataWjazdu(LocalDateTime dataWjazdu) {
        this.dataWjazdu = dataWjazdu;
    }
}
