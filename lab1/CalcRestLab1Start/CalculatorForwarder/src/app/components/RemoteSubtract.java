package app.components;

import org.springframework.stereotype.Component;
import okhttp3.OkHttpClient;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;

@Component
public class RemoteSubtract {

	public String subtract(double a, double b) throws Exception
	{
		OkHttpClient client = new OkHttpClient.Builder().build();
		
		Retrofit retrofit = new Retrofit.Builder()
			.client(client)
			.baseUrl("http://localhost:9999/")
			.build();
		
		RemoteSubtractInterface service = retrofit.create(RemoteSubtractInterface.class);
		
		Call<ResponseBody> call = service.subtract(a, b);
		Response<ResponseBody> response = call.execute();
		String reply = response.body().string();
		
		return reply;
	}
}
