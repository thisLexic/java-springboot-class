package app.components;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface RemoteMultiplyInterface 
{	
	@GET("http://localhost:9999/calculator/multiply")
	Call<ResponseBody> multiply(@Query("a") double a, @Query("b") double b);
}
