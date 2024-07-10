package OopCase;

public class Test {
    public static void main(String[] args) {
        Movie[] movies = new Movie[4];
        movies[0] = new Movie(1,"流浪地球",52,2.2,"wujing","武警","无");
        movies[1] = new Movie(2,"tainc",52,2.2,"wujing","武警","无");
        movies[2] = new Movie(3,"当幸福来敲门",52,2.2,"wujing","武警","jdjajjdisa");
        movies[3] = new Movie(4,"绿皮书",52,2.2,"wujing","武警","无");

        MovieOperator operator = new MovieOperator(movies);
        operator.showMovies();
        operator.checkMovieInfo(3);
    }
}
