public class Homework09{
	public static void main(String[] args){
		Music music = new Music();
		music.name = "Good";
		music.time = 3.14;
		music.play();
		music.getInfo();
}}
class Music{
	String name;
	double time;
	public void play(){
		System.out.println("The music is playing.");
	}
	public void getInfo(){
		System.out.println(name + "\t" + time);
	}
}