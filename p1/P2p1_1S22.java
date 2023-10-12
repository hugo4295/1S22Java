public class P2p1_1S22{
	public static void main(String[] args) {
		int opc = 1;
		switch(opc){
		case 1: 
			System.out.println("Aqui estamos en la primera opcion");
			break;
		case 2:
			System.out.println("Aqui estamos en la segunda opcion");
			break;
		case 3: 
			System.out.println("Aqui estamos en la tercera opcion");
			break;
		default:
			System.out.println("No existe el valor dentro de los casos");
		}

		char opc1='a';
		switch(opc1){
		case 'a':
			System.out.println("selecciono A");
			break;
		case 'b':
			System.out.println("selecciono B");
			break;
		case 'c':
			System.out.println("selecciono c");
			break;
		default: 
			System.out.println("no esta dentro de las opciones");
		}
	}
}