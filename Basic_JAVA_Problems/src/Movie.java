import java.util.Scanner;

public class Movie{
    private String title;
    private String studio;
    private String rating;

    Movie(String t,String s,String r){
        title = t;
        studio = s;
        rating = r;
    }

    Movie(String t,String s){
        title = t;
        studio = s;
        rating = "PG";
    }

    public static Movie[] getPG(Movie[] m){
        Movie[] h = new Movie[m.length];
        int p=0;
        for (int i =0; i< m.length ; i++) {
            if (m[i].rating.equals("PG")) {
                String title = m[i].title;
                String studio = m[i].studio;
                String rating = m[i].rating;
                h[p] = new Movie(title, studio, rating);
                p++;
            }
        }
          for (int j =p ; j <= h.length ;j++){
              String temp = "End";
              h[p] = new Movie(temp,temp,temp);
          }
        return h;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Movie[] movie = new Movie[5];
        for (int i=0 ; i<5 ; i++){
            System.out.print("Enter Movie name : ");
            String name = sc.nextLine();
            System.out.print("Enter Movie Studio : ");
            String studio = sc.nextLine();
            System.out.print("Enter Movie rating : ");
            String rating = sc.nextLine();

            movie[i] = new Movie(name,studio,rating);
        }

        Movie[] finalPGlist =  getPG(movie);
        int i = 0;
        System.out.print("Final List : \n");
        while (!finalPGlist[i].studio.equals("End")){
            System.out.print("Title = " + finalPGlist[i].title +"\nStudio = " + finalPGlist[i].studio + "\n\n");
            i++;
        }
    }
}
