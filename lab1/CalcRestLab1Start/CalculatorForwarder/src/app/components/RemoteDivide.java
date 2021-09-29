package app.components;

import org.springframework.stereotype.Component;
import okhttp3.OkHttpClient;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;

@Component
public class RemoteDivide {

	public String divide(double a, double b) throws Exception
	{
		OkHttpClient client = new OkHttpClient.Builder().build();
		
		Retrofit retrofit = new Retrofit.Builder()
			.client(client)
			.baseUrl("http://localhost:9999/")
			.build();
		
		RemoteDivideInterface service = retrofit.create(RemoteDivideInterface.class);
		
		Call<ResponseBody> call = service.divide(a, b);
		Response<ResponseBody> response = call.execute();
		String reply = response.body().string();
		
		return reply;
	}
}
