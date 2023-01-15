package philip.shedrack;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

import java.util.Date;
import java.util.List;

@WebService(serviceName = "ReleveWS")
public class ReleveService {
    @WebMethod
    public Releve getReleve(@WebParam(name = "rib") long rib) {
        return new Releve(rib, new Date(), Math.random()*43000);
    }

    @WebMethod
    public List<Releve> listReleve() {
        return List.of(
                new Releve(1, new Date(), Math.random()*2000),
                new Releve(2, new Date(), Math.random()*87000),
                new Releve(3, new Date(), Math.random()*2400),
                new Releve(4, new Date(), Math.random()*9400),
                new Releve(5, new Date(), Math.random()*8600),
                new Releve(6, new Date(), Math.random()*4800)
        );
    }

}
