/**
 * 展示从数据库获取的数据
 * @param id 控件id
 * @param type 要查询的类型
 * @param all
 * @returns {*}
 */
function showDictSelect(id, type, all) {
	//拿到对应的字典的数据
	var data = getDict(type);
	var select = $("#" + id);
	//清空原有的内容
	select.empty();

	if (all != undefined || all) {
        select.append("<option value=''>全部</option>");
    }

	$.each(data, function(k, v) {
		select.append("<option value ='" + k + "'>" + v + "</option>");
	});

	return data;
}

/**
 * 去后台获取对应数据
 * @param type
 * @returns {any}
 */
function getDict(type) {
	var v = sessionStorage[type];
	if (v == null || v == "") {
		$.ajax({
			type : 'get',
			url : '/dicts?type=' + type,
			async : false,
			success : function(data) {
				v = {};
				$.each(data, function(i, d) {
					v[d.k] = d.val;
				});

				sessionStorage[type] = JSON.stringify(v);
			}
		});
	}

	return JSON.parse(sessionStorage[type]);
}
