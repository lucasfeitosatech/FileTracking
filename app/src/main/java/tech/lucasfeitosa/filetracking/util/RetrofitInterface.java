package tech.lucasfeitosa.filetracking.util;

import okhttp3.ResponseBody;
import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.Url;
import rx.Observable;

public interface RetrofitInterface {

    @GET
    Observable<Response<ResponseBody>> downloadRedundancy(@Url String fileUrl);

}
