
public class FooBarQix {

	public static void main(String... args) {
        int i;
     
		for (i = 1; i <= 100; i++) {
			afficherNombre(i);
		}
	}


	  private static void afficherNombre(int nombre) {
		  String nbr     = String.valueOf(nombre);
		  String result  = new String();
		  int j;
		  
		  if ((nombre % 3) == 0) {
			  result += "Foo";
		  }
		  if ((nombre % 5) == 0) {
			  result += "Bar";
		  }

		  for (j = 0; j <= nbr.length()-1; j++ ) {
			  if (nbr.charAt(j) == '3') {
				  result += "Foo";
			  }
			  if (nbr.charAt(j) == '5') {
				  result += "Bar";
			  }
			  if (nbr.charAt(j) == '7') {
				  result += "Qix";
			  }
		  }
		  if (result.isEmpty()) {
			  result = nbr;
		  }
		  System.out.println(nbr+" -> "+result);
	  }
}

