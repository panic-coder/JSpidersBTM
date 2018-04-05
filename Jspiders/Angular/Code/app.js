var app = angular.module("myApp" , []);

ng.controller("myCtr" ,function($scope,$http){
	$http.get("https://api.github.com/users").then(function (item){
		$scope.gituser = item.data;
		
	
});

$scope.removeItem = function(user){
	var removeItem = $scope.gituser.indexOf(user);
	$scope.gituser.splice(removeItem, 1)
}

});

/* 9/2/18 {
	name : "test1",
	age :21,
	company : "testyantra"
}

app.contoller("deleteCtr" , function($scope){
	$scope.favLanguage = "none";

	$scope.php = function(){
		$scope.favLanguage = "php";
	};
	$scope.java = function(){
		$scope.favLanguage = "java";
	};
	$scope.python = function(){
		$scope.favLanguage = "python";
	};
	$scope.js = function(){
		$scope.favLanguage = "js";
	};
})*/

/*  8/2/18  app.controller("myCtr" , function($scope, $http){
	$http.get("data.json").then(function(item){
		$scope.players = item.data;
	});
	$scope.test = [
	{
		name : "dinga",
		company : "testyantra",
		skill : "angularjs"
	},
	{
		name : "dinga",
		company : "testyantra",
		skill : "angularjs"
	},
	{
		name : "dinga",
		company : "testyantra",
		skill : "angularjs"
	}
	];*/
