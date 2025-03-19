<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>대시보드</title>
    <script src="https://cdn.jsdelivr.net/npm/chart.js"></script> <!-- Chart.js 라이브러리 -->
    <style>
        .dashboard-container {
            width: 90%;
            margin: 20px auto;
            text-align: center;
        }
        .summary-box {
            display: flex;
            justify-content: space-around;
            margin-bottom: 20px;
        }
        .summary-box div {
            background: #f2f2f2;
            padding: 15px;
            border-radius: 10px;
            width: 30%;
            font-size: 18px;
            font-weight: bold;
        }
        .chart-container {
            display: flex;
            justify-content: space-around;
        }
        .chart-box {
            width: 45%;
        }
    </style>
</head>
<body>

    <div class="dashboard-container">
        <h2>📊 대시보드</h2>

        <!-- 요약 지표 -->
        <div class="summary-box">
            <div>총 생산량: <c:out value="${totalProduction}" /></div>
            <div>총 매출: <c:out value="${totalSales}" /></div>
            <div>평균 불량률: <c:out value="${averageDefectRate}" />%</div>
        </div>

        <!-- 생산 실적 & 경영 실적 차트 -->
        <div class="chart-container">
            <div class="chart-box">
                <h3>📈 생산 실적</h3>
                <canvas id="productionChart"></canvas>
            </div>
            <div class="chart-box">
                <h3>📊 경영 실적</h3>
                <canvas id="financialChart"></canvas>
            </div>
        </div>

        <!-- 불량률 추이 차트 -->
        <div class="chart-container">
            <div class="chart-box" style="width: 80%;">
                <h3>⚠ 불량품 추이</h3>
                <canvas id="defectChart"></canvas>
            </div>
        </div>
    </div>

    <script>
        // 📌 생산 실적 차트 (주간/월간/분기별 생산량)
        var ctx1 = document.getElementById('productionChart').getContext('2d');
        var productionChart = new Chart(ctx1, {
            type: 'bar',
            data: {
                labels: [<c:forEach var="data" items="${productionList}">"${data.productionDate}",</c:forEach>],
                datasets: [{
                    label: '생산량',
                    data: [<c:forEach var="data" items="${productionList}">${data.quantity},</c:forEach>],
                    backgroundColor: 'rgba(54, 162, 235, 0.6)',
                    borderColor: 'rgba(54, 162, 235, 1)',
                    borderWidth: 1
                }]
            }
        });

        // 📌 경영 실적 차트 (총 매출, 영업이익, 순이익)
        var ctx2 = document.getElementById('financialChart').getContext('2d');
        var financialChart = new Chart(ctx2, {
            type: 'bar',
            data: {
                labels: [<c:forEach var="data" items="${financialList}">"${data.period}",</c:forEach>],
                datasets: [{
                    label: '총 매출',
                    data: [<c:forEach var="data" items="${financialList}">${data.totalSales},</c:forEach>],
                    backgroundColor: 'rgba(255, 99, 132, 0.6)',
                    borderColor: 'rgba(255, 99, 132, 1)',
                    borderWidth: 1
                }]
            }
        });

        // 📌 불량률 추이 차트 (월별 불량률)
        var ctx3 = document.getElementById('defectChart').getContext('2d');
        var defectChart = new Chart(ctx3, {
            type: 'line',
            data: {
                labels: [<c:forEach var="data" items="${defectList}">"${data.period}",</c:forEach>],
                datasets: [{
                    label: '불량 개수',
                    data: [<c:forEach var="data" items="${defectList}">${data.totalDefects},</c:forEach>],
                    backgroundColor: 'rgba(255, 206, 86, 0.6)',
                    borderColor: 'rgba(255, 206, 86, 1)',
                    borderWidth: 2,
                    fill: false
                }]
            }
        });

    </script>

</body>
</html>
