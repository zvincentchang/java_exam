package z804;
public class Q005 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] [] array2D ={ { 0, 1, 2, 4} ,{5, 6}}; 
		int [] [] array2D1 = new int [2] [2]; 
		array2D1[0] [0] = 1; array2D1[0] [1] = 2; array2D1[1] [0] = 3; array2D1[1] [1] = 4;
		
		int [] [] [] array3D = new int [2] [2] [2];
		int[] array=new int[]{1,2};
		array3D [0] [0] = array; array3D [0] [1] = array; array3D [1] [0] = array; array3D [1] [1] = array;
		for(int i=0;i<array3D.length;i++){
			for(int j=0;j<array3D[i].length;j++){
				for(int k=0;k<array3D[i][j].length;k++){
					System.out.printf("array3D[%d][%d][%d]=%d\t",i,j,k,array3D[i][j][k]);
				}	
				System.out.println();
			}
		}
	}

}
