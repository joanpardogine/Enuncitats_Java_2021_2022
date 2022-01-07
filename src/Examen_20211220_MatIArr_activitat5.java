
public class activitat5 {

	public static void main(String[] args) {
		char[][] mat={{'b','b','f','f'},
                  {'a','g','j','t'}, 
                  {'z','z','t','t'}, 
                  {'g','h','l','n'}};
		boolean isBeck[] = new boolean[mat.length];

		for(int fila=0;fila<mat.length;fila++) {
			isBeck[fila]=true;
			if(mat[fila].length%2!=0) {
				isBeck[fila]=false;
			}
			for(int col=0;col<mat[fila].length;col++) {
				if(col>0) {
					if(col%2==1) {
						if(mat[fila][col]!=mat[fila][col-1]) {
							isBeck[fila]=false;
						}
					}
				}
			}
		}

		for (int i=0; i<isBeck.length; i++){
			if(isBeck[i]) {
				System.out.println("La fila "+i+" ES beck-normal");
			}else{
				System.out.println("La fila "+i+ " NO es beck-normal");
			}
		}
	}

}
