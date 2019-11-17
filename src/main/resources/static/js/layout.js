layui.define(['element', 'jquery', 'table', 'layer', 'laydate'], function (exports) {
    var element = layui.element;
    var $ = layui.jquery;

    var client = function () {
        $(".layui-nav-child a").click(function () {
            var value = $(this).text();
            if ('列表一' === value) {
                console.log("列表一")
                liebiaoyi();
            }
            if ('列表二' === value) {
                console.log("列表二")
                liebiaoer();
            }
        })
    };

    var liebiaoyi = function(){
        $("#right-content").text("列表一的主要内容")
    };



    var liebiaoer = function(){
        $("#right-content").text("列表二的主要内容")
    }

    client();
    //…
});
