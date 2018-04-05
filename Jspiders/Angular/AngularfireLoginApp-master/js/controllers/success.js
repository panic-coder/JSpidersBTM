myApp.controller('SuccessController', ['$scope', "myService"  , "$location" , "$firebaseArray" , "$firebaseObject" ,   function($scope , myService , $location , $firebaseArray , $firebaseObject) {
  
  $scope.message = "welcome to ";

  $scope.username = myService.getUser();
  if(!$scope.username){
    $location.path("/login");
  }

  
var ref = firebase.database().ref().child('articles');
$scope.articles = $firebaseArray(ref);

$scope.addPost = function(){
 var title = $scope.articles.title;
 var post = $scope.articles.post;
 $scope.articles.$add({
     title,
     post
 }).then(function(ref){
  console.log(ref);
})(function(err){
  console.log(err);
});
} // addpost

$scope.editPost = function(id){
  var ref = firebase.database().ref().child('articles/' + id);
    $scope.editPostData = $firebaseObject(ref);
   
} //edit post


$scope.updatePost = function(id){
  var ref = firebase.database().ref().child("articles/" + id);
    ref.update({
      title:$scope.editPostData.title,
      post : $scope.editPostData.post
    }).then(function(ref){
      console.log(ref);  
    }, function(err){
      console.log(err);
    }
  )} // update post

  $scope.logout = function(){
    myService.logoutUser();
    console.log("cliked");
  };

$scope.deleteItem = function(article){
  $scope.deleteArticle = article; 
}

$scope.deletePost = function(deleteArticle){
  $scope.articles.$remove(deleteArticle);
  $("#deleteModal").modal('hide');
}

}]);