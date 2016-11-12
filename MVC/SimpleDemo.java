public class SimpleDemo {
   public static void main(String[] args) {

      //fetch student record based on his roll no from the database
      SimpleModel model  = retriveStudentFromDatabase();

      //Create a view : to write student details on console
      SimpleView view = new SimpleView();

      SimpleController controller = new SimpleController(model, view);

      controller.updateView();

      //update model data
      controller.setStudentName("Jason");

      controller.updateView();
   }

   private static SimpleModel retriveStudentFromDatabase(){
	   SimpleModel student = new SimpleModel();
      student.setName("Erik");
      student.setRollNo("20");
      return student;
   }
}