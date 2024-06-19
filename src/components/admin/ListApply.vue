<template>
    <div class="home-apply">
        <div  class ="list-apply">
        <HeaderAdmin />
            <h1>{{ title }}</h1>
            <p>{{ content }}</p>
            <img :src ="image" alt ="để tạm để phân biệt trang" class ="image" style="width:500px;">
        <FooterAdmin />
        </div>
    </div>
</template>
<script>
import HeaderAdmin from '../partials/HeaderAdmin';
import FooterAdmin from '../partials/FooterAdmin';
export default{
    name: "ListApply",
    components:{
        HeaderAdmin,
        FooterAdmin
    },
    data(){
        return {
            title: "Trang quản lý danh sách tuyển dụng",
            content:"Tuyển dụng hành chính nhân sự 2024",
            image:"https://hanhchinhnhansu.edu.vn/wp-content/uploads/2024/06/Quan-Ly-Nhan-Su.jpg"
        };
    },
    mounted() {
        setTimeout(() =>{
            this.image = "https://hanhchinhnhansu.edu.vn/wp-content/uploads/2024/06/Quy-Dinh-Ve-Quan-Ly-Ho-So.jpg"
        },3000);
    }
}
</script>
<style>
.home-apply{
  display: flex;
  flex-direction: column;
  height:100%;
  background-color: #f1f1f1; 
  font-family: Arial, sans-serif;
}
.header-admin {
  position: fixed;
  top: 0;
  width: 100%;
  z-index: 1000;
  background-color: #004080; 
  color: #ff;
  text-align: center;
  padding: 15px 0;
  font-size: 18px;
  box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1); 
}
.list-apply{
  flex: 1;
  padding: 100px 20px 20px; 
  margin: 20px auto;
  background-color: #ffffff; 
  border: 1px solid #dee2e6; 
  border-radius: 8px; 
  box-shadow: 0 2px 10px rgba(0, 0, 0, 0.1);
  width: 95%; 
  max-width: 100%; 
  overflow: hidden;
}
.list-apply h1{
  color: #004080;
  margin-bottom: 10px;
  font-size: 24px;
  font-weight: bold;
  text-align:center;
}
.list-apply p{
  color: #333;
  font-size: 16px;
  line-height: 1.6; 
  text-align:center;
}
.footer-admin {
  position: fixed;
  bottom: 0;
  width: 100%;
  z-index: 1000;
  background-color: #004080;
  color: #fff;
  text-align: center;
  padding: 10px 0;
  font-size: 14px;
  box-shadow: 0 -2px 4px rgba(0, 0, 0, 0.1); 
}
.image{
    display:block;
    margin: 20px auto;
}
</style>