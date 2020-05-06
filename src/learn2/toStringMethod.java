package learn2;

class Movie{
    private int id;
    private String title;
    private boolean hit;
    Movie(int id,String title, boolean hit){
        this.id = id;
        this.title = title;
        this.hit = hit;
    }
    
    public String toString(){
        StringBuilder ss= new StringBuilder();
        return ss.append(id).append(" ").append(title).append(" ").append(hit).toString(); // efficent way
        //return id+" "+title+" "+hit; //infficient way
    }
}

public class toStringMethod {
    public static void main(String[] args) {

        Movie m1 = new Movie(1,"Shawshank",true);
        System.out.println(m1);
        //It prints a hashcode of the object if there's no toString method over-riding the default
        
    }
}