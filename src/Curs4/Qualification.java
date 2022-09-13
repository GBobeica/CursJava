package Curs4;

public class Qualification extends Teacher {
	
	public Qualification(String course, int experienceYears, String schedule) {
	              setCourse(course);
	              setExperienceYears(experienceYears);
		          setSchedule(schedule);
	}
	
	
	public void verify() {
		if(Course.equals("Java") && ExperienceYears > 3 && Schedule.equals("Afternoon")) {
			System.out.println("You qualify to teach at this school!");
		}else {
			System.out.println("“You do not qualify!");
		}
		
		
		
		
	}
	

}
