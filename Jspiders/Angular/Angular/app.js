var myapp = angular.module("testApp" , ["ngRoute"]);



myapp.config(function($routeProvider , $locationProvider){
    $routeProvider.when("/login" , {
        templateUrl:"view/login.html"
    }).when("/register" , {
        templateUrl:"view/register.html"
    }).otherwise({
        redirectTo:"/"
    });

})

