
function totalSum(from, to) {
	if (to == undefined) {
		to = from;
		from = 1;
	}
	/*		
	 console.log(from);
	 console.log(to==undefined);
	 */
	var sum = 0;
	for (var i = from; i <= to; i++) {
		sum += i;
	}
	return sum;

}

function handleBtnOk() {
	console.log("OK버튼을 클릭함");
}