
/* 함수 호이스팅 */

function printName(firstname) {

    var inner = function() {
        return "inner value";
    }

    var result = inner();
    console.log("name is " + result);
}

printName();