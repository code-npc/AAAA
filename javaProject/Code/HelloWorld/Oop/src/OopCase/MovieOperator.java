package OopCase;

public class MovieOperator {
    private Movie[] movies;


    public MovieOperator(Movie[] movies) {
        this.movies = movies;
    }


    /*
     * 展示电影的全部信息
     * */
    public void showMovies() {
        System.out.println("系统全部电影信息如下：");
        for (int i = 0; i < movies.length; i++) {
            System.out.println("编号" + movies[i].getId());
            System.out.println("名字" + movies[i].getName());
            System.out.println("价格" + movies[i].getPrice());
            System.out.println("评分" + movies[i].getScore());
            System.out.println("导演" + movies[i].getDirecter());
            System.out.println("演员" + movies[i].getActor());
            System.out.println("详情" + movies[i].getInfo());
            System.out.println("-------------------");
        }

    }

    /*
     * 根据电影的编号查询，并展示出该电影的详细信息
     * */
    public void checkMovieInfo(int id) {
        for (int i = 0; i < movies.length; i++) {
            if (id == movies[i].getId()) {
                System.out.println("该电影的详细信息如下：" + movies[i].getInfo());
                return;

            }

        }
        System.out.println("没有找到该电影。");
    }
}
