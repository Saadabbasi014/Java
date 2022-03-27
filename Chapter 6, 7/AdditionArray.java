import java.security.SecureRandom;
apublic class AdditionArray{
	
	public static void main(String [] args){
		int[] array1 = new int[5];
		int[] array2 = new int[5];
		
		int[] array3 = new int[5];
		
        SecureRandom randomNumbers = new SecureRandom();
		
		// int[] array1 = {8, 38, 46, 9 ,27};
		// int[] array2 = {84,56, 68,91,77};
		// int[] array3 = {0, 0, 0, 0, 0};
		
		for(int count = 0; count < array2.length; count++){
			 array1[count] = 1 + randomNumbers.nextInt(50);
			 array2[count] = 1 + randomNumbers.nextInt(100);
			 array3[count] = array1[count] + array2[count];
		System.out.println(array3[count]);
		}
		System.out.println();
	}
	
}