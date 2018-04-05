var myapp = angular.module("loginApp" , ["ngRoute" , "firebase"]);

myapp.config(["$routeProvider" , "$locationProvider" , function($routeProvider , $locationProvider){
    $routeProvider.when("/login" , {
        title:"login",
        templateUrl : "views/login.html",
        controller : "resgiterCtr"
    }).
    when("/register" , {
        title:"register",
        templateUrl : "views/register.html",
        controller : "registerCtr"
    }).
    when("/success" , {
        title:"success",
        templateUrl : "views/success.html"
        // controller : "successCtr"
    }).
    when("/home" , {
        title:"welcome to login application ",
        templateUrl : "views/home.html"
        // controller : "homeCtr"
    }).otherwise({
        redirectTo:"/login"
    });

}])