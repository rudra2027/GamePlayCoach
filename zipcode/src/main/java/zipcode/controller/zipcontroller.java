package zipcode.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.aggregation.ArrayOperators.Zip;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import zipcode.pojo.Zipcode;
import zipcode.source.zipRepository;

@RestController
public class zipcontroller {
@Autowired
private zipRepository repo;

@GetMapping("/zipcode")
public  List<Zipcode> getAll() {
	return repo.findAll();
}
@PostMapping("/zip")
public String addZip(@RequestBody Zipcode zip) {
	repo.save(zip);
	return zip.getCity();
}

@GetMapping("/zipcode/{zip}")
public Optional<Zipcode> getDetails(@PathVariable Long zip) {
	return repo.findById(zip);
}
}
