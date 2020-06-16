package in.sabnar.songs.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import in.sabnar.songs.dto.ApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import in.sabnar.songs.dto.Song;


@RestController
@RequestMapping("/v1/songs")
public class SongController {

	public static final String SUCCESS = "success";

	@GetMapping
	public List<Song> getSongs(@RequestParam Map<String, String> params) {
		params.forEach((k, v)->{
			System.out.println(k +"<-->"+ v);
		});
		return Arrays.asList(
			new Song(1L, "Dil Chahta Hai", 5), 
			new Song(2L, "Swag Se Karenge Sabka Swagat", 4.5F),
			new Song(3L, "Phir Bhi Dil Hai Hindustani", 4F)
		);
	}

	@PostMapping("/create")
	public ApiResponse create(){
		return new ApiResponse(HttpStatus.OK, SUCCESS, "Song Created Successfully");
	}


}
