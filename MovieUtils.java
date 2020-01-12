public class MovieUtils {
	// Return the movie with the given id if found, null otherwise.
	public static Movie findMovieById(List<Movie> movies, int id) {     //works well
                //Integer findID = id;
            //Cond SEC= new IntEqualCond(findID);

    if (movies.empty()){
        return null;
    }
            //beginning of the game
    movies.findFirst();
            
            while (!movies.last()) {

                if (id == movies.retrieve().id)
                return movies.retrieve();
        
                movies.findNext();  }
    
        if (id == movies.retrieve().id)      //checking last element
            return movies.retrieve();
            
            //end of the game
            //return movies.findAllEle(SEC);
	
    
                return null;
                    /*
           Cond SEC= new StringEqualCond(id + "");
        if(movies.findFirstEle(SEC)){
            return movies.retrieve();
	}
        return null; */
        
        }
            
            
	// Return the list of movies having a given title. If none is found, empty list is returned.
	public static List<Movie> findMovieByTitle(List<Movie> movies, String title) {      //works well
            
            
            movies.findFirst();
            Cond SEC= new StringEqualCond(title);
            //beginning of the game
            
    List<Movie> FBG = new LinkedList();
    
    if (movies.empty()){
        return FBG;
    }
    
    
    if (movies.empty()) {   return FBG;     }       //returning empty list
    
    else  {
        movies.findFirst();
        
        while (!movies.last()) {
        if (SEC.test(movies.retrieve().title)){
            FBG.insert(movies.retrieve());
        }
            
            movies.findNext();
                 }
                                
    
        if (SEC.test(movies.retrieve().title))      //checking last element
            FBG.insert(movies.retrieve());
            
            //end of the game
            //return movies.findAllEle(SEC);
	}
    return FBG;
                
                
                //return movies.findAllEle(SEC);
	}
        
	// Return the list of movies of a given genre. If none is found, empty list is returned.
	public static List<Movie> findMoviesByGenre(List<Movie> movies, String genre) {
            
            
            
            List g = new LinkedList();
            
            if (movies.empty()){
        return g;
    }
            
            Cond fc = new StringEqualCond(genre);
            
            movies.findFirst();
            
            while(!movies.last()){
                if (movies.retrieve().genres.findFirstEle(fc)){
                    g.insert(movies.retrieve());
                    
                }
                movies.findNext();
            }
            if (movies.retrieve().genres.findFirstEle(fc))
                    g.insert(movies.retrieve());
            
            return g;
            
            
            
            
            /*movies.findFirst();
            while(!movies.last()){
            List N = movies.retrieve().genres;
            N.findFirst();
            while (!movies.retrieve().genres.last()){
            if (f.test(movies.retrieve().genres.retrieve()))
            g.insert(movies.retrieve());
            movies.retrieve().genres.findNext();
            }
            
            movies.findNext();
            }
            
            
            return g;*/
            
        }
        
	// Return the list of movies of given genres (a movie must have all genres to be in the list). If none is found, empty list is returned. Assume genres is not empty.
	public static List<Movie> findMoviesByGenres(List<Movie> movies, List<String> genres) {
                
            
            
            
            genres.findFirst();
            movies.findFirst();
            
            List found = movies;
            
            if (movies.empty()){
        return found;
    }

            
            while (!genres.last()){
               
               
               found = findMoviesByGenre(found, genres.retrieve());
               genres.findNext();
            }
            found = findMoviesByGenre(found, genres.retrieve());
            //found = findMoviesByGenre(found, genres.retrieve());      //should be there but somehow not working
            
            
            return found;
            
            
            
            
            
            
            
            /*
            boolean f = false;
            
            List found = new LinkedList();
            
            movies.findFirst();
            genres.findFirst();
            
            
            while (!movies.last()){     // take one movie
                
                while(!genres.last()){          //search for each genre
                    while(!movies.retrieve().genres.empty()){       //rolling movie genres
                    if (movies.retrieve().genres.retrieve() == genres.retrieve()){      //seeing if it matches selected genre
                    f = true;  }        //if it matches then f will be true;
                    else { f = false; }
                    }
            genres.findNext();
            }
movies.findNext();
        }
            return found;       */
}
}

