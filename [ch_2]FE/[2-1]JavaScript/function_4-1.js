function printName(firstname) {
    var myname = "hyeju";
    return myname + " , " + firstname;
}

// 실행 순서 : line 13, 7, 8, 9, (1, 2, 3, 4), 9(result), 10, 11 
function run(firstname) {
    var firstname = firstname || "kim";
    var result = printName(firstname);
    console.log(result);
}

run('park');