import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.sql.SQLOutput;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Highway {

    private List<VehcileInfo> vehicleList = new ArrayList<>();

    public void vehicleEntry(String numerRej, CarType typ) {
        VehcileInfo enteringOne = new VehcileInfo(numerRej, typ, LocalDateTime.now());
        vehicleList.add(enteringOne);
        System.out.println("Pojazd " + enteringOne.getNrRej() + " wjechal na autostrade");
    }

    public void searchVehicle(String numerRej, CarType typ) {
        for (int i = 0; i < vehicleList.size(); i++) {
            if (vehicleList.get(i).getNrRej().equals(numerRej) && vehicleList.get(i).getTypPojazdu().equals(typ)) {
                System.out.println("Pojazd o numerze " + numerRej + " znajduje sie na autostradzie");

            }
        }
    }

}
