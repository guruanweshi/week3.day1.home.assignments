package week3.day1.assignment5;

public class Automation extends MultipleLangauge implements Language,TestTool {

	@Override
	public void Selenium() {
		System.out.println("Selenium");
		
	}

	@Override
	public void Java() {
		System.out.println("Java");
		
	}

	@Override
	public void ruby() {
		System.out.println("Ruby");
		
	}
	
	public static void main(String[] args) {
		Automation obj = new Automation();
		obj.Java();
		obj.Selenium();
		obj.ruby();
		obj.python();
	}

}
