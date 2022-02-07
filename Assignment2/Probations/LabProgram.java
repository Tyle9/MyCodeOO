public class LabProgram {
   public static void main(String[] args) {
      Course course = new Course();
      int probCount;

      // Example students for testing
      course.addStudent(new Student("Henry", "Cabot", 3.2));   
      course.addStudent(new Student("Brenda", "Stern", 1.1)); 
      course.addStudent(new Student("Lynda", "Robison", 2.4)); 
      course.addStudent(new Student("Jane", "Flynn", 1.8)); 
      
      probCount = course.countProbation();
      System.out.println("Probation count: " + probCount);
   }
}