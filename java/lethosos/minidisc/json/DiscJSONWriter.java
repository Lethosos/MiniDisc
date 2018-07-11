package lethosos.minidisc.json;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import lethosos.minidisc.utils.Label;

public class DiscJSONWriter {

	//public static Label list;
	
	public static void makeJSON(Label label)
	{
		Label list = new Label(label);
		
		Gson gson = new Gson();
		
		GsonBuilder builder = new GsonBuilder();
		builder.setPrettyPrinting().serializeNulls();

		gson = builder.create();
		/*
		Dataset dataset = new Dataset();
		dataset.album_id = "7596";
		dataset.album_title = "Album 1";
		
 
		AlbumImages image = new AlbumImages();
		image.image_id = "1";
		image.albumId = "10";
		dataset.images.add(image);
		albums.dataset.add(dataset);
		*/
 
		System.out.println(gson.toJson(list));
	}
}