function totalSum(from, to) {
	console.log(from);
	if (to == undefined) {
		to = from;
		from = 1;
	}
	var sum = 0;
	for (var i = from; i <= to; i++) {
		sum += i;
	}
	return sum;
}

var result = totalSum(1, 100);
console.log("result : " + result);

var result2 = totalSum(100);
console.log("result : " + result);

function handleBtnOk() {
	console.log("OK 버튼을 클릭함");
}