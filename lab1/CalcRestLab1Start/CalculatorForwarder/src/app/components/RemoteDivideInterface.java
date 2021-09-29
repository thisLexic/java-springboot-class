package app.components;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface RemoteDivideInterface 
{	
	@GET("http://localhost:9999/calculator/divide")
	Call<ResponseBody> divide(@Query("a") double a, @Query("b") double b);
}
