
    function postData(){
//formData 就相当于一个表单数据一样,后台可以直接获取
        var formData = new FormData();
        formData.append("file",$("#uploadFile")[0].files[0]);

        $.ajax({
            url:'uploadFile',
            type:'post',
            data: formData,
            contentType: false,
            processData: false,
            success:function(res){
                //res 就是后端返回来的对象，BaseResult<Boolean>
                //res.code 就是BaseResult的code属性
               // 后端要返回json格式
                if(res.code==200&&res.data==true){
                    alert('成功');
                    window.location.href="login.html";
                }else {
                    alert('失败');
                }
            }
        })
    }
