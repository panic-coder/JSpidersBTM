myapp.filter("MyFilter",function(){
    return function(input){
        return input.slice(0,1).toUpperCase();
    }
});