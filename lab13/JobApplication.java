import java.util.*;
import java.util.Map.Entry;
public class JobApplication {
	private static Set<String> skills = new HashSet<String>(Arrays.asList("Java","HTML5","CSS3"));
	private static Map<String, Set<String>> applicants = new HashMap<String, Set<String>>();
	
	
	public static void main(String[] args) {
		//------Task1------//
		System.out.println("Task 1: create and show applicants");
		createApplicants();
		//------Task2------//
		System.out.println("Task 2: findApplicantsWithMatchSkills");
		findApplicantsWithMatchSkills();
		//------Task3------//
		System.out.println("Task 3: allApplicantsSkills");
		allApplicantsSkills();
		
		System.out.println("Challenge: suggestTraining");
		countApplicants();


	}
	
	public static void createApplicants() {
		//----------------YOUR CODE HERE--------------//
		Set<String> peterSkills = new HashSet<String>();
        peterSkills.add("C++");
        peterSkills.add("Ruby");
        applicants.put("Peter", peterSkills);

		Set<String> aumSkills = new HashSet<String>();
        aumSkills.add("C#");
        aumSkills.add("Java");
        applicants.put("Aum", aumSkills);

		Set<String> tipSkills = new HashSet<String>();
        tipSkills.add("Java");
        tipSkills.add("CSS3");
        tipSkills.add("HTML5");
        applicants.put("Tip", tipSkills);

		Set<String> janeSkills = new HashSet<String>();
        janeSkills.add("HTML5");
        janeSkills.add("Ruby");
        janeSkills.add("Java");
        janeSkills.add("CSS3");
        applicants.put("Jane", janeSkills);

		for (Entry<String, Set<String>> entry : applicants.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }
		
	}
	
	public static void findApplicantsWithMatchSkills() { 
		//----------------YOUR CODE HERE--------------//
		for (Entry<String, Set<String>> entry : applicants.entrySet()) {
            String name = entry.getKey();
            Set<String> applicantSkills = entry.getValue();

            if (applicantSkills.containsAll(skills)) {
                System.out.println(name + " => " + applicantSkills);
            }
        }
	}
	public static void allApplicantsSkills() {
		//----------------YOUR CODE HERE--------------//
		Set<String> everyoneSkills = new HashSet<String>();

        for (Set<String> applicantSkills : applicants.values()) {
            everyoneSkills.addAll(applicantSkills);
        }

        System.out.println("all applicants' skills " + everyoneSkills);
		
	}

	public static void countApplicants() {
    System.out.println("\nChallenge: countApplicants");

    for (Entry<String, Set<String>> entry : applicants.entrySet()) {
        String name = entry.getKey();
        Set<String> applicantSkills = entry.getValue();

        
        int count = applicantSkills.size();
        System.out.println(name + " มีทักษะทั้งหมด " + count + " อย่าง");
    }

    System.out.println("-----------------------------");
    System.out.println("มีผู้สมัครทั้งหมด " + applicants.size() + " คน");
}
	
	
	

}
