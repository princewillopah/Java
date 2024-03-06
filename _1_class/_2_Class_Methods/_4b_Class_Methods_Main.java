    abstract class Main {
        public String fname = "John";
        public int age = 24;
        public abstract void study(); // abstract method
      }
      
      // Subclass (inherit from Main)
      class _4b_Class_Methods_Main extends Main {
        public int graduationYear = 2018;
        public void study() { // the body of the abstract method is provided here
          System.out.println("Studying all day long");
        }
      }

