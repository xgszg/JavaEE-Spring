<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script src="js/echarts.js"></script>
<title>look Apples</title>
</head>
<body>
Apples:
<br>
一个苹果的信息如下：  名称：${apple.appleName } 价格：${apple.applePrice }
<br>
Json:${applejson }
<br>
价格：${appleprice }
<div id="demo" style="width: 500px; height: 500px;"></div>
<script type="text/javascript">
	var price = ${apple.applePrice };
	var demo= echarts.init(document.getElementById('demo'));
	option = {
			  tooltip: {
			    formatter: '{a} <br/>{b} : {c}%'
			  },
			  series: [
			    {
				  max: 10,
			      name: 'Pressure',
			      type: 'gauge',
			      progress: {
			        show: true
			      },
			      detail: {
			        valueAnimation: true,
			        formatter: '{value}'
			      },
			      data: [
			        {
			          value: price,
			          name: '苹果价格'
			        }
			      ]
			    }
			  ]
	};
	demo.setOption(option);
</script>
</body>
</html>