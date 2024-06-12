<template>
  <div>
    <h1 style="text-align:center;">Trang Product</h1>
    <div class="listproduct">
      <p style="text-align:center;">{{ title }}</p>
      <p style="text-align:center;">{{ content }}</p>
      <img :src ="image" alt ="hình mới" style="margin-left:500px;">
    </div>
  </div>
</template>
<script>
export default {
    name:'ProductList',
    data(){
        return{
            title: "Trang xem danh sách sản phẩm ",
            content: "ở đây chúng tôi cung cấp những sản phẩm chất lượng",
            image: "https://cdn.tgdd.vn/Products/Images/42/319670/xiaomi-redmi-note-13-pro-5g-violet-thumb-600x600.jpg"
        };
    },
    mounted() {
        setTimeout(() =>{
            this.image="https://scdn.comfy.ua/89fc351a-22e7-41ee-8321-f8a9356ca351/https://cdn.comfy.ua/media/catalog/product/_/7/_75__7.jpg/w_600"
        },3000);
    }
};
</script>

<style>
.product {
  text-align:center;
  margin: 0px;
  padding: 20px;
  border-radius: 10px; 
  border: 5px solid #33CCFF; 
  background: #CCFFFF;
}
</style>
