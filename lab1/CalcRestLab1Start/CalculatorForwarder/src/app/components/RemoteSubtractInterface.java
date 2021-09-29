package app.components;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.POST;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.Field;

public interface RemoteSubtractInterface 
{	
	@FormUrlEncoded
	@POST("http://localhost:9999/calculator/subtract")
	Call<ResponseBody> subtract(@Field("a") double a, @Field("b") double b);
}

