var trackingSensorChart;
$(function() {
	trackingSensorChart = new Highcharts.Chart({
		chart: {
			renderTo:"trackingSensorChartContainer",
			type:"spline",
			events: {
				load: requestTrackingSensorData
			}
		},
		colors: ['yellow'],
		title: {
			text: "TrackingSensor(트레킹 센서)"
		},
		xAxis: {
			type: "datetime",
			tickPixelInterval: 100,
			minRange:20*1000
		},
		yAxis: {
			title: {
				text: "값",
				margin: 30
			}
		},
		series: [{
			name: "값",
			data: []
		}]
	});
});

function requestTrackingSensorData() {
	var ws = new WebSocket("ws://" + location.host + "/SensingCarRemoteWebControl/websocket/trackingsensor");
	ws.onmessage = function(event) {
		var data = JSON.parse(event.data);
		var series = trackingSensorChart.series[0];
		var shift = series.data.length > 20;
		series.addPoint([data.time, data.tracking], true, shift);
	};
}






