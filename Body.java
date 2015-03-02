class Body {
	public long idNum;
	public String name;
	public Body orbits;
	
	public static long nextID = 0;
	public final double PI = 3.1416;

/* ------------------------------------------------------------------------ */

	Body() {
	   idNum = nextID++;
	   }
	
	 Body(Body orbitsAround, String bodyName) {
	  this();
	  name = bodyName;
	  orbits = orbitsAround;
	  }

	Body(String bodyName) {
	  this();
	  orbits = null;
	  name = bodyName;
	  }

	public String toString() {
	   String desc = idNum + " (" + name + ")";
	   if (orbits != null) 
		desc += " orbits " + orbits.toString();
	   return desc;
	   }
	

	public String toString(String arg) {
	    System.out.println("This is dumb: " + arg); 
		return "Hello";
	     }

}

