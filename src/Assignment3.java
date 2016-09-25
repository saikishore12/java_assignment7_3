
public class Assignment3 {
	public static void main(String[] args) {
		String inputString = "hai this is Saikishore Amririshetty";
		String subString = "hai";
		int temp = 0;

		for (int j = 0; j <= inputString.length() - subString.length(); j++)

		{
			for (int i = 0; i < subString.length(); i++) {
				if (inputString.charAt(j + i) == subString.charAt(i)) {

					if (i == subString.length() - 1) {
						temp++;

						break;
					}
				} else {
					break;
				}

			}
		}
		System.out.println("found");
	}
}
