//package com.vectoritcgroup.rastreo.controller;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpHeaders;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.MediaType;
//import org.springframework.http.ResponseEntity;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.util.UriComponentsBuilder;
//
//import com.vectoritcgroup.rastreo.service.UbicacionService;
//import com.vectoritcgroup.rastreo.model.Ubicacion;
//
//@Controller
//public class UbicacionController {
//
//	@Autowired
//	private UbicacionService ubicacionService;
//
//	@RequestMapping(value = "/ubicacion/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
//	public ResponseEntity<List<Ubicacion>> getObjeto(@PathVariable String id) {
//		System.out.println("Fetching Ubicacion with id " + id);
//		List<Ubicacion> ubicaciones = ubicacionService.getTravel(Long.valueOf(id));
//        if (ubicaciones == null || ubicaciones.size() == 0) {
//            System.out.println("Ubicacion with idObjeto " + id + " not found");
//            return new ResponseEntity<List<Ubicacion>>(HttpStatus.NOT_FOUND);
//        }
//        return new ResponseEntity<List<Ubicacion>>(ubicaciones, HttpStatus.OK);
//	}
//	
//	@RequestMapping(value = "/ubicacion/", method = RequestMethod.POST)
//    public ResponseEntity<Void> createUbicacion(@RequestBody Ubicacion ubicacion, UriComponentsBuilder ucBuilder) {
//        System.out.println(String.format("Creating ubicacion [%s]", ubicacion.getIdObjeto().getIdObjeto()+ ", Lat: "+ubicacion.getLatitud()+", Lon: "+ubicacion.getLongitud()));
// 
//        ubicacionService.saveUbicacion(ubicacion);
// 
//        HttpHeaders headers = new HttpHeaders();
//        headers.setLocation(ucBuilder.path("/ubicacion/{id}").buildAndExpand(ubicacion.getIdObjeto()).toUri());
//        return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
//    }
//
//}
