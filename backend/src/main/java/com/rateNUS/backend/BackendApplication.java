package com.rateNUS.backend;

import com.rateNUS.backend.canteen.Canteen;
import com.rateNUS.backend.canteen.DummyCanteenData;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
public class BackendApplication {

	@GetMapping
	public List<Canteen> getAllCanteen() {
		return DummyCanteenData.canteenList;
	}

	public static void main(String[] args) {
		SpringApplication.run(BackendApplication.class, args);
	}

}
