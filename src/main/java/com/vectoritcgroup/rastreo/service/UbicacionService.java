package com.vectoritcgroup.rastreo.service;


import java.util.List;

import com.vectoritcgroup.rastreo.model.Ubicacion;

public interface UbicacionService {

    List<Ubicacion> getTravel(long idObjeto);
    
    List<Ubicacion> getTravelByDate(Ubicacion ubicacion);
    
    Ubicacion saveUbicacion(Ubicacion ubicacion);

}
