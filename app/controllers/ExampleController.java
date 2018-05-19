package controllers;
import play.mvc.*;


import java.io.IOException;
import java.util.*;
// imports under here for Config
import javax.inject.Inject;
import com.typesafe.config.*;
//imports under here for accessing HTTP requests to external programs
import java.util.concurrent.CompletionStage;
import java.util.concurrent.ExecutionException;
import play.libs.ws.WSClient;
import play.libs.ws.WSRequest;
import play.libs.ws.WSResponse;
//imports under here for logger
import play.Logger;
//imports under here for sending file to server
import java.io.File;



public class ExampleController extends Controller {
    private final Config config;
    private final WSClient ws;
    //Logger.error
    //Logger.warn
    private static final Logger.ALogger LOG = Logger.of(ExampleController.class);
    //because we have used Inject here, play will automatically provide
    //the Config object at runtime, so we can save a reference to this element and
    //use it as necessary
    //needs an import
    @Inject
                            //param needs an import
    public ExampleController(Config config, WSClient ws)
    {
        //standard objects method, gets if not null ?
        //parses if not null?
        this.config = Objects.requireNonNull(config);
        this.ws = Objects.requireNonNull(ws);
    }

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
        LOG.debug("{} + {}", a, b);
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

    public Result exampleConfigAction()
    {
            String string = config.getString("string");
            int integer = config.getInt("numeric");
            boolean bool = config.getBoolean("boolean");
            List<String> list = config.getStringList("list");
            //same type
            Config object = config.getConfig("object");

            System.out.println(string);
            System.out.println(integer);
            System.out.println(bool);
            System.out.println(list);


            //just need to do the route - 4mins ish

        return ok();
    }
// make a call to an external API to get some data
    public CompletionStage<Result> exampleWsAction()
    {
        WSRequest request = ws.url("http://localhost:9000/2plus2");
        CompletionStage<WSResponse> response = request.get();

        //when the response is available, convert it to a byte array...
        //...then when the byte array is ready, create an OK result using it (the byte array)
        CompletionStage<Result> result = response.thenApply(WSResponse::asByteArray).thenApply(Results::ok);

        //below is the long winded version of the above
        /*
        try {
            response.toCompletableFuture().get();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        */

        //return a CompletionStage<Result> object
        return result;
    }

    @BodyParser.Of(BodyParser.Raw.class)
    public Result uploadAction()
    {
        File file = request().body().asRaw().asFile();
        try {
            return ok(file.getCanonicalPath());
        } catch (IOException e) {
            e.printStackTrace();
            return ok(e.toString());
        }
    }

}
