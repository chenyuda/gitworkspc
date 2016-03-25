
public class Sum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num={1,3,5,7,9,11,13,15};
		for(int i=0;i<num.length-2;i++){
			for(int j=1;j<num.length-1;j++){
				for(int k=2;k<num.length;k++){
					System.out.println(num[i]+"+"+num[j]+"+"+num[k]+"="+(num[i]+num[j]+num[k]));
				}
			}
		}
	}

}
