
public class HelloWorld {

	public static void main(String[] args) {
		// System.out.println("Hello,.. World !!");
		int arr[] = { '1', '0', '3', '6', '8'};
		int temp = 0,i,j, len;
		len = arr.length;
		System.out.println("Array length:" + len);
		
		for (i = 0; i < len; i++ )
		{ for (j = 1+1; j < len; j ++)
			{
			if (arr[i] < arr[j])
			temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			}
		}
		
		for (i = 0; i < len-1; i++)
		{System.out.println(arr[i] + ",");
		}
		System.out.println(arr[len-1]);
	}

	}


