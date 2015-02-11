public class BodyDriver {
  public static void main(String[] args) {
	Body sun = new Body();
	// sun.idNum = Body.nextID++;
	sun.name = "Sol";
	sun.orbits = null; // Sun don't orbit nobody
	System.out.println(sun.toString());

	Body earth = new Body("Earth", sun);
	// earth.idNum = Body.nextID++;
	earth.orbits = sun;
	System.out.println(earth.toString());
	}
}
