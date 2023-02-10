#数据库：Mysql 8.0.32


#分组统计每种product的合计sales值
SELECT
	Product,
	sum( ` Sales` ) 
FROM
	sheet1 
GROUP BY
	Product;


#统计各country的合计sales值，并按由多到少排序
SELECT
	Country,
	sum( ` Sales` ) 
FROM
	sheet1 
GROUP BY
	Country 
ORDER BY
	sum( ` Sales` ) DESC;


#找出sales值最高的月份
SELECT
	Date ,` Sales`
FROM
	sheet1 
WHERE
	` Sales` = ( SELECT MAX( ` Sales` ) FROM sheet1 );