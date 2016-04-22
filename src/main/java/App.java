// import java.util.ArrayList;
// import java.util.Map;
// import java.util.HashMap;
// import spark.ModelAndView;
// import spark.template.velocity.VelocityTemplateEngine;
// import static spark.Spark.*;
//
// public class App {
//   public static void main(String[] args) {
//     String layout = "templates/layout.vtl";
//     staticFileLocation("/public");
//
//     get("/", (request, response) -> {
//       Map<String, Object> model = new HashMap<String, Object>();
//       model.put("template", "templates/home.vtl");
//       return new ModelAndView(model, layout);
//     }, new VelocityTemplateEngine());
//
//     get("/puzzle", (request, response) -> {
//       Map<String, Object> model = new HashMap<String, Object>();
//       model.put("template", "templates/puzzle.vtl");
//       String userInput = request.queryParams("userInput");
//       // String puzzle = replaceVowel(userInput);
//       // model.put("puzzle", puzzle);
//
//       return new ModelAndView(model, layout);
//     }, new VelocityTemplateEngine());
//
//   }
//
// }
