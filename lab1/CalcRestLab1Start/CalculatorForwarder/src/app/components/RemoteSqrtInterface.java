package app.components;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface RemoteSqrtInterface 
{	
	@GET("http://localhost:9999/calculator/sqrt")
	Call<ResponseBody> sqrt(@Query("a") double a);
}
