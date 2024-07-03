<template>
    <div class="home-admin">
     <HeaderAdmin />
        <div class="list-hradmin">
            <h1 style="text-align:center;">{{ title }}</h1>
            <p style="text-align:center;">{{ content }}</p>
            <img :src="image" alt="hình mới" class="image" style="width:500px;">
            <ul>
              <li v-for="hradmin in hrAdministrations" :key="hradmin.id">
                    {{ hradmin.title }} - {{ hradmin.description }}
                </li>
            </ul>
        </div>
         <FooterAdmin />
    </div>
</template>
<script>
import HeaderAdmin from '../partials/HeaderAdmin';
import FooterAdmin from '../partials/FooterAdmin';
import axios from 'axios';
export default {
        name: " ListHradministration",
        components:{
            HeaderAdmin,
            FooterAdmin
        },
        data(){
            return{
                title:"Trang quản lý bài viết về hành chính nhân sự",
                content:"Trang update bài viết",
                image: "https://hanhchinhnhansu.edu.vn/wp-content/uploads/2024/06/Quan-Ly-Hanh-Chinh-Nhan-Su-min.jpg",
                hrAdministrations: []
                };
        },
        mounted() {
            setTimeout(() =>{
                this.image ="https://hanhchinhnhansu.edu.vn/wp-content/uploads/2024/06/Gioi-Thieu-Xu-Huong-Quan-Ly-Nhan-Su.jpg"
            },3000);
           // Gọi API khi component được mount
        axios.get('http://localhost:8080/hradministrations/list')
            .then(response => {
                this.hrAdministrations = response.data; // Lưu dữ liệu trả về vào biến hrAdministrations
            })
            .catch(error => {
                console.error("There was an error!", error);
            });
        }
}
</script>
<style>
.home-admin {
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
.list-hradmin{
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
.list-hradmin h1{
  color: #004080;
  margin-bottom: 10px;
  font-size: 24px;
  font-weight: bold;
}
.list-hradmin p{
  color: #333;
  font-size: 16px;
  line-height: 1.6; 
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