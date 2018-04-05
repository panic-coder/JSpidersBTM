angular.module("myApp",[])
.controller("index",["$scope",function($scope){
    $scope.message="Hello World!";
    $scope.favoriteWord;
    $scope.favoriteColor;
    $scope.favoriteShape;
}]);
