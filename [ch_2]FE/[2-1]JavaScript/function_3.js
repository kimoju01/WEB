function a() {
    console.log(arguments);

    for(var i=0; i<arguments.length; i++) {
        console.log(arguments[i]);
    }
}

a(1,2,3);


function b() {
    if(arguments.length < 3) return;    //b(1,2) 까지만 하면 반환값이 없어서 결과가 없다.
    console.log('my name is ', arguments[2]);
}

b(1,2,"hyeju");

////////////////////////////////////////////////

/* argument는 필요한 경우에 체크하는 경우라거나.. 이런데서 써야지
변경에 약한 코드라서 함부로 수정하려하면 안된다 */