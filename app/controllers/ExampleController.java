package controllers;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Http;
public class ExampleController extends Controller {

    public Result exampleAction()
    {
        Http.Request thisRequest = request();
        thisRequest.queryString();
        thisRequest.getHeaders();
        thisRequest.body();
        thisRequest.cookies();
        return ok("Success");
    }

    public Result exampleBodyAction()
    {
        Http.Request request = request();
        //a null value received if the return type of teh request is not of this type (body)
        //but it is in this case
        Http.RequestBody body = request.body();
        //System.out.println(request.hasBody());
        System.out.println("Json Body: " + body.asJson());
        System.out.println("Text Body: " + body.asText());
        return ok();
    }

}
