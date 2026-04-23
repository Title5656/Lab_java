//Name:
//ID:
//Section:

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import com.google.gson.Gson;

public class MovieCatalog {
	
	private List<Movie> movies = null;
	
	MovieCatalog()
	{
		movies = new ArrayList<Movie>();
	}
	
	public List<Movie> getAllMovies()
	{
		return movies;
	}
	
	public void loadMovies(String filename)
	{
		//********************* YOUR CODE HERE **************************//




		//**************************************************************//
	}
	
	public List<Movie> searchByTitle(String keyword)
	{
		//********************* YOUR CODE HERE **************************//
		
		
		
		return null;
		//**************************************************************//
	}
	
	public List<Movie> searchByRottenTomatoesScores(double lowScore , double highScore)
	{
		//********************* YOUR CODE HERE **************************//
		
		
		
		return null;
		//**************************************************************//
	}
	
	public static void saveMoviesJSON(List<Movie> movieList, String outFilename)
	{
		//********************* YOUR CODE HERE **************************//
		
		
		
		//**************************************************************//
	}


}
