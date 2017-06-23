var thermistorSensorChart;
$(function() {
   thermistorSensorChart = new Highcharts.Chart({
      chart : {
         renderTo : "thermistorSensorChartContainer",
         type : "spline",
         events : {
            load : requestThermistorSensorData
         }
      },
      colors : [ 'white' ],
      title : {
         text : "ThermistorSensor(온도센서)"
      },
      xAxis : {
         type : "datetime",
         tickPixelInterval : 100,
         minRange : 10 * 1000
      },
      yAxis : {
         minPadding : 0.2,
         maxPadding : 0.2,
         title : {
            text : "온도",
            margin : 30
         }
      },
      series : [ {
         name : "온도",
         data : []
      } ],
      // 마커(점)이 없어지는 현상 방지
      plotOptions : {
         series : {
            marker : {
               enabled : true
            }
         }
      }
   });

});

function requestThermistorSensorData() {
   var ws = new WebSocket("ws://" + location.host
         + "/SensingCarRemoteWebControl/websocket/thermistorsensor")
   ws.onmessage = function(event) {
      var data = JSON.parse(event.data);
      var series = thermistorSensorChart.series[0];
      var shift = series.data.length > 10;
      series.addPoint([ data.time, data.temperature ], true, shift);
      if (data.temperature > 27) {
         console.log(thermistorSensorChart.series[0].color.toString());
         thermistorSensorChart.series[0].color = 'red';
      } else if (data.temperature <= 27) {
         console.log(thermistorSensorChart.series[0].color.toString());
         thermistorSensorChart.series[0].color = 'cyan';
      }
   };
}



