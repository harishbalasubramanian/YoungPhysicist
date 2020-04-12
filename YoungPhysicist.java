import java.io.*;
import java.util.*;
public class YoungPhysicist {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int length = Integer.parseInt(br.readLine());
		int[] arr = new int[3];
		for(int i = 0; i < length; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j = 0; j < 3; j++) {
				arr[j] += Integer.parseInt(st.nextToken());
			}
		}
		if(arr[0] == 0 && arr[1] == 0 && arr[2] == 0) {
			System.out.println("YES");
		}else System.out.println("NO");
	}
}
