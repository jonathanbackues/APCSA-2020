 package ElevensLab;
 public class Shuffler {

		
		private static final int SHUFFLE_COUNT = 2;

		
		private static final int VALUE_COUNT = 52;

		public static void main(String[] args) {
			System.out.println("Results of " + SHUFFLE_COUNT +
									 " consecutive perfect shuffles:");
			int[] values1 = new int[VALUE_COUNT];
			for (int i = 0; i < values1.length; i++) {
				values1[i] = i;
				}
			for (int j = 1; j <= SHUFFLE_COUNT; j++) {
				perfectShuffle(values1);
				System.out.print("  " + j + ":");
				for (int k = 0; k < values1.length; k++) {
					System.out.print(" " + values1[k]);
				}
				System.out.println();
			}
			System.out.println();
			System.out.println("Results of " + SHUFFLE_COUNT +
									 " consecutive efficient selection shuffles:");
			int[] values2 = new int[VALUE_COUNT];
			for (int i = 0; i < values2.length; i++) {
				values2[i] = i;
			}
			
			for (int j = 1; j <= SHUFFLE_COUNT; j++) {
				selectionShuffle(values2);
				System.out.print("  " + j + ":");
				for (int k = 0; k < values2.length; k++) {
					System.out.print(" " + values2[k]);
				}
			System.out.println();
			}
			System.out.println();
			
		}

		public static void perfectShuffle(int[] values) {
			/* *** TO BE IMPLEMENTED IN ACTIVITY 3 *** */
			int[] cards = new int[values.length];
			int middle  = (values.length+1)/2;
			int k = 0;
			for(int i = 0; i<middle; i++) {
				cards[k]=values[i];
				k+=2;
			}
			k = 1;
			for(int i = middle; i<values.length-1; i++) {
				cards[k]=values[i];
				k+=2;
			}
			for(int i = 0; i< values.length-1; i++){
				values[i] = cards[i];
			}
		}

		public static void selectionShuffle(int[] values) {
			  for (int k = values.length - 1; k > 0; k--) {
			   int pos = (int) (Math.random() * (k + 1));  
			   int temp = values[pos];
			   values[pos] = values[k];
			   values[k] = temp;
			  }
		}
	}


