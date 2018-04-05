var app = angular.module("myApp" , []);
/*app.service("random",function(){
    this.testOne=function(){
        alert("test");
    }
    

    var num = Math.round(Math.random()*100);
    this.randomNumber = function(){
        return num;
    }
});

app.controller("serviceCtr",function($scope,random){
  /*  $scope.randomtest = function(){
        console.log("test");
        $scope.testrandom = random.randomNumber();
     $scope.message = function()   {
       $scope.testfunc =  random.testOne();
     }
    
})*/

app.directive("enter",function(){
    return{
        restrict:"A",
        template : "<h1>Hello</h1>",
        link : function(scope , element , attrs){
            element.bind("mouseenter" , function(){
                console.log("mouse entered");
                element.addClass("enter")
            });
        }
    }
});

app.directive("leave",function(){
    return{
        restrict:"A",
        //template : "<h1>Hello</h1>",
        link : function(scope , element , attrs){
            element.bind("mouseleave" , function(){
                console.log("mouse leave");
                element.addClass("enter")
            });
        }
    }
});


