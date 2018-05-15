package controllers;
import play.mvc.BodyParser;
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

    //looking at the Request being sent / request object


    //this sets the expected object type to a Json object
    //will show the client making the POST request with anything else
    //an error message if they have not set JSon headers in the request object
    //without this, the object it can handle will be a text object, JSon object, MXL object etc
    @BodyParser.Of(BodyParser.Json.class)

    //this parses to Json object even if the headers are not set
    //@BodyParser.Of(BodyParser.TolerantJson.class)

    public Result exampleBodyAction()
    {
        Http.Request request = request();
        //a null value received if the return type of the request is not of this type (body)
        //but it is in this case
        Http.RequestBody body = request.body();
        //below returns true or false, but it always says true - as the body will be there, just empty
        //for the majority of the requests sent
        //System.out.println(request.hasBody());
        System.out.println("Json Body: " + body.asJson());
        System.out.println("Text Body: " + body.asText());
        return ok();
    }

    public Result exampleResultAction()
    {

        //status we can define our own status code
        return status(700);
        //found used to redirect auto
        //return found("www.google.co.uk");
        //return notFound();
        //return ok();
        //return internalServerError();

    }

    //testing argument passing through the URI
    public Result exampleAdditionAction(String a, String b)
    {
        Integer first = Integer.parseInt(a);
        Integer second = Integer.parseInt(b);
        return ok(Integer.toString(first + second));
    }

    //testing stripping the URI of the args and passing through params instead of URI
    public Result exampleAddAction(Integer a, Integer b)
    {
        return ok(Integer.toString(a+b));
    }

    //testing if b argument s not passed
    public Result exampleAddWithMissingArgAction(Integer a, Integer b)
    {
        return ok(Integer.toString(a+(b == null ? 0 : b)));
        //(b == new ? 0 : b) = turner expression, shorthand for if statement
    }

    public Result exampleAddWithDefaultArgsAction(Integer a, Integer b)
    {
        return ok(Integer.toString((a +b)));
    }

}
