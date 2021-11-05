public class ex01 {
	public static void main(String[] args) {
		int[] arranjo = new int[20];
		int[] arranjoinv = new int[20];
		int[] arranjo3 = union(arranjo, arranjoinv);
		// int [] arranjoinv = new int[ arranjo.length ];

		System.out.println("Arranjo");
		for (int i = 0; i <= arranjo.length - 1; i++) {
			arranjo[i] = i * 10;
			System.out.println(arranjo[i]);
		}
		System.out.println("\n");
		System.out.println("Arranjo invertido");
		for (int c = 0; c <= arranjo.length - 1; c++) {
			arranjoinv[c] = arranjo[(arranjo.length - c) - 1];

			System.out.println(arranjoinv[c] + " ");
		}

        System.out.println("------------------------------------------------------------------- ");
		System.out.println("Ocorrencias de um elemento " + nOcorrencias(arranjo, 50));
		System.out.println("------------------------------------------------------------------- ");
		System.out.println("Se o elemento foi repetido é true: " + hasRepeat((arranjo)));
		System.out.println("------------------------------------------------------------------- ");
		System.out.println("Quantidade de repetidos " + nroRepeat(arranjo));
		System.out.println("------------------------------------------------------------------- ");

		int[] x = listRepeat(arranjo);
		System.out.println("Lista de repetidos: ");
		for (int i = 0; i < x.length; i++) {
			System.out.println(x[i]);
		}
		System.out.println("A intersecção é ");
		int[] xy = intersect(arranjo, arranjoinv);
		for (int i = 0; i < xy.length; i++) {
			System.out.println(xy[i]);
		}
		System.out.println("A diferença é");
		difference(arranjo, arranjoinv);

	}

	public static int nOcorrencias(int[] l, Integer el) {
		int ocorr = 0;
		for (int i = 0; i < l.length; i++) {
			if (l[i] == el) {
				ocorr++;
			}
		}
		return ocorr;
	}// fecha nOcorrencias

	public static boolean hasRepeat(int[] l) {
		for (int i = 0; i < l.length; i++) {
			for (int e = 0; e < i; e++) {
				if (l[i] == l[e]) {
					return true;
				}
			}
		}
		return false;
	}// fecha hasRepeat

	public static int nroRepeat(int[] l) {
		int nro = 0;
		for (int i = 0; i < l.length; i++) {
			for (int z = 0; z < i; z++) {
				if (l[i] == l[z]) {
					nro++;
				}
			}
		}
		return nro;
	}// fecha nroRepeat

	public static int[] listRepeat(int[] l) {
		int[] lista = new int[nroRepeat(l)];
		int cont = 0;
		for (int i = 0; i < l.length; i++) {
			for (int z = 1; z < i; z++) {
				if (l[i] == l[z]) {
					lista[cont] = l[i];
					cont++;
				}
			}
		}
		return lista;
	}

	public static int[] union(int[] l1, int[] l2) {
		int[] uni = new int[(l1.length + l2.length)];
		int cont = 0;
		for (int i = 0; i < l1.length; i++) {
			uni[cont] = l1[i];
			System.out.print(uni[cont] + " ");
			cont++;
		}
		return uni;
	}// fecha int

	public static int[] intersect(int[] l1, int[] l2) {
		int[] lista = new int[(l1.length + l2.length)];
		int cont = 0;
		for (int i = 0; i < l1.length; i++) {
			for (int z = 0; z < l2.length; z++) {
				if (l1[i] == l2[z]) {
					lista[cont] = l1[i];
					cont++;
				}
			}
		}
		return lista;
	}// fecha inter

	public static int[] difference(int[] l1, int[] l2) {
		int dif = l1.length + l2.length;
		int[] list = new int[dif];
		int u = 0, cont = 0;
		for (int i = 0; i < l1.length; i++) {
			cont = 0;
			for (int y = 0; y < l2.length; y++) {
				if (l1[i] == l2[y]) {
					cont++;
				}
			}
			if (cont == 0) {
				list[u] = l1[i];
				System.out.println("O número " + l1[i]);
				u++;
			}
		}
		return list;
	}

}